package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3561aw {
    /* JADX INFO: renamed from: ri */
    public static void m16367ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
