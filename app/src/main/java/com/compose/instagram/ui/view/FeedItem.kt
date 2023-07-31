package com.compose.instagram.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.instagram.data.model.Feed

@Composable
fun FeedItem(feed: Feed) {
}

@Preview(showBackground = true)
@Composable
fun FeedItemPreview() {
    FeedItem(
        feed = Feed(
            userNickName = "Joe Doe",
            localName = "Brasil",
            userAvatar = "",
            imageUrl = "",
            description = "",
            postedAgo = "Há 2 dias"
        )
    )
}