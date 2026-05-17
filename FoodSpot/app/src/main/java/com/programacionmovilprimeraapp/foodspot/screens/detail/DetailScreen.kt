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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
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
    goBack: () -> Unit,
    goToHome: () -> Unit,
    goToSearch: () -> Unit,
){
    val viewModel: DetailViewModel = viewModel()

    LaunchedEffect(restaurantId){
        viewModel.loadDish(restaurantId)
    }

    val dishList by viewModel.dish.collectAsState()

    val restaurant by viewModel.findedRestaurant.collectAsState()

    Scaffold(
        topBar = { DetailTopAppBar(goBack) },
        bottomBar = { DetailBottomBar(goToHome, goToSearch) }
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
            .background(Color(0xFF000103))
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
                    color = Color.White,
                    fontWeight = FontWeight.Bold)

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF333138)
                    )
                ){
                    Text(text = restaurant?.description.toString(),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(16.dp))
                }
            }
        }

        items(dishList){
                item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF333138)
                )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    Box(
                        modifier = Modifier
                            .width(115.dp)
                            .height(115.dp)
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
                        Text(text = item.name,
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold)

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(text = item.description,
                            fontSize = 15.sp,
                            color = Color.White)

                        Spacer(modifier = Modifier.height(12.dp))

                        Button(
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "${item.name} agregado al carrito",
                                    Toast.LENGTH_SHORT
                                ).show()
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFF312E)
                            )
                        ){
                            Text(text = "Agregar a carrito",
                                fontSize = 15.sp,
                                color = Color.White)
                        }
                    }
                }
            }
        }
    }
}


