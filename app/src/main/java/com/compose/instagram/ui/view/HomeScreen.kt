package com.compose.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.instagram.data.model.Feed
import com.compose.instagram.data.model.Story
import com.compose.instagram.data.repository.stories
import com.compose.instagram.ui.theme.DividerColor
import com.compose.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        InstagramToolBar()

        StoryList(stories = stories)

        Divider(color = DividerColor, thickness = 0.2.dp)

        FeedItem(
            feed = Feed(
                userNickName = "deassis",
                localName = "Tiradentes - MG",
                userAvatar = "https://cdn.brasildefato.com.br/media/d3e65c869db03180a7d34b1569ccdc04.jpg",
                imageUrl = "https://i.pinimg.com/originals/2b/43/cf/2b43cf682ec5697cedcd6d75df3a7392.png",
                description = "Olhos de cigana oblíqua dissimimulada. Eu não sabia o que era oblíqua, mas dissimulada...",
                postedAgo = "Hà 21 horas"
            )
        )
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
fun HomeScreenPreview() {
    HomeScreen()
}