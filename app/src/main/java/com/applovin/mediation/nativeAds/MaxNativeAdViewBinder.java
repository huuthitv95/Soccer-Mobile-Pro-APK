package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private final View f4168a;

        /* JADX INFO: renamed from: b */
        private final int f4169b;

        /* JADX INFO: renamed from: c */
        private int f4170c;

        /* JADX INFO: renamed from: d */
        private int f4171d;

        /* JADX INFO: renamed from: e */
        private int f4172e;

        /* JADX INFO: renamed from: f */
        private int f4173f;

        /* JADX INFO: renamed from: g */
        private int f4174g;

        /* JADX INFO: renamed from: h */
        private int f4175h;

        /* JADX INFO: renamed from: i */
        private int f4176i;

        /* JADX INFO: renamed from: j */
        private int f4177j;

        /* JADX INFO: renamed from: k */
        private int f4178k;

        /* JADX INFO: renamed from: l */
        private int f4179l;

        /* JADX INFO: renamed from: m */
        private int f4180m;

        /* JADX INFO: renamed from: n */
        private String f4181n;

        public Builder(int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.f4170c = -1;
            this.f4171d = -1;
            this.f4172e = -1;
            this.f4173f = -1;
            this.f4174g = -1;
            this.f4175h = -1;
            this.f4176i = -1;
            this.f4177j = -1;
            this.f4178k = -1;
            this.f4179l = -1;
            this.f4180m = -1;
            this.f4169b = i;
            this.f4168a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f4168a, this.f4169b, this.f4170c, this.f4171d, this.f4172e, this.f4173f, this.f4174g, this.f4177j, this.f4175h, this.f4176i, this.f4178k, this.f4179l, this.f4180m, this.f4181n);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f4171d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f4172e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f4180m = i;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(int i) {
            this.f4174g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f4173f = i;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(int i) {
            this.f4179l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f4178k = i;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(int i) {
            this.f4176i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f4175h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i) {
            this.f4177j = i;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.f4181n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f4170c = i;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.starRatingContentViewGroupId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
