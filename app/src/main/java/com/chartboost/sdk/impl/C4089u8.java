package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u8 */
/* JADX INFO: loaded from: classes3.dex */
public class C4089u8 {

    /* JADX INFO: renamed from: a */
    public final C3643af f16479a;

    public C4089u8(C3643af c3643af) {
        this.f16479a = c3643af;
    }

    /* JADX INFO: renamed from: a */
    public DataUseConsent m19576a(String str) {
        return (DataUseConsent) this.f16479a.m16833a().get(str);
    }
}
