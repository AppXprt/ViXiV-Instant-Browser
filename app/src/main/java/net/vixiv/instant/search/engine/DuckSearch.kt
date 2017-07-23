package net.vixiv.instant.search.engine

import net.vixiv.instant.R
import net.vixiv.instant.constant.Constants

/**
 * The DuckDuckGo search engine.
 *
 * See https://duckduckgo.com/assets/logo_homepage.normal.v101.png for the icon.
 */
class DuckSearch : BaseSearchEngine(
        "file:///android_asset/duckduckgo.png",
        Constants.DUCK_SEARCH,
        R.string.search_engine_duckduckgo
)
