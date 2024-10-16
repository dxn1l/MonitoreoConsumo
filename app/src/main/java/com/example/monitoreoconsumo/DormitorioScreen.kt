package com.example.monitoreoconsumo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.monitoreoconsumo.ui.theme.MonitoreoConsumoTheme


class DormitorioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                DormitorioScreen(onNavigateToMain = {
                    startActivity(Intent(this, MainActivity::class.java))
                })
            }
        }
    }
}

@Composable
fun DormitorioScreen(modifier: Modifier = Modifier, onNavigateToMain: () -> Unit) {
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
                Button(onClick = onNavigateToMain) {
                    Text(text = "Volver a la pantalla principal")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DormitorioScreenPreview() {
    MonitoreoConsumoTheme {
        DormitorioScreen(onNavigateToMain = {})
    }
}