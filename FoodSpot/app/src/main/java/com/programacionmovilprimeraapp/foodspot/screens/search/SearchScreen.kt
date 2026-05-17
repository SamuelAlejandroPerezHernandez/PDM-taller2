package com.programacionmovilprimeraapp.foodspot.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.programacionmovilprimeraapp.foodspot.model.Restaurant
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Search(
    goBack: () -> Unit,
    goToDetail: (Int) -> Unit,
    goToHome: () -> Unit
){
    val viewModel: SearchViewModel = viewModel()

    val selectedRestaurant by viewModel.filteredName.collectAsState()

    var searchText by rememberSaveable{mutableStateOf("")}

    val changeTextFild: (String) -> Unit = {
        it -> searchText = it
    }

    val loadRestaurantList = {
        viewModel.loadRestaurants(searchText)
    }

    Scaffold(
        topBar = { SearchTopAppBar(goBack) },
        bottomBar = { SearchBottomBar(goToHome) }
    ){
        innerPadding ->
        SearchContent(innerPadding, searchText, changeTextFild, selectedRestaurant, loadRestaurantList, goToDetail)
    }
}

@Composable
fun SearchContent(
    padding: PaddingValues,
    searchText: String,
    changeTextFild: (String) -> Unit,
    selectedRestaurant: List<Restaurant>,
    loadRestaurantList: () -> Unit,
    goToDetail: (Int) -> Unit
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .background(Color(0xFF000103)),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item{
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ){
                TextField(
                    value = searchText,
                    onValueChange = { changeTextFild(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    placeholder = { Text("Buscar restaurante...") }
                )

                Spacer(modifier = Modifier.height(8.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Button(
                        onClick = { loadRestaurantList() },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFF312E)
                        )
                    ){
                        Text(text = "Buscar",
                            fontSize = 20.sp,
                            color = Color.White)
                    }
                }
            }
        }

        if(selectedRestaurant.isEmpty()){
            item{
                Text(
                    text = "No se encontraron resultados",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(bottom = 14.dp))
            }
        }
        else{
            item{
                Text(
                    text = "${selectedRestaurant.size} resultados encontrados",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(bottom = 14.dp)
                )
            }

            items(selectedRestaurant){
                    restaurante ->
                Card(
                    onClick = { goToDetail(restaurante.id) },
                    modifier = Modifier
                        .width(250.dp)
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF333138)
                    )
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            modifier = Modifier
                                .width(250.dp)
                                .height(250.dp)
                        ){
                            AsyncImage(
                                model = restaurante.imageUrl,
                                contentDescription = "restaurant image",
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Column(
                            modifier = Modifier.padding(12.dp)
                        ) {
                            Text(
                                text = restaurante.name,
                                fontSize = 25.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}