package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.b3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1509b3 extends AbstractC1558g2 {
    public C1509b3(C1748l c1748l) {
        super(c1748l, C1548f2.b.MEDIATED_AD);
    }

    /* JADX INFO: renamed from: a */
    private void m2094a(C1548f2 c1548f2, MaxAdFormat maxAdFormat, String str, AbstractC1482a3 abstractC1482a3, MaxError maxError, Map map) {
        if (abstractC1482a3 != null) {
            map.putAll(AbstractC1568h2.m2785a(abstractC1482a3));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(AbstractC1568h2.m2790a(maxError));
        }
        m2682d(c1548f2, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2095a(C1548f2 c1548f2, AbstractC1482a3 abstractC1482a3) {
        m2098a(c1548f2, abstractC1482a3, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m2096a(C1548f2 c1548f2, AbstractC1482a3 abstractC1482a3, MaxError maxError) {
        m2097a(c1548f2, abstractC1482a3, maxError, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m2097a(C1548f2 c1548f2, AbstractC1482a3 abstractC1482a3, MaxError maxError, Map map) {
        m2094a(c1548f2, abstractC1482a3.getFormat(), abstractC1482a3.getAdUnitId(), abstractC1482a3, maxError, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2098a(C1548f2 c1548f2, AbstractC1482a3 abstractC1482a3, Map map) {
        m2094a(c1548f2, abstractC1482a3.getFormat(), abstractC1482a3.getAdUnitId(), abstractC1482a3, null, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2099a(C1548f2 c1548f2, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        m2094a(c1548f2, maxAdFormat, str, null, maxError, new HashMap());
    }
}
