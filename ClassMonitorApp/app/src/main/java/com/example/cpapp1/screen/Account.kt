package com.example.cpapp1.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.cpapp1.R


@Composable
fun Account(openDrawer : () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() }
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .background(color = MaterialTheme.colors.primaryVariant)
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape),
                    painter = painterResource(R.drawable.picture),
                    contentDescription = "App Icon",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(text = "James Kibet", color = Color.White, fontWeight = FontWeight.Bold)
                    Text(text = "Bsc in ICT", color = Color.White)
                    Text(text = "Y1S1", color = Color.White)
                }
            }
        }
    }
}

