package com.facebook.ads.redexgen.core;

import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4941Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC7534rY A00;
    public InterfaceC7518rI A01;
    public C7505r5 A02;
    public final InterfaceC7519rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC7518rI A03 = new C4942Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C4941Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC7534rY interfaceC7534rY, InterfaceC7519rJ interfaceC7519rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC7534rY;
        this.A04 = interfaceC7519rJ;
    }

    public static C4941Ao A01() {
        return new C4941Ao(new ViewpointQeConfig(), new C4944Ar(), null);
    }

    private void A05(AbstractC7521rL abstractC7521rL, InterfaceC7526rQ interfaceC7526rQ, InterfaceC4938Al interfaceC4938Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C7505r5.A01(this.A05, abstractC7521rL, interfaceC7526rQ, interfaceC4938Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C7530rU c7530rU) {
        C7505r5 c7505r5 = this.A02;
        if (c7505r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c7530rU != null) {
                c7505r5.A07(dspViewableNode, c7530rU);
            } else {
                c7505r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C7530rU c7530rU, C7523rN c7523rN) {
        C7505r5 c7505r5 = this.A02;
        if (c7505r5 != null && dspViewableNode != null && c7523rN != null) {
            if (this.A05.A00 && c7530rU != null) {
                c7523rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c7523rN.A08 + c7530rU;
                c7505r5.A08(dspViewableNode, c7530rU, c7523rN);
            } else {
                c7505r5.A09(dspViewableNode, c7523rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C7523rN<?, ?> c7523rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c7523rN);
    }

    public final void A0A(AbstractC7521rL abstractC7521rL, View view) {
        if (abstractC7521rL != null && view != null) {
            A05(abstractC7521rL, new C4943Aq(view, this.A00), new C44121u(null), null);
        }
    }
}
