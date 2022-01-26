package com.example.compose_project

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Training: BottomBarScreen (
        route = "training",
        title = "Training",
        icon = Icons.Default.Home
    )

    object Dictionary: BottomBarScreen (
        route = "dictionary",
        title = "Dictionary",
        icon = Icons.Default.List
    )

    object Store: BottomBarScreen (
        route = "store",
        title = "Store",
        icon = Icons.Default.ShoppingCart
    )
}
