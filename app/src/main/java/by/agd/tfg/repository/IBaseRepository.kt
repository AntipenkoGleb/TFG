package by.agd.tfg.repository

import androidx.lifecycle.LiveData

interface IBaseRepository<T> {

    fun getAll(): LiveData<List<T>>

    fun get(id: Long): LiveData<T>

    suspend fun update(item: T)

    fun getAll(parentId: Long) : LiveData<List<T>>

}