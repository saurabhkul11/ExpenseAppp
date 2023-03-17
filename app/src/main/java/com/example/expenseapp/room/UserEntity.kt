package com.example.expenseapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DATA")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var id :Int,
    @ColumnInfo(name = "Name")val name:String,
    @ColumnInfo(name = "Budget")val budget:String,
    @ColumnInfo(name = "Income")val income:String
    )