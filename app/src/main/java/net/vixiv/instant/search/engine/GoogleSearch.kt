package net.vixiv.instant.search.engine

import net.vixiv.instant.R
import net.vixiv.instant.constant.Constants

/**
 * The Google search engine.
 *
 * See https://www.google.com/images/srpr/logo11w.png for the icon.
 */
class GoogleSearch : BaseSearchEngine(
        "file:///android_asset/google.png",
        Constants.GOOGLE_SEARCH,
        R.string.search_engine_google
)
