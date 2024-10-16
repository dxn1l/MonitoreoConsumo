package com.example.monitoreoconsumo.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConsumptionScreen(
    onNavigateToDormitorio: () -> Unit,
    onNavigateToCocina: () -> Unit,
    onNavigateToBath: () -> Unit
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Text(text = "Registro de Consumo", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onNavigateToDormitorio) {
                Text(text = "Dormitorio")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onNavigateToCocina) {
                Text(text = "Cocina")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onNavigateToBath) {
                Text(text = "Baño")
            }
        }
    }
}