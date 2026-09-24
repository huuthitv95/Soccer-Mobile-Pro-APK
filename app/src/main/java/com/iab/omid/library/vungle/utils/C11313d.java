package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.vungle.C11269a;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11313d {
    /* JADX INFO: renamed from: a */
    public static void m25146a(String str) {
        if (!C11269a.f23608a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m25147a(String str, Exception exc) {
        if ((!C11269a.f23608a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m25148b(String str) {
        if (!C11269a.f23608a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: c */
    public static void m25149c(String str) {
        if (!C11269a.f23608a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: d */
    public static void m25150d(String str) {
        if (!C11269a.f23608a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
