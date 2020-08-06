package by.agd.tfg.persistence.dao

import androidx.room.Dao
import by.agd.tfg.model.Category
import by.agd.tfg.persistence.base.IBaseDao

@Dao
interface CategoryDao : IBaseDao<Category> {
}