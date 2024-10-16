package com.example.monitoreoconsumo.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DormitorioScreen(modifier: Modifier = Modifier, onNavigateToConsumption: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Dormitorio",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = { /* Acción del botón */ }) {
                    Text(text = "Gasto energético")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = onNavigateToConsumption) {
                    Text(text = "Volver a la pantalla principal")
                }
            }
        }
    }
}