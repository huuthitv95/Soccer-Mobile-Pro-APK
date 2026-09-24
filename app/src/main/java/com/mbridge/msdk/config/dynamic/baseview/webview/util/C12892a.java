package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.webview.util.a */
/* JADX INFO: compiled from: MBHybridUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12892a {
    /* JADX INFO: renamed from: a */
    public static String m36038a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        return "javascript:window.WindVane." + uri.getHost() + "(" + uri.getQueryParameter(String.valueOf(array[0])) + "," + (array.length > 1 ? uri.getQueryParameter(String.valueOf(array[1])) : "") + ");";
    }
}
