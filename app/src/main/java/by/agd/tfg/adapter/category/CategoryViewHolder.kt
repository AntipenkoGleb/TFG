package by.agd.tfg.adapter.category

import android.view.LayoutInflater
import android.view.ViewGroup
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.base.ItemViewHolder
import by.agd.tfg.databinding.ItemCategoryBinding
import by.agd.tfg.model.Category

class CategoryViewHolder(private val binding: ItemCategoryBinding) : ItemViewHolder<Category>(binding.root) {

    override fun bind(item: Category, listener: ItemClickListener<Category>) {
        binding.item = item
        binding.listener = listener
    }

    companion object {
        fun inflate(parent: ViewGroup): CategoryViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            val binding = ItemCategoryBinding.inflate(inflater, parent, false)
            return CategoryViewHolder(binding)
        }
    }
}