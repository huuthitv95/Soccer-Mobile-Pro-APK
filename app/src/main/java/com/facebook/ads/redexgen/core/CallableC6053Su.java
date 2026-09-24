package com.facebook.ads.redexgen.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC6053Su implements Callable<Boolean> {
    public static byte[] A02;
    public final C6052St A00;
    public final /* synthetic */ C6056Sx A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC6053Su(C6056Sx c6056Sx, C6052St c6052St) {
        this.A01 = c6056Sx;
        this.A00 = c6052St;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (AbstractC6271WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 72);
            } else {
                strA01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            C5602LX c5602lx = new C5602LX(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            c5602lx.A04 = this.A00.A03;
            c5602lx.A02 = this.A00.A01;
            c5602lx.A05 = this.A00.A04;
            if (C6059T0.A06(this.A01.A04)) {
                C6056Sx.A0F.put(this.A00.A08, c5602lx);
            }
            return Boolean.valueOf(C6056Sx.A03(this.A01.A04.A02()).AIg(c5602lx) != null);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC6271WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
            return null;
        }
    }
}
