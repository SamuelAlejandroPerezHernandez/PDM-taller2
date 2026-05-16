package com.programacionmovilprimeraapp.foodspot.screens.search

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
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import kotlinx.coroutines.delay


@Composable
fun Search(
    goBack: () -> Unit
){
    val viewModel: SearchViewModel = viewModel()

    val selectedRestaurant by
    viewModel.filteredName.collectAsState()

    var searchText by rememberSaveable{mutableStateOf("")}

    val changeTextFild: (String) -> Unit = {
        it -> searchText = it
    }

    val loadRestaurantList = {
        viewModel.loadRestaurants(searchText)
    }

    Scaffold(
        topBar = { SearchTopAppBar(goBack) },
        bottomBar = { SearchBottomBar() }
    ){
        innerPadding ->
        SearchContent(innerPadding, searchText, changeTextFild, selectedRestaurant, loadRestaurantList)
    }
}

@Composable
fun SearchContent(
    padding: PaddingValues,
    searchText: String,
    changeTextFild: (String) -> Unit,
    selectedRestaurant: List<Restaurant>,
    loadRestaurantList: () -> Unit
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
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

                Button(
                    onClick = { loadRestaurantList() },
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(text = "Buscar")
                }
            }
        }

        items(selectedRestaurant){
            restaurante ->
            Card(
                onClick = {},
                modifier = Modifier
                    .width(250.dp)
                    .padding(horizontal = 12.dp, vertical = 8.dp)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Box(
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                    ){
                        AsyncImage(
                            model = restaurante.imageUrl,
                            contentDescription = "restaurant image",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Column(
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Text(
                            text = restaurante.name,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}