package com.iab.omid.library.fyber.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.fyber.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11098a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23161a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m24075a() {
        UiModeManager uiModeManager = f23161a;
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
    public static void m24076a(Context context) {
        if (context != null) {
            f23161a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
