package by.agd.tfg.ui.viewmodels

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import by.agd.tfg.model.Category
import by.agd.tfg.repository.CategoryRepository

class CategoryViewModel @ViewModelInject constructor(
    private val repository: CategoryRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _categories = repository.getAll()
    val categories: LiveData<List<Category>> get() = _categories
}