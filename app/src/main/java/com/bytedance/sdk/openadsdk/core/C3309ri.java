package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ri */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309ri {

    /* JADX INFO: renamed from: ri */
    private static final String f11557ri = m14748ik();

    /* JADX INFO: renamed from: lr */
    private static final String f11556lr = C3299nr.m14639ka().m14855ka();

    /* JADX INFO: renamed from: ik */
    private static String m14748ik() {
        char[] cArr = {203, Typography.paragraph, 168, Typography.degree, 207, 148, 149, 178, 205, Typography.paragraph, 149, 166, 134, 178, 184, Typography.degree, 206, Typography.registered, 187, 178, 150, 185, Typography.section, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: lr */
    public static String m14749lr() {
        return new String(Base64.decode(f11556lr, 0)).substring(2);
    }

    /* JADX INFO: renamed from: ri */
    public static String m14750ri() {
        return new String(Base64.decode(f11557ri, 0)).substring(2);
    }
}
