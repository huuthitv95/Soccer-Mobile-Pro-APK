package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.f */
/* JADX INFO: loaded from: classes3.dex */
public class C1545f extends AbstractC1558g2 {
    public C1545f(C1748l c1748l) {
        super(c1748l, C1548f2.b.AD);
    }

    /* JADX INFO: renamed from: a */
    private AppLovinAdSize m2523a(C1781u c1781u, AbstractC1736b abstractC1736b) {
        AppLovinAdSize appLovinAdSizeM5265f = c1781u != null ? c1781u.m5265f() : null;
        if (appLovinAdSizeM5265f != null) {
            return appLovinAdSizeM5265f;
        }
        if (abstractC1736b != null) {
            return abstractC1736b.getSize();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m2524a(C1548f2 c1548f2, C1781u c1781u, AbstractC1736b abstractC1736b, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f1653a.m4801a(C1831z4.f3742J)).booleanValue() && this.f1653a.m4772I0()) {
            return;
        }
        if (abstractC1736b != null) {
            map.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
        } else if (c1781u != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", c1781u.m5264e(), map);
            MaxAdFormat maxAdFormatM5263d = c1781u.m5263d();
            if (maxAdFormatM5263d != null) {
                CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatM5263d.getLabel(), map);
            }
        }
        AppLovinAdSize appLovinAdSizeM2523a = m2523a(c1781u, abstractC1736b);
        if (appLovinAdSizeM2523a != null) {
            CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeM2523a.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        m2682d(c1548f2, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2525a(C1548f2 c1548f2, AbstractC1736b abstractC1736b) {
        m2526a(c1548f2, abstractC1736b, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m2526a(C1548f2 c1548f2, AbstractC1736b abstractC1736b, Map map) {
        m2524a(c1548f2, abstractC1736b != null ? abstractC1736b.getAdZone() : null, abstractC1736b, null, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2527a(C1548f2 c1548f2, C1781u c1781u, AppLovinError appLovinError) {
        m2524a(c1548f2, c1781u, null, appLovinError, new HashMap());
    }
}
