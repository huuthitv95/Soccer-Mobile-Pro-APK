package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8341q extends AbstractC8326e {
    public C8341q(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        C9142d0 c9142d0;
        String str = (String) this.f18601b.get("url");
        IAlog.m21949e("IAmraidActionOpen: opening Internal Browser For Url: %s", str);
        AbstractC9239i0 abstractC9239i0 = this.f18602c;
        if (abstractC9239i0 != null) {
            C9152g1 c9152g1 = this.f18603d;
            InterfaceC9243j1 interfaceC9243j1 = abstractC9239i0.f21570g;
            if (interfaceC9243j1 != null) {
                c9142d0 = ((InterfaceC9218b0) interfaceC9243j1).mo20920a(str, c9152g1);
            } else {
                EnumC9151g0 enumC9151g0 = EnumC9151g0.FAILED;
                Exception exc = new Exception("No webview listener available");
                if (AbstractC9174o.m21989a(abstractC9239i0.f21565b) != null) {
                    AbstractC9174o.m21989a(abstractC9239i0.f21565b).getClass();
                }
                c9142d0 = new C9142d0(enumC9151g0, exc);
            }
            if (c9142d0.f21443a == EnumC9151g0.FAILED) {
                AbstractC9239i0 abstractC9239i1 = this.f18602c;
                EnumC8335k enumC8335k = EnumC8335k.OPEN;
                Throwable th = c9142d0.f21444b;
                abstractC9239i1.m22071a(enumC8335k, th == null ? "unknown error" : th.getMessage());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: c */
    public final String mo20718c() {
        return (String) this.f18601b.get("url");
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: d */
    public final void mo20719d() {
        AbstractC9239i0 abstractC9239i0 = this.f18602c;
        if (abstractC9239i0 != null) {
            abstractC9239i0.m22071a(EnumC8335k.OPEN, "No native click was detected in a timely fashion");
        }
    }
}
