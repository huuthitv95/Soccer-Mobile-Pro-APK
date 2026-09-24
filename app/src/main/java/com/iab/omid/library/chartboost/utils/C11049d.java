package com.iab.omid.library.chartboost.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.chartboost.C11018a;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11049d {
    /* JADX INFO: renamed from: a */
    public static void m23847a(String str) {
        if (!C11018a.f22934a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m23848a(String str, Exception exc) {
        if ((!C11018a.f22934a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m23849b(String str) {
        if (!C11018a.f22934a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
