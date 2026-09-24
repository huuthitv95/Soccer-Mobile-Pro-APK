package com.vungle.ads.internal.p298ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.nativead.NativeVideoContract;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentView", "Lcom/vungle/ads/internal/ui/view/BaseContentView;", "videoListener", "Lcom/vungle/ads/nativead/NativeVideoListener;", "destroy", "", "destroy$vungle_ads_release", "getCurrentTime", "getDuration", "getVideoControl", "Lcom/vungle/ads/nativead/NativeVideoContract$VideoControl;", "getVideoControl$vungle_ads_release", "present", "internal", "Lcom/vungle/ads/internal/NativeAdInternal;", "present$vungle_ads_release", "setNativeVideoListener", "listener", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class MediaView extends RelativeLayout {
    private BaseContentView contentView;
    private NativeVideoListener videoListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void destroy$vungle_ads_release() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
        BaseContentView baseContentView = this.contentView;
        if (baseContentView != null) {
            baseContentView.destroy$vungle_ads_release();
        }
        this.contentView = null;
    }

    public final int getCurrentTime() {
        NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getDuration() : 0) / 1000;
    }

    public final NativeVideoContract.VideoControl getVideoControl$vungle_ads_release() {
        ViewParent viewParent = this.contentView;
        if (viewParent instanceof NativeVideoContract.VideoControl) {
            return (NativeVideoContract.VideoControl) viewParent;
        }
        return null;
    }

    public final void present$vungle_ads_release(NativeAdInternal internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        if (internal.hasVideoContent()) {
            if (this.contentView == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                VideoContentView videoContentView = new VideoContentView(context, internal);
                videoContentView.setNativeVideoListener(this.videoListener);
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, internal.getLogEntry(), (String) null, 4, (Object) null);
                this.contentView = videoContentView;
            }
        } else if (this.contentView == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            BaseContentView baseContentView = new BaseContentView(context2, internal);
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric2 = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            singleValueMetric2.setValue(2L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric2, internal.getLogEntry(), (String) null, 4, (Object) null);
            this.contentView = baseContentView;
        }
        BaseContentView baseContentView2 = this.contentView;
        if (baseContentView2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            baseContentView2.setLayoutParams(layoutParams);
            if (!Intrinsics.areEqual(baseContentView2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) baseContentView2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(baseContentView2);
                }
                addView(baseContentView2);
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            baseContentView2.render(context3);
        }
    }

    public final void setNativeVideoListener(NativeVideoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoListener = listener;
        BaseContentView baseContentView = this.contentView;
        VideoContentView videoContentView = baseContentView instanceof VideoContentView ? (VideoContentView) baseContentView : null;
        if (videoContentView == null) {
            return;
        }
        videoContentView.setNativeVideoListener(listener);
    }
}
