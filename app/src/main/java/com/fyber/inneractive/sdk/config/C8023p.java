package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8023p implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8040s f17807a;

    public C8023p(C8040s c8040s) {
        this.f17807a = c8040s;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        C8021o c8021o = (C8021o) obj;
        if (c8021o != null) {
            C8040s c8040s = this.f17807a;
            if (c8021o.equals(c8040s.f17862b)) {
                return;
            }
            c8040s.f17864d = true;
            c8040s.f17862b = c8021o;
            AbstractC9183r.f21477a.execute(new RunnableC8025q(c8040s));
        }
    }
}
