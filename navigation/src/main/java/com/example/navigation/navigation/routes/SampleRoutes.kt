package com.example.navigation.navigation.routes

import kotlinx.serialization.Serializable

sealed class SampleRoutes {
    @Serializable
    data object HomeScreen : SampleRoutes()

    @Serializable
    data class RetrofitScreen(val id: Int) : SampleRoutes()
}