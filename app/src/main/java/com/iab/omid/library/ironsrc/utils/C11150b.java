package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11150b {
    /* JADX INFO: renamed from: a */
    public static String m24330a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m24331b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m24332c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m24333d() {
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "deviceType", m24330a());
        C11151c.m24342a(jSONObject, "osVersion", m24332c());
        C11151c.m24342a(jSONObject, C11540L6.f24911F, m24331b());
        return jSONObject;
    }
}
