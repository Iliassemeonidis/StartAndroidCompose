package com.android.example.startandroidcompose

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

@Composable
fun HomeScreen(checked: State<Boolean>, onCheckedChange: (Boolean) -> Unit) {
    var checkedVal = checked.value
    Row(verticalAlignment = CenterVertically) {
        Checkbox(checked = checkedVal, onCheckedChange = onCheckedChange)

        Text(text = "Some text check box", fontSize = 18.sp, modifier =
        Modifier.clickable {
            if (checkedVal) {
                checkedVal = false
                onCheckedChange(checkedVal)
            } else {
                checkedVal = true
                onCheckedChange(checkedVal)
            }
        })
    }
}
@Composable
fun HomeScreen1(text : State<String>,onValueChange: (String) -> Unit ){
    OutlinedTextField(value = text.value, onValueChange = onValueChange)
}

//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen()
//}