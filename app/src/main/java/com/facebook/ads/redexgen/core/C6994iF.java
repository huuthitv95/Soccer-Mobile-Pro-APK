package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC4297Ad;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.ironsource.C12136ce;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6994iF extends AbstractC5784OU implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final C7013iZ A00;
    public final C6997iI A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-57, -52, -46, -35, -61, -48, -48, -51, -48, -35, -63, -51, -62, -61, -35, -55, -61, -41, -73, -68, -62, -51, -64, -60, -51, -60, -73, -78, -77, -67, -51, -78, -61, -64, -81, -62, -73, -67, -68, -51, -71, -77, -57, 114, 117, 116, 109, -123, 111, 116, 124, 103, 114, 111, 106, 103, 122, 111, 117, 116, -123, 122, 111, 115, 107, -123, 113, 107, 127, -107, -106, -108, -95, -121, -108, -108, -111, -108, -95, -113, -121, -107, -107, -125, -119, -121, -95, -115, -121, -101};
    }

    public C6994iF(String str, InterfaceC5786OW interfaceC5786OW, C7013iZ c7013iZ, C6997iI c6997iI) {
        super(str, interfaceC5786OW);
        this.A00 = c7013iZ;
        this.A01 = c6997iI;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC4297Ad interfaceC4297Ad) {
        super.A00.AEs(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC4297Ad interfaceC4297Ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 34), this.A00.A0F());
        bundle.putInt(A00(18, 25, 106), this.A01.A00);
        super.A00.AEs(2100, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC4297Ad interfaceC4297Ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 62), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), adError.getErrorCode());
        super.A00.AEs(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC4297Ad interfaceC4297Ad) {
        super.A00.AEs(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.AEs(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.AEs(3001, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.AEs(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.AEs(C12136ce.f30183h, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.AEs(3000, super.A01, null);
    }
}
