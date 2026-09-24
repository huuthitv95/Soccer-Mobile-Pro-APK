package com.iab.omid.library.bytedance2.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C10995b {
    /* JADX INFO: renamed from: a */
    public static String m23565a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m23566b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m23567c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m23568d() {
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "deviceType", m23565a());
        C10996c.m23577a(jSONObject, "osVersion", m23567c());
        C10996c.m23577a(jSONObject, C11540L6.f24911F, m23566b());
        return jSONObject;
    }
}
