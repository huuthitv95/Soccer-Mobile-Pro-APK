package com.iab.omid.library.chartboost.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.chartboost.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11046a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23026a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m23819a() {
        UiModeManager uiModeManager = f23026a;
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
    public static void m23820a(Context context) {
        if (context != null) {
            f23026a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
