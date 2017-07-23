package net.vixiv.instant.search.engine

import net.vixiv.instant.R
import net.vixiv.instant.constant.Constants

/**
 * The Yahoo search engine.
 *
 * See http://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Yahoo%21_logo.svg/799px-Yahoo%21_logo.svg.png
 * for the icon.
 */
class YahooSearch : BaseSearchEngine(
        "file:///android_asset/yahoo.png",
        Constants.YAHOO_SEARCH,
        R.string.search_engine_yahoo
)
