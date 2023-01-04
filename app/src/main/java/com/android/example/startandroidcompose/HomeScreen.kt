package com.android.example.startandroidcompose


import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

const val TAG = "TEST INFO"

@Composable
fun HomeScreen(
    counter: State<Int>,
    onCounterClick: () -> Unit
) {
    val counterValue = counter.value
    Log.d(TAG, "HomeScreen")
    Column {
        Counter(counter = counterValue, onCounterClick)
        InfoText(text = if (counterValue < 3) "More" else "Enough")
    }

}

@Composable
private fun Counter(
    counter: Int,
    onCounterClick: () -> Unit
) {
    Log.d(TAG, "ClickCounter $counter")
    Text(
        text = "Clicks: $counter",
        modifier = Modifier.clickable{
            Log.d(TAG, "--- click ---")
            onCounterClick()
        }
    )
}

@Composable
fun InfoText(text: String) {
    Log.d(TAG, "InfoText $text")
    Text(text = text, fontSize = 18.sp)
}


//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen()
//}