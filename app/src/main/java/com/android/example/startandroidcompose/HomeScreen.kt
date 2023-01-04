package com.android.example.startandroidcompose


import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

const val TAG = "TEST_INFO"

@Composable
fun ClickCounter(
    uppercase: State<Boolean>,
    counter: State<Int>,
    onCounterClick: () -> Unit,
    onCheckedChange: (Boolean) -> Unit
) {
    val evenOdd = remember(uppercase) { EvenOdd(uppercase.value) }
    val counterValue = counter.value
    Column (modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Clicks: ${counter.value} ${evenOdd.check(counter.value)}",
            modifier = Modifier.clickable(onClick = onCounterClick),
        )
        Log.d(TAG, "ClickCounter ${counter.value} ${evenOdd.hashCode()}")

        Row(verticalAlignment = CenterVertically) {
            Checkbox(checked = uppercase.value, onCheckedChange = onCheckedChange)
            Text(text = "Uppercase", fontSize = 18.sp)
        }

    }
    Log.d(TAG, "ClickCounter(counter = $counterValue, uppercase = $uppercase), $evenOdd")
}

class EvenOdd(private val uppercase: Boolean) {
    fun check(count: Int): String {
        var result = if (count % 2 == 0) "even" else "odd"

        if (uppercase) result = result.uppercase()
        return result
    }

    override fun toString(): String {
        return "EvenOdd(uppercase = $uppercase, hashcode = ${hashCode()})"
    }
}