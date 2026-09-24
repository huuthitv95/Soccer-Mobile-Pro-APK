package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.I7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5391I7 extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public static String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C46275S A00;
    public final /* synthetic */ C45474A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, Ascii.ETB, Ascii.ETB, Ascii.DC4, 3, Ascii.CAN, Ascii.f22502US, Ascii.SYN, 81, Ascii.CAN, Ascii.f22502US, Ascii.NAK, Ascii.DC4, Ascii.ETB, Ascii.CAN, Ascii.f22502US, Ascii.CAN, 5, Ascii.DC4, Ascii.f22494GS, 8};
    }

    static {
        A01();
    }

    public C5391I7(C46275S c46275s, C45474A c45474a) {
        this.A00 = c46275s;
        this.A01 = c45474a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A00.A0S.getState() == EnumC6844fm.A02) {
            int currentPositionInMillis = this.A00.A0S.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                this.A00.A0S(A00(0, 22, 57));
            }
        }
    }
}
