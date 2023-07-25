package com.compose.instagram.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.instagram.R

@Composable
fun InstagramToolBar() {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .height(56.dp)
            .fillMaxWidth()
    ) {

        Text(text = "Instagram", fontSize = 32.sp, modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.ic_notification),
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
                .align(Alignment.CenterVertically),
            contentDescription = "Ícone de notificações na barra de ferramentas."
        )

        Image(
            painter = painterResource(id = R.drawable.ic_message),
            modifier = Modifier
                .size(32.dp)
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically),
            contentDescription = "Ícone de mensagens diretas (DM) na barra de ferramentas."
        )

    }
}

@Preview(showBackground = true)
@Composable
fun InstagramToolbarPreview() {
    InstagramToolBar()
}