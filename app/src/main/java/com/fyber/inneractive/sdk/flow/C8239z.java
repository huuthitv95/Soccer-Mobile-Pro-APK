package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.C7936j;
import com.fyber.inneractive.sdk.click.EnumC7943q;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8239z implements InterfaceC7941o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9152g1 f18393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC9150g f18394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7941o f18395c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC8076b0 f18396d;

    public C8239z(AbstractC8076b0 abstractC8076b0, C9152g1 c9152g1, EnumC9150g enumC9150g, InterfaceC7941o interfaceC7941o) {
        this.f18396d = abstractC8076b0;
        this.f18393a = c9152g1;
        this.f18394b = enumC9150g;
        this.f18395c = interfaceC7941o;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC7941o
    /* JADX INFO: renamed from: a */
    public final void mo20328a(C7928b c7928b) {
        AbstractC8076b0 abstractC8076b0 = this.f18396d;
        abstractC8076b0.getClass();
        IAlog.m21945a("%s super click result: %s", IAlog.m21943a(abstractC8076b0), c7928b);
        AbstractC8076b0 abstractC8076b1 = this.f18396d;
        if (abstractC8076b1.f17964h == null) {
            IAlog.m21945a("%s click handler is null. Probably cancelled", IAlog.m21943a(abstractC8076b1));
            return;
        }
        abstractC8076b1.f17964h = null;
        abstractC8076b1.f17965i = null;
        abstractC8076b1.mo20477G();
        AbstractC8076b0 abstractC8076b2 = this.f18396d;
        C9152g1 c9152g1 = this.f18393a;
        EnumC9150g enumC9150g = this.f18394b;
        abstractC8076b2.getClass();
        EnumC7943q enumC7943q = c7928b.f17607a;
        if (enumC7943q == EnumC7943q.OPEN_IN_EXTERNAL_APPLICATION || enumC7943q == EnumC7943q.OPEN_GOOGLE_STORE) {
            IAlog.m21945a("InneractiveAdRendererImpl: handleOpenResult - opened in external application", new Object[0]);
            ArrayList arrayList = c7928b.f17612f;
            C7936j c7936j = (C7936j) arrayList.get(arrayList.size() - 1);
            EnumC7943q enumC7943q2 = c7936j.f17631c;
            if (enumC7943q2 == EnumC7943q.OPENED_IN_EXTERNAL_BROWSER) {
                abstractC8076b2.m20481a(c7936j.f17629a, enumC7943q2);
            }
            if (abstractC8076b2.f17959c != null) {
                abstractC8076b2.m20476F();
            }
        } else if (enumC7943q == EnumC7943q.OPENED_IN_INTERNAL_BROWSER) {
            IAlog.m21945a("InneractiveAdRendererImpl: handleOpenResult - opened in internal browser", new Object[0]);
            abstractC8076b2.f17960d = true;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(abstractC8076b2);
        } else if (enumC7943q == EnumC7943q.OPENED_USING_CHROME_NAVIGATE || enumC7943q == EnumC7943q.OPENED_IN_EXTERNAL_BROWSER) {
            IAlog.m21945a("InneractiveAdRendererImpl: handleOpenResult - opened in external browser", new Object[0]);
            abstractC8076b2.m20481a(c7928b.f17610d, c7928b.f17607a);
            if (abstractC8076b2.f17959c != null) {
                abstractC8076b2.m20476F();
            }
        }
        if (abstractC8076b2.m20487o() == EnumC8253m.NONE || (!TextUtils.isEmpty(c7928b.f17609c) && !c7928b.f17609c.equals("IgniteGooglePlay"))) {
            abstractC8076b2.m20482b(c7928b, c9152g1, enumC9150g);
        }
        InterfaceC7941o interfaceC7941o = this.f18395c;
        if (interfaceC7941o != null) {
            interfaceC7941o.mo20328a(c7928b);
        }
    }
}
