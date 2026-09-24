package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3912m8 {
    public static final <T> List<T> asList(JSONArray jSONArray) {
        return AbstractC3935n8.m18774a(jSONArray);
    }

    public static final <T> List<T> asListSkipNull(JSONArray jSONArray) {
        return AbstractC3935n8.m18775b(jSONArray);
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i) {
        return AbstractC3935n8.m18770a(packageManager, str, i);
    }

    public static final String getPackageVersionName(PackageManager packageManager, String str) {
        return AbstractC3935n8.m18773a(packageManager, str);
    }

    public static final C3944nh toBodyFields(C3921mh c3921mh) {
        return AbstractC3935n8.m18772a(c3921mh);
    }

    public static final C3850jf toReachabilityBodyFields(C3769g3 c3769g3) {
        return AbstractC3935n8.m18771a(c3769g3);
    }
}
