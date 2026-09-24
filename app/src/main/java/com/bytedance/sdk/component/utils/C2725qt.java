package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2725qt {
    /* JADX INFO: renamed from: ri */
    public static void m10269ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
