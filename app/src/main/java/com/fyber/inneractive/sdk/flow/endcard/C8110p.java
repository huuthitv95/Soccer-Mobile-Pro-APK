package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.model.vast.C8306o;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8110p extends C8115u {

    /* JADX INFO: renamed from: j */
    public final String f18042j;

    /* JADX INFO: renamed from: k */
    public String f18043k;

    /* JADX INFO: renamed from: l */
    public boolean f18044l;

    public C8110p(C8109o c8109o) {
        super(c8109o);
        C8306o c8306o = c8109o.f17984c.f18383e.f18504f;
        this.f18042j = c8306o != null ? c8306o.f18555a : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m20535b(InterfaceC8106a interfaceC8106a) {
        if (TextUtils.isEmpty(this.f18054e) || TextUtils.isEmpty(this.f18043k)) {
            return;
        }
        if (this.f18055f || !this.f18057h.compareAndSet(false, true)) {
            IAlog.m21945a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f17980a, Boolean.valueOf(this.f18055f), Boolean.valueOf(this.f18057h.get()));
        } else {
            m20540a(interfaceC8106a);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.C8115u
    /* JADX INFO: renamed from: d */
    public final C8111q mo20536d() {
        AbstractC8084b abstractC8084b = this.f17981b;
        return new C8111q(abstractC8084b.f17984c.f18383e, (C8109o) abstractC8084b);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.C8115u
    /* JADX INFO: renamed from: f */
    public final boolean mo20537f() {
        return false;
    }
}
