package com.cloverix.locket.features.mainscreen.ui

import android.content.Context
import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cloverix.locket.R

@Composable
fun MainScreen() {
    //Background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
    ) {
        Column {
            //Top row: profile, friends and chat buttons
            Row (
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .systemBarsPadding()
            ) {
                //Profile button
                Button(
                    onClick = {}
                ) {}
                //Friends button
                Button(
                    onClick = {},
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    Text(
                        text = "Friends",
                        fontSize = 20.sp
                    )
                }
                //Chat button
                Button(
                    onClick = {}
                ) {}
            }
            Spacer(Modifier.height(20.dp))
            BoxWithConstraints {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(maxWidth)
                ) {
                    //Здесь картинка с камеры, кропнутая в RoundedCornerShape
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}