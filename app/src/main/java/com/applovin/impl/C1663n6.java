package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* JADX INFO: renamed from: com.applovin.impl.n6 */
/* JADX INFO: loaded from: classes3.dex */
class C1663n6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final AbstractC1798v7 f2424g;

    /* JADX INFO: renamed from: h */
    private final AppLovinAdLoadListener f2425h;

    C1663n6(AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super("TaskRenderVastAd", c1748l);
        this.f2425h = appLovinAdLoadListener;
        this.f2424g = abstractC1798v7;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Rendering VAST ad...");
        }
        int size = this.f2424g.m5482a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strM2432a = "";
        C1487a8 c1487a8M1887a = null;
        C1544e8 c1544e8M2513a = null;
        C1789u7 c1789u7M5313a = null;
        C1780t7 c1780t7M5246a = null;
        String strM2432a2 = "";
        for (C1702q8 c1702q8 : this.f2424g.m5482a()) {
            C1702q8 c1702q8M4124b = c1702q8.m4124b(AbstractC1534d8.m2445b(c1702q8) ? "Wrapper" : "InLine");
            if (c1702q8M4124b != null) {
                C1702q8 c1702q8M4124b2 = c1702q8M4124b.m4124b("AdSystem");
                if (c1702q8M4124b2 != null) {
                    c1487a8M1887a = C1487a8.m1887a(c1702q8M4124b2, c1487a8M1887a, this.f1969a);
                }
                strM2432a = AbstractC1534d8.m2432a(c1702q8M4124b, "AdTitle", strM2432a);
                strM2432a2 = AbstractC1534d8.m2432a(c1702q8M4124b, "Description", strM2432a2);
                AbstractC1534d8.m2438a(c1702q8M4124b.m4122a("Impression"), hashSet, this.f2424g, this.f1969a);
                C1702q8 c1702q8M4126c = c1702q8M4124b.m4126c("ViewableImpression");
                if (c1702q8M4126c != null) {
                    AbstractC1534d8.m2438a(c1702q8M4126c.m4122a("Viewable"), hashSet, this.f2424g, this.f1969a);
                }
                C1702q8 c1702q8M4124b3 = c1702q8M4124b.m4124b("AdVerifications");
                if (c1702q8M4124b3 != null) {
                    c1780t7M5246a = C1780t7.m5246a(c1702q8M4124b3, c1780t7M5246a, this.f2424g, this.f1969a);
                }
                AbstractC1534d8.m2438a(c1702q8M4124b.m4122a("Error"), hashSet2, this.f2424g, this.f1969a);
                C1702q8 c1702q8M4126c2 = c1702q8M4124b.m4126c("Creatives");
                if (c1702q8M4126c2 != null) {
                    for (C1702q8 c1702q9 : c1702q8M4126c2.m4125b()) {
                        C1702q8 c1702q8M4126c3 = c1702q9.m4126c("Linear");
                        if (c1702q8M4126c3 != null) {
                            c1544e8M2513a = C1544e8.m2513a(c1702q8M4126c3, c1544e8M2513a, this.f2424g, this.f1969a);
                        } else {
                            C1702q8 c1702q8M4124b4 = c1702q9.m4124b("CompanionAds");
                            if (c1702q8M4124b4 != null) {
                                C1702q8 c1702q8M4124b5 = c1702q8M4124b4.m4124b("Companion");
                                if (c1702q8M4124b5 != null) {
                                    c1789u7M5313a = C1789u7.m5313a(c1702q8M4124b5, c1789u7M5313a, this.f2424g, this.f1969a);
                                }
                            } else if (C1768p.m5160a()) {
                                this.f1971c.m5174b(this.f1970b, "Received and will skip rendering for an unidentified creative: " + c1702q9);
                            }
                        }
                    }
                }
            } else if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Did not find wrapper or inline response for node: " + c1702q8);
            }
        }
        C1711r7 c1711r7M4282a = new C1711r7.b().m4276a(this.f1969a).m4281a(this.f2424g.m5483b()).m4285b(this.f2424g.m5486e()).m4273a(this.f2424g.m5484c()).m4283b(strM2432a).m4279a(strM2432a2).m4274a(c1487a8M1887a).m4275a(c1544e8M2513a).m4278a(c1789u7M5313a).m4277a(c1780t7M5246a).m4284b(hashSet).m4277a(c1780t7M5246a).m4280a(hashSet2).m4282a();
        EnumC1807w7 enumC1807w7M2447c = AbstractC1534d8.m2447c(c1711r7M4282a);
        if (enumC1807w7M2447c != null) {
            AbstractC1534d8.m2437a(this.f2424g, this.f2425h, enumC1807w7M2447c, -6, this.f1969a);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finished rendering VAST ad: " + c1711r7M4282a);
        }
        c1711r7M4282a.getAdEventTracker().m2809e();
        this.f1969a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1682p5(c1711r7M4282a, this.f1969a, this.f2425h), C1552f6.b.CACHING);
    }
}
