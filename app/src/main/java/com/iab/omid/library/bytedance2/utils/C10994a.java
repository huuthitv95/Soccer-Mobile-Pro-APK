package com.iab.omid.library.bytedance2.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C10994a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f22886a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m23563a() {
        UiModeManager uiModeManager = f22886a;
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
    public static void m23564a(Context context) {
        if (context != null) {
            f22886a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
