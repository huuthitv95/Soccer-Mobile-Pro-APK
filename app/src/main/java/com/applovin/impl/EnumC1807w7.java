package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.w7 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1807w7 {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(401),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(405),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);


    /* JADX INFO: renamed from: a */
    private final int f3543a;

    EnumC1807w7(int i) {
        this.f3543a = i;
    }

    /* JADX INFO: renamed from: b */
    public int m5555b() {
        return this.f3543a;
    }
}
