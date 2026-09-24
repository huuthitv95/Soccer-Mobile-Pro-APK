package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.InterfaceC9194u1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.o0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8168o0 implements InterfaceC9194u1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8170p0 f18190a;

    public C8168o0(AbstractC8170p0 abstractC8170p0) {
        this.f18190a = abstractC8170p0;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9194u1
    /* JADX INFO: renamed from: a */
    public final void mo20394a() {
        Runnable runnable = this.f18190a.f18195n;
        if (runnable != null) {
            AbstractC9183r.f21478b.post(runnable);
        }
        AbstractC8170p0 abstractC8170p0 = this.f18190a;
        C9197v1 c9197v1 = abstractC8170p0.f18196o;
        if (c9197v1 != null) {
            c9197v1.f21502e = null;
            abstractC8170p0.f18196o = null;
        }
    }
}
