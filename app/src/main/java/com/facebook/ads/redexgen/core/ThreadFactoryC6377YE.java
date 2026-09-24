package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ThreadFactoryC6377YE implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Ascii.f22491EM, Ascii.NAK, Ascii.ETB, 84, Ascii.f22493FS, Ascii.ESC, Ascii.f22491EM, Ascii.f22502US, Ascii.CAN, Ascii.NAK, Ascii.NAK, 17, 84, Ascii.ESC, Ascii.f22498RS, 9, 90, Ascii.f22500SO, Ascii.DC2, 8, Ascii.f22502US, Ascii.ESC, Ascii.f22498RS, 87, 95, Ascii.f22498RS, 90, 95, Ascii.f22500SO, 60, 90, 95, 70, Ascii.f22500SO, 46, 5, Ascii.f22491EM, 3, Ascii.DC4, Ascii.DLE, Ascii.NAK, 2, 46, Ascii.DC2, Ascii.f22498RS, 4, Ascii.f22502US, 5, Ascii.DC4, 3, 46, 2, Ascii.NAK, Ascii.SUB, 46, Ascii.ETB, Ascii.DLE, Ascii.DC2, 5, Ascii.f22498RS, 3, 8};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC6104Tj.A00(A01(35, 27, 45));
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
