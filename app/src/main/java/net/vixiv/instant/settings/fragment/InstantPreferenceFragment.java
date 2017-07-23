package net.vixiv.instant.settings.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import javax.inject.Inject;

import net.vixiv.instant.BrowserApp;
import net.vixiv.instant.preference.PreferenceManager;

/**
 * Simplify {@link PreferenceManager} inject in all the PreferenceFragments
 *
 * @author Stefano Pacifici
 * @date 2015/09/16
 */
public class InstantPreferenceFragment extends PreferenceFragment {

    @Inject
    PreferenceManager mPreferenceManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrowserApp.getAppComponent().inject(this);
    }
}
