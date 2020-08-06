package by.agd.tfg.adapter.base

import androidx.recyclerview.widget.RecyclerView

abstract class ItemAdapter<T>(
    private val clickListener: ItemClickListener<T>,
    private val data: MutableList<T> = mutableListOf()
) : RecyclerView.Adapter<ItemViewHolder<T>>() {

    fun submitList(newData: List<T>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ItemViewHolder<T>, position: Int) {
        val item = data[position]
        holder.bind(item, clickListener)
    }

    override fun getItemCount(): Int = data.size
}