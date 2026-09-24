package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.C1846R;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final AppLovinNativeAdImpl nativeAd;
    private final Uri privacyDestinationUri;
    private final C1748l sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1748l c1748l, Context context) {
        super(context);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = c1748l;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            ImageViewUtils.setImageUri(imageView, privacyIconUri, c1748l);
        } else {
            imageView.setImageResource(C1846R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.nativeAd.isCustomTabsEnabled()) {
            this.sdk.m4757A().m2661a(this.privacyDestinationUri, this.nativeAd, this.sdk.m4861w0());
        } else {
            AbstractC1664n7.m3685a(this.privacyDestinationUri, C1748l.m4756p(), this.sdk);
        }
    }
}
