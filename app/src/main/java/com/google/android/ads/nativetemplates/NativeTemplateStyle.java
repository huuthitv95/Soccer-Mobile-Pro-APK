package com.google.android.ads.nativetemplates;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeTemplateStyle {
    private ColorDrawable callToActionBackgroundColor;
    private float callToActionTextSize;
    private Typeface callToActionTextTypeface;
    private Integer callToActionTypefaceColor;
    private ColorDrawable mainBackgroundColor;
    private ColorDrawable primaryTextBackgroundColor;
    private float primaryTextSize;
    private Typeface primaryTextTypeface;
    private Integer primaryTextTypefaceColor;
    private ColorDrawable secondaryTextBackgroundColor;
    private float secondaryTextSize;
    private Typeface secondaryTextTypeface;
    private Integer secondaryTextTypefaceColor;
    private ColorDrawable tertiaryTextBackgroundColor;
    private float tertiaryTextSize;
    private Typeface tertiaryTextTypeface;
    private Integer tertiaryTextTypefaceColor;

    public static final class Builder {
        private NativeTemplateStyle styles = new NativeTemplateStyle();

        public NativeTemplateStyle build() {
            return this.styles;
        }

        public Builder withCallToActionBackgroundColor(ColorDrawable callToActionBackgroundColor) {
            this.styles.callToActionBackgroundColor = callToActionBackgroundColor;
            return this;
        }

        public Builder withCallToActionTextSize(float callToActionTextSize) {
            this.styles.callToActionTextSize = callToActionTextSize;
            return this;
        }

        public Builder withCallToActionTextTypeface(Typeface callToActionTextTypeface) {
            this.styles.callToActionTextTypeface = callToActionTextTypeface;
            return this;
        }

        public Builder withCallToActionTypefaceColor(int callToActionTypefaceColor) {
            this.styles.callToActionTypefaceColor = Integer.valueOf(callToActionTypefaceColor);
            return this;
        }

        public Builder withMainBackgroundColor(ColorDrawable mainBackgroundColor) {
            this.styles.mainBackgroundColor = mainBackgroundColor;
            return this;
        }

        public Builder withPrimaryTextBackgroundColor(ColorDrawable primaryTextBackgroundColor) {
            this.styles.primaryTextBackgroundColor = primaryTextBackgroundColor;
            return this;
        }

        public Builder withPrimaryTextSize(float primaryTextSize) {
            this.styles.primaryTextSize = primaryTextSize;
            return this;
        }

        public Builder withPrimaryTextTypeface(Typeface primaryTextTypeface) {
            this.styles.primaryTextTypeface = primaryTextTypeface;
            return this;
        }

        public Builder withPrimaryTextTypefaceColor(int primaryTextTypefaceColor) {
            this.styles.primaryTextTypefaceColor = Integer.valueOf(primaryTextTypefaceColor);
            return this;
        }

        public Builder withSecondaryTextBackgroundColor(ColorDrawable secondaryTextBackgroundColor) {
            this.styles.secondaryTextBackgroundColor = secondaryTextBackgroundColor;
            return this;
        }

        public Builder withSecondaryTextSize(float secondaryTextSize) {
            this.styles.secondaryTextSize = secondaryTextSize;
            return this;
        }

        public Builder withSecondaryTextTypeface(Typeface secondaryTextTypeface) {
            this.styles.secondaryTextTypeface = secondaryTextTypeface;
            return this;
        }

        public Builder withSecondaryTextTypefaceColor(int secondaryTextTypefaceColor) {
            this.styles.secondaryTextTypefaceColor = Integer.valueOf(secondaryTextTypefaceColor);
            return this;
        }

        public Builder withTertiaryTextBackgroundColor(ColorDrawable tertiaryTextBackgroundColor) {
            this.styles.tertiaryTextBackgroundColor = tertiaryTextBackgroundColor;
            return this;
        }

        public Builder withTertiaryTextSize(float tertiaryTextSize) {
            this.styles.tertiaryTextSize = tertiaryTextSize;
            return this;
        }

        public Builder withTertiaryTextTypeface(Typeface tertiaryTextTypeface) {
            this.styles.tertiaryTextTypeface = tertiaryTextTypeface;
            return this;
        }

        public Builder withTertiaryTextTypefaceColor(int tertiaryTextTypefaceColor) {
            this.styles.tertiaryTextTypefaceColor = Integer.valueOf(tertiaryTextTypefaceColor);
            return this;
        }
    }

    public ColorDrawable getCallToActionBackgroundColor() {
        return this.callToActionBackgroundColor;
    }

    public float getCallToActionTextSize() {
        return this.callToActionTextSize;
    }

    public Typeface getCallToActionTextTypeface() {
        return this.callToActionTextTypeface;
    }

    public Integer getCallToActionTypefaceColor() {
        return this.callToActionTypefaceColor;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public ColorDrawable getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    public float getPrimaryTextSize() {
        return this.primaryTextSize;
    }

    public Typeface getPrimaryTextTypeface() {
        return this.primaryTextTypeface;
    }

    public Integer getPrimaryTextTypefaceColor() {
        return this.primaryTextTypefaceColor;
    }

    public ColorDrawable getSecondaryTextBackgroundColor() {
        return this.secondaryTextBackgroundColor;
    }

    public float getSecondaryTextSize() {
        return this.secondaryTextSize;
    }

    public Typeface getSecondaryTextTypeface() {
        return this.secondaryTextTypeface;
    }

    public Integer getSecondaryTextTypefaceColor() {
        return this.secondaryTextTypefaceColor;
    }

    public ColorDrawable getTertiaryTextBackgroundColor() {
        return this.tertiaryTextBackgroundColor;
    }

    public float getTertiaryTextSize() {
        return this.tertiaryTextSize;
    }

    public Typeface getTertiaryTextTypeface() {
        return this.tertiaryTextTypeface;
    }

    public Integer getTertiaryTextTypefaceColor() {
        return this.tertiaryTextTypefaceColor;
    }
}
