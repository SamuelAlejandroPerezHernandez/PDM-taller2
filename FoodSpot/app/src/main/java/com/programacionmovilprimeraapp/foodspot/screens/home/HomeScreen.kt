package com.programacionmovilprimeraapp.foodspot.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.programacionmovilprimeraapp.foodspot.model.Restaurant
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Home(
    goToDetail: (Int) -> Unit,
    goToSearch: () -> Unit
){
    val viewModel: HomeViewModel = viewModel()

    val filteredCategory by viewModel.categoryFillter.collectAsState()

    val filteredList = filteredCategory.toList()

    Scaffold(
        topBar = { HomeTopAppBar(goToSearch) },
        bottomBar = { HomeBottomBar(goToSearch) }
    ){
            innerPadding ->
        HomeContent(innerPadding,filteredList, goToDetail)
    }
}

@Composable
fun HomeContent(
    padding: PaddingValues,
    filteredList: List<Pair<String, List<Restaurant>>>,
    goToDetail: (Int) -> Unit
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .background(Color.LightGray)
    ){
        items(filteredList){
                (categoria, restaurante) ->

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 20.dp)
                ){
                    Text(text = categoria,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold)

                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ){
                        items(restaurante){
                            item ->
                            Card(
                                onClick = { goToDetail(item.id) },
                                modifier = Modifier
                                    .width(180.dp)
                                    .height(235.dp),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 6.dp
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
                                            .fillMaxWidth()
                                            .height(180.dp)
                                    ){
                                        AsyncImage(
                                            model = item.imageUrl,
                                            contentDescription = "restaurant image",
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
                                            contentScale = ContentScale.Crop,

                                        )
                                    }

                                    Text(text = item.name,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
        }
    }

}