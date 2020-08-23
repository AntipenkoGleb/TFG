package by.agd.tfg

import android.app.Application
import by.agd.tfg.firebase.AppAnalytics
import com.google.android.gms.ads.MobileAds
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
        Timber.plant(Timber.DebugTree())
    }
}