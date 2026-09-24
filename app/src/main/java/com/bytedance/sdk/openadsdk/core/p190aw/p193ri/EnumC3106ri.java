package com.bytedance.sdk.openadsdk.core.p190aw.p193ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3106ri {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);


    /* JADX INFO: renamed from: mj */
    private final int f9880mj;

    EnumC3106ri(int i) {
        this.f9880mj = i;
    }

    /* JADX INFO: renamed from: ri */
    public String m12559ri() {
        return String.valueOf(this.f9880mj);
    }
}
