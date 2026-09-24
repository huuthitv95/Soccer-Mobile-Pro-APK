package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ihz {
    /* JADX INFO: renamed from: ri */
    public static int m16522ri() {
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (iMaxMemory <= 2) {
                return 2;
            }
            if (iMaxMemory >= 5) {
                return 5;
            }
            return iMaxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
