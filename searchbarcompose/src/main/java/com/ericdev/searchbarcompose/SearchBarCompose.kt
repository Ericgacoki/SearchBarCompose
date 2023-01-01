package com.ericdev.searchbarcompose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.MinHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchBarCompose(
    modifier: Modifier = Modifier
        .clip(RoundedCornerShape(100))
        .background(
            if (isSystemInDarkTheme())
                Color.White.copy(alpha = .24F) else
                Color.Black.copy(alpha = .24F)
        ),
    hint: String = "Search",
    onSearchParamChange: (String) -> Unit,
    onSearchClick: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(MinHeight) // 56.dp
    ) {
        var searchParam: String by remember { mutableStateOf("") }

        val focusRequester = remember { FocusRequester() }
        val focusManager = LocalFocusManager.current

        TextField(
            value = searchParam,
            onValueChange = { newValue ->
                searchParam = if (newValue.trim().isNotEmpty()) newValue else ""
                onSearchParamChange(newValue)
            },
            modifier = Modifier
                .fillMaxSize()
                .focusRequester(focusRequester = focusRequester),
            singleLine = true,
            placeholder = {
                Text(text = hint)
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ), keyboardOptions = KeyboardOptions(
                autoCorrect = true,
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearchClick(searchParam)
                }
            ),
            trailingIcon = {
                Row {
                    AnimatedVisibility(visible = searchParam.trim().isNotEmpty()) {
                        IconButton(onClick = {
                            focusManager.clearFocus()
                            searchParam = ""
                            onSearchParamChange(searchParam)
                        }) {
                            Icon(
                                imageVector = Icons.Default.Clear,
                                contentDescription = null
                            )
                        }
                    }

                    IconButton(onClick = {
                        onSearchClick(searchParam)
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null
                        )
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLight() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        SearchBarCompose(
            onSearchParamChange = {

            },
            onSearchClick = {

            }
        )
    }
}
