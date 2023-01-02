package com.android.example.startandroidcompose

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Text(
        text = "Home Screen",
        fontSize = 32.sp,
        color = Color.Blue,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxWidth()
    )

}

@Composable
fun HomeScreenColum() {
    // LinearLayout оринтпция вертикальная
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(text = "Приветствие", fontSize = 35.sp)
        Text(
            text = "Меня зовут Питер Паркер", fontSize = 20.sp,
            modifier = Modifier.align(Start)
        )
    }
}

@Composable
fun HomeScreenRow() {
    // LinearLayout оринтпция горизонтальный
    Row(verticalAlignment = CenterVertically) {
        Text(text = "Title", fontSize = 25.sp)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Description", fontSize = 20.sp)
    }
}

@Composable
fun HomeScreenBox() {
    //FrameLayout
    Box {
        Text(text = "N", fontSize = 45.sp)
        Text(text = "ame", modifier = Modifier.align(BottomCenter))

    }
}

@Composable
fun HomeScreenModif() {
 // тут комбинация лайаутов
    Row(verticalAlignment = CenterVertically) {
        HomeScreenBox()
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = "Title")
            Text(text = "Description")
        }
    }
}

@Composable
fun HomeScreenPadding() {
    Column(modifier = Modifier.padding(start = 32.dp, end = 16.dp)) {
        Text(text = "Title")
        Text(text = "Description")

    }
}

@Composable
fun HomeScreenList(list: List<String>) {
    if (list.isEmpty()) {
        Box(contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
            Text(text = "List is empty")
        }
    } else {
        Column {
            for (s in list) {
                Text(text = s)
            }
        }
    }
}
@Composable
fun HomeScreenRes() {
    Column(modifier = Modifier.padding(start = dimensionResource(id = R.dimen.large_padding))) {
        Text(text = stringResource(id = R.string.home_screen_title))
        Text(text = stringResource(id = R.string.home_screen_description))
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreenRes()
}