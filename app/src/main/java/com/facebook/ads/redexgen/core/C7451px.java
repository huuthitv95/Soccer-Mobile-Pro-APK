package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.px */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7451px implements InterfaceC442224 {
    public static byte[] A03;
    public static String[] A04 = {"UnBMZo2POSkJfz8F5ORuhqz31kXq7ERt", "GIL9xJe6rQGrNyWVB8WflXUexCYVOXiL", "1YJSMghIf03NGeOR9kmJ9bGOSAOIDk9h", "FbkWhL7EvytxWPK79enAjrYaTxkw07sQ", "DvmeNztcauqB3GuZI4NFBZAXEAF", "3h1K0W52WnqAecgG5ddVr1SgL8ZiRxH3", "SzBXc", "YkLyJW6tcdkoyMoq5nPmYT201JvYdNzP"};
    public static final InterfaceC442123<C7451px> A05;
    public static final C7451px A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{109, 81, 92, 68, 95, 92, 94, 86, 109, 92, 79, 92, 80, 88, 73, 88, 79, 78, Ascii.NAK, 78, 77, 88, 88, 89, 0, Ascii.CAN, 19, Ascii.f22499SI, 91, 17, Ascii.f22494GS, 77, 84, 73, 94, 85, 0, Ascii.CAN, 19, Ascii.f22499SI, 91, Ascii.DC4};
    }

    static {
        A02();
        A06 = new C7451px(1.0f);
        A08 = AbstractC46115C.A0h(0);
        A07 = AbstractC46115C.A0h(1);
        A05 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.py
            @Override // com.facebook.ads.redexgen.core.InterfaceC442123
            public final InterfaceC442224 A6f(Bundle bundle) {
                return C7451px.A00(bundle);
            }
        };
    }

    public C7451px(float f) {
        this(f, 1.0f);
    }

    public C7451px(float f, float f2) {
        AbstractC45353y.A07(f > 0.0f);
        AbstractC45353y.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(1000.0f * f);
    }

    public static /* synthetic */ C7451px A00(Bundle bundle) {
        float f = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C7451px(f, pitch);
    }

    public final long A03(long j) {
        return ((long) this.A02) * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7451px c7451px = (C7451px) obj;
        if (this.A01 == c7451px.A01) {
            float f = this.A00;
            float f2 = c7451px.A00;
            if (A04[7].charAt(19) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "pC9U2";
            strArr[4] = "3ca7HvojzYBlvf3WwnTfkyYQmWq";
            if (f == f2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return AbstractC46115C.A0n(A01(0, 42, 46), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
