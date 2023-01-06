package com.android.example.startandroidcompose


import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

const val TAG = "TEST_INFO"

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {
    val uiState by homeViewModel.uiState.collectAsState()

    HomeScreen1(uiState, homeViewModel::onCounterClick, homeViewModel::setEnabled)
}


@Composable
fun HomeScreen1(
    uiState: HomeScreenUiState,
    onCounterClick: () -> Unit,
    onCheckedChange: (Boolean) -> Unit
) {
    Column {
        ClickCounter(counter = uiState.count, onCounterClick = onCounterClick)
        EnableFeature(enabled = uiState.enabled, onCheckedChange = onCheckedChange)
    }

}

@Composable
private fun ClickCounter(counter: Int, onCounterClick: () -> Unit) {
    Text(
        text = "Clicks: $counter",
        modifier = Modifier
            .clickable(onClick = onCounterClick)
    )
}

@Composable
fun EnableFeature(
    enabled: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = enabled, onCheckedChange = onCheckedChange)
        Text("enable feature")
    }

}


@Preview(showBackground = true)
@Composable
fun ClickCounterPreview() {
    ClickCounter(5, onCounterClick = {})
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen1(
        uiState = HomeScreenUiState(count = 5, enabled = true),
        onCounterClick = {},
        onCheckedChange = {}
    )
}

