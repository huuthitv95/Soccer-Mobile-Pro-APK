package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.C8294c;
import com.fyber.inneractive.sdk.model.vast.EnumC8302k;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8116v extends AbstractC8085c {

    /* JADX INFO: renamed from: h */
    public final EnumC8302k f18059h;

    public C8116v(C8237x0 c8237x0, C8294c c8294c, int i) {
        super(c8237x0, c8294c, i);
        this.f18059h = c8294c.f18516b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: c */
    public final InterfaceC8108n mo20507c() {
        return new C8117w(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c, com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: l */
    public final boolean mo20516l() {
        return super.mo20516l() && ((C8117w) m20510f()).f18060c != null;
    }
}
