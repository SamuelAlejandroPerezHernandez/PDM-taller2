package com.programacionmovilprimeraapp.foodspot.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepository
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepositoryImplement
import com.programacionmovilprimeraapp.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SearchViewModel: ViewModel(){

    val repository: RestaurantRepository = RestaurantRepositoryImplement()

    val _restaurant = MutableStateFlow<List<Restaurant>>(emptyList())

    val _filteredList = MutableStateFlow<List<Restaurant>>(emptyList())
    val filteredName = _filteredList.asStateFlow()

    init{
        loadRestaurants("")
    }

    fun loadRestaurants(filteredName: String){
        viewModelScope.launch{
            _restaurant.value = repository.getRestaurants()

            val filteredRestaurants = _restaurant.value.filter{
                restaurants ->
                restaurants.name.contains(filteredName, ignoreCase = true)
                        ||
                restaurants.menu.any{
                    dish ->
                    dish.name.contains(filteredName, ignoreCase = true)
                }
            }

            _filteredList.value = filteredRestaurants
        }
    }

}