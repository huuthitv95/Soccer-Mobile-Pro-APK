package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9227e0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f21552a;

    /* JADX INFO: renamed from: b */
    public int f21553b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC9239i0 f21554c;

    public C9227e0(AbstractC9239i0 abstractC9239i0) {
        this.f21554c = abstractC9239i0;
    }

    /* JADX INFO: renamed from: a */
    public final void m22053a() {
        try {
            AbstractC9239i0 abstractC9239i0 = this.f21554c;
            abstractC9239i0.getClass();
            IAlog.m21945a("%sunregister screen broadcast receiver called", IAlog.m21943a(abstractC9239i0));
            if (this.f21552a != null) {
                AbstractC9239i0 abstractC9239i1 = this.f21554c;
                abstractC9239i1.getClass();
                IAlog.m21945a("%sunregistering broadcast receiver", IAlog.m21943a(abstractC9239i1));
                this.f21552a.unregisterReceiver(this);
                this.f21552a = null;
            }
        } catch (Throwable th) {
            IAlog.m21950f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iM21997b;
        if (this.f21552a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iM21997b = AbstractC9174o.m21997b()) == this.f21553b) {
            return;
        }
        this.f21553b = iM21997b;
        AbstractC9239i0 abstractC9239i0 = this.f21554c;
        C9248m c9248m = abstractC9239i0.f21565b;
        if (c9248m != null) {
            c9248m.getViewTreeObserver().removeOnPreDrawListener(abstractC9239i0.f21611n0);
            abstractC9239i0.f21565b.getViewTreeObserver().addOnPreDrawListener(abstractC9239i0.f21611n0);
        }
    }
}
