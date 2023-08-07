package com.example.card

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController


@Composable
    fun NavigationCard() {
        val navController = rememberNavController()

        NavHost(navController, startDestination = "ProductCard") {
            composable("ProductCard") {
                ProductCard(navController)
            }
            composable("detail") {
                DetailScreen()
            }
        }

    }
@Composable
    fun DetailScreen() {
        Column {
            Text("Это экран с деталями")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        NavigationCard()
    }
}