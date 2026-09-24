package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5375Hr implements InterfaceC6539aq {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ C460455 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, Ascii.f22494GS, 44, Ascii.f22502US, 52, 39, 37, Ascii.f22502US, 50, 39, 45, 44, Ascii.f22494GS, 39, Ascii.f22502US, 32};
    }

    static {
        A01();
    }

    public C5375Hr(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF7(String str) {
        this.A00.A0H = false;
        if (this.A00.A05 != null) {
            this.A00.A05.setProgress(100);
        }
        AbstractC6374YB.A0O(this.A00.A05, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AF9(String str) {
        this.A00.A0H = true;
        AbstractC6374YB.A0O(this.A00.A05, 0);
        if (this.A00.A04 != null) {
            this.A00.A04.setUrl(str);
        }
        if (!this.A00.A0G && this.A00.A01 > 1) {
            this.A00.A0G = true;
            this.A00.A0r(A00(0, 19, 88));
        }
        C460455 c460455 = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        C460455.A03(c460455);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFY(int i) {
        if (this.A00.A0H && this.A00.A05 != null) {
            this.A00.A05.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFb(String str) {
        if (this.A00.A04 != null) {
            this.A00.A04.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6539aq
    public final void AFe() {
        ((AbstractC5428Ij) this.A00).A0B.ADJ(14);
    }
}
