package com.example.cpapp1.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cpapp1.Routes

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.route) {
        composable(Routes.Login.route) {
            Login(navController = navController)
        }
        composable(
            route = Routes.AppMainScreen.route
        ) { entry ->
            AppMainScreen()
        }
    }
}

