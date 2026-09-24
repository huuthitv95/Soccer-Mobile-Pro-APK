package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7a */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47597a extends AbstractC7040j0 {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C47597a(C6902gi c6902gi, C5761O7 c5761o7) {
        super(c6902gi, c5761o7);
    }

    private C7029ip A00(Runnable runnable) {
        return new C7029ip(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0P() {
        AbstractC7081jh abstractC7081jh = (AbstractC7081jh) this.A01;
        abstractC7081jh.A00(this.A08.A00);
        abstractC7081jh.A01(this.A08.A01);
        abstractC7081jh.A0J();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0R(InterfaceC5693N1 interfaceC5693N1, C6117Tw c6117Tw, C6115Tu c6115Tu, C5762O8 c5762o8) {
        C47817w c47817w = (C47817w) interfaceC5693N1;
        C7033it c7033it = new C7033it(this, c5762o8, c47817w);
        if (C6171Up.A2f(this.A0B)) {
            Handler handlerA0H = A0H();
            C6118Tx c6118TxA05 = c6117Tw.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0H.postDelayed(c7033it, c6118TxA05.A05());
        }
        c47817w.A0K(this.A0B, A00(c7033it), c5762o8, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC7081jh rewardedVideoAdapter = (AbstractC7081jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
