package com.example.cpapp1.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cpapp1.R


sealed class DrawerScreens(val title: String, val route: String) {
    object Home : DrawerScreens("Home", "home")
    object Account : DrawerScreens("Account", "account")
    object Units : DrawerScreens("Units", "units")
    object Attendance : DrawerScreens("Attendance", "attendance")
    object Schedule : DrawerScreens("Schedule", "schedule")
    object Help : DrawerScreens("Help", "help")
}

private val screens = listOf(
    DrawerScreens.Home,
    DrawerScreens.Account,
    DrawerScreens.Units,
    DrawerScreens.Attendance,
    DrawerScreens.Schedule,
    DrawerScreens.Help
)

@Composable
fun Drawer (
    modifier: Modifier = Modifier,
    onDestinationClicked : (Routes: String) -> Unit
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 48.dp)
    ) {
        Row(

        ) {
            Image(
                modifier = Modifier.size(40.dp),
                painter = painterResource(R.drawable.clock1),
                contentDescription = "App Icon"
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "James Mathew")
                Text(text = "Bsc ICT - Year One")
            }
        }

        screens.forEach { screen ->
            Spacer(Modifier.height(24.dp))
            Text(
                text = screen.title,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.clickable {
                    onDestinationClicked(screen.route)
                }
            )
        }
    }
}




