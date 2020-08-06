package by.agd.tfg.ui.viewmodels

import android.view.View
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import by.agd.tfg.model.Question
import by.agd.tfg.repository.QuestionRepository

class GameViewModel @ViewModelInject constructor(
    private val repository: QuestionRepository,
    @Assisted savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _questions = repository.getAll()
    val questions get() = _questions

    private val _currentPage = MutableLiveData(1)
    val currentPage: LiveData<Int> get() = _currentPage

    private val _answered = MutableLiveData(false)
    val answered: LiveData<Boolean> get() = _answered

    private val _answerId = MutableLiveData<Int>()
    val answerId: LiveData<Int> get() = _answerId

    private var questionId = -1

    private val _question = MutableLiveData<Question>()
    val question: LiveData<Question> get() = _question

    fun start() {
        // If questions are loaded
        _questions.value?.let {
            // display next page
            next()
        }
    }

    fun checkAnswer(answerId: Int) {
        _answerId.postValue(answerId)
        _answered.postValue(true)
    }

    fun next() {
        // If is not last question
        if (++questionId < questions.value!!.size) {
            // update question
            _question.postValue(_questions.value!![questionId])
            // hide going next button
            _answered.postValue(false)
        } else {
            // if last question save results to the database
            saveResults()
        }
        // and display next page
        _currentPage.postValue(_currentPage.value!! + 1)
    }


    fun end(view: View) {
        view.findNavController().navigateUp()
    }

    private fun saveResults() {

    }
}