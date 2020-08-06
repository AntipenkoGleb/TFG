package by.agd.tfg.persistence.dao

import androidx.room.Dao
import by.agd.tfg.model.Question
import by.agd.tfg.persistence.base.IBaseDao

@Dao
interface QuestionDao : IBaseDao<Question> {

}