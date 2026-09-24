package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C48018G extends AbstractC7133kY<EnumC5636M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C48018G(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7133kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C5630Lz A04(EnumC5636M5 enumC5636M5) {
        return new C5630Lz(this, enumC5636M5 == null ? A00(0, 4, 114) : enumC5636M5.A03());
    }
}
