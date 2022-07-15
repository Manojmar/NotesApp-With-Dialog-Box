package com.example.dialogbox

import android.provider.ContactsContract
import androidx.room.Dao
import androidx.room.Insert
import com.example.dialogbox.model.UserData

@Dao
interface NoteDao {
    @Insert
    fun insert(note:UserData)
}