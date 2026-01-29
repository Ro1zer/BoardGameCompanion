package com.example.boardgamecompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.boardgamecompanion.ui.features.home.HomeScreen
import com.example.boardgamecompanion.ui.theme.BoardGameCompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoardGameCompanionTheme {
                HomeScreen()
            }
        }
    }
}