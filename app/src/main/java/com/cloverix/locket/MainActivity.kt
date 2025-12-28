package com.cloverix.locket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cloverix.locket.features.mainscreen.presentation.screen.MainScreen
import com.cloverix.locket.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme (darkTheme = true) {
                MainScreen()
            }
        }
    }
}