package com.programacionmovilprimeraapp.foodspot.model

data class Restaurant(
    var id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)









