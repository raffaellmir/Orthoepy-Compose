package com.example.compose_project.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_project.ui.theme.ComposeTheme

@Composable
fun DictionaryScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Dictionary",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Light,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DictionaryScreenPreview() {
    ComposeTheme {
        DictionaryScreen()
    }
}