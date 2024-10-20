package com.example.di.di.modules

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.example.feature_sample.home.HomeViewModel

val presentationModule = module {
    viewModelOf(::HomeViewModel)
}