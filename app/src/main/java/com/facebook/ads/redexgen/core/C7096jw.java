package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7096jw implements InterfaceC6048Sp {
    public static byte[] A04;
    public final /* synthetic */ InterfaceC5701N9 A00;
    public final /* synthetic */ C478580 A01;
    public final /* synthetic */ C472976 A02;
    public final /* synthetic */ C6427Z2 A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C7096jw(C478580 c478580, C6427Z2 c6427z2, InterfaceC5701N9 interfaceC5701N9, C472976 c472976) {
        this.A01 = c478580;
        this.A03 = c6427z2;
        this.A00 = interfaceC5701N9;
        this.A02 = c472976;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 69);
        this.A02.A0F().A3N(C6364Y1.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        this.A00.AEN(this.A01, C6229Vm.A01(adErrorType, strA00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        this.A03.A0J();
        this.A00.ADD(this.A01, this.A03);
        this.A02.A0F().A4O(this.A01.A01 != null);
    }
}
