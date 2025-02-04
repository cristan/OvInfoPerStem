package nl.openov.ovinfoperstem

import android.app.Activity
import android.content.Intent
import android.speech.RecognizerIntent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.jordond.compass.Coordinates
import nl.openov.ovinfoperstem.ui.theme.OvInfoPerStemTheme
import nl.openov.ovinfoperstem.viewmodel.HomeContent
import nl.openov.ovinfoperstem.viewmodel.HomeViewModel
import org.koin.androidx.compose.koinViewModel
import java.util.Locale

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel()
) {
    val coordinates by viewModel.coordinates
    val content by viewModel.content
    val backendTexts by viewModel.backendTexts

    LaunchedEffect(Unit) {
        viewModel.onScreenLaunched()
    }

    HomeView(content, coordinates, backendTexts, viewModel::onLoadLocationClicked)
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun HomeView(
    content: HomeContent,
    coordinates: Coordinates?,
    backendTexts: List<String>,
    onLocationClicked: () -> Unit,
) {
    OvInfoPerStemTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
                        titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    title = {
                        Text(stringResource(R.string.app_name))
                    }
                )
            },
            contentWindowInsets = WindowInsets(0, 0, 0, 0)
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                when (content) {
                    is HomeContent.Main -> {
                        MainContent(coordinates, backendTexts)
                    }

                    HomeContent.RequireGpsPermission -> {
                        RequireGpsContent(onLocationClicked)
                    }
                }
            }
        }
    }
}

@Composable
private fun RequireGpsContent(onLocationClicked: () -> Unit) {
    Icon(
        painter = painterResource(id = R.drawable.baseline_location_searching_24),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary,
        modifier = Modifier.size(92.dp),
    )
    Button(onClick = onLocationClicked) {
        Text("Laad je locatie")
    }
}

@Composable
private fun MainContent(coordinates: Coordinates?, backendTexts: List<String>) {
    val speechText = remember { mutableStateOf("Your speech will appear here.") }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == Activity.RESULT_OK) {
            val data = it.data
            val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            speechText.value = result?.get(0) ?: "No speech detected."
        } else {
            speechText.value = "[Speech recognition failed.]"
        }
    }

    Button(onClick = {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Waar wil je naartoe?")
        launcher.launch(intent)
    }) {
        Image(
            painter = painterResource(id = R.drawable.baseline_mic_24),
            contentDescription = null,
            modifier = Modifier.size(92.dp),
        )
    }
    Spacer(modifier = Modifier.padding(16.dp))
    if (coordinates != null) {
        Text("Location:\n${coordinates.latitude}, ${coordinates.latitude}\n")
    }
    Text(speechText.value, textAlign = TextAlign.Center)

    LazyColumn {
        items(backendTexts) { backendText ->
            Text(backendText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NeedGpsPermissionPreview() {
    HomeView(HomeContent.RequireGpsPermission, null, emptyList(), {})
}

@Preview(showBackground = true)
@Composable
fun MainWithLocationPreview() {
    HomeView(HomeContent.Main, Coordinates(37.423442344234424, 37.423442344234), emptyList(), {})
}

@Preview(showBackground = true)
@Composable
fun MainWithoutLocationPreview() {
    HomeView(HomeContent.Main, null, emptyList(), {})
}