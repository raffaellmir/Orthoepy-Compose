package com.example.compose_project

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose_project.screens.DictionaryScreen
import com.example.compose_project.screens.StoreScreen
import com.example.compose_project.screens.TrainingScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Training.route
    ) {
        composable(route = BottomBarScreen.Training.route) { TrainingScreen( hiltViewModel() )}
        composable(route = BottomBarScreen.Dictionary.route) { DictionaryScreen() }
        composable(route = BottomBarScreen.Store.route) { StoreScreen() }
    }
}