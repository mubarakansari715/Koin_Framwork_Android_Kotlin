package com.example.koin_framwork_android.Container

import android.app.Application
import com.example.koin_framwork_android.DI.AppModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(AppModule)
        }
    }
}