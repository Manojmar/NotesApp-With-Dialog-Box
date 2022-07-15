package com.example.dialogbox.model

import android.provider.Settings
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class UserData (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="title")
    val userName: String,
    @ColumnInfo(name = "para")
    val userMb:String
        )