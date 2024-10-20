package com.example.sampleapptest.core

import android.app.Application
import com.example.di.di.modules.dataLocalModules
import com.example.di.di.modules.dataModules
import com.example.di.di.modules.dataRemoteModules
import com.example.di.di.modules.domainModules
import com.example.di.di.modules.navigationModule
import com.example.di.di.modules.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            modules(
                listOf(
                    dataModules,
                    domainModules,
                    presentationModule,
                    dataRemoteModules,
                    dataLocalModules,
                    navigationModule
                )
            )
            androidContext(applicationContext)
        }
    }
}