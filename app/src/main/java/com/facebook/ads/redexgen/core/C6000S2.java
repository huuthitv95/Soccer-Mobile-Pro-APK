package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6000S2 implements NativeAdApi {
    public static String[] A02 = {"Qf6uI4y6btMkRXvA96gvAPpQqYMeMLVQ", "xsH0pc0gEvMtYCBpu3k37P2MSYje76", "eIeN", "vYRtnf0lNdhCyq", "4", "0cPKH6qR821KJSq9ovGwsT1tt", "LdRpqMhVSgJGWZUoheR2iPgR57uht61Q", "hYjvJgOs8spNmgMi7B8jHFIGUAKFh9RM"};
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    public C6000S2(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        C6140UK.A0L(nativeAdBaseApi).A1i(EnumC6232Vq.A06);
    }

    public C6000S2(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private C6140UK A00() {
        return C6140UK.A0L(this.A01);
    }

    public final int A01() {
        return A00().A10();
    }

    public final String A02() {
        return A00().A1L();
    }

    public final String A03() {
        return A00().A1M();
    }

    public final List<NativeAd> A04() {
        if (A00().A1N() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C6140UK internalNativeAd : A00().A1N()) {
            arrayList.add(new NativeAd(internalNativeAd.A16(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        if (!TextUtils.isEmpty(A00().A1M())) {
            return NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1N() != null && !A00().A1N().isEmpty()) {
            return NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            NativeAd.AdCreativeType adCreativeType = NativeAd.AdCreativeType.IMAGE;
            if (A02[1].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "KhCZfMyUHPJBMWXSGegcdmWrt";
            strArr[3] = "8FosuavNBsKEQf";
            return adCreativeType;
        }
        return NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return EnumC6223Vf.A00(A00().A1D());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView, List<View> clickableViews) {
        if (imageView != null) {
            C6902gi c6902giA16 = A00().A16();
            C6902gi downloadContext = C5987Rp.A03(imageView.getContext());
            downloadContext.A0L(c6902giA16);
            C6140UK.A0k(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2, List<View> list) {
        if (mediaView != null) {
            ((C6932hC) mediaView.getMediaViewApi()).A0W(this.A00);
        }
        if (mediaView2 != null) {
            ((C6932hC) mediaView2.getMediaViewApi()).A0X(this.A01, false);
        }
        if (list != null) {
            A00().A1V(view, mediaView, list);
            return;
        }
        C6140UK c6140ukA00 = A00();
        String[] strArr = A02;
        if (strArr[0].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        A02[4] = "Y8dslRp9uWVtvGXxjU2U0Td790Xm7bcp";
        c6140ukA00.A1U(view, mediaView);
    }
}
