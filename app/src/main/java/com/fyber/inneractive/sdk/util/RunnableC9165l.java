package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.cache.InterfaceC7899a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9165l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7899a f21460a;

    public RunnableC9165l(InterfaceC7899a interfaceC7899a) {
        this.f21460a = interfaceC7899a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7899a interfaceC7899a;
        try {
            if (AbstractC9174o.f21470a == null || (interfaceC7899a = this.f21460a) == null) {
                return;
            }
            AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(interfaceC7899a.mo20352b()).apply();
        } catch (Throwable unused) {
        }
    }
}
