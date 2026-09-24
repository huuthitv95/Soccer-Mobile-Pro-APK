package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12232hc implements InterfaceC12214gc {
    @Override // com.ironsource.InterfaceC12214gc
    /* JADX INFO: renamed from: a */
    public void mo31555a(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.m25995e() + " failed. error: " + e.getMessage());
        }
    }
}
