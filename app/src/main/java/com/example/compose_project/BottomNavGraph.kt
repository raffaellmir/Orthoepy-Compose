package com.example.compose_project

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose_project.ui.dictionary.DictionaryScreen
import com.example.compose_project.ui.store.StoreScreen
import com.example.compose_project.ui.training.TrainingScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Training.route
    ) {
        composable(route = BottomBarScreen.Training.route) { TrainingScreen( /*hiltViewModel()*/ ) }
        composable(route = BottomBarScreen.Dictionary.route) { DictionaryScreen() }
        composable(route = BottomBarScreen.Store.route) { StoreScreen() }
    }
}