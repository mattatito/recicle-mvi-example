package com.matthbr.recicle.data.database

import androidx.room.*
import com.matthbr.recicle.domain.model.Item

@Dao
interface ItemDAO {

    @Query("SELECT * FROM Item")
    suspend fun getAllItems() : List<Item>

    @Insert
    suspend fun insertNewItem(item : Item)

    @Update
    suspend fun updateItem(item : Item)

    @Delete
    suspend fun deleteItem(item: Item)

}