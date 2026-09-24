package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2010ri {
    /* JADX INFO: renamed from: ri */
    public static String m6448ri(File file) {
        return m6449ri(file, null);
    }

    /* JADX INFO: renamed from: ri */
    public static String m6449ri(File file, String str) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return m6450ri(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    private static String m6450ri(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & Ascii.f22499SI];
        }
        return new String(cArr2);
    }
}
