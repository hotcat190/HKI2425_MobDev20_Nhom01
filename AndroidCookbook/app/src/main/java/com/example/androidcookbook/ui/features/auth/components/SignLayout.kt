package com.example.androidcookbook.ui.features.auth.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidcookbook.ui.features.auth.theme.SignLayoutTheme

@Composable
fun SignLayout(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    SignLayoutTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .verticalScroll(rememberScrollState())
        ) {
            val ovalColor = MaterialTheme.colorScheme.onBackground
            // Background and layout setup
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawOval(
                    color = ovalColor,
                    topLeft = Offset(-215f, -290f),
                    size = Size(1500f, 750f)
                )
            }

            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .fillMaxHeight()
                    .padding(11.dp)
                    .align(Alignment.TopCenter)
                    .offset(y = 70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                AppLogo()

                content()
            }
        }
    }
}

@Preview
@Composable
fun LayoutPreview() {
    SignLayout {  }
}