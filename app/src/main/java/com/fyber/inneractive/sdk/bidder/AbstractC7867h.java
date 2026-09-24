package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.h */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7867h {
    /* JADX INFO: renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableBool m20345a(Boolean bool) {
        C7894v c7894vNewBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            c7894vNewBuilder.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) c7894vNewBuilder.f21118b).setData(zBooleanValue);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableBool) c7894vNewBuilder.m21751a();
    }

    /* JADX INFO: renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableString m20346a(String str) {
        C7897y c7897yNewBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            c7897yNewBuilder.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) c7897yNewBuilder.f21118b).setData(str);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableString) c7897yNewBuilder.m21751a();
    }

    /* JADX INFO: renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 m20347a(int i) {
        C7898z c7898zNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i > 0) {
            c7898zNewBuilder.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder.f21118b).setData(i);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder.m21751a();
    }
}
