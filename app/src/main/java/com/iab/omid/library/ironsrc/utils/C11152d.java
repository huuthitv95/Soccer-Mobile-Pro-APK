package com.iab.omid.library.ironsrc.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C11121a;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11152d {
    /* JADX INFO: renamed from: a */
    public static void m24356a(String str) {
        if (!C11121a.f23210a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m24357a(String str, Exception exc) {
        if ((!C11121a.f23210a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m24358b(String str) {
        if (!C11121a.f23210a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }
}
