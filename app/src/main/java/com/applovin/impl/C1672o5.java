package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.o5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1672o5 extends AbstractC1662n5 {

    /* JADX INFO: renamed from: q */
    private final C1735a f2465q;

    /* JADX INFO: renamed from: r */
    private boolean f2466r;

    /* JADX INFO: renamed from: s */
    private boolean f2467s;

    /* JADX INFO: renamed from: com.applovin.impl.o5$a */
    class a implements C1536e0.a {
        a() {
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri != null) {
                C1672o5.this.f2465q.m4446g1();
                C1672o5.this.f2465q.m4438a(uri);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.o5$b */
    class b implements AbstractC1662n5.c {
        b() {
        }

        @Override // com.applovin.impl.AbstractC1662n5.c
        /* JADX INFO: renamed from: a */
        public void mo3671a(String str) {
            C1672o5.this.f2465q.m4442c(C1672o5.this.m3748c(str));
            C1672o5.this.f2465q.m4527b(true);
            C1768p c1768p = C1672o5.this.f1971c;
            if (C1768p.m5160a()) {
                C1672o5 c1672o5 = C1672o5.this;
                c1672o5.f1971c.m5171a(c1672o5.f1970b, "Finish caching non-video resources for ad #" + C1672o5.this.f2465q.getAdIdNumber());
            }
            C1672o5 c1672o6 = C1672o5.this;
            c1672o6.f1971c.m5177f(c1672o6.f1970b, "Ad updated with cachedHTML = " + C1672o5.this.f2465q.m4440a1());
        }
    }

    public C1672o5(C1735a c1735a, C1748l c1748l, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", c1735a, c1748l, appLovinAdLoadListener);
        this.f2465q = c1735a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public String m3748c(String str) {
        if (AbstractC1701q7.m4115j(C1748l.m4756p())) {
            str = AbstractC1701q7.m4090c(str);
        }
        if (!this.f2465q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f1969a.m4831g0().m3127a(str, AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g));
    }

    /* JADX INFO: renamed from: k */
    private void m3749k() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching non-optional HTML resources...");
        }
        this.f2465q.m4442c(m3748c(m3659a(this.f2465q.m4440a1(), this.f2465q.m4505S(), this.f2465q)));
        this.f2465q.m4527b(true);
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finish caching non-optional HTML resources for ad #" + this.f2465q.getAdIdNumber());
        }
        this.f1971c.m5177f(this.f1970b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f2465q.m4440a1());
    }

    /* JADX INFO: renamed from: l */
    private void m3750l() {
        Uri uriM3664b;
        if (m3670j() || (uriM3664b = m3664b(this.f2465q.m4444e1())) == null) {
            return;
        }
        this.f2465q.m4446g1();
        this.f2465q.m4438a(uriM3664b);
    }

    /* JADX INFO: renamed from: m */
    private C1526d0 m3751m() {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching HTML resources...");
        }
        return m3656a(this.f2465q.m4440a1(), this.f2465q.m4505S(), new b());
    }

    /* JADX INFO: renamed from: n */
    private C1536e0 m3752n() {
        return m3657a(this.f2465q.m4444e1(), new a());
    }

    /* JADX INFO: renamed from: o */
    private void m3753o() {
        List<String> listM4484H = this.f2465q.m4484H();
        if (CollectionUtils.isEmpty(listM4484H)) {
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching optional HTML resources...");
        }
        String strM4440a1 = this.f2465q.m4440a1();
        for (String str : listM4484H) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Caching optional resource: " + str);
            }
            int iM4970a = this.f1969a.m4771I().m4970a(str, this.f2410g);
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g);
            String strM4974a = this.f1969a.m4771I().m4974a(C1748l.m4756p(), str, this.f2465q.getCachePrefix(), this.f2465q.m4505S(), true, true, iM4970a, this.f2412i, mapM2787a);
            if (StringUtils.isValidString(strM4974a)) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Updating HTML with cached optional resource: " + strM4974a);
                }
                this.f2465q.m4523a(strM4974a, str);
                strM4440a1 = strM4440a1.replace(str, strM4974a);
                this.f2465q.m4442c(strM4440a1);
            } else {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Failed to cache optional resource: " + str);
                }
                m3663a(str, "cacheOptionalHtmlResource", mapM2787a);
            }
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finish caching optional HTML resources for ad #" + this.f2465q.getAdIdNumber());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3754b(boolean z) {
        this.f2467s = z;
    }

    /* JADX INFO: renamed from: c */
    public void m3755c(boolean z) {
        this.f2466r = z;
    }

    @Override // com.applovin.impl.AbstractC1662n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zMo4248y0 = this.f2465q.mo4248y0();
        boolean z = this.f2467s;
        if (zMo4248y0 || z) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Begin caching for streaming ad #" + this.f2465q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3743J0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!zMo4248y0) {
                    mo3667e();
                    C1526d0 c1526d0M3751m = m3751m();
                    if (c1526d0M3751m != null) {
                        arrayList.add(c1526d0M3751m);
                    }
                } else if (this.f2466r) {
                    mo3667e();
                    C1526d0 c1526d0M3751m2 = m3751m();
                    if (c1526d0M3751m2 != null) {
                        arrayList.add(c1526d0M3751m2);
                    }
                    C1536e0 c1536e0M3752n = m3752n();
                    if (c1536e0M3752n != null) {
                        arrayList.add(c1536e0M3752n);
                    }
                } else {
                    C1526d0 c1526d0M3751m3 = m3751m();
                    if (c1526d0M3751m3 != null) {
                        m3660a(Arrays.asList(c1526d0M3751m3));
                    }
                    mo3667e();
                    C1536e0 c1536e0M3752n2 = m3752n();
                    if (c1536e0M3752n2 != null) {
                        arrayList.add(c1536e0M3752n2);
                    }
                }
                m3660a(arrayList);
                mo3667e();
            } else if (zMo4248y0) {
                if (this.f2466r) {
                    mo3667e();
                }
                m3749k();
                if (!this.f2466r) {
                    mo3667e();
                }
                m3750l();
            } else {
                mo3667e();
                m3749k();
            }
        } else {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Begin processing for non-streaming ad #" + this.f2465q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3743J0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                C1526d0 c1526d0M3751m4 = m3751m();
                if (c1526d0M3751m4 != null) {
                    arrayList2.add(c1526d0M3751m4);
                }
                C1536e0 c1536e0M3752n3 = m3752n();
                if (c1536e0M3752n3 != null) {
                    arrayList2.add(c1536e0M3752n3);
                }
                m3660a(arrayList2);
                mo3667e();
                m3753o();
            } else {
                m3749k();
                m3750l();
                mo3667e();
                m3753o();
            }
        }
        m3669i();
    }
}
