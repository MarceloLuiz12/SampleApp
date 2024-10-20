package com.example.sampleapptest.navigation.hosts

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.feature_sample.home.HomeScreen
import com.example.feature_sample.retrofit.RetrofitScreen
import com.example.navigation.navigation.routes.SampleRoutes


@Composable
fun SampleHosts(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = SampleRoutes.HomeScreen
    ) {
        composable<SampleRoutes.HomeScreen> {
            HomeScreen()
        }

        composable<SampleRoutes.RetrofitScreen> { entry ->
            val id: SampleRoutes.RetrofitScreen = entry.toRoute()
            RetrofitScreen(id.id)
        }
    }
}