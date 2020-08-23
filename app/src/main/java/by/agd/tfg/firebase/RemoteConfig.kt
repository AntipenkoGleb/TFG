package by.agd.tfg.firebase

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import kotlinx.coroutines.tasks.await
import timber.log.Timber
import javax.inject.Inject

class RemoteConfig @Inject constructor(private val config: FirebaseRemoteConfig) {

    suspend fun getVersion(key: String): Double {
        return try {
            config.fetchAndActivate().await()
            config.getDouble(key)
        } catch (e: Exception) {
            Timber.e(e)
            0.0
        }
    }

    companion object {
        const val KEY_CATEGORIES_VERSION = "categories_version"
        const val KEY_TOPICS_VERSION = "topic_version"
        const val KEY_QUESTIONS_VERSION = "question_version"
    }

}