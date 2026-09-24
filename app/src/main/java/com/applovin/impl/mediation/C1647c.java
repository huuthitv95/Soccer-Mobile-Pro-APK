package com.applovin.impl.mediation;

import com.applovin.impl.C1539e3;
import com.applovin.impl.C1576i0;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.mediation.c */
/* JADX INFO: loaded from: classes3.dex */
public class C1647c {

    /* JADX INFO: renamed from: a */
    private final C1748l f2221a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2222b;

    /* JADX INFO: renamed from: c */
    private final a f2223c;

    /* JADX INFO: renamed from: d */
    private C1576i0 f2224d;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3417a(C1539e3 c1539e3);
    }

    C1647c(C1748l c1748l, a aVar) {
        this.f2221a = c1748l;
        this.f2222b = c1748l.m4782Q();
        this.f2223c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3419a(C1539e3 c1539e3) {
        if (C1768p.m5160a()) {
            this.f2222b.m5171a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f2223c.mo3417a(c1539e3);
    }

    /* JADX INFO: renamed from: a */
    public void m3420a() {
        if (C1768p.m5160a()) {
            this.f2222b.m5171a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C1576i0 c1576i0 = this.f2224d;
        if (c1576i0 != null) {
            c1576i0.m2854a();
            this.f2224d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3421a(final C1539e3 c1539e3, long j) {
        if (C1768p.m5160a()) {
            this.f2222b.m5171a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f2224d = C1576i0.m2851a(j, this.f2221a, new Runnable() { // from class: com.applovin.impl.mediation.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3419a(c1539e3);
            }
        });
    }
}
