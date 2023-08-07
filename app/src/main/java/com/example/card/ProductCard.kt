package com.example.card

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductCard(product:Products) {
    var counter = remember { mutableStateOf(0)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Gray)
            .padding(3.dp)
        ) {
        Image(painter = painterResource(id = product.imageId), contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(150.dp)
        )
        Text(text = product.title,color=(Color.Black),fontSize=18.sp,
        modifier = Modifier
            .padding(5.dp)


        )
        Text(text = product.description,fontSize=14.sp, color = (Color.Black), softWrap = true,
            modifier = Modifier
                .padding(3.dp)
                )
        Text(text = "details", modifier= Modifier
            .padding(3.dp)
            .clickable(true){{ navController.navigate("detail") })
        Row {
            Text(text = product.price, fontSize = 20.sp, color = (Color.Black),
                modifier = Modifier
                    .padding(3.dp))
            Text(text = product.lastPrice, fontSize = 20.sp, color = (Color.Red),
                modifier = Modifier
                    .padding(3.dp))
        }
        Row{
            Button(
                onClick={ counter.value++ },
                border = BorderStroke(1.dp, Color.DarkGray),
                shape =  MaterialTheme.shapes.medium,
                elevation = 2.dp,
                enabled =true,
                modifier = Modifier
                    .padding(3.dp))
            Text(text = "+", fontSize = 20.sp, color = (Color.Black),
                modifier = Modifier
                    .padding(3.dp))

            Button(
                border = BorderStroke(1.dp, Color.DarkGray),
                shape =  MaterialTheme.shapes.medium,
                elevation = 2.dp,
                modifier = Modifier.padding(3.dp)
            )
            Text(text = counter.value.toString(), fontSize = 20.sp, color = (Color.Black),
                modifier = Modifier
                    .padding(3.dp))
            Button(
                onClick = { counter.value-- },
            border = BorderStroke(1.dp, Color.DarkGray),
                shape =  MaterialTheme.shapes.medium,
                elevation = 2.dp,
                enabled =true,
                modifier = Modifier
                .padding(3.dp))
            Text(text = "-", fontSize = 20.sp, color = (Color.Black),
                modifier = Modifier
                    .padding(3.dp))


        }
    }
}
}


