package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.O7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11595O7 {
    /* JADX INFO: renamed from: a */
    public final String m26733a() {
        String OMID_LIB_VERSION = C11366Bc.f23953f;
        Intrinsics.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    /* JADX INFO: renamed from: b */
    public final String m26734b() {
        return C11366Bc.f23952e;
    }

    /* JADX INFO: renamed from: c */
    public final String m26735c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
