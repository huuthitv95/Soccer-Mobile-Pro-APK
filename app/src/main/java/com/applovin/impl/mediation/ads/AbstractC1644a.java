package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1811x2;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1644a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected MaxAdExpirationListener expirationListener;
    protected final C1768p logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final C1748l sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a */
    public interface a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    protected AbstractC1644a(String str, MaxAdFormat maxAdFormat, String str2, C1748l c1748l) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = c1748l;
        this.tag = str2;
        this.logger = c1748l.m4782Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3407a(String str, String str2, MaxAdFormat maxAdFormat, String str3, C1748l c1748l, String str4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str + CertificateUtil.DELIMITER + str2);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str3, mapHashMap);
        c1748l.m4784R().m2678a(C1548f2.f1573x0, str4, mapHashMap);
    }

    /* JADX INFO: renamed from: a */
    private void m3408a(final String str, final String str2, final String str3, final MaxAdFormat maxAdFormat, final String str4, final C1748l c1748l) {
        c1748l.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(c1748l, "reportExtraParameter", new Runnable() { // from class: com.applovin.impl.mediation.ads.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1644a.m3407a(str, str2, maxAdFormat, str3, c1748l, str4);
            }
        }), C1552f6.b.OTHER);
    }

    public static void logApiCall(String str, String str2) {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l == null) {
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            C1748l.f3003E0.m4782Q().m5171a(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    void m3409a(AbstractC1482a3 abstractC1482a3) {
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5564a().m5570a("MAX Ad").m5567a(abstractC1482a3).m5564a();
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, c1811x2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (AbstractC1701q7.m4092c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i = Integer.parseInt(str2);
            if (i > TimeUnit.MINUTES.toSeconds(2L)) {
                C1768p.m5167h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i + "s) - this will be ignored");
            }
        }
        m3408a(str, str2, this.adUnitId, this.adFormat, "extraParameter", this.sdk);
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            m3408a(str, String.valueOf(obj), this.adUnitId, this.adFormat, "localExtraParameter", this.sdk);
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }
}
