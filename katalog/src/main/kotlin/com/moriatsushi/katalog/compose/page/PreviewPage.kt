package com.moriatsushi.katalog.compose.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FormatTextdirectionLToR
import androidx.compose.material.icons.filled.FormatTextdirectionRToL
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
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
    var isRtl by remember { mutableStateOf(false) }
    Scaffold(
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            PreviewTopAppBar(
                name = component.name,
                isRtl = isRtl,
                onClickClose = onClickClose,
                onToggleRtl = { isRtl = !isRtl },
            )
        }
    ) { padding ->
        CompositionLocalProvider(
            LocalLayoutDirection provides if (isRtl) LayoutDirection.Rtl else LayoutDirection.Ltr,
        ) {
            Preview(
                modifier = Modifier.fillMaxSize().padding(padding),
                extensions = extensions,
                extNavState = extNavState,
                clickable = true,
                definition = component.definition,
            )
        }
    }
}

@Composable
private fun PreviewTopAppBar(
    name: String,
    isRtl: Boolean,
    onClickClose: () -> Unit,
    onToggleRtl: () -> Unit,
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
        actions = {
            IconButton(onClick = onToggleRtl) {
                Icon(
                    imageVector = if (isRtl) {
                        Icons.Filled.FormatTextdirectionLToR
                    } else {
                        Icons.Filled.FormatTextdirectionRToL
                    },
                    contentDescription = if (isRtl) "switch to LTR" else "switch to RTL",
                )
            }
        },
    )
}
