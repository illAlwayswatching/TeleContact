package com.example.telecontact

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val firstname: String,
    val lastname: String,
    val phonenumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
