package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.r */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9258r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21658a;

    public RunnableC9258r(AbstractC9239i0 abstractC9239i0) {
        this.f21658a = abstractC9239i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9239i0 abstractC9239i0 = this.f21658a;
        if (abstractC9239i0.f21593V == null) {
            try {
                abstractC9239i0.getClass();
                IAlog.m21945a("%sregistering orientation broadcast receiver", IAlog.m21943a(abstractC9239i0));
                this.f21658a.f21593V = new C9227e0(this.f21658a);
                if (AbstractC9174o.m21989a(this.f21658a.f21565b) != null) {
                    AbstractC9239i0 abstractC9239i1 = this.f21658a;
                    C9227e0 c9227e0 = abstractC9239i1.f21593V;
                    Context contextM21989a = AbstractC9174o.m21989a(abstractC9239i1.f21565b);
                    AbstractC9239i0 abstractC9239i2 = c9227e0.f21554c;
                    abstractC9239i2.getClass();
                    IAlog.m21945a("%sregister screen broadcast receiver", IAlog.m21943a(abstractC9239i2));
                    c9227e0.f21552a = contextM21989a;
                    contextM21989a.registerReceiver(c9227e0, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                AbstractC9239i0 abstractC9239i3 = this.f21658a;
                abstractC9239i3.getClass();
                IAlog.m21950f("%sfailed registering orientation broadcast recevier", IAlog.m21943a(abstractC9239i3));
                if (IAlog.f21426a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
