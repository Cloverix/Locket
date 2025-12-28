package com.cloverix.locket.features.chatlist.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cloverix.locket.R
import com.cloverix.locket.Routes
import com.cloverix.locket.core.presentation.BlankSurface
import com.cloverix.locket.ui.theme.AppTheme

@Composable
fun ChatListScreen(navController: NavHostController) {
    BlankSurface {
        Scaffold(
            topBar = {
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .systemBarsPadding()
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.arrow_left),
                        contentDescription = "Arrow left icon",
                        modifier = Modifier
                            .scale(1.75f)
                            .padding(horizontal = 15.dp)
                            .clickable(
                                onClick = {
                                    navController.navigate(Routes.MAINSCREEN)
                                }
                            )
                    )
                }
            }
        ) {}
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChatListScreen() {
    AppTheme(darkTheme = true) {
        ChatListScreen(rememberNavController())
    }
}