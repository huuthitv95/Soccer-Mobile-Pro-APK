package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8243d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8248h f18401a;

    public RunnableC8243d(C8248h c8248h) {
        this.f18401a = c8248h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8248h c8248h = this.f18401a;
        IAlog.m21945a("onInstallTimeout after %d msec", Long.valueOf(c8248h.f18417k));
        for (InterfaceC8258r interfaceC8258r : c8248h.f18414h) {
            if (interfaceC8258r != null) {
                interfaceC8258r.mo20642a((String) null, EnumC8250j.INSTALL_TIMEOUT.m20652a(), (String) null);
            }
        }
    }
}
