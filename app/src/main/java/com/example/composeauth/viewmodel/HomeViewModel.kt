package com.example.composeauth.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.DelicateCoroutinesApi


private const val TAG = "HomeViewModel"

class HomeViewModel : ViewModel() {
    var message =  mutableStateOf("")

    // Update email
    fun updateMessage(newMessage: String) {
        message.value = newMessage
    }

    fun writeMessage() {
        val userMessage = message.value
        val db = FirebaseFirestore.getInstance()
        val sentMessage =  hashMapOf( "message" to userMessage,)

        if (userMessage.isEmpty()) {
           db.collection("messages").add(sentMessage).addOnSuccessListener {
                message.value = ""
                Log.d(TAG, "writeMessage: Message Uploaded Successfully")
            }.addOnFailureListener {
                Log.d(TAG, "writeMessage: Message Failed to Upload")
            }
        }
    }
}
