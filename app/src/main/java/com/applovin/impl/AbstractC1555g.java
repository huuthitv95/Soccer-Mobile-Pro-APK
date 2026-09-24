package com.applovin.impl;

import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1493b;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1555g {
    /* JADX INFO: renamed from: a */
    public static void m2634a(C1493b c1493b, C1748l c1748l) {
        if (c1493b == null) {
            return;
        }
        boolean zM4305a = AbstractC1713s.m4305a(c1493b);
        boolean zCanDrawOverlays = Settings.canDrawOverlays(c1493b.getContext());
        if (zCanDrawOverlays || zM4305a) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) c1493b.getCurrentAd());
            mapM2787a.put("details", "canDrawOverlays=" + zCanDrawOverlays + ",isViewOverlaid=" + zM4305a);
            c1748l.m4764E().m2678a(C1548f2.f1487L0, "overlayViolation", mapM2787a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2635a(AbstractC1736b abstractC1736b, AppLovinFullscreenActivity appLovinFullscreenActivity, C1748l c1748l) {
        String strM2247b = AbstractC1525d.m2247b(appLovinFullscreenActivity);
        String strM2243a = AbstractC1525d.m2243a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z = StringUtils.isValidString(strM2247b) && !strM2247b.equals(packageName);
        boolean z2 = StringUtils.isValidString(strM2243a) && !strM2243a.equals(packageName);
        if (z || z2) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b);
            mapM2787a.put("details", "activityTaskAffinityMismatch=" + z + ",baseActivityTaskAffinityMismatch=" + z2);
            c1748l.m4764E().m2678a(C1548f2.f1487L0, "taskAffinityMismatch", mapM2787a);
        }
    }
}
