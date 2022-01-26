package com.example.compose_project.ui.training

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compose_project.data.database.Word
import com.example.compose_project.ui.main.MainViewModel

@Composable
fun TrainingScreen(viewModel: MainViewModel = hiltViewModel()) {

    val textState = remember { mutableStateOf(TextFieldValue("")) }
    val letterCount : Int? = viewModel.getLetterCount.observeAsState().value
    val words : List<Word>? = viewModel.getAllWords.observeAsState().value

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Букв: $letterCount Слово: ${words?.get(2)?.wordText}",
            color = Color.Black
        )

        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(

            value = textState.value,
            onValueChange = { textState.value = it },
            label = { Text(text = "dude...", fontSize = 16.sp) },
            modifier = Modifier
                .fillMaxWidth(0.7f),
        )

        Spacer(modifier = Modifier.padding(16.dp))

        Button(
            onClick = { viewModel.increaseLetterCount(textState.value.text.toInt()) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 0.dp)
        ) { Text(text = "Буквы") }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun TrainingScreenPreview(viewModel: MainViewModel) {
    ComposeTheme {
        TrainingScreen(viewModel = viewModel)
    }
}*/
