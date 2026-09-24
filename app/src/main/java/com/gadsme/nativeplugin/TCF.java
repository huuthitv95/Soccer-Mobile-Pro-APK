package com.gadsme.nativeplugin;

import android.preference.PreferenceManager;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class TCF {
    public static String getConsentString() {
        return PreferenceManager.getDefaultSharedPreferences(UnityPlayer.currentActivity).getString("IABTCF_TCString", "");
    }
}
