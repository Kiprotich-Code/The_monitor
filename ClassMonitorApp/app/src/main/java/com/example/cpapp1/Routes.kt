package com.example.cpapp1

sealed class Routes(val route: String) {
    object Login : Routes("Login")
    object AppMainScreen : Routes("AppMainScreen")
}
