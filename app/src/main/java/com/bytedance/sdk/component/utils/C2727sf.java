package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2727sf {

    /* JADX INFO: renamed from: ri */
    private static final byte[] f7778ri = m10281ri("VP8X");

    /* JADX INFO: renamed from: ri */
    public static boolean m10279ri(byte[] bArr, int i) {
        try {
            boolean zM10280ri = m10280ri(bArr, i + 12, f7778ri);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            boolean z = (bArr[i2] & 2) == 2;
            if (zM10280ri && z) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m10280ri(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    private static byte[] m10281ri(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }
}
