package com.iab.omid.library.vungle.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11311b {
    /* JADX INFO: renamed from: a */
    public static String m25119a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m25120b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m25121c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m25122d() {
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "deviceType", m25119a());
        C11312c.m25131a(jSONObject, "osVersion", m25121c());
        C11312c.m25131a(jSONObject, C11540L6.f24911F, m25120b());
        return jSONObject;
    }
}
