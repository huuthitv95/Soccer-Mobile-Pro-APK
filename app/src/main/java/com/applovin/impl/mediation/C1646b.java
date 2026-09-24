package com.applovin.impl.mediation;

import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.C1539e3;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.mediation.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1646b implements C1630a.a, C1647c.a {

    /* JADX INFO: renamed from: a */
    private final C1630a f2219a;

    /* JADX INFO: renamed from: b */
    private final C1647c f2220b;

    public C1646b(C1748l c1748l) {
        this.f2219a = new C1630a(c1748l);
        this.f2220b = new C1647c(c1748l, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m3414c(C1539e3 c1539e3) {
        C1655h c1655hM1816B;
        if (c1539e3 == null || (c1655hM1816B = c1539e3.m1816B()) == null || !c1539e3.m1863x().compareAndSet(false, true)) {
            return;
        }
        c1539e3.m1862w().set(true);
        AbstractC1793v2.m5450e(c1655hM1816B.m3569c(), c1539e3);
    }

    /* JADX INFO: renamed from: a */
    public void m3416a() {
        this.f2220b.m3420a();
        this.f2219a.m3294a();
    }

    @Override // com.applovin.impl.mediation.C1647c.a
    /* JADX INFO: renamed from: a */
    public void mo3417a(C1539e3 c1539e3) {
        m3414c(c1539e3);
    }

    @Override // com.applovin.impl.mediation.C1630a.a
    /* JADX INFO: renamed from: b */
    public void mo3296b(final C1539e3 c1539e3) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3414c(c1539e3);
            }
        }, c1539e3.m2476p0());
    }

    /* JADX INFO: renamed from: e */
    public void m3418e(C1539e3 c1539e3) {
        long jM2477q0 = c1539e3.m2477q0();
        if (jM2477q0 >= 0) {
            this.f2220b.m3421a(c1539e3, jM2477q0);
        }
        if (c1539e3.m2467B0() || c1539e3.m2468C0()) {
            this.f2219a.m3295a(c1539e3, this);
        }
    }
}
