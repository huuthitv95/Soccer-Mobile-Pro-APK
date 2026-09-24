package com.ironsource.adapters.ironsource.nativeAd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C11344A8;
import com.ironsource.C11362B8;
import com.ironsource.C11416E8;
import com.ironsource.InterfaceC11398D8;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.C12514R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final InterfaceC11398D8 nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private C11344A8 networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(InterfaceC11398D8 nativeAd, NativeAdProperties nativeAdProperties) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.mo25612c() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            C11362B8 c11362b8Mo25612c = this.nativeAd.mo25612c();
            Intrinsics.checkNotNull(c11362b8Mo25612c);
            WebView webViewM25435l = c11362b8Mo25612c.m25435l();
            if (webViewM25435l != null) {
                mediaView.addView(webViewM25435l, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        C11362B8 c11362b8Mo25612c2 = this.nativeAd.mo25612c();
        Intrinsics.checkNotNull(c11362b8Mo25612c2);
        View viewM25436m = c11362b8Mo25612c2.m25436m();
        viewM25436m.setId(C12514R.id.privacy_icon_button);
        viewM25436m.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C11344A8 c11344a8 = new C11344A8(context);
        c11344a8.addView(view);
        c11344a8.addView(viewM25436m);
        this.networkNativeAdView = c11344a8;
        C11344A8 networkNativeAdView = getNetworkNativeAdView();
        Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.mo25610a(new C11416E8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM25436m));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public C11344A8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
