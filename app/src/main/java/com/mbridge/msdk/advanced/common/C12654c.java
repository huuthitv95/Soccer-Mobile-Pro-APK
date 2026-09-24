package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.common.c */
/* JADX INFO: compiled from: MBNativeAdvancedWebViewCache.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12654c {

    /* JADX INFO: renamed from: a */
    private static Map<String, Boolean> f33399a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m34379a(String str, boolean z) {
        f33399a.put(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34380a(String str) {
        if (f33399a.containsKey(str)) {
            return f33399a.get(str).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m34381b(String str) {
        f33399a.remove(str);
    }
}
