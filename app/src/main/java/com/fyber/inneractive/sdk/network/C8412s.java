package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC8167o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8412s extends AbstractC8394m {

    /* JADX INFO: renamed from: e */
    public final InneractiveAdRequest f18705e;

    /* JADX INFO: renamed from: f */
    public final C8407q0 f18706f;

    public C8412s(InneractiveAdRequest inneractiveAdRequest, String str, C8006r c8006r, AbstractC8167o abstractC8167o) {
        super(c8006r, str, abstractC8167o);
        this.f18705e = inneractiveAdRequest;
        C8407q0 c8407q0 = new C8407q0(new C8406q(this), inneractiveAdRequest, c8006r);
        this.f18706f = c8407q0;
        c8407q0.f18714d = new C8409r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8394m
    /* JADX INFO: renamed from: a */
    public final void mo20771a() {
        this.f18682b = true;
        this.f18681a = null;
        this.f18706f.f18711a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8394m
    /* JADX INFO: renamed from: b */
    public final String mo20773b() {
        return this.f18706f.mo20732r();
    }
}
