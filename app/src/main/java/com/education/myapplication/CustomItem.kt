package com.education.myapplication
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class CustomItem {

    @Composable
    fun makeCustomItem(person: Person) {
        Row(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "${person.age}",
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${person.firstName}",
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${person.lastName}",
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun customItemPreview() {
        makeCustomItem(
            person = Person(
                id = 0,
                firstName = "John",
                lastName = "Doe",
                age = 20
            )
        )
    }
}