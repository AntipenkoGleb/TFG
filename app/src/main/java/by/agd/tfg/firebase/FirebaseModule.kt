package by.agd.tfg.firebase

import by.agd.tfg.R
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.google.firebase.storage.ktx.storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object FirebaseModule {

    @Provides
    fun provideFirestore() = Firebase.firestore

    @Provides
    fun provideStorage() = Firebase.storage

    @Provides
    fun provideFirestoreDao(firestore: FirebaseFirestore) = FirebaseFirestoreDao(firestore)

    @Provides
    fun provideRemoteConfig() = Firebase.remoteConfig.apply {
        setDefaultsAsync(R.xml.remote_config_defaults)
    }
}