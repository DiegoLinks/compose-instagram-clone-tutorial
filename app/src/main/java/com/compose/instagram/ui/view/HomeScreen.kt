package com.compose.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
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
import com.compose.instagram.data.repository.feedList
import com.compose.instagram.data.repository.stories
import com.compose.instagram.ui.theme.DividerColor
import com.compose.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen() {

    LazyColumn(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {

        item {
            InstagramToolBar()
        }

        item {
            StoryList(stories = stories)
        }

        item {
            Divider(color = DividerColor, thickness = 0.2.dp)
        }

        feedList(feedList = feedList)
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

fun LazyListScope.feedList(feedList: List<Feed>) {
    itemsIndexed(feedList) { _, item ->
        FeedItem(feed = item)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}