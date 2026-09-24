package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C10944a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f22756a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m23318a() {
        UiModeManager uiModeManager = f22756a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV;
        }
        return DeviceCategory.MOBILE;
    }

    /* JADX INFO: renamed from: a */
    public static void m23319a(Context context) {
        if (context != null) {
            f22756a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
