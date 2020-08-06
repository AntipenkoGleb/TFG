package by.agd.tfg.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import by.agd.tfg.model.Category
import by.agd.tfg.persistence.dao.CategoryDao
import javax.inject.Inject

class CategoryRepository @Inject constructor(categoryDao: CategoryDao) : IBaseRepository<Category> {

    override fun getAll(): LiveData<List<Category>> {
        return MutableLiveData(
            listOf(
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category()
            )
        )
    }

    override fun get(id: Long): LiveData<Category> {
        return MutableLiveData<Category>()
    }

    override suspend fun update(item: Category) {
        TODO("Not yet implemented")
    }

    override fun getAll(parentId: Long): LiveData<List<Category>> {
        return MutableLiveData(
            listOf(
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category(),
                Category()
            )
        )
    }

}