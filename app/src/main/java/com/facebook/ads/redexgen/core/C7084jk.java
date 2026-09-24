package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7084jk extends AbstractC5695N3 {
    public static byte[] A02;

    @Nullable
    public final C7082ji A00;
    public final InterfaceC6192VA A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C7084jk(C6902gi c6902gi, AbstractC5696N4 abstractC5696N4, C6847fp c6847fp, InterfaceC6192VA interfaceC6192VA, C7082ji c7082ji) {
        super(c6902gi, abstractC5696N4, c6847fp);
        this.A01 = interfaceC6192VA;
        this.A00 = c7082ji;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5695N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC5790Oa.A02(this.A00.A0a(), AbstractC6349Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C6171Up.A1A(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C6288Wl c6288WlA00 = C6288Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                c6288WlA00.A0E(string, placementType);
            }
        }
    }
}
