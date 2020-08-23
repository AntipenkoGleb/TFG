package by.agd.tfg.firebase

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase


object AppAnalytics {

    private var analytics: FirebaseAnalytics = Firebase.analytics

    fun logOnCategorySelected(categoryId: Long) {
        analytics.logEvent(Event.CATEGORY_SELECTED) { param(Param.CATEGORY_ID, categoryId) }
    }

    fun logOnTopicSelected(topicId: Long) {
        analytics.logEvent(Event.TOPIC_SELECTED) { param(Param.TOPIC_ID, topicId) }
    }

    object Param {
        const val CATEGORY_ID = "category_id"
        const val TOPIC_ID = "topic_id"
    }

    object Event {
        const val CATEGORY_SELECTED = "category_selected"
        const val TOPIC_SELECTED = "topic_selected"
    }
}