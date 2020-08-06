package by.agd.tfg.adapter.topic

import android.view.LayoutInflater
import android.view.ViewGroup
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.base.ItemViewHolder
import by.agd.tfg.databinding.ItemTopicBinding
import by.agd.tfg.model.Topic

class TopicViewHolder(private val binding: ItemTopicBinding) : ItemViewHolder<Topic>(binding.root) {

    override fun bind(item: Topic, listener: ItemClickListener<Topic>) {
        binding.item = item
        binding.listener = listener
    }

    companion object {
        fun inflate(parent: ViewGroup): TopicViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            val binding = ItemTopicBinding.inflate(inflater, parent, false)
            return TopicViewHolder(binding)
        }
    }

}