package com.example.monitoreoconsumo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ConsumptionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                ConsumptionScreen()
            }
        }
    }
}

@Composable
fun ConsumptionScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Text(text = "Registro de Consumo", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Acción del botón Dormitorio */ }) {
                Text(text = "Dormitorio")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Acción del botón Cocina */ }) {
                Text(text = "Cocina")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Acción del botón Baño */ }) {
                Text(text = "Baño")
            }
        }
    }
}