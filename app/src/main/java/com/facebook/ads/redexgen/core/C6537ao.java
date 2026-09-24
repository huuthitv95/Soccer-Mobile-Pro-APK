package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6537ao implements InterfaceC6072TD {
    public static byte[] A01;
    public final C6067T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, Ascii.f22491EM, Ascii.f22499SI, Ascii.f22494GS, Ascii.SUB, Ascii.DC4, Ascii.f22499SI};
    }

    public C6537ao(C6067T8 c6067t8) {
        this.A00 = c6067t8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A86() {
        return AbstractC6260WI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final InterfaceC6071TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C6546ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6072TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
