package com.bytedance.sdk.component.utils;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class slm {

    /* JADX INFO: renamed from: ri */
    private static final char[] f7779ri = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ri */
    public static String m10282ri(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return m10283ri(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static String m10283ri(byte[] bArr) {
        if (bArr != null) {
            return m10284ri(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* JADX INFO: renamed from: ri */
    public static String m10284ri(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b = bArr[i5 + i];
            int i6 = i4 + 1;
            char[] cArr2 = f7779ri;
            cArr[i4] = cArr2[(b & 255) >> 4];
            i4 += 2;
            cArr[i6] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr, 0, i3);
    }
}
