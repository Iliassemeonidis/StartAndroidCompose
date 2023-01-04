package com.android.example.startandroidcompose


import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

const val TAG = "TEST_INFO"

@Composable
fun HomeScreen() {
    Log.d(TAG, "HomeScreen")
    val list = remember {
        List(20) { "Item ${it + 1}" }.toMutableStateList()
    }
    Column {
        TextButton(onClick = {
            list.add("Item ${list.size + 1}")
        }) {
            Text(text = "Append")
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .border(width = 2.dp, color = Color.Blue)
        ) {
            items(list) {
                SomeItem(text = it)
            }
        }
    }


}

@Composable
fun SomeItem(text: String) {
    Log.d(TAG, "SomeItem $text")
    Text(
        text = text, fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.Black)
            .padding(16.dp)
    )
}


@Preview
@Composable
fun ClickCounterPreview() {
    HomeScreen()
}

