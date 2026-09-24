package com.iab.omid.library.chartboost.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11047b {
    /* JADX INFO: renamed from: a */
    public static String m23821a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m23822b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m23823c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m23824d() {
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "deviceType", m23821a());
        C11048c.m23833a(jSONObject, "osVersion", m23823c());
        C11048c.m23833a(jSONObject, C11540L6.f24911F, m23822b());
        return jSONObject;
    }
}
