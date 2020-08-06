package by.agd.tfg.ui.view.category

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import by.agd.tfg.R
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.category.CategoryAdapter
import by.agd.tfg.databinding.FragmentCategoryBinding
import by.agd.tfg.model.Category
import by.agd.tfg.ui.viewmodels.CategoryViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CategoryFragment : Fragment(R.layout.fragment_category) {

    private val viewModel: CategoryViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCategoryBinding.bind(view)

        val listener = ItemClickListener<Category> {
            CategoryFragmentDirections.toTopicFragment(it.id).navigate(this)
        }

        val categoryAdapter = CategoryAdapter(listener)

        binding.rvCategory.apply {
            setHasFixedSize(true)
            adapter = categoryAdapter
        }

        viewModel.categories.observe(this.viewLifecycleOwner, Observer {
            categoryAdapter.submitList(it)
        })
    }
}

fun NavDirections.navigate(fragment: Fragment) {
    fragment.findNavController().navigate(this)
}

