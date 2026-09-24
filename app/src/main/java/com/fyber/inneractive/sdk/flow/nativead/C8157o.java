package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.EnumC7943q;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8157o implements InterfaceC7941o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8145i f18165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC9150g f18166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8158p f18167c;

    public C8157o(C8158p c8158p, C8145i c8145i, EnumC9150g enumC9150g) {
        this.f18167c = c8158p;
        this.f18165a = c8145i;
        this.f18166b = enumC9150g;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC7941o
    /* JADX INFO: renamed from: a */
    public final void mo20328a(C7928b c7928b) {
        if (c7928b.f17607a == EnumC7943q.FAILED) {
            C8158p c8158p = this.f18167c;
            C8145i c8145i = this.f18165a;
            String str = c7928b.f17610d;
            EnumC9150g enumC9150g = this.f18166b;
            c8158p.getClass();
            IAlog.m21950f("%s : Trying to resolve fallback Link: %s", C8158p.f18168b, str);
            C8146j c8146j = (C8146j) c8158p.f18169a;
            C8145i c8145i2 = c8146j.f18139a;
            if (c8145i2 == null || c8145i2.equals(c8145i)) {
                IAlog.m21945a("%s : No valid link object, origin: %s", C8146j.f18138d, enumC9150g);
                return;
            }
            C8158p c8158p2 = c8146j.f18141c;
            C8145i c8145i3 = c8146j.f18139a;
            c8158p2.getClass();
            AbstractC9183r.f21477a.execute(new RunnableC8149m(c8158p2, c8145i3, true, enumC9150g));
        }
    }
}
