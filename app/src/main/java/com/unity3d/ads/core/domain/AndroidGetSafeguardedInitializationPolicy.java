package com.unity3d.ads.core.domain;

import gatewayprotocol.p299v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidGetSafeguardedInitializationPolicy.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSafeguardedInitializationPolicy;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "()V", "invoke", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = requestPolicy.getRetryPolicy();
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = requestPolicy.getTimeoutPolicy();
        NativeConfigurationOuterClass.RequestPolicy requestPolicyBuild = NativeConfigurationOuterClass.RequestPolicy.newBuilder(requestPolicy).setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(retryPolicy).setMaxDuration(Math.max(5000, retryPolicy.getMaxDuration())).setRetryWaitBase(Math.max(0, retryPolicy.getRetryWaitBase())).setRetryMaxInterval(Math.max(0, retryPolicy.getRetryMaxInterval())).setRetryScalingFactor(Math.max(0.1f, retryPolicy.getRetryScalingFactor())).setRetryJitterPct(Math.min(100.0f, Math.max(0.0f, retryPolicy.getRetryJitterPct())))).setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(timeoutPolicy).setConnectTimeoutMs(Math.max(1000, timeoutPolicy.getConnectTimeoutMs())).setReadTimeoutMs(Math.max(1000, timeoutPolicy.getReadTimeoutMs())).setWriteTimeoutMs(Math.max(1000, timeoutPolicy.getWriteTimeoutMs())).setOverallTimeoutMs(Math.max(1000, timeoutPolicy.getOverallTimeoutMs()))).build();
        Intrinsics.checkNotNullExpressionValue(requestPolicyBuild, "newBuilder(requestPolicy…  )\n            ).build()");
        return requestPolicyBuild;
    }
}
