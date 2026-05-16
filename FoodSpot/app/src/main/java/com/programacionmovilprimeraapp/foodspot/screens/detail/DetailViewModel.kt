package com.programacionmovilprimeraapp.foodspot.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepository
import com.programacionmovilprimeraapp.foodspot.data.RestaurantRepositoryImplement
import com.programacionmovilprimeraapp.foodspot.model.Dish
import com.programacionmovilprimeraapp.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailViewModel: ViewModel() {

    private val repository: RestaurantRepository = RestaurantRepositoryImplement()

    private val _restaurant = MutableStateFlow<List<Restaurant>>(emptyList())
    private val _dish = MutableStateFlow<List<Dish>>(emptyList())
    val dish = _dish.asStateFlow()

    private val _findedRestaurant = MutableStateFlow<Restaurant?>(null)

    val findedRestaurant = _findedRestaurant.asStateFlow()

    init{
        loadDish(0)
    }

    fun loadDish(restaurantId: Int){
        viewModelScope.launch{
            _restaurant.value = repository.getRestaurants()

            val findRestaurant = _restaurant.value.find{
                it.id == restaurantId
            }

            _findedRestaurant.value = findRestaurant

            _dish.value = findRestaurant?.menu ?:emptyList()
        }
    }

}