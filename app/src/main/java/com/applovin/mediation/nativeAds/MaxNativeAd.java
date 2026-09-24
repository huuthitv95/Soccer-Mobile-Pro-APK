package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private MaxAdFormat f4137a;

        /* JADX INFO: renamed from: b */
        private String f4138b;

        /* JADX INFO: renamed from: c */
        private String f4139c;

        /* JADX INFO: renamed from: d */
        private String f4140d;

        /* JADX INFO: renamed from: e */
        private String f4141e;

        /* JADX INFO: renamed from: f */
        private MaxNativeAdImage f4142f;

        /* JADX INFO: renamed from: g */
        private View f4143g;

        /* JADX INFO: renamed from: h */
        private View f4144h;

        /* JADX INFO: renamed from: i */
        private View f4145i;

        /* JADX INFO: renamed from: j */
        private MaxNativeAdImage f4146j;

        /* JADX INFO: renamed from: k */
        private float f4147k;

        /* JADX INFO: renamed from: l */
        private Double f4148l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f4137a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f4139c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f4140d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f4141e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f4142f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f4143g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f4146j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f4147k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f4145i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f4144h = view;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.f4148l = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.f4138b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a */
        private Drawable f4149a;

        /* JADX INFO: renamed from: b */
        private Uri f4150b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f4149a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f4150b = uri;
        }

        public Drawable getDrawable() {
            return this.f4149a;
        }

        public Uri getUri() {
            return this.f4150b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f4137a;
        this.title = builder.f4138b;
        this.advertiser = builder.f4139c;
        this.body = builder.f4140d;
        this.callToAction = builder.f4141e;
        this.icon = builder.f4142f;
        this.iconView = builder.f4143g;
        this.optionsView = builder.f4144h;
        this.mediaView = builder.f4145i;
        this.mainImage = builder.f4146j;
        this.mediaContentAspectRatio = builder.f4147k;
        Double d = builder.f4148l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }
}
