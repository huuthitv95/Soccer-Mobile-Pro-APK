package com.iab.omid.library.vungle.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.vungle.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11310a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23724a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m25117a() {
        UiModeManager uiModeManager = f23724a;
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
    public static void m25118a(Context context) {
        if (context != null) {
            f23724a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
