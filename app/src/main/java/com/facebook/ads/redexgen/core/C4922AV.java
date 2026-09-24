package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4922AV extends AbstractC7447pt {
    public static byte[] A01;
    public static final InterfaceC442123<C4922AV> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{Ascii.SYN, 3, Ascii.DC4, 5, 3, 8, Ascii.DC2, 70, Ascii.f22503VT, 19, Ascii.NAK, Ascii.DC2, 70, 4, 3, 70, Ascii.f22499SI, 8, 70, Ascii.DC2, Ascii.f22500SO, 3, 70, Ascii.DC4, 7, 8, 1, 3, 70, 9, 0, 70, Base64.padSymbol, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = AbstractC46115C.A0h(1);
        A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.facebook.ads.redexgen.core.InterfaceC442123
            public final InterfaceC442224 A6f(Bundle bundle) {
                return C4922AV.A00(bundle);
            }
        };
    }

    public C4922AV() {
        this.A00 = -1.0f;
    }

    public C4922AV(float f) {
        AbstractC45353y.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 45));
        this.A00 = f;
    }

    public static C4922AV A00(Bundle bundle) {
        AbstractC45353y.A07(bundle.getInt(AbstractC7447pt.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new C4922AV() : new C4922AV(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4922AV) && this.A00 == ((C4922AV) obj).A00;
    }

    public final int hashCode() {
        return AbstractC5025CB.A00(Float.valueOf(this.A00));
    }
}
