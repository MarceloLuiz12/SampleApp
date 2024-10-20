package com.example.di.di.modules

import com.example.navigation.navigation.SampleNavigationImpl
import com.example.feature_sample.navigation.SampleNavigation
import com.example.navigation.navigation.NavigationManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

val navigationModule = module {
    single {
        NavigationManager(
            CoroutineScope(
                SupervisorJob() + Dispatchers.Main
            )
        )
    }

    single<SampleNavigation> {
        SampleNavigationImpl(get())
    }
}