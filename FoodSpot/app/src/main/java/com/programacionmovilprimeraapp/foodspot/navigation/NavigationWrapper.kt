package com.programacionmovilprimeraapp.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.programacionmovilprimeraapp.foodspot.screens.detail.Detail
import com.programacionmovilprimeraapp.foodspot.screens.home.Home
import com.programacionmovilprimeraapp.foodspot.screens.search.Search

@Composable
fun NavigationWrapper(){
    val backStack = rememberNavBackStack(Routes.home)

    NavDisplay(
        backStack = backStack,

        onBack = {
            backStack.removeLastOrNull()
        },

        entryProvider = entryProvider{
            entry<Routes.home>{
                Home(
                    goToDetail = {
                        restaurantId ->
                        backStack.add(Routes.detail(restaurantId))
                    },

                    goToSearch = {
                        backStack.add(Routes.search)
                    }
                )
            }

            entry<Routes.detail>{
                Detail(
                    restaurantId = it.restaurantId,

                    goBack = {
                        backStack.removeLastOrNull()
                    },

                    goToHome = {
                        backStack.add(Routes.home)
                    },

                    goToSearch = {
                        backStack.add(Routes.search)
                    }
                )
            }

            entry<Routes.search>{
                Search(
                    goBack = {
                        backStack.removeLastOrNull()
                    },

                    goToDetail = {
                        restaurantId ->
                        backStack.add(Routes.detail(restaurantId))
                    },

                    goToHome = {
                        backStack.add(Routes.home)
                    }
                )
            }
        }
    )
}