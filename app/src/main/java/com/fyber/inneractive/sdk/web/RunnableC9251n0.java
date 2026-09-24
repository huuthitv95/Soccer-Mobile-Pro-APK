package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.flow.C8222v;
import com.fyber.inneractive.sdk.ignite.EnumC8250j;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.n0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9251n0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21648a;

    public RunnableC9251n0(C9270v0 c9270v0) {
        this.f21648a = c9270v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9270v0 c9270v0 = this.f21648a;
        c9270v0.f21677a.stopLoading();
        IAlog.m21945a("%sonLoadTimeout after %d msec", IAlog.m21943a(c9270v0), Long.valueOf(c9270v0.f21690n));
        C8222v c8222v = c9270v0.f21684h;
        if (c8222v == null || c9270v0.f21680d == null) {
            return;
        }
        c8222v.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, c9270v0.f21687k, EnumC8250j.LOAD_WEBPAGE_TIMEOUT.m20652a(), c9270v0.f21680d);
    }
}
