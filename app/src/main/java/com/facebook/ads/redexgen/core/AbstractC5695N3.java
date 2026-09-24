package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.N3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5695N3 {
    public static byte[] A04;
    public boolean A00;

    @Nullable
    public final AbstractC5696N4 A01;
    public final C6902gi A02;
    public final C6847fp A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, Ascii.SUB, 40, 40, Ascii.f22498RS, 36, 35, -43, 33, 36, Ascii.f22493FS, Ascii.f22493FS, Ascii.SUB, Ascii.f22491EM};
    }

    public abstract void A08(Map<String, String> map);

    public AbstractC5695N3(C6902gi c6902gi, AbstractC5696N4 abstractC5696N4, C6847fp c6847fp) {
        this.A02 = c6902gi;
        this.A01 = abstractC5696N4;
        this.A03 = c6847fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C6558b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        AbstractC6319XI.A04(this.A02, A00(0, 17, 60));
        AbstractC5696N4 abstractC5696N4 = this.A01;
    }
}
