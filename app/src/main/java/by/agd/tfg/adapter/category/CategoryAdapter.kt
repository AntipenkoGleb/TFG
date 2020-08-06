package by.agd.tfg.adapter.category

import android.view.ViewGroup
import by.agd.tfg.adapter.base.ItemAdapter
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.base.ItemViewHolder
import by.agd.tfg.model.Category

class CategoryAdapter(clickListener: ItemClickListener<Category>) : ItemAdapter<Category>(clickListener) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder<Category> {
        return CategoryViewHolder.inflate(parent)
    }
}