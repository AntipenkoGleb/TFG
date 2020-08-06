package by.agd.tfg.adapter.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class ItemViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bind(item: T, listener: ItemClickListener<T>)

}