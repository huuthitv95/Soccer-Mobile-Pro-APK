package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC6279Wc implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC6269WS> A04;
    public final C6267WQ A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, Ascii.f22503VT, Ascii.DLE, Ascii.DLE, Ascii.f22502US, Ascii.f22493FS, Ascii.DC2, Ascii.ESC, 94, Ascii.f22494GS, Ascii.f22492FF, Ascii.ESC, Ascii.f22502US, 10, Ascii.ESC, Ascii.SUB, 80, 94, 42, Ascii.SYN, Ascii.f22492FF, Ascii.ESC, Ascii.f22502US, Ascii.SUB, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC6279Wc() {
        if (A03.get()) {
            this.A00 = C6284Wh.A01(new C6283Wg(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, InterfaceC6269WS interfaceC6269WS) {
        A02.set(z);
        A04.set(interfaceC6269WS);
    }

    public final C6267WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C6284Wh.A03(this);
            }
            try {
                A07();
            } catch (Throwable th) {
                if (A02.get()) {
                    AbstractC6286Wj.A00().AAx(3301, th);
                    InterfaceC6269WS interfaceC6269WS = A04.get();
                    if (interfaceC6269WS != null) {
                        interfaceC6269WS.AIZ(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C6284Wh.A04(this);
            }
        } catch (Throwable th2) {
            AbstractC6271WU.A00(th2, this);
        }
    }
}
