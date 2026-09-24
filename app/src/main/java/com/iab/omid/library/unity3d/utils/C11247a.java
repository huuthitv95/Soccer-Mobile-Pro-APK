package com.iab.omid.library.unity3d.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.unity3d.adsession.DeviceCategory;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11247a {

    /* JADX INFO: renamed from: a */
    private static UiModeManager f23560a;

    /* JADX INFO: renamed from: a */
    public static DeviceCategory m24822a() {
        UiModeManager uiModeManager = f23560a;
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
    public static void m24823a(Context context) {
        if (context != null) {
            f23560a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
