package com.facebook.ads.redexgen.core;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5324H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C5318Gw A00;
    public final int A01;
    public final C7270n0 A02;
    public final InterfaceC5323H1 A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, Base64.padSymbol, 43};
    }

    static {
        A03();
    }

    public AbstractC5324H2(InterfaceC5319Gx interfaceC5319Gx, InterfaceC5323H1 interfaceC5323H1, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.A03 = interfaceC5323H1;
        this.A01 = i;
        this.A02 = new C7270n0(interfaceC5319Gx, j, j2, j3, j4, j5, j6);
    }

    private final int A00(InterfaceC7263ms interfaceC7263ms, long j, C5353HV c5353hv) {
        if (j != interfaceC7263ms.A8n()) {
            c5353hv.A00 = j;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C5318Gw A01(long j) {
        return new C5318Gw(j, this.A02.A05(j), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z, long j) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC7263ms interfaceC7263ms, long j) throws IOException {
        long jA8n = j - interfaceC7263ms.A8n();
        if (jA8n >= 0 && jA8n <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC7263ms.AK3((int) jA8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        while (true) {
            C5318Gw c5318Gw = (C5318Gw) AbstractC45353y.A02(this.A00);
            long jA01 = c5318Gw.A01();
            long jA00 = c5318Gw.A00();
            long jA02 = c5318Gw.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC7263ms, jA01, c5353hv);
            }
            if (!A05(interfaceC7263ms, jA02)) {
                return A00(interfaceC7263ms, jA02, c5353hv);
            }
            interfaceC7263ms.AIl();
            C5321Gz c5321GzAIw = this.A03.AIw(interfaceC7263ms, c5318Gw.A04());
            switch (c5321GzAIw.A00) {
                case -3:
                    A04(false, jA02);
                    return A00(interfaceC7263ms, jA02, c5353hv);
                case -2:
                    c5318Gw.A0D(c5321GzAIw.A02, c5321GzAIw.A01);
                    break;
                case -1:
                    c5318Gw.A0C(c5321GzAIw.A02, c5321GzAIw.A01);
                    break;
                case 0:
                    A05(interfaceC7263ms, c5321GzAIw.A01);
                    long floorPosition = c5321GzAIw.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC7263ms, c5321GzAIw.A01, c5353hv);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C7270n0 A07() {
        return this.A02;
    }

    public final void A08(long j) {
        if (this.A00 != null && this.A00.A03() == j) {
            return;
        }
        this.A00 = A01(j);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
