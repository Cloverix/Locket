package com.cloverix.locket

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cloverix.locket.features.chatlist.presentation.screen.ChatListScreen
import com.cloverix.locket.features.mainscreen.presentation.screen.MainScreen

object Routes {
    const val MAINSCREEN = "mainscreen"
    const val CHATLIST = "chatlist"
}

@Composable
fun Locket() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Routes.MAINSCREEN) {
        composable(Routes.MAINSCREEN) {
            MainScreen(navController)
        }
        composable(Routes.CHATLIST) {
            ChatListScreen(navController)
        }
    }
}