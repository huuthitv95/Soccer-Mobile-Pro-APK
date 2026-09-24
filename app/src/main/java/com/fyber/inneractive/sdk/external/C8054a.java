package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.external.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8054a implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f17938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnFyberMarketplaceInitializedListener f17939b;

    public C8054a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f17938a = context;
        this.f17939b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        if (this.f17938a.getApplicationContext() != null) {
            IAConfigManager.removeListener(this);
            InneractiveAdManager.f17908e = null;
            if (z) {
                InneractiveAdManager.m20459a(this.f17939b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.m20459a(this.f17939b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
            }
            if (AbstractC8057d.f17942a.f17910a == null || !IAConfigManager.m20377c() || AbstractC8057d.f17942a.f17913d) {
                return;
            }
            AbstractC8057d.f17942a.f17913d = true;
            new C8428w(EnumC8424u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).m20808a((String) null);
        }
    }
}
