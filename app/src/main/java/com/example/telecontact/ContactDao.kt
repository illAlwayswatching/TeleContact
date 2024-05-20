package com.example.telecontact

import androidx.lifecycle.LifecycleOwner;
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ContactDao {

    @Upsert
    suspend fun upsertContact(contact: Contact): Unit

    @Delete
    suspend fun deleteContact(contact: Contact): Unit

    @Query("SELECT * FROM contact ORDER BY firstname ASC")
    fun getContactsOrderedByFirstName():kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastname ASC")
    fun getContactsOrderedByLastName(): kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phonenumber ASC")
    fun getContactsOrderedByPhonenumber(): kotlinx.coroutines.flow.Flow<List<Contact>>

}