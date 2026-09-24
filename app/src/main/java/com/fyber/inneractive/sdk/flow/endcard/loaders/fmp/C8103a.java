package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.flow.endcard.C8092j;
import com.fyber.inneractive.sdk.flow.endcard.C8109o;
import com.fyber.inneractive.sdk.flow.endcard.loaders.C8096b;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.fmp.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8103a implements InterfaceC8106a {

    /* JADX INFO: renamed from: a */
    public final C8237x0 f18026a;

    /* JADX INFO: renamed from: b */
    public final C8092j f18027b;

    /* JADX INFO: renamed from: c */
    public final C8096b f18028c;

    /* JADX INFO: renamed from: d */
    public C8109o f18029d;

    public C8103a(C8092j c8092j, C8237x0 c8237x0, C8096b c8096b) {
        this.f18027b = c8092j;
        this.f18026a = c8237x0;
        this.f18028c = c8096b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a
    /* JADX INFO: renamed from: a */
    public final void mo20527a() {
        C8096b c8096b = this.f18028c;
        C8109o c8109o = this.f18029d;
        c8096b.getClass();
        if (c8109o != null) {
            IAlog.m21945a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", c8109o.mo20513i());
            c8096b.f18012d.m20532a(c8109o);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a
    /* JADX INFO: renamed from: a */
    public final void mo20528a(String str) {
        this.f18028c.getClass();
        IAlog.m21945a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
    }
}
