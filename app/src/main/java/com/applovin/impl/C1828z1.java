package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.z1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1828z1 extends AbstractC1819y1 {

    /* JADX INFO: renamed from: M */
    private final C1481a2 f3658M;

    /* JADX INFO: renamed from: N */
    private C1576i0 f3659N;

    /* JADX INFO: renamed from: O */
    private long f3660O;

    /* JADX INFO: renamed from: P */
    private final AtomicBoolean f3661P;

    public C1828z1(AbstractC1736b abstractC1736b, Activity activity, Map map, C1748l c1748l, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f3658M = new C1481a2(this.f3594a, this.f3597d, this.f3595b);
        this.f3661P = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: C */
    private long m5733C() {
        AbstractC1736b abstractC1736b = this.f3594a;
        if (!(abstractC1736b instanceof C1735a)) {
            return 0L;
        }
        float fM4441b1 = ((C1735a) abstractC1736b).m4441b1();
        if (fM4441b1 <= 0.0f) {
            fM4441b1 = this.f3594a.m4557r();
        }
        return (long) (AbstractC1701q7.m4087c(fM4441b1) * (((double) this.f3594a.m4569y()) / 100.0d));
    }

    /* JADX INFO: renamed from: D */
    private int m5734D() {
        C1576i0 c1576i0;
        int iMin = 100;
        if (m5662h()) {
            if (((Boolean) this.f3595b.m4801a(C1831z4.f3959j1)).booleanValue() && !this.f3594a.hasShown()) {
                return 0;
            }
            if (!m5738E() && (c1576i0 = this.f3659N) != null) {
                iMin = (int) Math.min(100.0d, ((this.f3660O - c1576i0.m2855b()) / this.f3660O) * 100.0d);
            }
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m5735F() {
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.f3661P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m5736G() {
        this.f3610q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m5737H() {
        ArrayList arrayList = new ArrayList();
        C1498g c1498g = this.f3604k;
        if (c1498g != null) {
            arrayList.add(new C1590j4(c1498g, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        C1502k c1502k = this.f3603j;
        if (c1502k != null && c1502k.m2036a()) {
            C1502k c1502k2 = this.f3603j;
            arrayList.add(new C1590j4(c1502k2, FriendlyObstructionPurpose.NOT_VISIBLE, c1502k2.getIdentifier()));
        }
        this.f3594a.getAdEventTracker().m2805b(m5654b(), arrayList);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: A */
    protected void mo2178A() {
        this.f3658M.mo1805a(this.f3605l);
        this.f3610q = SystemClock.elapsedRealtime();
        this.f3661P.set(true);
    }

    /* JADX INFO: renamed from: E */
    protected boolean m5738E() {
        if (!(this.f3591J && this.f3594a.m4510U0()) && m5662h()) {
            return this.f3661P.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    protected void m5739I() {
        long jM4499P;
        long millis = 0;
        if (this.f3594a.m4497O() >= 0 || this.f3594a.m4499P() >= 0) {
            if (this.f3594a.m4497O() >= 0) {
                jM4499P = this.f3594a.m4497O();
            } else {
                if (this.f3594a.m4502Q0()) {
                    int iM4441b1 = (int) ((C1735a) this.f3594a).m4441b1();
                    if (iM4441b1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iM4441b1);
                    } else {
                        int iM4557r = (int) this.f3594a.m4557r();
                        if (iM4557r > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iM4557r);
                        }
                    }
                }
                jM4499P = (long) (millis * (((double) this.f3594a.m4499P()) / 100.0d));
            }
            m5656c(jM4499P);
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2084a(ViewGroup viewGroup) {
        this.f3658M.m1806a(this.f3604k, this.f3603j, m5654b(), viewGroup);
        if (((Boolean) this.f3595b.m4801a(C1831z4.f3892b6)).booleanValue() || !m5653a(false)) {
            C1502k c1502k = this.f3603j;
            if (c1502k != null) {
                c1502k.m2037b();
            }
            m5654b().renderAd(this.f3594a);
            mo2184a("javascript:al_onPoststitialShow();", this.f3594a.m4568x());
            if (m5662h()) {
                long jM5733C = m5733C();
                this.f3660O = jM5733C;
                if (jM5733C > 0) {
                    if (C1768p.m5160a()) {
                        this.f3596c.m5171a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f3660O + "ms...");
                    }
                    this.f3659N = C1576i0.m2851a(this.f3660O, this.f3595b, new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m5735F();
                        }
                    });
                }
            }
            if (this.f3604k != null) {
                if (this.f3594a.m4557r() >= 0) {
                    m5649a(this.f3604k, this.f3594a.m4557r(), new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m5736G();
                        }
                    });
                } else {
                    this.f3604k.setVisibility(0);
                }
            }
            m5739I();
            this.f3595b.m4853s0().m2605a(new C1788u6(this.f3595b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m5737H();
                }
            }), C1552f6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            m5667p();
            super.m5657c(AbstractC1701q7.m4103e(this.f3595b));
        }
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2085a(String str) {
        if (!((Boolean) this.f3595b.m4801a(C1831z4.f3813R6)).booleanValue()) {
            AbstractC1736b abstractC1736b = this.f3594a;
            if (abstractC1736b != null) {
                abstractC1736b.m4522a(str);
            }
            mo2189m();
        }
        C1576i0 c1576i0 = this.f3659N;
        if (c1576i0 != null) {
            c1576i0.m2854a();
            this.f3659N = null;
        }
        super.mo2085a(str);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: b */
    public void mo2185b(long j) {
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: e */
    public void mo2187e() {
        super.mo2187e();
        mo2178A();
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: f */
    public void mo2188f() {
        super.mo2188f();
        mo2178A();
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: m */
    protected void mo2189m() {
        super.m5647a(m5734D(), false, m5738E(), -2L);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: v */
    public void mo2090v() {
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: w */
    public void mo2091w() {
        mo2084a((ViewGroup) null);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: x */
    protected void mo5670x() {
        super.mo5670x();
        this.f3661P.set(true);
    }
}
