package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* JADX INFO: renamed from: a */
    private C1488a f912a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1740a(null, null, null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize) {
        this(appLovinAdSize, (String) null);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str) {
        super(C1748l.m4756p());
        m1740a(appLovinAdSize, str, AppLovinSdk.getInstance(C1748l.m4756p()), C1748l.m4756p(), null);
    }

    @Deprecated
    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m1740a(appLovinAdSize, str, null, context, null);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    @Deprecated
    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m1740a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m1739a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, i, iApplyDimension);
    }

    /* JADX INFO: renamed from: a */
    private void m1740a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            m1739a(attributeSet, context);
            return;
        }
        C1488a c1488a = new C1488a();
        this.f912a = c1488a;
        c1488a.m1948a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1959b();
        }
    }

    public C1488a getController() {
        return this.f912a;
    }

    public AppLovinAdSize getSize() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            return c1488a.m1972k();
        }
        return null;
    }

    public String getZoneId() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            return c1488a.m1973l();
        }
        return null;
    }

    public void loadNextAd() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1974u();
        } else {
            C1768p.m5168i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1940B();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1941C();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1958a(z);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1962c(i);
        }
    }

    public void pause() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1942D();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1965c(appLovinAd);
        }
    }

    public void resume() {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1943F();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1953a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1954a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1955a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1949a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        C1488a c1488a = this.f912a;
        if (c1488a != null) {
            c1488a.m1957a(str, obj);
        }
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + AbstractJsonLexerKt.END_OBJ;
    }
}
