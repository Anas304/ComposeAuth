package com.example.composeauth.nav

sealed class Screens(val route: String) {
    object FirstScreen : Screens("first_screen")
    object RegisterScreen : Screens(route = "register_screen")
    object LoginScreen : Screens(route = "login_screen")
    object SecondScreen : Screens(route = "second_screen")

}