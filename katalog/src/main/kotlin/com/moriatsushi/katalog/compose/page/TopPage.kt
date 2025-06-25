package com.moriatsushi.katalog.compose.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.moriatsushi.katalog.compose.util.rememberIsTop
import com.moriatsushi.katalog.compose.widget.CatalogItemList
import com.moriatsushi.katalog.domain.CatalogItem
import com.moriatsushi.katalog.domain.Katalog
import com.moriatsushi.katalog.ext.ExperimentalKatalogExtApi
import com.moriatsushi.katalog.ext.ExtNavState

@OptIn(ExperimentalKatalogExtApi::class)
@Composable
internal fun TopPage(
    katalog: Katalog,
    extNavState: ExtNavState,
    onClickItem: (item: CatalogItem) -> Unit,
    modifier: Modifier = Modifier,
    onChangeIsTop: (isTop: Boolean) -> Unit = {},
) {
    val lazyListState = rememberLazyListState()
    val isTop by lazyListState.rememberIsTop()
    LaunchedEffect(isTop) {
        onChangeIsTop(isTop)
    }
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        CatalogItemList(
            list = katalog.items,
            extensions = katalog.extensions,
            extNavState = extNavState,
            onClick = onClickItem,
            lazyListState = lazyListState,
        )
    }
}
