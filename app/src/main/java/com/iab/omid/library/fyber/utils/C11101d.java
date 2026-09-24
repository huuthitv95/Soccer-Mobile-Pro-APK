package com.iab.omid.library.fyber.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.fyber.C11070a;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11101d {
    /* JADX INFO: renamed from: a */
    public static void m24103a(String str) {
        if (!C11070a.f23075a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m24104a(String str, Exception exc) {
        if ((!C11070a.f23075a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m24105b(String str) {
        if (!C11070a.f23075a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
