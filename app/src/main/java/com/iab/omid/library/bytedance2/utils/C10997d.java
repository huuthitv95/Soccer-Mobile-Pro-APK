package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.bytedance2.C10967a;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C10997d {
    /* JADX INFO: renamed from: a */
    public static void m23590a(String str) {
        if (!C10967a.f22805a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m23591a(String str, Exception exc) {
        if ((!C10967a.f22805a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m23592b(String str) {
        if (!C10967a.f22805a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
