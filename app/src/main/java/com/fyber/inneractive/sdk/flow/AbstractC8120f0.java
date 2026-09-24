package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.f0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8120f0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18068a;

    static {
        int[] iArr = new int[InneractiveErrorCode.values().length];
        f18068a = iArr;
        try {
            iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18068a[InneractiveErrorCode.NO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18068a[InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
