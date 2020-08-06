package by.agd.tfg.adapter.topic

import android.view.ViewGroup
import by.agd.tfg.adapter.base.ItemAdapter
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.base.ItemViewHolder
import by.agd.tfg.model.Topic

class TopicAdapter(listener: ItemClickListener<Topic>) : ItemAdapter<Topic>(listener) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder<Topic> {
        return TopicViewHolder.inflate(parent)
    }

}