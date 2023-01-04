package com.android.example.startandroidcompose


import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

const val TAG = "TEST_INFO"

@Composable
fun ClickCounter(
) {
    var checked  by remember { mutableStateOf(false) }

    Column {
        Row(verticalAlignment = CenterVertically) {
            Checkbox(checked = checked, onCheckedChange = { checked = it })
            Text(text = "More details", fontSize = 18.sp)
        }
        Column(modifier = Modifier.padding(15.dp)) {
            if (checked) {
                Text(text = stringResource(id = R.string.app_name))
            }
        }
    }
}


@Preview
@Composable
fun ClickCounterPreview() {
    ClickCounter()
}

