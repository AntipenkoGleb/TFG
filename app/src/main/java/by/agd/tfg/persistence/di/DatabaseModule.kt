package by.agd.tfg.persistence.di

import android.content.Context
import androidx.room.Room
import by.agd.tfg.persistence.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(@ApplicationContext app: Context): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, "app_db").build()
    }

    @Provides
    fun provideCategoryDao(database: AppDatabase) = database.categoryDao()

    @Provides
    fun provideTopicDao(database: AppDatabase) = database.topicDao()

    @Provides
    fun provideQuestionDao(database: AppDatabase) = database.questionDao()
}