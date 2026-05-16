package com.programacionmovilprimeraapp.foodspot.screens.detail

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.programacionmovilprimeraapp.foodspot.model.Dish
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.programacionmovilprimeraapp.foodspot.model.Restaurant

@Composable
fun Detail(
    restaurantId: Int,
    goBack: () -> Unit
){
    val viewModel: DetailViewModel = viewModel()

    LaunchedEffect(restaurantId){
        viewModel.loadDish(restaurantId)
    }

    val dishList by viewModel.dish.collectAsState()

    val restaurant by viewModel.findedRestaurant.collectAsState()

    Scaffold(
        topBar = { DetailTopAppBar(goBack) },
        bottomBar = { DetailBottomBar() }
    ){
        innerPadding ->
        DetailContent(innerPadding, dishList, restaurant)
    }
}

@Composable
fun DetailContent(
    padding: PaddingValues,
    dishList: List<Dish>,
    restaurant: Restaurant?,
){
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .background(Color.LightGray)
    ){
        item{
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(
                    modifier = Modifier
                        .width(125.dp)
                        .height(125.dp)
                ){
                    AsyncImage(
                        model = restaurant?.imageUrl,
                        contentDescription = "restaurantLogo",
                        modifier = Modifier
                            .fillMaxSize()
                            .size(140.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(text = restaurant?.name.toString(),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)
            }
        }

        items(dishList){
                item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                    ){
                        AsyncImage(
                            model = item.imageUrl,
                            contentDescription = "dish image",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }

                    Column(
                        verticalArrangement = Arrangement.Center
                    ){
                        Text(text = item.name)

                        Text(text = item.description)

                        Button(
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "${item.name} agregado al carrito",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        ){
                            Text(text = "Agregar a carrito")
                        }
                    }
                }
            }
        }
    }
}


