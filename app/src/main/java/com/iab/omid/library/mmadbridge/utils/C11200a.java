package com.iab.omid.library.mmadbridge.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11200a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23431a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m24581a() {
        UiModeManager uiModeManager = f23431a;
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
    public static void m24582a(Context context) {
        if (context != null) {
            f23431a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
