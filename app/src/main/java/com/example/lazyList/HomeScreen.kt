package com.example.lazyList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    rowClick: () -> Unit,
    gridClick: () -> Unit,
    columnClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                rowClick()
            }
        ) {
            Text(text = "Lazy Row")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                gridClick()
            }
        ) {
            Text(text = "Lazy Grid")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                columnClick()
            }
        ) {
            Text(text = "Lazy Column")
        }

    }
}