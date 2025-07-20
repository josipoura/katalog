package com.moriatsushi.katalog.ext.pagesaver.internal

import kotlinx.serialization.json.Json

internal object BackStackMapper {
    fun toString(backStack: List<String>): String {
        return Json.encodeToString(backStack)
    }

    fun fromString(value: String): List<String> {
        return Json.decodeFromString(value)
    }
}
