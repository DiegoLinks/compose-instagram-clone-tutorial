package com.compose.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.compose.instagram.data.Story
import com.compose.instagram.ui.theme.spacingSmall

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun StoryItem(story: Story) {
    Column(
        modifier = Modifier
            .padding(horizontal = spacingSmall)
            .background(MaterialTheme.colorScheme.background)
    ) {
        GlideImage(
            model = story.userAvatar,
            contentDescription = ""
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    StoryItem(story = Story(userNickName = "", userAvatar = ""))
}