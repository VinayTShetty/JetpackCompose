package com.education.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun nav() {
    val navContorller = rememberNavController()
    NavHost(navController = navContorller, startDestination = "Route_A") {
        composable(route = "Route_A") {
            ScreenA(navContorller)
        }
        composable(route = "Route_B") {
            ScreenB(navContorller)
        }
        composable(route = "Route_C") {
            ScreenC(navContorller)
        }
    }
}