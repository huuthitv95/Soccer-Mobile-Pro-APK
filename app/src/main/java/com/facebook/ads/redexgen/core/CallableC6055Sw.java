package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC6055Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C6054Sv A00;
    public final /* synthetic */ C6056Sx A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC6055Sw(C6056Sx c6056Sx, C6054Sv c6054Sv) {
        this.A01 = c6056Sx;
        this.A00 = c6054Sv;
    }

    private final Boolean A00() throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            C5602LX c5602lx = new C5602LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            c5602lx.A01 = this.A00.A05;
            c5602lx.A00 = this.A00.A04;
            if (C6059T0.A06(this.A01.A04)) {
                C6056Sx.A0F.put(this.A00.A08, c5602lx);
            }
            boolean precacheResult = false;
            if (this.A01.A08) {
                precacheResult = C6056Sx.A03(this.A01.A04.A02()).AIe(c5602lx, false).A01();
            } else if (this.A01.A03.A0F(this.A00) != null) {
                precacheResult = true;
            }
            C6062T3 c6062t3 = this.A00.A01;
            if (c6062t3 != null && c6062t3.A02()) {
                int iA00 = c6062t3.A00();
                int iA01 = c6062t3.A01();
                if (iA00 <= 0 || iA01 <= 0) {
                    if (this.A01.A08) {
                        A04(this.A00.A08, c5602lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else if (this.A01.A08) {
                    c5602lx.A00 = iA00;
                    c5602lx.A01 = iA01;
                    A04(this.A00.A08, c5602lx);
                } else {
                    A03(iA00, iA01);
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
            return null;
        }
    }

    private void A03(int i, int i2) {
        Bitmap bitmapA0G = this.A01.A03.A0G(this.A01.A04, this.A00.A08, i, i2, this.A00.A02);
        if (bitmapA0G == null) {
            return;
        }
        this.A01.A07.put(this.A00.A08, bitmapA0G);
    }

    private void A04(String str, C5602LX c5602lx) {
        Bitmap bitmapA00 = C6056Sx.A03(this.A01.A04.A02()).AIe(c5602lx, true).A00();
        if (bitmapA00 == null) {
            return;
        }
        this.A01.A07.put(str, bitmapA00);
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
