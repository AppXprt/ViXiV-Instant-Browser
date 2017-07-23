package net.vixiv.instant.di;

import javax.inject.Singleton;

import net.vixiv.instant.browser.activity.BrowserActivity;
import net.vixiv.instant.reading.activity.ReadingActivity;
import net.vixiv.instant.browser.TabsManager;
import net.vixiv.instant.browser.activity.ThemableBrowserActivity;
import net.vixiv.instant.settings.activity.ThemableSettingsActivity;
import net.vixiv.instant.BrowserApp;
import net.vixiv.instant.browser.BrowserPresenter;
import net.vixiv.instant.browser.SearchBoxModel;
import net.vixiv.instant.constant.BookmarkPage;
import net.vixiv.instant.constant.DownloadsPage;
import net.vixiv.instant.constant.HistoryPage;
import net.vixiv.instant.constant.StartPage;
import net.vixiv.instant.dialog.InstantDialogBuilder;
import net.vixiv.instant.download.DownloadHandler;
import net.vixiv.instant.download.InstantDownloadListener;
import net.vixiv.instant.settings.fragment.BookmarkSettingsFragment;
import net.vixiv.instant.browser.fragment.BookmarksFragment;
import net.vixiv.instant.settings.fragment.DebugSettingsFragment;
import net.vixiv.instant.settings.fragment.GeneralSettingsFragment;
import net.vixiv.instant.settings.fragment.InstantPreferenceFragment;
import net.vixiv.instant.settings.fragment.PrivacySettingsFragment;
import net.vixiv.instant.browser.fragment.TabsFragment;
import net.vixiv.instant.search.SearchEngineProvider;
import net.vixiv.instant.search.SuggestionsAdapter;
import net.vixiv.instant.utils.ProxyUtils;
import net.vixiv.instant.view.InstantChromeClient;
import net.vixiv.instant.view.InstantView;
import net.vixiv.instant.view.InstantWebClient;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BrowserActivity activity);

    void inject(BookmarksFragment fragment);

    void inject(BookmarkSettingsFragment fragment);

    void inject(InstantDialogBuilder builder);

    void inject(TabsFragment fragment);

    void inject(InstantView instantView);

    void inject(ThemableBrowserActivity activity);

    void inject(InstantPreferenceFragment fragment);

    void inject(BrowserApp app);

    void inject(ProxyUtils proxyUtils);

    void inject(ReadingActivity activity);

    void inject(InstantWebClient webClient);

    void inject(ThemableSettingsActivity activity);

    void inject(InstantDownloadListener listener);

    void inject(PrivacySettingsFragment fragment);

    void inject(StartPage startPage);

    void inject(HistoryPage historyPage);

    void inject(BookmarkPage bookmarkPage);

    void inject(DownloadsPage downloadsPage);

    void inject(BrowserPresenter presenter);

    void inject(TabsManager manager);

    void inject(DebugSettingsFragment fragment);

    void inject(SuggestionsAdapter suggestionsAdapter);

    void inject(InstantChromeClient chromeClient);

    void inject(DownloadHandler downloadHandler);

    void inject(SearchBoxModel searchBoxModel);

    void inject(SearchEngineProvider searchEngineProvider);

    void inject(GeneralSettingsFragment generalSettingsFragment);

}
