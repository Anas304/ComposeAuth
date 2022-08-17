package com.example.composeauth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composeauth.nav.Screens
import com.example.composeauth.ui.theme.ComposeAuthTheme
import com.example.composeauth.widgets.Buttons

@Composable
fun FirstScreen(navController: NavController) {
    ComposeAuthTheme() {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Buttons(
                    title = "Register",
                    onClick = { navController.navigate(Screens.RegisterScreen.route) },
                    backgroundColor = Color.Blue
                )
                Spacer(modifier = Modifier.padding(vertical = 10.dp))
                Buttons(
                    title = "Login",
                    onClick = { navController.navigate(Screens.LoginScreen.route) },
                    backgroundColor = Color.Magenta
                )
            }
        }
    }
}