package com.example.composeauth.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeauth.register.RegisterScreen
import com.example.composeauth.screens.FirstScreen
import com.example.composeauth.screens.SecondsScreen
import com.example.dayschallenge.Screens.login.LoginScreen

@Composable
fun Navigations(navController: NavController) {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SecondScreen.route) {

     /*   composable(Screens.FirstScreen.route) {
            FirstScreen(navController = navController)
        }

        composable(Screens.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(Screens.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }

        composable(Screens.LoginScreen.route) {
            LoginScreen(navController = navController)
        }*/

        composable(Screens.SecondScreen.route) {
            SecondsScreen(navController = navController)
        }
    }
}