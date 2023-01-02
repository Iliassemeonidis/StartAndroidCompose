package com.android.example.startandroidcompose

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun HomeScreen() {
    Box(contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                //тут выбираем вигуру
//                .background(color = Color.Cyan, shape = RoundedCornerShape(16.dp))
                // тут обрезали углы у фигуры
//                .background(color = Color.Cyan, shape = CutCornerShape(16.dp))
                //тут у нас круг
//                .background(color = Color.Cyan, shape = CircleShape)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Blue,
                            Color.Red,
                            Color.Cyan
                        )
                    ),
                    alpha = 0.2f,
                    shape = CircleShape
                )
        )
    }
}

@Composable
fun HomeScreen1() {
    Box(contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                .background(color = Color.Yellow, shape = RoundedCornerShape(16.dp))
                .border(
                    width = 2.dp, brush = Brush.linearGradient(
                        listOf(
                            Color.Blue,
                            Color.Red,
                            Color.Cyan
                        )
                    ), shape = CircleShape
                )
        )
    }
}

@Composable
fun HomeScreenImage() {
    Box(contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.hermes), contentDescription = null)
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
    }
}

@Composable
fun HomeScreenImage2() {
    Box(contentAlignment = Center, modifier = Modifier.fillMaxSize()) {
      AsyncImage(
          model = "https://developer.android.com/images/android-go/next-billion-users_856.png",
          contentDescription = null
      )
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreenImage2()
}