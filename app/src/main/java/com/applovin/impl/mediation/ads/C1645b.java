package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.C1549f3;
import com.applovin.impl.C1574h8;
import com.applovin.impl.C1584i8;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.mediation.ads.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1645b implements C1584i8.a {

    /* JADX INFO: renamed from: a */
    private final C1748l f2214a;

    /* JADX INFO: renamed from: b */
    private final C1549f3 f2215b;

    /* JADX INFO: renamed from: c */
    private final C1584i8 f2216c;

    /* JADX INFO: renamed from: d */
    private final C1574h8 f2217d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1644a.a f2218e;

    public C1645b(C1549f3 c1549f3, ViewGroup viewGroup, AbstractC1644a.a aVar, C1748l c1748l) {
        this.f2214a = c1748l;
        this.f2215b = c1549f3;
        this.f2218e = aVar;
        this.f2217d = new C1574h8(viewGroup, c1748l);
        C1584i8 c1584i8 = new C1584i8(viewGroup, c1748l, this);
        this.f2216c = c1584i8;
        c1584i8.m2938a(c1549f3);
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3410a(long j) {
        if (this.f2215b.m2579y0().compareAndSet(false, true)) {
            this.f2214a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2214a.m4782Q().m5171a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f2214a.m4797Z().processViewabilityAdImpressionPostback(this.f2215b, j, this.f2218e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3411a() {
        this.f2216c.m2939b();
    }

    /* JADX INFO: renamed from: b */
    public C1549f3 m3412b() {
        return this.f2215b;
    }

    /* JADX INFO: renamed from: c */
    public void m3413c() {
        this.f2214a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2214a.m4782Q().m5171a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f2215b.m2578x0().compareAndSet(false, true)) {
            this.f2214a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2214a.m4782Q().m5171a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f2215b.getNativeAd().isExpired()) {
                C1768p.m5167h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f2214a.m4828f().m4430a(this.f2215b);
            }
            this.f2214a.m4797Z().processRawAdImpression(this.f2215b, this.f2218e);
        }
    }

    @Override // com.applovin.impl.C1584i8.a
    public void onLogVisibilityImpression() {
        m3410a(this.f2217d.m2848a(this.f2215b));
    }
}
