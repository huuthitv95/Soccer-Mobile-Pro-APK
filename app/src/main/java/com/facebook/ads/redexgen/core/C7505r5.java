package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7505r5 {
    public static C7505r5 A03;
    public static InterfaceC7533rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C7515rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C7505r5(ViewpointQeConfig viewpointQeConfig, AbstractC7521rL abstractC7521rL, C7515rF c7515rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c7515rF;
        abstractC7521rL.A03(new C4936Aj(c7515rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C7505r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC7521rL abstractC7521rL, InterfaceC7526rQ interfaceC7526rQ, InterfaceC4938Al interfaceC4938Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C7505r5 c7505r5 = A03;
        if (c7505r5 != null) {
            return c7505r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        C5034CK c5034ck = C5034CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C7505r5(viewpointQeConfig, abstractC7521rL, new C7515rF(viewpointQeConfig, interfaceC7526rQ, c5034ck, interfaceC4938Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC7520rK interfaceC7520rK) {
        this.A02.A0H(interfaceC7520rK);
    }

    public final void A05(InterfaceC7518rI interfaceC7518rI) {
        this.A02.A0I(interfaceC7518rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C7530rU c7530rU) {
        if (this.A00.A00 && c7530rU != null) {
            this.A01.A06(dspViewableNode, c7530rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C7530rU c7530rU, C7523rN c7523rN) {
        if (this.A00.A00 && c7530rU != null) {
            this.A01.A07(dspViewableNode, c7530rU, c7523rN);
        } else {
            this.A01.A08(dspViewableNode, c7523rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C7523rN c7523rN) {
        A08(dspViewableNode, null, c7523rN);
    }
}
