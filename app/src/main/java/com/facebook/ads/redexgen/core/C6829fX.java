package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6829fX {
    public static byte[] A02;
    public final C4901AA A00;
    public final C7280nA A01 = new C7280nA();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, Ascii.f22492FF, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, Ascii.DLE, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C6829fX(C6902gi c6902gi) {
        InterfaceC5185Em trackSelectionFactory = new C7297nR(this.A01);
        C48739h c48739h = new C48739h(trackSelectionFactory);
        InterfaceC472774 loadControl = new C7390ox();
        this.A00 = AbstractC46986b.A00(new C7387ou(c6902gi), c48739h, loadControl, this.A01);
    }

    public static String A01(C7453pz c7453pz) {
        boolean z = c7453pz instanceof C4904AD;
        String strA00 = A00(36, 2, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String strA01 = A00(0, 14, 108);
        if (z) {
            C4904AD c4904ad = (C4904AD) c7453pz;
            return A00(55, 11, 8) + c4904ad.A03 + A00(14, 22, 98) + c4904ad.A02 + strA01 + c4904ad.getCause() + strA00;
        }
        return A00(41, 14, 99) + c7453pz.getMessage() + strA01 + c7453pz.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C6827fV A08() {
        C7472qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C6827fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C6898ge c6898ge, Uri uri) {
        if (C6171Up.A2z(c6898ge, A03())) {
            C6833fb cacheManager = C6833fb.A06(c6898ge);
            InterfaceC46335Y cachedDataSourceFactory = cacheManager.A0H(c6898ge);
            this.A00.A0Q(new C48809o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC5072Cx mediaSource = new C48809o(new C7407pE(c6898ge, AbstractC46115C.A0j(c6898ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC6826fU interfaceC6826fU) {
        this.A00.A0O(new C5081D6(this, interfaceC6826fU));
    }

    public final void A0H(final InterfaceC6828fW interfaceC6828fW) {
        this.A00.A0P(new InterfaceC7378ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.core.InterfaceC46205L
            public final void AGa(int i, int i2, int i3, float f) {
                interfaceC6828fW.AGa(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
