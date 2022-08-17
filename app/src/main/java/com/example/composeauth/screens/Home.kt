package com.example.composeauth.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.composeauth.ui.theme.ComposeAuthTheme
import com.example.composeauth.viewmodel.HomeViewModel
import com.example.composeauth.widgets.Buttons
import com.example.composeauth.widgets.TextFormField

private const val TAG = "Home"
@Composable
fun SecondsScreen(navController: NavController,homeViewModel: HomeViewModel = viewModel()) {
    val message = homeViewModel.message.value
    val context = LocalContext.current

    ComposeAuthTheme() {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextFormField(
                    value = message,
                    onValueChange = {
                        homeViewModel.updateMessage(it) },
                    label = "Type Your Message Here.....",
                    keyboardType = KeyboardType.Email,
                    visualTransformation = VisualTransformation.None
                )


                Spacer(modifier = Modifier.padding(top = 20.dp))
                Buttons(title = "Upload", onClick = {
                    Log.d(TAG, "SecondsScreen: $message ")
                    homeViewModel.writeMessage()
                    Toast.makeText(context, "Data Uploaded", Toast.LENGTH_SHORT).show()
                }, backgroundColor = Color.DarkGray)
            }
        }
    }
}