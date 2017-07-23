package net.vixiv.instant.search;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import net.vixiv.instant.BrowserApp;
import net.vixiv.instant.preference.PreferenceManager;
import net.vixiv.instant.search.engine.AskSearch;
import net.vixiv.instant.search.engine.BaiduSearch;
import net.vixiv.instant.search.engine.BaseSearchEngine;
import net.vixiv.instant.search.engine.BingSearch;
import net.vixiv.instant.search.engine.CustomSearch;
import net.vixiv.instant.search.engine.DuckLiteSearch;
import net.vixiv.instant.search.engine.DuckSearch;
import net.vixiv.instant.search.engine.GoogleSearch;
import net.vixiv.instant.search.engine.StartPageMobileSearch;
import net.vixiv.instant.search.engine.StartPageSearch;
import net.vixiv.instant.search.engine.ViXiVSearch;
import net.vixiv.instant.search.engine.YahooSearch;
import net.vixiv.instant.search.engine.YandexSearch;

/**
 * The model that provides the search engine based
 * on the user's preference.
 */
public class SearchEngineProvider {

    @Inject PreferenceManager mPreferenceManager;

    @Inject
    public SearchEngineProvider() {
        BrowserApp.getAppComponent().inject(this);
    }

    @NonNull
    public BaseSearchEngine getCurrentSearchEngine() {
        switch (mPreferenceManager.getSearchChoice()) {
            case 0:
                return new CustomSearch(mPreferenceManager.getSearchUrl());
            case 1:
            default:
                return new ViXiVSearch();
            case 2:
                return new GoogleSearch();
            case 3:
                return new AskSearch();
            case 4:
                return new BingSearch();
            case 5:
                return new YahooSearch();
            case 6:
                return new StartPageSearch();
            case 7:
                return new StartPageMobileSearch();
            case 8:
                return new DuckSearch();
            case 9:
                return new DuckLiteSearch();
            case 10:
                return new BaiduSearch();
            case 11:
                return new YandexSearch();
        }
    }

    public int mapSearchEngineToPreferenceIndex(@NonNull BaseSearchEngine searchEngine) {
        if (searchEngine instanceof CustomSearch) {
            return 0;
        } else if (searchEngine instanceof ViXiVSearch) {
            return 1;
        } else if (searchEngine instanceof GoogleSearch) {
            return 2;
        } else if (searchEngine instanceof AskSearch) {
            return 3;
        } else if (searchEngine instanceof BingSearch) {
            return 4;
        } else if (searchEngine instanceof YahooSearch) {
            return 5;
        } else if (searchEngine instanceof StartPageSearch) {
            return 6;
        } else if (searchEngine instanceof StartPageMobileSearch) {
            return 7;
        } else if (searchEngine instanceof DuckSearch) {
            return 8;
        } else if (searchEngine instanceof DuckLiteSearch) {
            return 9;
        } else if (searchEngine instanceof BaiduSearch) {
            return 10;
        } else if (searchEngine instanceof YandexSearch) {
            return 11;
        } else {
            throw new UnsupportedOperationException("Unknown search engine provided: " + searchEngine.getClass());
        }
    }

    @NonNull
    public List<BaseSearchEngine> getAllSearchEngines() {
        return new ArrayList<BaseSearchEngine>(11) {{
            add(new CustomSearch(mPreferenceManager.getSearchUrl()));
            add(new ViXiVSearch());
            add(new GoogleSearch());
            add(new AskSearch());
            add(new BingSearch());
            add(new YahooSearch());
            add(new StartPageSearch());
            add(new StartPageMobileSearch());
            add(new DuckSearch());
            add(new DuckLiteSearch());
            add(new BaiduSearch());
            add(new YandexSearch());
        }};
    }

}
