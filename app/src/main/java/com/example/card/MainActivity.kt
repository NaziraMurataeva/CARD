package com.example.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.card.ui.theme.CARDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                itemsIndexed(
                    listOf(
                        Products(R.drawable.image1,"puma","rsdjfhdjfhjhfjfd", "18.99$", "25.88$"),
                        Products(R.drawable.image2,"Nike","rsdjfhdjfhjhfjfd", "18.99$", "25.88$"),
                        Products(R.drawable.image3,"Reebok","rsdjfhdjfhjhfjfd", "18.99$", "25.88$"),)
                ){_, item ->
                    ProductCard(product = item)
                    NavigationCard()
                }



                }
            }
        }
    }
