package com.example.navigation.navigation

import com.example.navigation.navigation.routes.SampleRoutes
import com.example.feature_sample.navigation.SampleNavigation

class SampleNavigationImpl(
    private val navigationManager: NavigationManager
): SampleNavigation {
    override fun navigateToHome() {
        navigationManager.navigate(
            route = SampleRoutes.HomeScreen
        )
    }

    override fun navigateToRetrofit(id: Int) {
        navigationManager.navigate(
            route = SampleRoutes.RetrofitScreen(id)
        )
    }
}