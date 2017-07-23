package net.vixiv.instant.browser;

import android.support.annotation.NonNull;

import net.vixiv.instant.database.HistoryItem;

public interface BookmarksView {

    void navigateBack();

    void handleUpdatedUrl(@NonNull String url);

    void handleBookmarkDeleted(@NonNull HistoryItem item);

}
