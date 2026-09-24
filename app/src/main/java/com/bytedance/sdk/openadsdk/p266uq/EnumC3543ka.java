package com.bytedance.sdk.openadsdk.p266uq;

import com.ironsource.C11676T3;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ka */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3543ka {
    TYPE_2G("2g"),
    TYPE_3G(C11676T3.f25718a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(C11676T3.f25719b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");


    /* JADX INFO: renamed from: mj */
    private String f12936mj;

    EnumC3543ka(String str) {
        this.f12936mj = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12936mj;
    }
}
