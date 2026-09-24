package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6002S4 implements NativeAdViewApi {
    public static View A00(C6902gi c6902gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C6221Vd c6221Vd = (C6221Vd) nativeAdViewAttributes.getInternalAttributes();
        C6140UK internalNativeAd = C6140UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC6222Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c6221Vd);
        C47357C c47357c = new C47357C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c6902gi, c47357c);
        c47357c.A08(mediumRectTemplateLayout, c6902gi, nativeAd, c6221Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC6334XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C6902gi c6902gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C6140UK c6140ukA0L = C6140UK.A0L(nativeAd.getInternalNativeAd());
        C6221Vd c6221Vd = (C6221Vd) nativeAdViewAttributes.getInternalAttributes();
        c6140ukA0L.A1h(EnumC6222Ve.A0B);
        c6140ukA0L.A1g(c6221Vd);
        C47357C c47357c = new C47357C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c6902gi, c47357c);
        c47357c.A08(nativeAdLayout, c6902gi, nativeAd, c6221Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C5987Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return AbstractC6429Z4.A00(C5987Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C6902gi contextWrapper;
        try {
            if (context instanceof C6902gi) {
                contextWrapper = (C6902gi) context;
            } else {
                contextWrapper = C5987Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return AbstractC6429Z4.A00(C5987Rp.A03(context), th);
        }
    }
}
