package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C10945b {
    /* JADX INFO: renamed from: a */
    public static String m23320a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m23321b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m23322c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m23323d() {
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "deviceType", m23320a());
        C10946c.m23332a(jSONObject, "osVersion", m23322c());
        C10946c.m23332a(jSONObject, C11540L6.f24911F, m23321b());
        return jSONObject;
    }
}
