package net.vixiv.instant.search

import net.vixiv.instant.database.HistoryItem
import net.vixiv.instant.search.suggestions.BaiduSuggestionsModel
import net.vixiv.instant.search.suggestions.DuckSuggestionsModel
import net.vixiv.instant.search.suggestions.GoogleSuggestionsModel
import android.app.Application
import com.anthonycr.bonsai.Single
import com.anthonycr.bonsai.SingleAction

internal object SuggestionsManager {

    @JvmStatic
    @Volatile var isRequestInProgress: Boolean = false

    @JvmStatic
    fun createGoogleQueryObservable(query: String, application: Application) =
            Single.create(SingleAction<List<HistoryItem>> { subscriber ->
                isRequestInProgress = true
                val results = GoogleSuggestionsModel(application).fetchResults(query)
                subscriber.onItem(results)
                subscriber.onComplete()
                isRequestInProgress = false
            })

    @JvmStatic
    fun createBaiduQueryObservable(query: String, application: Application) =
            Single.create(SingleAction<List<HistoryItem>> { subscriber ->
                isRequestInProgress = true
                val results = BaiduSuggestionsModel(application).fetchResults(query)
                subscriber.onItem(results)
                subscriber.onComplete()
                isRequestInProgress = false
            })

    @JvmStatic
    fun createDuckQueryObservable(query: String, application: Application) =
            Single.create(SingleAction<List<HistoryItem>> { subscriber ->
                isRequestInProgress = true
                val results = DuckSuggestionsModel(application).fetchResults(query)
                subscriber.onItem(results)
                subscriber.onComplete()
                isRequestInProgress = false
            })

}
