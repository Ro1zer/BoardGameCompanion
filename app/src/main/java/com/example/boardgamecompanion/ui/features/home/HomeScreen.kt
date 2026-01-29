package com.example.boardgamecompanion.ui.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.boardgamecompanion.domain.model.Player
import com.example.boardgamecompanion.ui.theme.BoardGameCompanionTheme

@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(
                    Icons.Filled.Add,
                    "Add new player"
                )
            }
        }
    ) { innerPadding ->
        HomeScreenContent(Modifier.padding(innerPadding))
    }
}

@Composable
private fun HomeScreenContent(
    modifier: Modifier = Modifier
) {

}

@Composable
private fun PlayerCard(
    player: Player
) {
    Surface(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp)
                    .drawBehind {
                        drawCircle(
                            color = Color.Cyan,
                            radius = this.size.maxDimension
                        )
                    },
                text = "${player.name.first()}"
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = "${player.score}"
            )
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    BoardGameCompanionTheme {
        HomeScreen()
    }
}

@Preview
@Composable
fun PlayerCardPreview() {
    BoardGameCompanionTheme() {
        PlayerCard(Player("Maks", 20))
    }
}