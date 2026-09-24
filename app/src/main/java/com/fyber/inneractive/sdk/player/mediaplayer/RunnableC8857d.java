package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8857d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EnumC8489b f20799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8869p f20800b;

    public RunnableC8857d(C8869p c8869p, EnumC8489b enumC8489b) {
        this.f20800b = c8869p;
        this.f20799a = enumC8489b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC8867n interfaceC8867n = this.f20800b.f20821i;
        if (interfaceC8867n != null) {
            ((AbstractC8476q) interfaceC8867n).m20907a(this.f20799a);
        }
    }
}
