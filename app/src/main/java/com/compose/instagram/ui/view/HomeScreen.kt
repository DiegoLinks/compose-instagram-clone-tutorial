package com.compose.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.compose.instagram.data.Story
import com.compose.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen() {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)) {

        InstagramToolBar()

        val stories = listOf(
            Story(userNickName = "janedoe_", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe_janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "doe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "jane", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "j", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
        )

        StoryList(stories = stories)
    }
}

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(modifier = Modifier.padding(top = spacingMedium)) {
        itemsIndexed(stories) { _, item ->
            StoryItem(story = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}