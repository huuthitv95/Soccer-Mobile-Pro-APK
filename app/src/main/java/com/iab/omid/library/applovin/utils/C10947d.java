package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C10916a;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C10947d {
    /* JADX INFO: renamed from: a */
    public static void m23346a(String str) {
        if (!C10916a.f22670a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m23347a(String str, Exception exc) {
        if ((!C10916a.f22670a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m23348b(String str) {
        if (!C10916a.f22670a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
