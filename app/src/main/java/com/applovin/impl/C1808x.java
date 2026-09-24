package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.x */
/* JADX INFO: loaded from: classes3.dex */
public class C1808x {

    /* JADX INFO: renamed from: a */
    private final String f3544a;

    /* JADX INFO: renamed from: b */
    private final DTBAdSize f3545b;

    /* JADX INFO: renamed from: com.applovin.impl.x$a */
    private enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C1808x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f3544a = str;
        this.f3545b = m5556a(JsonUtils.getInt(jSONObject, "type", m5557a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* JADX INFO: renamed from: a */
    private DTBAdSize m5556a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private a m5557a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    /* JADX INFO: renamed from: a */
    public DTBAdSize m5558a() {
        return this.f3545b;
    }
}
