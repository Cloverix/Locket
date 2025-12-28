package com.cloverix.locket.core.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BlankSurface(content: @Composable (() -> Unit)) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        content = content,
        modifier = Modifier
            .fillMaxSize()
    )
}