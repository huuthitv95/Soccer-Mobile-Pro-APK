package com.fyber.inneractive.sdk.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.i1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9158i1 {
    /* JADX INFO: renamed from: a */
    public static String m21971a(String str, int i) {
        if (i <= 0 || str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 3) + "...";
    }
}
