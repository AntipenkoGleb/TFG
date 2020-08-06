package by.agd.tfg.adapter.base

class ItemClickListener<T>(private val listener: (item: T) -> Unit) {

    fun onClick(item: T) = listener(item)

}