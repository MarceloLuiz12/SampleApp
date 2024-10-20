package com.example.feature_sample.home

import androidx.lifecycle.ViewModel
import com.example.feature_sample.navigation.SampleNavigation
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HomeViewModel: ViewModel(), KoinComponent {
    private val navigation: SampleNavigation by inject()

    fun navigateToRetrofitScreen() {
        navigation.navigateToRetrofit(id = 5)
    }
}