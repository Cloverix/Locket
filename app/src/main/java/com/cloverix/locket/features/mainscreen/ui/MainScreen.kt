package com.cloverix.locket.features.mainscreen.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cloverix.locket.R
import com.cloverix.locket.ui.theme.AppTheme
import com.cloverix.locket.ui.theme.displayFontFamily

@Composable
fun MainScreen() {
    var isFlashEnabled by remember { mutableStateOf(false) }
    //Background
    Surface (
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column {
            //Top row: profile, friends and chat buttons
            Row (
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .systemBarsPadding()
                    .padding(vertical = 5.dp)
            ) {
                //Profile button
                Button(
                    onClick = {
                        //navController takes to profile screen
                    }
                ) {}
                //Friends button
                Button(
                    onClick = {
                        //navController takes to friends screen
                    },
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
                    onClick = {
                        //navCompose takes to chat screen
                    }
                ) {}
            }
            Spacer(Modifier.height(20.dp))
            //Place for camera image
            BoxWithConstraints {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(maxWidth)
                ) {
                    //Picture from the camera cropped to RoundedCornerShape
                }
            }
            Spacer(Modifier.height(30.dp))
            //Bottom row: flash, take a photo and flip camera buttons
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                //Flash button
                Icon(
                    imageVector = ImageVector.vectorResource(if (isFlashEnabled) R.drawable.lightning_icon_filled else R.drawable.lightning_icon_outlined),
                    contentDescription = "Lightning icon",
                    tint = colorResource(if (isFlashEnabled) R.color.yellow else R.color.white),
                    modifier = Modifier
                        .scale(1.5f)
                        .clickable(
                            onClick = {
                                //Function that enables / disables the flash and changes isFlashEnabled parameter
                                isFlashEnabled = !isFlashEnabled
                            }
                        )
                )
                //Take a photo button
                Box(
                    modifier = Modifier
                        .size(105.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Box(
                        modifier = Modifier
                            .size(95.dp)
                            .clip(CircleShape)
                            .background(colorResource(R.color.black))
                            .align(Alignment.Center)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .clip(CircleShape)
                                .background(colorResource(R.color.yellow))
                                .align(Alignment.Center)
                                .clickable(
                                    onClick = {
                                        //Function that takes a photo
                                    }
                                )
                        )
                    }
                }
                //Camera flip button
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.arrows_clockwise_fill),
                    contentDescription = "Camera flip icon",
                    tint = colorResource(R.color.white),
                    modifier = Modifier
                        .scale(1.5f)
                        .clickable(
                            onClick = {
                                //Function that flips the camera
                            }
                        )

                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMainScreen() {
    AppTheme(darkTheme = true) {
        MainScreen()
    }
}