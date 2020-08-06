package by.agd.tfg.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import by.agd.tfg.model.Topic
import javax.inject.Inject

class TopicRepository @Inject constructor() : IBaseRepository<Topic> {

    override fun getAll(): LiveData<List<Topic>> {
        return MutableLiveData(
            listOf(
                Topic(),
                Topic(),
                Topic(),
                Topic(),
                Topic(),
                Topic(),
                Topic(),
                Topic(),
                Topic()
            )
        )
    }

    override fun get(id: Long): LiveData<Topic> {
        return MutableLiveData(Topic())
    }

    override suspend fun update(item: Topic) {

    }

    override fun getAll(parentId: Long): LiveData<List<Topic>> {
        return MutableLiveData(
            listOf(
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId),
                Topic(parentId)
            )
        )
    }

}