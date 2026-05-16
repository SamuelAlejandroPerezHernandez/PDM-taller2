package com.programacionmovilprimeraapp.foodspot.data

import com.programacionmovilprimeraapp.foodspot.model.Restaurant

interface RestaurantRepository{
    suspend fun getRestaurants(): List<Restaurant>
}