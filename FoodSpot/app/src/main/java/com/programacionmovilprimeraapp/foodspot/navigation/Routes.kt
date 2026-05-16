package com.programacionmovilprimeraapp.foodspot.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey{

    @Serializable
    data object home: Routes()

    @Serializable
    data class detail(val restaurantId: Int): Routes()

    @Serializable
    data object search: Routes()
}