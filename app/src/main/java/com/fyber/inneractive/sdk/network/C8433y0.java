package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8433y0 implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f18767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f18768b;

    public C8433y0(String str, long j) {
        this.f18767a = str;
        this.f18768b = j;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m21945a("Hit Request: Hitting URL finished: %s", this.f18767a);
        if (exc == null) {
            IAlog.m21945a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m21945a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m21945a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f18768b));
    }
}
