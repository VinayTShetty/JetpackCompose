package com.education.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ScreenC(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(5f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen C", fontSize = 34.sp)
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = {
            /**
             * popupto and Inclusive needs to be experemented.
             */
            navController.navigate("Route_A") {
                popUpTo("Route_A") {
                    inclusive = true
                }
            }
        }) {
            Text(text = "Go TO Screen A")

        }
    }
}