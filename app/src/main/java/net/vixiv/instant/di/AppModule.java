package net.vixiv.instant.di;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import net.i2p.android.ui.I2PAndroidHelper;

import javax.inject.Singleton;

import net.vixiv.instant.BrowserApp;
import net.vixiv.instant.database.bookmark.BookmarkDatabase;
import net.vixiv.instant.database.bookmark.BookmarkModel;
import net.vixiv.instant.database.downloads.DownloadsDatabase;
import net.vixiv.instant.database.downloads.DownloadsModel;
import net.vixiv.instant.database.history.HistoryDatabase;
import net.vixiv.instant.database.history.HistoryModel;
import net.vixiv.instant.download.DownloadHandler;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final BrowserApp mApp;

    public AppModule(BrowserApp app) {
        this.mApp = app;
    }

    @Provides
    public Application provideApplication() {
        return mApp;
    }

    @Provides
    public Context provideContext() {
        return mApp.getApplicationContext();
    }

    @NonNull
    @Provides
    @Singleton
    public BookmarkModel provideBookmarkModel() {
        return new BookmarkDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public DownloadsModel provideDownloadsModel() {
        return new DownloadsDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public HistoryModel providesHistoryModel() {
        return new HistoryDatabase(mApp);
    }

    @NonNull
    @Provides
    @Singleton
    public DownloadHandler provideDownloadHandler() {
        return new DownloadHandler();
    }

    @NonNull
    @Provides
    @Singleton
    public I2PAndroidHelper provideI2PAndroidHelper() {
        return new I2PAndroidHelper(mApp.getApplicationContext());
    }

}
