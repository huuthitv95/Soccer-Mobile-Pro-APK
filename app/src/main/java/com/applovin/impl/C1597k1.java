package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.applovin.impl.k1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1597k1 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1948a;

    public C1597k1(C1748l c1748l) {
        this.f1948a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    public void m3047a(Uri uri) {
        C1768p.m5166g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f1948a.m4865y0().m3894b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f1948a.m4865y0().m3896c(queryParameter2);
            }
        }
    }
}
