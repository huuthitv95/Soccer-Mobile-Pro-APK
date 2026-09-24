package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C11608P2;
import com.ironsource.InterfaceC11625Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdView extends FrameLayout implements InterfaceC11625Q2 {

    /* JADX INFO: renamed from: a */
    private C11608P2 f41405a;

    /* JADX INFO: renamed from: b */
    private BannerAdViewListener f41406b;

    private BannerAdView(Context context) {
        super(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(C11608P2 bannerAdViewInternal) {
        Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.m26812d().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f41405a = bannerAdViewInternal;
        bannerAdViewInternal.m26808a(new WeakReference<>(this));
        bannerAdViewInternal.m26810b(new WeakReference<>(this));
    }

    public final BannerAdInfo getAdInfo() {
        C11608P2 c11608p2 = this.f41405a;
        if (c11608p2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            c11608p2 = null;
        }
        return c11608p2.m26811c();
    }

    public final BannerAdViewListener getListener() {
        return this.f41406b;
    }

    @Override // com.ironsource.InterfaceC11625Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f41406b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC11625Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f41406b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f41406b = bannerAdViewListener;
    }
}
