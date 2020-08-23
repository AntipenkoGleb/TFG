package by.agd.tfg.firebase

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import javax.inject.Inject

class FirebaseFirestoreDao @Inject constructor(private val firestore: FirebaseFirestore) {

    fun getCategories(): Task<QuerySnapshot> {
        return firestore.collection(Category.COLLECTION_NAME).get()
    }

    fun getTopics(categoryId: Long): Task<QuerySnapshot> {
        return firestore.collection(Topic.COLLECTION_NAME)
            .whereArrayContains(Topic.CATEGORY_FOREIGN_KEY, categoryId).get()
    }

    fun getQuestions(topicId: Long): Task<QuerySnapshot> {
        return firestore.collection(Question.COLLECTION_NAME)
            .whereArrayContains(Question.TOPIC_FOREIGN_KEY, topicId).get()
    }

    private object Category {
        const val COLLECTION_NAME = "category"
    }

    private object Topic {
        const val COLLECTION_NAME = "topic"
        const val CATEGORY_FOREIGN_KEY = "categoryId"
    }

    private object Question {
        const val COLLECTION_NAME = "question"
        const val TOPIC_FOREIGN_KEY = "topicId"
    }

}