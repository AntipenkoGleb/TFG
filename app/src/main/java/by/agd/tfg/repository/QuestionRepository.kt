package by.agd.tfg.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import by.agd.tfg.model.Question
import javax.inject.Inject

class QuestionRepository @Inject constructor() : IBaseRepository<Question> {
    override fun getAll(): LiveData<List<Question>> {
        return MutableLiveData(
            listOf(
                Question(text = "Q1", wrong = listOf("W1", "W2", "W3"), correct = "R"),
                Question(text = "Q2", wrong = listOf("W1", "W2", "W3"), correct = "R"),
                Question(text = "Q3", wrong = listOf("W1", "W2", "W3"), correct = "R"),
                Question(text = "Q4", wrong = listOf("W1", "W2", "W3"), correct = "R"),
                Question(text = "Q5", wrong = listOf("W1", "W2", "W3"), correct = "R"),
                Question(text = "Q6", wrong = listOf("W1", "W2", "W3"), correct = "R")
            )
        )
    }

    override fun get(id: Long): LiveData<Question> {
        return MutableLiveData(Question().also { it.id = id })
    }

    override suspend fun update(item: Question) {

    }

    override fun getAll(parentId: Long): LiveData<List<Question>> {
        return getAll()
    }

}