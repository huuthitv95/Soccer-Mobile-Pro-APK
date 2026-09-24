package com.vungle.ads.internal.p298ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseContentView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0016H\u0010¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/view/BaseContentView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "internal", "Lcom/vungle/ads/internal/NativeAdInternal;", "(Landroid/content/Context;Lcom/vungle/ads/internal/NativeAdInternal;)V", "imageView", "Landroid/widget/ImageView;", "getImageView$vungle_ads_release", "()Landroid/widget/ImageView;", "setImageView$vungle_ads_release", "(Landroid/widget/ImageView;)V", "getInternal", "()Lcom/vungle/ads/internal/NativeAdInternal;", "nativeVideoListener", "Lcom/vungle/ads/nativead/NativeVideoListener;", "getNativeVideoListener", "()Lcom/vungle/ads/nativead/NativeVideoListener;", "setNativeVideoListener", "(Lcom/vungle/ads/nativead/NativeVideoListener;)V", "destroy", "", "destroy$vungle_ads_release", "render", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public class BaseContentView extends RelativeLayout {
    private ImageView imageView;
    private final NativeAdInternal internal;
    private NativeVideoListener nativeVideoListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentView(Context context, NativeAdInternal internal) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.internal = internal;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void destroy$vungle_ads_release() {
        removeAllViews();
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseContentView baseContentView = this;
            ImageView imageView = this.imageView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: getImageView$vungle_ads_release, reason: from getter */
    public final ImageView getImageView() {
        return this.imageView;
    }

    public final NativeAdInternal getInternal() {
        return this.internal;
    }

    public final NativeVideoListener getNativeVideoListener() {
        return this.nativeVideoListener;
    }

    public void render(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.internal.displayMainImage(this.imageView);
        requestLayout();
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setNativeVideoListener(NativeVideoListener nativeVideoListener) {
        this.nativeVideoListener = nativeVideoListener;
    }
}
