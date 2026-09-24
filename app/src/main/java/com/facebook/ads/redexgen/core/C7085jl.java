package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7085jl extends AbstractC5695N3 {
    public static byte[] A06;
    public static final String A07;
    public C7087jn A00;
    public EnumC6231Vp A01;
    public boolean A02;
    public final C6902gi A03;
    public final InterfaceC6192VA A04;
    public final AbstractC6547ay A05;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C7085jl.class.getSimpleName();
    }

    public C7085jl(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC6547ay abstractC6547ay, C6847fp c6847fp, AbstractC5696N4 abstractC5696N4, EnumC6231Vp enumC6231Vp) {
        super(c6902gi, abstractC5696N4, c6847fp);
        this.A04 = interfaceC6192VA;
        this.A05 = abstractC6547ay;
        this.A03 = c6902gi;
        this.A01 = enumC6231Vp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5695N3
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC5790Oa.A02(this.A00.A05(), AbstractC6349Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C6171Up.A1A(this.A03)) {
                if (this.A01 == EnumC6231Vp.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C6288Wl c6288WlA00 = C6288Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                c6288WlA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC6367Y4.A00(new C7086jm(this));
            }
        }
    }

    public final void A0A(C7087jn c7087jn) {
        this.A00 = c7087jn;
    }
}
