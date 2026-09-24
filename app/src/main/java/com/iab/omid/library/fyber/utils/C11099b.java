package com.iab.omid.library.fyber.utils;

import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11099b {
    /* JADX INFO: renamed from: a */
    public static String m24077a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* JADX INFO: renamed from: b */
    public static String m24078b() {
        return C11744X3.f26142d;
    }

    /* JADX INFO: renamed from: c */
    public static String m24079c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m24080d() {
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "deviceType", m24077a());
        C11100c.m24089a(jSONObject, "osVersion", m24079c());
        C11100c.m24089a(jSONObject, C11540L6.f24911F, m24078b());
        return jSONObject;
    }
}
