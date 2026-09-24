package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9291l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MarketplaceOnUserAgentAvailableListener f21745a;

    public RunnableC9291l(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        this.f21745a = marketplaceOnUserAgentAvailableListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.f17654M;
            if (!iAConfigManager.f17692x.f21485a.get() || iAConfigManager.f17692x.f21488d.compareAndSet(true, true) || i >= 100) {
                break;
            }
            IAlog.m21945a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        String strM22016a = iAConfigManager.f17692x.m22016a();
        if (strM22016a.isEmpty()) {
            return;
        }
        IAlog.m21945a("UserAgentAvailable", new Object[0]);
        this.f21745a.onUserAgentAvailable(strM22016a);
    }
}
