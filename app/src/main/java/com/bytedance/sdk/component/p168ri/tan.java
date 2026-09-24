package com.bytedance.sdk.component.p168ri;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
class tan {

    /* JADX INFO: renamed from: ri */
    private static boolean f7746ri;

    /* JADX INFO: renamed from: ri */
    static String m10179ri() {
        return "";
    }

    /* JADX INFO: renamed from: ri */
    static String m10180ri(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!f7746ri || z) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    /* JADX INFO: renamed from: ri */
    static String m10181ri(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof slm ? ((slm) th).f7745ri : 0);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ri */
    static void m10182ri(boolean z) {
        f7746ri = z;
    }
}
