package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45193i {
    public static byte[] A04;
    public static final C45193i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, 37, Ascii.f22498RS, 43, 43, 34, 41, 0, 44, 50, 43, 49, -6, Ascii.f22500SO, 2, 71, 80, 69, 81, 70, 75, 80, 73, Ascii.f22502US, -33, 19, 2, 7, Ascii.f22490CR, -28, Ascii.f22490CR, Ascii.DLE, Ascii.f22503VT, -1, Ascii.DC2, -7, 17, -1, Ascii.f22503VT, Ascii.f22500SO, 10, 3, -16, -1, Ascii.DC2, 3, -37};
    }

    static {
        A01();
        A05 = new C45193i(-1, -1, -1);
    }

    public C45193i(int i, int i2, int i3) {
        int iA06;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (AbstractC46115C.A15(i3)) {
            iA06 = AbstractC46115C.A06(i3, i2);
        } else {
            iA06 = -1;
        }
        this.A00 = iA06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45193i)) {
            return false;
        }
        C45193i c45193i = (C45193i) obj;
        return this.A03 == c45193i.A03 && this.A01 == c45193i.A01 && this.A02 == c45193i.A02;
    }

    public final int hashCode() {
        return AbstractC5025CB.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, 127) + this.A02 + AbstractJsonLexerKt.END_LIST;
    }
}
