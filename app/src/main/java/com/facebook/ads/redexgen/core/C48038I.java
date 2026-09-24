package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C48038I extends AbstractC7133kY<EnumC5622Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C48038I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7133kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C5630Lz A04(EnumC5622Lr enumC5622Lr) {
        return new C5630Lz(this, enumC5622Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC5622Lr.A03());
    }
}
