package com.android.example.startandroidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.example.startandroidcompose.ui.theme.StartAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val checked = mutableStateOf(false)
        val text = mutableStateOf("text")
        setContent {
//            HomeScreen(
//                checked = checked,
//                onCheckedChange = { newValue ->
//                    checked.value = newValue
//                }
//            )

            HomeScreen1(
                text = text,
                onValueChange = { newValue ->
                    text.value = newValue

                }
            )
        }
    }
}