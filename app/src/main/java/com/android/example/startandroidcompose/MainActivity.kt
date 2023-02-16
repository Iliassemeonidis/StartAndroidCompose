package com.android.example.startandroidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "HomeScreen1",
                    modifier = Modifier.weight(1f)
                ) {
                    composable("HomeScreen1") { HomeScreen1() }
                    composable("HomeScreen2") { HomeScreen2() }
                    composable("HomeScreen3") { HomeScreen3() }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "HomeScreen1",
                        modifier = Modifier.clickable { navController.navigate("HomeScreen1") })
                    Text(
                        text = "HomeScreen2",
                        modifier = Modifier.clickable { navController.navigate("HomeScreen2") })
                    Text(
                        text = "HomeScreen3",
                        modifier = Modifier.clickable { navController.navigate("HomeScreen3") })
                }

            }
        }
    }
}