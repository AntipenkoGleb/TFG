package by.agd.tfg.ui.viewmodels

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import by.agd.tfg.model.Topic
import by.agd.tfg.repository.IBaseRepository
import by.agd.tfg.repository.TopicRepository

class TopicViewModel @ViewModelInject constructor(
    repository: TopicRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val categoryId = savedStateHandle.get<Long>("categoryId") ?: 0L

    private val _topics: LiveData<List<Topic>> = repository.getAll()
    val topics get() = _topics

}