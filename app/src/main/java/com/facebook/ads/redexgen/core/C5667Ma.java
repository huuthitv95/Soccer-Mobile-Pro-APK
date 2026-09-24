package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5667Ma implements InterfaceC6751eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ C5663MW A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C5667Ma(C5663MW c5663mw) {
        this.A00 = c5663mw;
    }

    public /* synthetic */ C5667Ma(C5663MW c5663mw, C5679Mm c5679Mm) {
        this(c5663mw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AEA() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AEh() {
        if (!this.A00.A0H.A0b()) {
            this.A00.A0N();
            return;
        }
        C5663MW c5663mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        c5663mw.A0S.set(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AFQ() {
        this.A00.AFA(false);
        this.A00.A0Q.A0E(8);
        this.A00.A0J.A0F().AFH();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AGg() {
        this.A00.A0O.ADJ(15);
    }
}
