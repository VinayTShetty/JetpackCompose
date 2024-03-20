package com.education.myapplication





import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun homeScreen(navController: NavController) {
    val modifier = Modifier
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var nameValue by remember {
            mutableStateOf("")
        }
        var ageValue by remember {
            mutableStateOf("")
        }
        Text(text = "HomeScreen", fontSize = 54.sp)
        Spacer(modifier = Modifier.height(65.dp))
        TextField(value = nameValue, onValueChange = { nameValue = it },
            placeholder = {
                Text(text = "Enter Your Name")
            },
        )
        Spacer(modifier = Modifier.height(25.dp))
        TextField(value = ageValue, onValueChange = {ageValue=it},
        placeholder = {
            Text(text = "Enter Your Age")
        })
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {

         //   navController.navigate("Route_Details/$nameValue/$ageValue")

            navController.navigate("Route_Details?myname=$nameValue&age=$ageValue")
        }) {
            Text(text = "Submit")
        }
    }
}
