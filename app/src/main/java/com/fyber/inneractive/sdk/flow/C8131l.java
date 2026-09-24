package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C8359b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8131l implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveAdRequest f18102a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8133m f18103b;

    public C8131l(C8133m c8133m, InneractiveAdRequest inneractiveAdRequest) {
        this.f18103b = c8133m;
        this.f18102a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z) {
            this.f18103b.m20560c(this.f18102a);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(exc instanceof C8359b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR, EnumC8125i.NO_APP_CONFIG_AVAILABLE, exc);
        C8133m c8133m = this.f18103b;
        c8133m.m20580a(this.f18102a, c8133m.m20584c(), inneractiveInfrastructureError);
    }
}
