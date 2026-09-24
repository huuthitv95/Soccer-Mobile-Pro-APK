package com.applovin.impl;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;

/* JADX INFO: renamed from: com.applovin.impl.i */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1575i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH(ToolBar.REFRESH),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* JADX INFO: renamed from: a */
    private final String f1800a;

    EnumC1575i(String str) {
        this.f1800a = str;
    }

    /* JADX INFO: renamed from: b */
    public String m2850b() {
        return this.f1800a;
    }
}
