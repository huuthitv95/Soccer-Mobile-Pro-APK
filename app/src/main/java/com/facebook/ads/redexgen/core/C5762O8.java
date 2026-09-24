package com.facebook.ads.redexgen.core;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5762O8 {
    public final long A00;
    public final C6118Tx A01;
    public final String A02;
    public final JSONObject A03;

    public C5762O8(JSONObject jSONObject, C6118Tx c6118Tx, String str, long j) {
        this.A03 = jSONObject;
        this.A01 = c6118Tx;
        this.A02 = str;
        this.A00 = j;
    }

    public final long A00() {
        return this.A00;
    }

    public final C6118Tx A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final JSONObject A03() {
        return this.A03;
    }
}
