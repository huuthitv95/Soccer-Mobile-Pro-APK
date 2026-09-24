package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8246f implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f18403a;

    public C8246f(String str) {
        this.f18403a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m21945a("Hit Request: Hitting URL finished: %s", this.f18403a);
        if (exc == null) {
            IAlog.m21945a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m21945a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
