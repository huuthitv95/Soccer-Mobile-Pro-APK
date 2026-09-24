package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1713s;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private MaxAdViewImpl f4127a;

    /* JADX INFO: renamed from: b */
    private View f4128b;

    /* JADX INFO: renamed from: c */
    private int f4129c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strM4303a = AbstractC1713s.m4303a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strM4303a2 = AbstractC1713s.m4303a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat fromString = StringUtils.isValidString(strM4303a2) ? MaxAdFormat.formatFromString(strM4303a2) : AbstractC1713s.m4301a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strM4303a == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(strM4303a)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (isInEditMode()) {
            m5774a(context);
        } else {
            m5775a(strM4303a, fromString, null, attributeIntValue, context);
        }
    }

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(C1748l.m4756p());
        AbstractC1644a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        m5775a(str, maxAdFormat, maxAdViewConfiguration, 49, C1748l.m4756p());
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        AbstractC1644a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        m5775a(str, maxAdFormat, null, 49, context);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, AbstractC1713s.m4301a(C1748l.m4756p()), maxAdViewConfiguration);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, AbstractC1713s.m4301a(context), context);
    }

    /* JADX INFO: renamed from: a */
    private void m5774a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m5775a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i, Context context) {
        View view = new View(context.getApplicationContext());
        this.f4128b = view;
        view.setBackgroundColor(0);
        addView(this.f4128b);
        this.f4128b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f4129c = getVisibility();
        this.f4127a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f4128b, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f4127a.logApiCall("destroy()");
        this.f4127a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f4127a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f4127a.getAdUnitId();
    }

    public String getPlacement() {
        this.f4127a.logApiCall("getPlacement()");
        return this.f4127a.getPlacement();
    }

    public void loadAd() {
        this.f4127a.logApiCall("loadAd()");
        this.f4127a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode()) {
            return;
        }
        this.f4127a.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f4127a != null && AbstractC1564g8.m2755a(this.f4129c, i)) {
            this.f4127a.onWindowVisibilityChanged(i);
        }
        this.f4129c = i;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4127a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4127a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f4127a.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f4128b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f4127a.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl = this.f4127a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i);
        }
        View view = this.f4128b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        this.f4127a.logApiCall("setCustomData(value=" + str + ")");
        this.f4127a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4127a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4127a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f4127a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f4127a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4127a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4127a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f4127a.logApiCall("setPlacement(placement=" + str + ")");
        this.f4127a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4127a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4127a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4127a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4127a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f4127a.logApiCall("startAutoRefresh()");
        this.f4127a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f4127a.logApiCall("stopAutoRefresh()");
        this.f4127a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f4127a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
