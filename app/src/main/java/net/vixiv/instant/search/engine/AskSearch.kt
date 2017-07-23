package net.vixiv.instant.search.engine

import net.vixiv.instant.R
import net.vixiv.instant.constant.Constants

/**
 * The Ask search engine.
 */
class AskSearch : BaseSearchEngine(
        "file:///android_asset/ask.png",
        Constants.ASK_SEARCH,
        R.string.search_engine_ask
)
