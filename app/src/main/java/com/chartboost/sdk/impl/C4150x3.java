package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x3 */
/* JADX INFO: loaded from: classes3.dex */
public class C4150x3 {
    /* JADX INFO: renamed from: a */
    public JSONObject m19882a(C4106v3 c4106v3) {
        return c4106v3 == null ? new JSONObject() : AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("carrier-name", c4106v3.m19644d()), AbstractC4171y2.m20012a("mobile-country-code", c4106v3.m19641a()), AbstractC4171y2.m20012a("mobile-network-code", c4106v3.m19642b()), AbstractC4171y2.m20012a("iso-country-code", c4106v3.m19643c()), AbstractC4171y2.m20012a("phone-type", Integer.valueOf(c4106v3.m19645e())));
    }
}
