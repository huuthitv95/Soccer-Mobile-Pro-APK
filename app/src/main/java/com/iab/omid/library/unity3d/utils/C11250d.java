package com.iab.omid.library.unity3d.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.unity3d.C11223a;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11250d {
    /* JADX INFO: renamed from: a */
    public static void m24849a(String str) {
        if (!C11223a.f23480a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m24850a(String str, Exception exc) {
        if ((!C11223a.f23480a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
