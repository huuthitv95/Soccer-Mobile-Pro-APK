package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import com.ironsource.C11341A5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.applovin.impl.w4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1804w4 {

    /* JADX INFO: renamed from: a */
    private static final byte[] f3515a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* JADX INFO: renamed from: b */
    private static final byte[] f3516b;

    /* JADX INFO: renamed from: com.applovin.impl.w4$a */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* JADX INFO: renamed from: a */
        private final int f3521a;

        a(int i) {
            this.f3521a = i;
        }

        /* JADX INFO: renamed from: a */
        public static a m5546a(int i) {
            if (i != 0 && i == 1) {
                return V2;
            }
            return DEFAULT;
        }

        /* JADX INFO: renamed from: b */
        public int m5548b() {
            return this.f3521a;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f3516b = bArr;
        System.arraycopy(new byte[]{Ascii.DC2, Ascii.f22492FF, Ascii.f22493FS, Ascii.DC4, 17, Ascii.ETB, Ascii.SUB, 9, Ascii.NAK, 3, Ascii.f22500SO, Ascii.f22494GS, 4, 0, 2, 7, 10, Ascii.f22494GS, 6, Ascii.DC4, 1}, 0, bArr, 0, 21);
    }

    /* JADX INFO: renamed from: a */
    private static int m5527a(byte[] bArr, byte b) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static String m5528a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', C11341A5.f23808U);
    }

    /* JADX INFO: renamed from: a */
    private static String m5529a(String str, String str2, C1748l c1748l) {
        String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
        try {
            try {
                try {
                    if (!"1".equals(strArrSplit[0])) {
                        m5533a(str, "v1", "Invalid encoding version", c1748l);
                        return null;
                    }
                    if (strArrSplit.length != 4) {
                        m5533a(str, "v1", "Invalid response format", c1748l);
                        return null;
                    }
                    String str3 = strArrSplit[1];
                    char c = 2;
                    String str4 = strArrSplit[2];
                    char c2 = 3;
                    byte[] bArrM5544b = m5544b(strArrSplit[3]);
                    if (!str2.endsWith(str4)) {
                        m5533a(str, "v1", "Invalid SDK key", c1748l);
                        return null;
                    }
                    byte[] bArr = f3515a;
                    if (!m5531a(bArr, c1748l).equals(str3)) {
                        m5533a(str, "v1", "Invalid salt signature", c1748l);
                        return null;
                    }
                    byte[] bArrM5538a = m5538a(str2.substring(0, 32), bArr, c1748l);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5544b);
                    char c3 = 0;
                    char c4 = '(';
                    char c5 = 7;
                    long j = (((long) ((byteArrayInputStream.read() ^ bArrM5538a[1]) & 255)) << 8) | ((long) ((byteArrayInputStream.read() ^ bArrM5538a[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrM5538a[7]) & 255)) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i = byteArrayInputStream.read(bArr2);
                    int i2 = 0;
                    while (i >= 0) {
                        char c6 = c;
                        char c7 = c3;
                        long j2 = ((long) i2) + j;
                        long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                        long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                        long j5 = j4 ^ (j4 >> 32);
                        char c8 = c5;
                        char c9 = c2;
                        char c10 = c4;
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c7] ^ bArrM5538a[i2 % bArrM5538a.length])) ^ (j5 & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[1] ^ bArrM5538a[(i2 + 1) % bArrM5538a.length])) ^ ((j5 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c6] ^ bArrM5538a[(i2 + 2) % bArrM5538a.length])) ^ ((j5 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c9] ^ bArrM5538a[(i2 + 3) % bArrM5538a.length])) ^ ((j5 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[4] ^ bArrM5538a[(i2 + 4) % bArrM5538a.length])) ^ ((j5 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[5] ^ bArrM5538a[(i2 + 5) % bArrM5538a.length])) ^ ((j5 >> c10) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[6] ^ bArrM5538a[(i2 + 6) % bArrM5538a.length])) ^ ((j5 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j5 >> 56) & 255) ^ ((long) (bArr2[c8] ^ bArrM5538a[(i2 + 7) % bArrM5538a.length]))));
                        i2 += 8;
                        c = c6;
                        c3 = c7;
                        c2 = c9;
                        c4 = c10;
                        i = byteArrayInputStream.read(bArr2);
                        c5 = c8;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e) {
                    e = e;
                    C1768p.m5162b("AppLovinSdk", "Failed to read bytes", e);
                    m5534a(str, "decode", e, c1748l);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (UnsupportedEncodingException e3) {
            m5534a(str, "decode", e3, c1748l);
            throw new RuntimeException("UTF-8 encoding not found", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5530a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace(C11341A5.f23808U, '*');
    }

    /* JADX INFO: renamed from: a */
    private static String m5531a(byte[] bArr, C1748l c1748l) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            c1748l.m4764E().m4329a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5532a(byte[] bArr, String str, C1748l c1748l) {
        try {
            int iM5540b = m5540b(bArr, str, c1748l);
            if (iM5540b == 0) {
                m5533a(new String(bArr), "v2", "Invalid payload format", c1748l);
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iM5540b, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                m5533a(new String(bArr), "v2", "Payload too small", c1748l);
                return null;
            }
            long jM4021a = AbstractC1701q7.m4021a(bArrCopyOfRange, 8);
            byte[] bArrM5538a = m5538a(str.substring(0, 32), f3516b, c1748l);
            return new String(AbstractC1701q7.m4099d(m5539a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jM4021a ^ AbstractC1701q7.m4088c(bArrM5538a), bArrM5538a)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            m5534a(new String(bArr), "decode2", e, c1748l);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            C1768p.m5162b("AppLovinSdk", "Failed to ungzip decode", e2);
            m5534a(new String(bArr), "decode2", e2, c1748l);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5533a(String str, String str2, String str3, C1748l c1748l) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str3);
        if (((Boolean) c1748l.m4801a(C1831z4.f3772M5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, mapHashMap);
        }
        c1748l.m4764E().m2678a(C1548f2.f1543j1, str2, mapHashMap);
    }

    /* JADX INFO: renamed from: a */
    private static void m5534a(String str, String str2, Throwable th, C1748l c1748l) {
        HashMap map = new HashMap(1);
        if (((Boolean) c1748l.m4801a(C1831z4.f3772M5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, map);
        }
        c1748l.m4764E().m4332a("AppLovinSdk", str2, th, map);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m5535a(String str, long j, a aVar, C1748l c1748l) {
        String strM4839k0 = c1748l.m4839k0();
        if (strM4839k0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (strM4839k0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        if (a.NONE == aVar) {
            return str.getBytes();
        }
        return a.V2 == aVar ? m5537a(str, j, false, strM4839k0, c1748l) : m5536a(str, j, strM4839k0, c1748l);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5536a(String str, long j, String str2, C1748l c1748l) {
        char c = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrM5538a = m5538a(strSubstring2, f3515a, c1748l);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ bArrM5538a[0]);
            char c2 = '\b';
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ bArrM5538a[1]);
            char c3 = 16;
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ bArrM5538a[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ bArrM5538a[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ bArrM5538a[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ bArrM5538a[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ bArrM5538a[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ bArrM5538a[7]);
            int i = 0;
            while (i < bytes.length) {
                char c4 = c2;
                char c5 = c3;
                long j2 = j + ((long) i);
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                char c6 = c;
                byteArrayOutputStream.write((byte) (((long) ((i >= bytes.length ? b : bytes[i]) ^ bArrM5538a[i % bArrM5538a.length])) ^ (j5 & 255)));
                int i2 = i + 1;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i2 % bArrM5538a.length] ^ (i2 >= bytes.length ? (byte) 0 : bytes[i2]))) ^ ((j5 >> c4) & 255)));
                int i3 = i + 2;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i3 % bArrM5538a.length] ^ (i3 >= bytes.length ? (byte) 0 : bytes[i3]))) ^ ((j5 >> c5) & 255)));
                int i4 = i + 3;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i4 % bArrM5538a.length] ^ (i4 >= bytes.length ? (byte) 0 : bytes[i4]))) ^ ((j5 >> 24) & 255)));
                int i5 = i + 4;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i5 % bArrM5538a.length] ^ (i5 >= bytes.length ? (byte) 0 : bytes[i5]))) ^ ((j5 >> c6) & 255)));
                int i6 = i + 5;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i6 % bArrM5538a.length] ^ (i6 >= bytes.length ? (byte) 0 : bytes[i6]))) ^ ((j5 >> 40) & 255)));
                int i7 = i + 6;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i7 % bArrM5538a.length] ^ (i7 >= bytes.length ? (byte) 0 : bytes[i7]))) ^ ((j5 >> 48) & 255)));
                int i8 = i + 7;
                byteArrayOutputStream.write((byte) (((long) (bArrM5538a[i8 % bArrM5538a.length] ^ (i8 >= bytes.length ? (byte) 0 : bytes[i8]))) ^ ((j5 >> 56) & 255)));
                i += 8;
                c2 = c4;
                c3 = c5;
                c = c6;
                b = 0;
            }
            String strM5545c = m5545c(byteArrayOutputStream.toByteArray());
            return ("1:" + m5531a(f3515a, c1748l) + CertificateUtil.DELIMITER + strSubstring + CertificateUtil.DELIMITER + strM5545c).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            m5534a(str, "encode", e, c1748l);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5537a(String str, long j, boolean z, String str2, C1748l c1748l) {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f3516b;
            byte[] bArrM5538a = m5538a(strSubstring2, bArr, c1748l);
            long jM4088c = AbstractC1701q7.m4088c(bArrM5538a) ^ j;
            byte[] bytes2 = String.format("2:%s:%s:", m5531a(bArr, c1748l), strSubstring).getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong(length);
            byteBufferAllocate2.putLong(jM4088c);
            byteBufferAllocate2.flip();
            byte[] bArrM5539a = m5539a(AbstractC1701q7.m4071a(bytes), j, bArrM5538a);
            if (z) {
                byte[] bytes3 = m5545c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = m5545c(bArrM5539a).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrM5539a.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrM5539a);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e) {
            m5534a(str, "encode2", e, c1748l);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            m5534a(str, "encode2", e2, c1748l);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5538a(String str, byte[] bArr, C1748l c1748l) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            c1748l.m4764E().m4329a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5539a(byte[] bArr, long j, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i % 8;
            if (i2 == 0) {
                long j3 = ((long) i) + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            bArrCopyOf[i] = (byte) (((long) bArrCopyOf[i]) ^ (((j2 >> (i2 * 8)) & 255) ^ ((long) bArr2[i % bArr2.length])));
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    private static int m5540b(byte[] bArr, String str, C1748l c1748l) {
        int iM5527a;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iM5527a = m5527a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = m5531a(f3516b, c1748l).getBytes();
        int i2 = iM5527a + 1;
        int length = bytes.length + i2;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            return 0;
        }
        int i3 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static a m5541b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return a.NONE;
        }
        char c = (char) bArr[0];
        if (c == '2') {
            return a.V2;
        }
        return c == '{' ? a.NONE : a.DEFAULT;
    }

    /* JADX INFO: renamed from: b */
    public static String m5542b(String str, long j, a aVar, C1748l c1748l) {
        String strM4839k0 = c1748l.m4839k0();
        if (strM4839k0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (strM4839k0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrM5537a = a.V2 == aVar ? m5537a(str, j, true, strM4839k0, c1748l) : m5536a(str, j, strM4839k0, c1748l);
        if (bArrM5537a != null) {
            return new String(bArrM5537a);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m5543b(byte[] bArr, C1748l c1748l) {
        String strM4839k0 = c1748l.m4839k0();
        if (strM4839k0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (strM4839k0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        a aVarM5541b = m5541b(bArr);
        if (a.NONE == aVarM5541b) {
            return new String(bArr);
        }
        return aVarM5541b == a.V2 ? m5532a(bArr, strM4839k0, c1748l) : m5529a(new String(bArr), strM4839k0, c1748l);
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m5544b(String str) {
        return Base64.decode(m5528a(str), 0);
    }

    /* JADX INFO: renamed from: c */
    private static String m5545c(byte[] bArr) {
        return m5530a(Base64.encode(bArr, 2));
    }
}
