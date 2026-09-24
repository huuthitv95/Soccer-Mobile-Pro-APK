package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.AbstractC1714s0;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1592j6;
import com.applovin.impl.C1595k;
import com.applovin.impl.C1832z5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C1768p logger;
    private final C1748l sdk;

    public AppLovinNativeAdService(C1748l c1748l) {
        this.sdk = c1748l;
        this.logger = c1748l.m4782Q();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1768p.m5167h(TAG, "Empty ad token");
            AbstractC1793v2.m5413b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        C1595k c1595k = new C1595k(strTrim, this.sdk);
        if (c1595k.m3037c() == C1595k.a.REGULAR) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(TAG, "Loading next ad for token: " + c1595k);
            }
            this.sdk.m4853s0().m2604a((AbstractRunnableC1601k5) new C1832z5(c1595k, appLovinNativeAdLoadListener, this.sdk), C1552f6.b.CORE);
            return;
        }
        if (c1595k.m3037c() != C1595k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1768p.m5167h(TAG, "Invalid token type");
            AbstractC1793v2.m5413b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectM3035a = c1595k.m3035a();
        if (jSONObjectM3035a == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1595k.m3036b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1768p.m5167h(TAG, str2);
            AbstractC1793v2.m5413b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        AbstractC1714s0.m4323c(jSONObjectM3035a, this.sdk);
        AbstractC1714s0.m4321b(jSONObjectM3035a, this.sdk);
        AbstractC1714s0.m4312a(jSONObjectM3035a, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectM3035a, AbstractC13068b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(TAG, "Rendering ad for token: " + c1595k);
            }
            this.sdk.m4853s0().m2604a((AbstractRunnableC1601k5) new C1592j6(jSONObjectM3035a, appLovinNativeAdLoadListener, this.sdk), C1552f6.b.CORE);
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5174b(TAG, "No ad returned from the server for token: " + c1595k);
        }
        AbstractC1793v2.m5413b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
