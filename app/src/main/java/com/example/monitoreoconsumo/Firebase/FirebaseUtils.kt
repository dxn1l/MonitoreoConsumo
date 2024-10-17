package com.example.monitoreoconsumo.Firebase

import com.google.firebase.database.FirebaseDatabase

fun saveAverageConsumption(room: String, averageConsumption: Double) {
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference("consumption").child(room)
    ref.setValue(averageConsumption)
}