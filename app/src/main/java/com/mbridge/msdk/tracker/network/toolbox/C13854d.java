package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.AbstractC13850t;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.d */
/* JADX INFO: compiled from: Common.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13854d {
    /* JADX INFO: renamed from: a */
    public static String m41263a(String str, AbstractC13850t<?> abstractC13850t) {
        if (TextUtils.isEmpty(str) || abstractC13850t == null) {
            return "";
        }
        byte[] bArrM41229b = abstractC13850t.m41229b();
        if (bArrM41229b == null || bArrM41229b.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str + new String(bArrM41229b);
        }
        return str + "?" + new String(bArrM41229b);
    }
}
