package com.example.lazyList.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lazyList.HomeScreen
import com.example.lazyList.screenName.Home
import com.example.lazyList.screenName.LazyColumnScreen
import com.example.lazyList.screenName.LazyGridScreen
import com.example.lazyList.screenName.LazyRowScreen
import com.example.lazyList.screens.ColumnScreen
import com.example.lazyList.screens.GridScreen
import com.example.lazyList.screens.RowScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Home
    ) {

        composable<Home> {
            HomeScreen(
                rowClick = {
                    navController.navigate(LazyRowScreen)
                },
                gridClick = {
                    navController.navigate(LazyGridScreen)
                },
                columnClick = {
                    navController.navigate(LazyColumnScreen)
                })
        }

        composable<LazyRowScreen> {
            RowScreen()
        }

        composable<LazyGridScreen> {
            GridScreen()
        }

        composable<LazyColumnScreen> {
            ColumnScreen()
        }

    }

}