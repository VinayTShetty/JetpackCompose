package com.education.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Route_Home") {
        composable(route = "Route_Home") {
            homeScreen(navController)
        }
        composable(route = "Route_Details?name={myname}&age={age}",
            arguments = listOf(
                navArgument(name = "myname") {
                    type = NavType.StringType
                    defaultValue="User"
                },
                navArgument(name = "age") {
                    type = NavType.IntType
                    defaultValue=100
                }
            )
        )
        /**
         * Take the data from the graph and pass it to the Screen.i.e using 'it' or 'NavBackStackEntry'
         */
        {backstackEntry ->
         detailsScreen(myName =backstackEntry.arguments!!.getString("myname"), myAge = backstackEntry.arguments!!.getInt("age"))
        }
    }
}