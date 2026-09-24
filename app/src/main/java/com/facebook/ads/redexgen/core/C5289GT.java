package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5289GT extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public static String[] A03 = {"zQTxaAZtyj5Zf7xpyBa5Wo13", "ZyRPoqiC9PInhvt4VYdLIOd5Fjjwld3Q", "AJVcAlxtfo1o3uDwHkILc2qtWBcw5I", "qm4l90vWWtQXhhB5Cv7", "msnWA3qGYryppWjZvi7PZr4M3Bb415RH", "kQT0oRvSr6py", "zmROIVOKOovaIXaapuTgFe6PU", "TFR8Ke0ijybG7ZAZ7LbnVmkovmXx0N"};
    public final /* synthetic */ C45684V A00;
    public final /* synthetic */ C45474A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{120, -85, -100, -100, -101, -88, -97, -92, -99, 86, -97, -92, -102, -101, -100, -97, -92, -97, -86, -101, -94, -81};
    }

    static {
        A01();
    }

    public C5289GT(C45684V c45684v, C45474A c45474a) {
        this.A00 = c45684v;
        this.A01 = c45474a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A00.A0M.getState() == EnumC6844fm.A02) {
            int currentPositionInMillis = this.A00.A0M.getCurrentPositionInMillis();
            if (A03[1].charAt(3) != 'P') {
                throw new RuntimeException();
            }
            A03[3] = "tIcfuB5su4wQORzkX2J";
            if (currentPositionInMillis == A00()) {
                this.A00.A0Q(A00(0, 22, 32));
            }
        }
    }
}
