package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3746f3 {

    /* JADX INFO: renamed from: a */
    public final Executor f14137a;

    /* JADX INFO: renamed from: b */
    public final C3962od f14138b;

    /* JADX INFO: renamed from: c */
    public final C3769g3 f14139c;

    /* JADX INFO: renamed from: d */
    public final C3921mh f14140d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3945ni f14141e;

    /* JADX INFO: renamed from: f */
    public final Executor f14142f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4000q7 f14143g;

    /* JADX INFO: renamed from: h */
    public final String f14144h;

    public C3746f3(Executor backgroundExecutor, C3962od factory, C3769g3 reachability, C3921mh timeSource, InterfaceC3945ni uiPoster, Executor networkExecutor, InterfaceC4000q7 eventTrackerProvider) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(networkExecutor, "networkExecutor");
        Intrinsics.checkNotNullParameter(eventTrackerProvider, "eventTrackerProvider");
        this.f14137a = backgroundExecutor;
        this.f14138b = factory;
        this.f14139c = reachability;
        this.f14140d = timeSource;
        this.f14141e = uiPoster;
        this.f14142f = networkExecutor;
        this.f14143g = eventTrackerProvider;
        this.f14144h = C3678c4.f13658b.m17025e();
    }

    /* JADX INFO: renamed from: a */
    public final String m17613a() {
        return this.f14144h;
    }

    /* JADX INFO: renamed from: a */
    public final void m17614a(AbstractC3654b3 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C4048sb.m19414d("Execute request: " + request.m16895e(), null);
        this.f14142f.execute(new RunnableC3940nd(this.f14137a, this.f14138b, this.f14139c, this.f14140d, this.f14141e, request, this.f14143g.mo19132a()));
    }
}
