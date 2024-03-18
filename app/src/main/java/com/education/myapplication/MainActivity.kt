package com.education.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.education.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationScreen()
        }
    }

    @Preview(showSystemUi = true)
    @Composable()
    fun NotificationScreen() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(1f)
        ) {
            notificationCounter()
        }
    }

    @Composable
    fun notificationCounter() {
        /**
         * remember --> This will not work on the change of Orientation.
         */
        var count = rememberSaveable() {
            mutableStateOf(0)  
        }
        Column(verticalArrangement = Arrangement.Center) {
            Text(text = "hello")
            Button(onClick = { count.value++
            Log.d("TSV","${count}")}
            ) {
                Text(text = "Send Notificaiton")
            }
            Text(text = "Value of the Counter ${count.value}")
        }
    }
}

