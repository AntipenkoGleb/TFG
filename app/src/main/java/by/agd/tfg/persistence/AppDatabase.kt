package by.agd.tfg.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import by.agd.tfg.model.Category
import by.agd.tfg.model.Question
import by.agd.tfg.model.Topic
import by.agd.tfg.persistence.dao.CategoryDao
import by.agd.tfg.persistence.dao.QuestionDao
import by.agd.tfg.persistence.dao.TopicDao

@Database(
    entities = [Category::class, Topic::class, Question::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun topicDao(): TopicDao
    abstract fun questionDao(): QuestionDao
}