package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.xha.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2009lr {

    /* JADX INFO: renamed from: ri */
    private static final MessageDigest f4655ri = m6447ri();

    /* JADX INFO: renamed from: lr */
    private static final char[] f4654lr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C2009lr() {
    }

    /* JADX INFO: renamed from: ri */
    public static String m6445ri(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = f4655ri;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C2009lr.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return m6446ri(bArrDigest);
    }

    /* JADX INFO: renamed from: ri */
    public static String m6446ri(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f4654lr;
            cArr[i] = cArr2[(b & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ri */
    private static MessageDigest m6447ri() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
