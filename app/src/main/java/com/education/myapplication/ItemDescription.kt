package com.education.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ItemDescription {
    @Preview
    @Composable
    fun previewItem() {
        makeItemDesign(
            R.drawable.baseline_add_shopping_cart_24,
            "Programming",
            "Learn Different Laungages"
        )
    }
    @Composable
    fun makeItemDesign(img: Int, title: String, description: String) {
        Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(6.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp),

                ) {
                Image(
                    painter = painterResource(id = img), contentDescription = "",
                    Modifier
                        .size(48.dp)
                        .padding(8.dp)
                        .weight(0.2f)
                )
                Column(Modifier.weight(0.8f)) {
                    Text(
                        text = title,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = description,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

