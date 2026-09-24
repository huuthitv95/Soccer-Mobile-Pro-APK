package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47357C extends C6931hB {
    public InterfaceC6774ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C6902gi c6902gi, NativeAd nativeAd, C6221Vd c6221Vd) {
        C6595bk c6595bk = new C6595bk(c6902gi);
        MediaView mediaView = new MediaView(c6902gi);
        AdOptionsView adOptionsView = new AdOptionsView(c6902gi, nativeAd, nativeAdLayout);
        c6221Vd.A09(adOptionsView, 28);
        this.A00 = new C5201F2(c6902gi, nativeAd, c6221Vd, C6140UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c6595bk, mediaView, adOptionsView);
        AbstractC6374YB.A0N(nativeAdLayout, c6221Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c6595bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5984Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
