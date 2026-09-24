package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11149a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23296a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m24328a() {
        UiModeManager uiModeManager = f23296a;
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
    public static void m24329a(Context context) {
        if (context != null) {
            f23296a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
