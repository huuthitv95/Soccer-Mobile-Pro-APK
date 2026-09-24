package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.unity.ads.C10825R;

/* JADX INFO: loaded from: classes4.dex */
public final class TemplateView extends FrameLayout {
    static final String MEDIUM_TEMPLATE = "medium_template";
    private static final String SMALL_TEMPLATE = "small_template";
    private static final String TAG = "TemplateView";
    private ConstraintLayout background;
    private Button callToActionView;
    private ImageView iconView;
    private LayoutInflater layoutInflater;
    private MediaView mediaView;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private TextView primaryView;
    private RatingBar ratingBar;
    private TextView secondaryView;
    private NativeTemplateStyle styles;
    private int templateType;
    private TextView tertiaryView;

    public TemplateView(Context context) {
        super(context);
    }

    public TemplateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public TemplateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    public TemplateView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context, attrs);
    }

    public TemplateView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, LayoutInflater layoutInflater) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.layoutInflater = layoutInflater;
        initView(context, attrs);
    }

    private boolean adHasOnlyStore(NativeAd nativeAd) {
        return !TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    private void applyStyles() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable mainBackgroundColor = this.styles.getMainBackgroundColor();
        if (mainBackgroundColor != null) {
            ConstraintLayout constraintLayout = this.background;
            if (constraintLayout != null) {
                constraintLayout.setBackground(mainBackgroundColor);
            }
            TextView textView13 = this.primaryView;
            if (textView13 != null) {
                textView13.setBackground(mainBackgroundColor);
            }
            TextView textView14 = this.secondaryView;
            if (textView14 != null) {
                textView14.setBackground(mainBackgroundColor);
            }
            TextView textView15 = this.tertiaryView;
            if (textView15 != null) {
                textView15.setBackground(mainBackgroundColor);
            }
        }
        Typeface primaryTextTypeface = this.styles.getPrimaryTextTypeface();
        if (primaryTextTypeface != null && (textView12 = this.primaryView) != null) {
            textView12.setTypeface(primaryTextTypeface);
        }
        Typeface secondaryTextTypeface = this.styles.getSecondaryTextTypeface();
        if (secondaryTextTypeface != null && (textView11 = this.secondaryView) != null) {
            textView11.setTypeface(secondaryTextTypeface);
        }
        Typeface tertiaryTextTypeface = this.styles.getTertiaryTextTypeface();
        if (tertiaryTextTypeface != null && (textView10 = this.tertiaryView) != null) {
            textView10.setTypeface(tertiaryTextTypeface);
        }
        Typeface callToActionTextTypeface = this.styles.getCallToActionTextTypeface();
        if (callToActionTextTypeface != null && (button4 = this.callToActionView) != null) {
            button4.setTypeface(callToActionTextTypeface);
        }
        if (this.styles.getPrimaryTextTypefaceColor() != null && (textView9 = this.primaryView) != null) {
            textView9.setTextColor(this.styles.getPrimaryTextTypefaceColor().intValue());
        }
        if (this.styles.getSecondaryTextTypefaceColor() != null && (textView8 = this.secondaryView) != null) {
            textView8.setTextColor(this.styles.getSecondaryTextTypefaceColor().intValue());
        }
        if (this.styles.getTertiaryTextTypefaceColor() != null && (textView7 = this.tertiaryView) != null) {
            textView7.setTextColor(this.styles.getTertiaryTextTypefaceColor().intValue());
        }
        if (this.styles.getCallToActionTypefaceColor() != null && (button3 = this.callToActionView) != null) {
            button3.setTextColor(this.styles.getCallToActionTypefaceColor().intValue());
        }
        float callToActionTextSize = this.styles.getCallToActionTextSize();
        if (callToActionTextSize > 0.0f && (button2 = this.callToActionView) != null) {
            button2.setTextSize(callToActionTextSize);
        }
        float primaryTextSize = this.styles.getPrimaryTextSize();
        if (primaryTextSize > 0.0f && (textView6 = this.primaryView) != null) {
            textView6.setTextSize(primaryTextSize);
        }
        float secondaryTextSize = this.styles.getSecondaryTextSize();
        if (secondaryTextSize > 0.0f && (textView5 = this.secondaryView) != null) {
            textView5.setTextSize(secondaryTextSize);
        }
        float tertiaryTextSize = this.styles.getTertiaryTextSize();
        if (tertiaryTextSize > 0.0f && (textView4 = this.tertiaryView) != null) {
            textView4.setTextSize(tertiaryTextSize);
        }
        ColorDrawable callToActionBackgroundColor = this.styles.getCallToActionBackgroundColor();
        if (callToActionBackgroundColor != null && (button = this.callToActionView) != null) {
            button.setBackground(callToActionBackgroundColor);
        }
        ColorDrawable primaryTextBackgroundColor = this.styles.getPrimaryTextBackgroundColor();
        if (primaryTextBackgroundColor != null && (textView3 = this.primaryView) != null) {
            textView3.setBackground(primaryTextBackgroundColor);
        }
        ColorDrawable secondaryTextBackgroundColor = this.styles.getSecondaryTextBackgroundColor();
        if (secondaryTextBackgroundColor != null && (textView2 = this.secondaryView) != null) {
            textView2.setBackground(secondaryTextBackgroundColor);
        }
        ColorDrawable tertiaryTextBackgroundColor = this.styles.getTertiaryTextBackgroundColor();
        if (tertiaryTextBackgroundColor != null && (textView = this.tertiaryView) != null) {
            textView.setBackground(tertiaryTextBackgroundColor);
        }
        invalidate();
        requestLayout();
    }

    private boolean areAllViewsInitialized() {
        return (this.nativeAdView == null || this.callToActionView == null || this.primaryView == null || this.secondaryView == null || this.tertiaryView == null || this.mediaView == null || this.iconView == null || this.ratingBar == null) ? false : true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L3
            goto L10
        L3:
            android.content.res.Resources$Theme r0 = r7.getTheme()
            int[] r1 = com.google.unity.ads.C10825R.styleable.TemplateView
            r2 = 0
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r1, r2, r2)
            if (r8 != 0) goto L11
        L10:
            return
        L11:
            int r0 = com.google.unity.ads.C10825R.styleable.TemplateView_gnt_template_type
            int r1 = com.google.unity.ads.C10825R.layout.gnt_medium_template_view
            int r3 = r8.getResourceId(r0, r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L2f
            r6.templateType = r3     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L2f
            r8.recycle()
            android.view.LayoutInflater r8 = r6.layoutInflater
            if (r8 != 0) goto L25
            r6.setLayoutInflater(r7)
        L25:
            android.view.LayoutInflater r7 = r6.layoutInflater
            int r8 = r6.templateType
            r7.inflate(r8, r6)
            return
        L2d:
            r7 = move-exception
            goto L4c
        L2f:
            r7 = move-exception
            java.lang.String r3 = com.google.android.ads.nativetemplates.TemplateView.TAG     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "Failed to get template type from attribute resources (templateTypeResource: %d, templateViewResource: %d)."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2d
            r5[r2] = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            r5[r0] = r1     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L2d
            android.util.Log.e(r3, r0, r7)     // Catch: java.lang.Throwable -> L2d
            throw r7     // Catch: java.lang.Throwable -> L2d
        L4c:
            r8.recycle()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ads.nativetemplates.TemplateView.initView(android.content.Context, android.util.AttributeSet):void");
    }

    private void setLayoutInflater(Context context) {
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void destroyNativeAd() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public NativeTemplateStyle getStyles() {
        return this.styles;
    }

    public String getTemplateTypeName() {
        if (this.templateType == C10825R.layout.gnt_medium_template_view) {
            return MEDIUM_TEMPLATE;
        }
        return this.templateType == C10825R.layout.gnt_small_template_view ? SMALL_TEMPLATE : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nativeAdView = (NativeAdView) findViewById(C10825R.id.native_ad_view);
        this.primaryView = (TextView) findViewById(C10825R.id.primary);
        this.secondaryView = (TextView) findViewById(C10825R.id.secondary);
        this.tertiaryView = (TextView) findViewById(C10825R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(C10825R.id.rating_bar);
        this.ratingBar = ratingBar;
        ratingBar.setEnabled(false);
        this.callToActionView = (Button) findViewById(C10825R.id.cta);
        this.iconView = (ImageView) findViewById(C10825R.id.ad_icon);
        this.mediaView = (MediaView) findViewById(C10825R.id.media_view);
        this.background = (ConstraintLayout) findViewById(C10825R.id.ad_background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
        if (areAllViewsInitialized()) {
            String store = nativeAd.getStore();
            String advertiser = nativeAd.getAdvertiser();
            String headline = nativeAd.getHeadline();
            String body = nativeAd.getBody();
            String callToAction = nativeAd.getCallToAction();
            Double starRating = nativeAd.getStarRating();
            NativeAd.Image icon = nativeAd.getIcon();
            this.nativeAdView.setCallToActionView(this.callToActionView);
            this.nativeAdView.setHeadlineView(this.primaryView);
            this.nativeAdView.setMediaView(this.mediaView);
            this.secondaryView.setVisibility(0);
            if (adHasOnlyStore(nativeAd)) {
                this.nativeAdView.setStoreView(this.secondaryView);
            } else if (TextUtils.isEmpty(advertiser)) {
                store = "";
            } else {
                this.nativeAdView.setAdvertiserView(this.secondaryView);
                store = advertiser;
            }
            this.primaryView.setText(headline);
            this.callToActionView.setText(callToAction);
            if (starRating == null || starRating.doubleValue() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.secondaryView.setText(store);
                this.secondaryView.setVisibility(0);
                this.ratingBar.setVisibility(8);
            } else {
                this.secondaryView.setVisibility(8);
                this.ratingBar.setVisibility(0);
                this.ratingBar.setRating(starRating.floatValue());
                this.nativeAdView.setStarRatingView(this.ratingBar);
            }
            if (icon != null) {
                this.iconView.setVisibility(0);
                this.iconView.setImageDrawable(icon.getDrawable());
                this.nativeAdView.setIconView(this.iconView);
            } else {
                this.iconView.setVisibility(8);
            }
            TextView textView = this.tertiaryView;
            if (textView != null) {
                textView.setText(body);
                this.nativeAdView.setBodyView(this.tertiaryView);
            }
            this.nativeAdView.setNativeAd(nativeAd);
        }
    }

    public void setStyles(NativeTemplateStyle styles) {
        this.styles = styles;
        applyStyles();
    }
}
