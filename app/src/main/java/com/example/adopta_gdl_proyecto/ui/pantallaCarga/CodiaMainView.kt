package com.example.adopta_gdl_proyecto.ui.pantallaCarga

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adopta_gdl_proyecto.R

/**
 * Created by codia-figma
 */
@Composable
fun CodiaMainView() {
    // Box-fake-group-fake-group[c:newComponent]
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.size(1080.dp, 2400.dp),
    ) {
        // Box-1:511-Pantalla de carga
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .advancedShadow(color = Color(0x3f000000), alpha = 0.25f, cornersRadius = 0.dp, shadowBlurRadius = 4.dp, offsetX = 0.dp, offsetY = 4.dp)
                .background(Color(0xffffffff))
                .size(1080.dp, 2400.dp)
                .clipToBounds(),
        ) {
            // Image-1:512-image 1
            Image(
                painter = painterResource(id = R.drawable.image1_1512),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = -168.dp, y = 457.dp)
                    .size(1416.dp, 1965.dp),
            )
            // Image-1:513-image
            Image(
                painter = painterResource(id = R.drawable.image2_1513),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 0.dp, y = 1996.5.dp)
                    .size(1080.dp, 419.dp),
            )
            // Empty-1:514-image
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 0.dp, y = 84.dp)
                    .size(1080.dp, 949.dp),
            )
            // Image-1:515-Ellipse 2
            Image(
                painter = painterResource(id = R.drawable.image3_1515),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 52.dp, y = 211.dp)
                    .size(975.dp, 601.dp),
            )
            // Image-1:516-Ellipse 1
            Image(
                painter = painterResource(id = R.drawable.image4_1516),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 92.dp, y = 247.dp)
                    .size(895.dp, 529.dp),
            )
            // Empty-1:517-lLne
            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .offset(x = -0.5.dp, y = 1159.5.dp)
                    .background(Color(0xff333334), RoundedCornerShape(100.dp))
                    .size(405.dp, 15.dp),
            )
            // Image-1:518-Group 2
            Image(
                painter = painterResource(id = R.drawable.image5_1518),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(1080.dp, 776.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodiaMainViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                CodiaMainView()
            }
        }
    }
}