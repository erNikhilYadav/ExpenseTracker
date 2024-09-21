package com.example.expensetracker.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExpenseEntity(
    val name: String
) {
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
}
