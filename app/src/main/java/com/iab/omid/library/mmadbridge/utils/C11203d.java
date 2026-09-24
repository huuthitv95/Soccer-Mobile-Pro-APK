package com.iab.omid.library.mmadbridge.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.mmadbridge.C11172a;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11203d {
    /* JADX INFO: renamed from: a */
    public static void m24609a(String str) {
        if (!C11172a.f23345a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m24610a(String str, Exception exc) {
        if ((!C11172a.f23345a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m24611b(String str) {
        if (!C11172a.f23345a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
