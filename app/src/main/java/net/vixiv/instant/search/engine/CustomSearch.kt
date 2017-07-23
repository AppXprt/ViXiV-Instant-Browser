package net.vixiv.instant.search.engine

import net.vixiv.instant.R

/**
 * A custom search engine.
 */
class CustomSearch(queryUrl: String) : BaseSearchEngine(
        "file:///android_asset/instant.png",
        queryUrl,
        R.string.search_engine_custom
)
