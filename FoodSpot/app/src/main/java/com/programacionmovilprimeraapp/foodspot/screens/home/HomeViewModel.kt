package com.programacionmovilprimeraapp.foodspot.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepository
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepositoryImplement
import com.programacionmovilprimeraapp.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel(){
    private val repository: RestaurantRepository = RestaurantRepositoryImplement()

    private val _restaurant = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurant = _restaurant.asStateFlow()

    private val _categoryFillter = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())

    val categoryFillter = _categoryFillter.asStateFlow()

    init{
        loadRestaurants()
    }

    fun loadRestaurants(){
        viewModelScope.launch{
            _restaurant.value = repository.getRestaurants()

            _categoryFillter.value = _restaurant.value.groupBy{
                it.categories.first()
            }
        }
    }
}