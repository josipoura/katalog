package com.moriatsushi.katalog.compose.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moriatsushi.katalog.compose.widget.KatalogTopAppBar
import com.moriatsushi.katalog.compose.widget.Preview
import com.moriatsushi.katalog.domain.CatalogItem
import com.moriatsushi.katalog.domain.Extensions
import com.moriatsushi.katalog.ext.ExperimentalKatalogExtApi
import com.moriatsushi.katalog.ext.ExtNavState

@ExperimentalKatalogExtApi
@Composable
internal fun PreviewPage(
    component: CatalogItem.Component,
    extensions: Extensions,
    extNavState: ExtNavState,
    onClickClose: () -> Unit,
) {
    Scaffold(
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            PreviewTopAppBar(
                name = component.name,
                onClickClose = onClickClose,
            )
        }
    ) { padding ->
        Preview(
            modifier = Modifier.fillMaxSize().padding(padding),
            extensions = extensions,
            extNavState = extNavState,
            clickable = true,
            definition = component.definition,
        )
    }
}

@Composable
private fun PreviewTopAppBar(
    name: String,
    onClickClose: () -> Unit,
) {
    KatalogTopAppBar(
        title = name,
        navigationIcon = {
            IconButton(onClick = onClickClose) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "close",
                )
            }
        },
    )
}
