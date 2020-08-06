package by.agd.tfg.persistence.dao

import androidx.room.Dao
import by.agd.tfg.model.Topic
import by.agd.tfg.persistence.base.IBaseDao

@Dao
interface TopicDao : IBaseDao<Topic> {
}