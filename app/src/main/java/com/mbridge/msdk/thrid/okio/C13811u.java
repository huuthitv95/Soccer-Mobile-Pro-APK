package com.mbridge.msdk.thrid.okio;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.u */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13811u {

    /* JADX INFO: renamed from: a */
    public static final Charset f39353a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static int m40967a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static short m40968a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: a */
    public static void m40969a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40970a(Throwable th) throws Throwable {
        m40972b(th);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40971a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static <T extends Throwable> void m40972b(Throwable th) throws Throwable {
        throw th;
    }
}
