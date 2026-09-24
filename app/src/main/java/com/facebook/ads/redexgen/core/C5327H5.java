package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5327H5 {
    public static byte[] A03;
    public final InterfaceC5326H4 A00;
    public final Constructor<? extends InterfaceC5331H9> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, Ascii.f22494GS, 0, 82, Ascii.ESC, Ascii.f22493FS, 1, 6, 19, Ascii.f22493FS, 6, Ascii.ESC, 19, 6, Ascii.ESC, Ascii.f22493FS, Ascii.NAK, 82, Ascii.ETB, 10, 6, Ascii.ETB, Ascii.f22493FS, 1, Ascii.ESC, Ascii.f22494GS, Ascii.f22493FS, 37, Ascii.f22498RS, Ascii.NAK, 8, 0, Ascii.NAK, 19, 4, Ascii.NAK, Ascii.DC4, 80, Ascii.NAK, 2, 2, Ascii.f22502US, 2, 80, 19, 2, Ascii.NAK, 17, 4, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, 80, Ascii.NAK, 8, 4, 2, 17, 19, 4, Ascii.f22502US, 2};
    }

    public C5327H5(InterfaceC5326H4 interfaceC5326H4) {
        this.A00 = interfaceC5326H4;
    }

    private Constructor<? extends InterfaceC5331H9> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7R();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e) {
                throw new RuntimeException(A00(0, 29, 124), e);
            }
        }
    }

    public final InterfaceC5331H9 A03(Object... objArr) {
        Constructor<? extends InterfaceC5331H9> constructorA01 = A01();
        if (constructorA01 == null) {
            return null;
        }
        try {
            return constructorA01.newInstance(objArr);
        } catch (Exception e) {
            throw new IllegalStateException(A00(29, 35, 126), e);
        }
    }
}
