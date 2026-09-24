package com.bykv.p028vk.openvk.preload.geckox.utils;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.d */
/* JADX INFO: compiled from: MD5Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1967d {

    /* JADX INFO: renamed from: a */
    private static char[] f4489a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    private static String m6080a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        if (i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = i << 1;
        char[] cArr = new char[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = bArr[i4];
            int i5 = i3 + 1;
            char[] cArr2 = f4489a;
            cArr[i3] = cArr2[(b & 255) >> 4];
            i3 += 2;
            cArr[i5] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m6081a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                    }
                    CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strM6080a = m6080a(bArrDigest, bArrDigest.length);
                        if (str.equals(strM6080a)) {
                            return;
                        }
                        throw new RuntimeException("md5 check failed file: local md5:" + strM6080a + " expect md5:" + str);
                    } catch (Exception e) {
                        throw new RuntimeException("md5 check failed:" + e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    CloseableUtils.close(inputStream);
                    throw th;
                }
            } catch (Exception e2) {
                throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("md5 check failed:" + e3.getMessage(), e3);
        }
    }
}
