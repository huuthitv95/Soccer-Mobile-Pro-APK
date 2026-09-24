package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.y3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9045y3 {
    /* JADX INFO: renamed from: a */
    public static void m21843a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C8984n1 {
        if (!m21847b(b2)) {
            if ((((b2 + 112) + (b << Ascii.f22493FS)) >> 30) == 0 && !m21847b(b3) && !m21847b(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new C8984n1("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: a */
    public static void m21844a(byte b, byte b2, byte b3, char[] cArr, int i) throws C8984n1 {
        if (m21847b(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m21847b(b3)))) {
            throw new C8984n1("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & Ascii.f22499SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: a */
    public static void m21845a(byte b, byte b2, char[] cArr, int i) throws C8984n1 {
        if (b < -62 || m21847b(b2)) {
            throw new C8984n1("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & Ascii.f22502US) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21846a(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21847b(byte b) {
        return b > -65;
    }
}
