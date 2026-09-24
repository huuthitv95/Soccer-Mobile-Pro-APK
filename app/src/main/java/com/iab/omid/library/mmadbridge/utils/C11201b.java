package com.iab.omid.library.mmadbridge.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11201b {
    /* JADX INFO: renamed from: a */
    public static String m24583a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m24584b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m24585c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m24586d() {
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "deviceType", m24583a());
        C11202c.m24595a(jSONObject, "osVersion", m24585c());
        C11202c.m24595a(jSONObject, C11540L6.f24911F, m24584b());
        return jSONObject;
    }
}
