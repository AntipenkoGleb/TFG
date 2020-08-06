package by.agd.tfg.persistence.base

import androidx.room.Insert
import androidx.room.Update

interface IBaseDao<T> {

    @Insert
    suspend fun insert(item: T): Long

    @Update
    suspend fun update(item: T)

}