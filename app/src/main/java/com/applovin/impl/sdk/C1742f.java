package com.applovin.impl.sdk;

import com.applovin.impl.C1781u;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1737c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.sdk.f */
/* JADX INFO: loaded from: classes3.dex */
public class C1742f {

    /* JADX INFO: renamed from: a */
    private final C1748l f2950a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2951b;

    /* JADX INFO: renamed from: d */
    private final Map f2953d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Map f2954e = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f2952c = new Object();

    C1742f(C1748l c1748l) {
        this.f2950a = c1748l;
        this.f2951b = c1748l.m4782Q();
        for (C1781u c1781u : C1781u.m5253a()) {
            this.f2953d.put(c1781u, new C1770r());
            this.f2954e.put(c1781u, new C1770r());
        }
    }

    /* JADX INFO: renamed from: b */
    private C1770r m4638b(C1781u c1781u) {
        C1770r c1770r;
        synchronized (this.f2952c) {
            c1770r = (C1770r) this.f2954e.get(c1781u);
            if (c1770r == null) {
                c1770r = new C1770r();
                this.f2954e.put(c1781u, c1770r);
            }
        }
        return c1770r;
    }

    /* JADX INFO: renamed from: c */
    private C1770r m4639c(C1781u c1781u) {
        synchronized (this.f2952c) {
            C1770r c1770rM4638b = m4638b(c1781u);
            if (c1770rM4638b.m5191b() > 0) {
                return c1770rM4638b;
            }
            return m4640d(c1781u);
        }
    }

    /* JADX INFO: renamed from: d */
    private C1770r m4640d(C1781u c1781u) {
        C1770r c1770r;
        synchronized (this.f2952c) {
            c1770r = (C1770r) this.f2953d.get(c1781u);
            if (c1770r == null) {
                c1770r = new C1770r();
                this.f2953d.put(c1781u, c1770r);
            }
        }
        return c1770r;
    }

    /* JADX INFO: renamed from: a */
    public AppLovinAdImpl m4641a(C1781u c1781u) {
        AppLovinAdImpl appLovinAdImplM5189a;
        synchronized (this.f2952c) {
            appLovinAdImplM5189a = m4639c(c1781u).m5189a();
        }
        return appLovinAdImplM5189a;
    }

    /* JADX INFO: renamed from: a */
    void m4642a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2952c) {
            m4640d(appLovinAdImpl.getAdZone()).m5190a(appLovinAdImpl);
            if (C1768p.m5160a()) {
                this.f2951b.m5171a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4643b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f2952c) {
            m4639c(appLovinAdImpl.getAdZone()).m5192b(appLovinAdImpl);
        }
    }

    /* JADX INFO: renamed from: e */
    public AppLovinAdImpl m4644e(C1781u c1781u) {
        C1737c c1737c;
        synchronized (this.f2952c) {
            C1770r c1770rM4640d = m4640d(c1781u);
            if (c1770rM4640d.m5191b() > 0) {
                m4638b(c1781u).m5190a(c1770rM4640d.m5189a());
                c1737c = new C1737c(c1781u, this.f2950a);
            } else {
                c1737c = null;
            }
        }
        if (c1737c != null) {
            if (C1768p.m5160a()) {
                this.f2951b.m5171a("AdPreloadManager", "Retrieved ad of zone " + c1781u + "...");
                return c1737c;
            }
        } else if (C1768p.m5160a()) {
            this.f2951b.m5171a("AdPreloadManager", "Unable to retrieve ad of zone " + c1781u + "...");
        }
        return c1737c;
    }

    /* JADX INFO: renamed from: f */
    public AppLovinAdBase m4645f(C1781u c1781u) {
        AppLovinAdImpl appLovinAdImplM5194d;
        synchronized (this.f2952c) {
            appLovinAdImplM5194d = m4639c(c1781u).m5194d();
        }
        return appLovinAdImplM5194d;
    }
}
