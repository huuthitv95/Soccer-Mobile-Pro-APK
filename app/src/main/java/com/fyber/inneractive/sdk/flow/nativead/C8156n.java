package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.EnumC7943q;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8156n implements InterfaceC7941o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8145i f18161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f18162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC9150g f18163c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8158p f18164d;

    public C8156n(C8158p c8158p, C8145i c8145i, String str, EnumC9150g enumC9150g) {
        this.f18164d = c8158p;
        this.f18161a = c8145i;
        this.f18162b = str;
        this.f18163c = enumC9150g;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC7941o
    /* JADX INFO: renamed from: a */
    public final void mo20328a(C7928b c7928b) {
        if (c7928b.f17607a == EnumC7943q.FAILED) {
            C8158p c8158p = this.f18164d;
            C8145i c8145i = this.f18161a;
            String str = this.f18162b;
            EnumC9150g enumC9150g = this.f18163c;
            c8158p.getClass();
            IAlog.m21950f("%s : Trying to resolve fallback Link: %s", C8158p.f18168b, str);
            if (AbstractC9195v.m22030a(str)) {
                C8157o c8157o = new C8157o(c8158p, c8145i, enumC9150g);
                InterfaceC8147k interfaceC8147k = ((C8146j) c8158p.f18169a).f18140b;
                if (interfaceC8147k != null) {
                    interfaceC8147k.mo20568a(str, true, enumC9150g, c8157o);
                    return;
                }
                return;
            }
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
