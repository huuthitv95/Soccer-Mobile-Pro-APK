package com.iab.omid.library.unity3d.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11248b {
    /* JADX INFO: renamed from: a */
    public static String m24824a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m24825b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m24826c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m24827d() {
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "deviceType", m24824a());
        C11249c.m24836a(jSONObject, "osVersion", m24826c());
        C11249c.m24836a(jSONObject, C11540L6.f24911F, m24825b());
        return jSONObject;
    }
}
