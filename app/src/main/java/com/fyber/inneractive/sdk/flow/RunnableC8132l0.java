package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.l0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8132l0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f18104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8170p0 f18105b;

    public RunnableC8132l0(AbstractC8170p0 abstractC8170p0, long j) {
        this.f18105b = abstractC8170p0;
        this.f18104a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18105b.mo20585I()) {
            AbstractC8170p0 abstractC8170p0 = this.f18105b;
            abstractC8170p0.f18195n = new RunnableC8130k0(this);
            long jMo20591a = abstractC8170p0.mo20591a(this.f18104a);
            AbstractC8170p0 abstractC8170p1 = this.f18105b;
            abstractC8170p1.getClass();
            C9197v1 c9197v1 = new C9197v1(TimeUnit.MILLISECONDS, jMo20591a);
            abstractC8170p1.f18196o = c9197v1;
            c9197v1.f21502e = new C8168o0(abstractC8170p1);
            c9197v1.f21501d = false;
            c9197v1.f21500c.sendEmptyMessage(1932593528);
            AbstractC8170p0 abstractC8170p2 = this.f18105b;
            abstractC8170p2.getClass();
            IAlog.m21945a("%sad contains custom close. Will show transparent x in %d", IAlog.m21943a(abstractC8170p2), Long.valueOf(jMo20591a));
            this.f18105b.f18193l = null;
        } else {
            AbstractC8170p0 abstractC8170p3 = this.f18105b;
            abstractC8170p3.getClass();
            IAlog.m21945a("%sad does not contain custom close. Showing close button", IAlog.m21943a(abstractC8170p3));
            this.f18105b.m20598e(false);
        }
        Runnable runnable = this.f18105b.f18193l;
        if (runnable != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnable);
            this.f18105b.f18193l = null;
        }
    }
}
