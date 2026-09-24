package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.RunnableC8270d;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.z */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8053z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC7946a0 f17894a;

    public RunnableC8053z(RunnableC7946a0 runnableC7946a0) {
        this.f17894a = runnableC7946a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17894a.f17695a.f17665I = new C8271e();
        RunnableC7946a0 runnableC7946a0 = this.f17894a;
        C8271e c8271e = runnableC7946a0.f17695a.f17665I;
        Context context = runnableC7946a0.f17696b;
        if (c8271e.f18433a) {
            return;
        }
        c8271e.f18433a = true;
        AbstractC9183r.f21478b.post(new RunnableC8270d(c8271e, context));
    }
}
