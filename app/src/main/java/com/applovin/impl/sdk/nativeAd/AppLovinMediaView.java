package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.C1846R;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final C1768p logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final C1748l sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1748l c1748l, Context context) {
        super(context);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = c1748l;
        this.logger = c1748l.m4782Q();
        LayoutInflater.from(context).inflate(C1846R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        C1711r7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri uriMo4235i0 = vastAd != null ? vastAd.mo4235i0() : null;
        if (mainImageUri == null && uriMo4235i0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) c1748l.m4801a(C1831z4.f3729H2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(c1748l, C1831z4.f3931g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(C1846R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
