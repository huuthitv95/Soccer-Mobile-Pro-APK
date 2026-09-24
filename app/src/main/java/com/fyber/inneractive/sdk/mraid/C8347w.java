package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8347w extends AbstractC8328f {
    public C8347w(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        boolean zEquals = "true".equals(this.f18601b.get("shouldUseCustomClose"));
        if (InneractiveAdManager.isCurrentUserAChild()) {
            zEquals = false;
        }
        AbstractC9239i0 abstractC9239i0 = this.f18602c;
        abstractC9239i0.f21595X = zEquals;
        InterfaceC9243j1 interfaceC9243j1 = abstractC9239i0.f21570g;
        if (interfaceC9243j1 != null) {
            ((InterfaceC9218b0) interfaceC9243j1).mo20926b(zEquals);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: b */
    public final boolean mo20717b() {
        return false;
    }
}
