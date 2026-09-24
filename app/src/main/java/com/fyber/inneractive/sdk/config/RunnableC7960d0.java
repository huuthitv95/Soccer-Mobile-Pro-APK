package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7960d0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAConfigManager f17715a;

    public RunnableC7960d0(IAConfigManager iAConfigManager) {
        this.f17715a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f17715a;
        if (iAConfigManager.f17684p == null) {
            iAConfigManager.f17684p = AbstractC8011j.m20437a(iAConfigManager.f17674f);
        }
        AbstractC9183r.f21478b.post(new RunnableC7950c0(this));
    }
}
