package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.applovin.impl.p5 */
/* JADX INFO: loaded from: classes3.dex */
class C1682p5 extends AbstractC1662n5 {

    /* JADX INFO: renamed from: q */
    private final C1711r7 f2532q;

    /* JADX INFO: renamed from: com.applovin.impl.p5$a */
    class a implements C1536e0.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1834z7 f2533a;

        a(C1834z7 c1834z7) {
            this.f2533a = c1834z7;
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri != null) {
                this.f2533a.m5758a(uri);
                C1682p5.this.f2532q.m4527b(true);
                return;
            }
            C1768p c1768p = C1682p5.this.f1971c;
            if (C1768p.m5160a()) {
                C1682p5 c1682p5 = C1682p5.this;
                c1682p5.f1971c.m5174b(c1682p5.f1970b, "Failed to cache static companion ad");
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p5$b */
    class b implements AbstractC1662n5.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1834z7 f2535a;

        b(C1834z7 c1834z7) {
            this.f2535a = c1834z7;
        }

        @Override // com.applovin.impl.AbstractC1662n5.c
        /* JADX INFO: renamed from: a */
        public void mo3671a(String str) {
            this.f2535a.m5759a(str);
            C1682p5.this.f2532q.m4527b(true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p5$c */
    class c implements AbstractC1662n5.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1834z7 f2537a;

        c(C1834z7 c1834z7) {
            this.f2537a = c1834z7;
        }

        @Override // com.applovin.impl.AbstractC1662n5.c
        /* JADX INFO: renamed from: a */
        public void mo3671a(String str) {
            this.f2537a.m5759a(str);
            C1682p5.this.f2532q.m4527b(true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p5$d */
    class d implements C1536e0.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1554f8 f2539a;

        d(C1554f8 c1554f8) {
            this.f2539a = c1554f8;
        }

        @Override // com.applovin.impl.C1536e0.a
        /* JADX INFO: renamed from: a */
        public void mo2339a(Uri uri) {
            if (uri != null) {
                C1768p c1768p = C1682p5.this.f1971c;
                if (C1768p.m5160a()) {
                    C1682p5 c1682p5 = C1682p5.this;
                    c1682p5.f1971c.m5171a(c1682p5.f1970b, "Video file successfully cached into: " + uri);
                }
                this.f2539a.m2628a(uri);
                return;
            }
            C1768p c1768p2 = C1682p5.this.f1971c;
            if (C1768p.m5160a()) {
                C1682p5 c1682p6 = C1682p5.this;
                c1682p6.f1971c.m5174b(c1682p6.f1970b, "Failed to cache video file: " + this.f2539a);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p5$e */
    class e implements AbstractC1662n5.c {
        e() {
        }

        @Override // com.applovin.impl.AbstractC1662n5.c
        /* JADX INFO: renamed from: a */
        public void mo3671a(String str) {
            if (C1682p5.this.f2532q.isOpenMeasurementEnabled()) {
                str = C1682p5.this.f1969a.m4831g0().m3127a(str, AbstractC1568h2.m2787a((AppLovinAdImpl) C1682p5.this.f2410g));
            }
            C1682p5.this.f2532q.m4229c(str);
            C1768p c1768p = C1682p5.this.f1971c;
            if (C1768p.m5160a()) {
                C1682p5 c1682p5 = C1682p5.this;
                c1682p5.f1971c.m5171a(c1682p5.f1970b, "Finish caching HTML template " + C1682p5.this.f2532q.m4230c1() + " for ad #" + C1682p5.this.f2532q.getAdIdNumber());
            }
        }
    }

    public C1682p5(C1711r7 c1711r7, C1748l c1748l, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", c1711r7, c1748l, appLovinAdLoadListener);
        this.f2532q = c1711r7;
    }

    /* JADX INFO: renamed from: c */
    private String m3875c(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f1969a.m4801a(C1831z4.f3972k5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriM3655a = m3655a(str2, Collections.EMPTY_LIST, false);
                if (uriM3655a != null) {
                    str = str.replace(str2, uriM3655a.toString());
                    this.f2410g.m4523a(uriM3655a.toString(), str2);
                } else if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    private void m3876k() {
        if (m3670j()) {
            return;
        }
        if (!this.f2532q.m4241o1()) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        C1789u7 c1789u7M4228a1 = this.f2532q.m4228a1();
        if (c1789u7M4228a1 == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        C1834z7 c1834z7M5318e = c1789u7M4228a1.m5318e();
        if (c1834z7M5318e == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriM5761c = c1834z7M5318e.m5761c();
        String string = uriM5761c != null ? uriM5761c.toString() : "";
        String strM5760b = c1834z7M5318e.m5760b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strM5760b)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5178k(this.f1970b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (c1834z7M5318e.m5762d() == C1834z7.a.STATIC) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Caching static companion ad at " + string + "...");
            }
            Uri uriM3655a = m3655a(string, Collections.EMPTY_LIST, false);
            if (uriM3655a != null) {
                c1834z7M5318e.m5758a(uriM3655a);
                this.f2532q.m4527b(true);
                return;
            } else {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (c1834z7M5318e.m5762d() != C1834z7.a.HTML) {
            if (c1834z7M5318e.m5762d() == C1834z7.a.IFRAME && C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strM5760b);
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3963j5)).booleanValue()) {
                strM5760b = m3875c(strM5760b);
            }
            c1834z7M5318e.m5759a(m3659a(strM5760b, Collections.EMPTY_LIST, this.f2532q));
            this.f2532q.m4527b(true);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strM3666c = m3666c(string, null, false);
        if (StringUtils.isValidString(strM3666c)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "HTML fetched. Caching HTML now...");
            }
            c1834z7M5318e.m5759a(m3659a(strM3666c, Collections.EMPTY_LIST, this.f2532q));
            this.f2532q.m4527b(true);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Unable to load companion ad resources from " + string);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m3877l() {
        if (m3670j() || !AbstractC1534d8.m2443a(this.f2532q)) {
            return;
        }
        String strM4230c1 = this.f2532q.m4230c1();
        if (!StringUtils.isValidString(strM4230c1)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strM3659a = m3659a(strM4230c1, this.f2532q.m4505S(), this.f2410g);
        if (this.f2532q.isOpenMeasurementEnabled()) {
            strM3659a = this.f1969a.m4831g0().m3127a(strM3659a, AbstractC1568h2.m2787a((AppLovinAdImpl) this.f2410g));
        }
        this.f2532q.m4229c(strM3659a);
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finish caching HTML template " + this.f2532q.m4230c1() + " for ad #" + this.f2532q.getAdIdNumber());
        }
    }

    /* JADX INFO: renamed from: m */
    private void m3878m() {
        C1554f8 c1554f8M4237k1;
        Uri uriM2632e;
        if (m3670j()) {
            return;
        }
        if (!this.f2532q.m4242p1()) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f2532q.m4236j1() == null || (c1554f8M4237k1 = this.f2532q.m4237k1()) == null || (uriM2632e = c1554f8M4237k1.m2632e()) == null) {
            return;
        }
        Uri uriM3665b = m3665b(uriM2632e.toString(), Collections.EMPTY_LIST, false);
        if (uriM3665b != null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Video file successfully cached into: " + uriM3665b);
            }
            c1554f8M4237k1.m2628a(uriM3665b);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Failed to cache video file: " + c1554f8M4237k1);
        }
    }

    /* JADX INFO: renamed from: n */
    private AbstractCallableC1516c0 m3879n() {
        if (!this.f2532q.m4241o1()) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        C1789u7 c1789u7M4228a1 = this.f2532q.m4228a1();
        if (c1789u7M4228a1 == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        C1834z7 c1834z7M5318e = c1789u7M4228a1.m5318e();
        if (c1834z7M5318e == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriM5761c = c1834z7M5318e.m5761c();
        String string = uriM5761c != null ? uriM5761c.toString() : "";
        String strM5760b = c1834z7M5318e.m5760b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strM5760b)) {
            if (c1834z7M5318e.m5762d() == C1834z7.a.STATIC) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Caching static companion ad at " + string + "...");
                }
                return new C1536e0(string, this.f2532q, Collections.EMPTY_LIST, false, this.f2412i, this.f1969a, new a(c1834z7M5318e));
            }
            if (c1834z7M5318e.m5762d() == C1834z7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strM5760b);
                    }
                    return m3656a(strM5760b, Collections.EMPTY_LIST, new c(c1834z7M5318e));
                }
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strM3666c = m3666c(string, null, false);
                if (StringUtils.isValidString(strM3666c)) {
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "HTML fetched. Caching HTML now...");
                    }
                    return m3656a(strM3666c, Collections.EMPTY_LIST, new b(c1834z7M5318e));
                }
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Unable to load companion ad resources from " + string);
                }
            } else if (c1834z7M5318e.m5762d() == C1834z7.a.IFRAME && C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Skip caching of iFrame resource...");
            }
        } else if (C1768p.m5160a()) {
            this.f1971c.m5178k(this.f1970b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.AbstractC1662n5
    /* JADX INFO: renamed from: a */
    void mo3661a(int i) {
        this.f2532q.getAdEventTracker().m2810f();
        super.mo3661a(i);
    }

    @Override // com.applovin.impl.AbstractC1662n5
    /* JADX INFO: renamed from: e */
    void mo3667e() {
        this.f2532q.getAdEventTracker().mo2812h();
        super.mo3667e();
    }

    /* JADX INFO: renamed from: o */
    protected C1526d0 m3880o() {
        if (!TextUtils.isEmpty(this.f2532q.m4230c1())) {
            return m3656a(this.f2532q.m4230c1(), this.f2532q.m4505S(), new e());
        }
        if (!C1768p.m5160a()) {
            return null;
        }
        this.f1971c.m5171a(this.f1970b, "Unable to load HTML template");
        return null;
    }

    /* JADX INFO: renamed from: p */
    protected C1536e0 m3881p() {
        C1554f8 c1554f8M4237k1;
        Uri uriM2632e;
        if (!this.f2532q.m4242p1()) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f2532q.m4236j1() == null || (c1554f8M4237k1 = this.f2532q.m4237k1()) == null || (uriM2632e = c1554f8M4237k1.m2632e()) == null) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Caching video file " + c1554f8M4237k1 + " creative...");
        }
        return m3658a(uriM2632e.toString(), Collections.EMPTY_LIST, false, new d(c1554f8M4237k1));
    }

    @Override // com.applovin.impl.AbstractC1662n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zMo4248y0 = this.f2532q.mo4248y0();
        if (C1768p.m5160a()) {
            C1768p c1768p = this.f1971c;
            String str = this.f1970b;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            sb.append(zMo4248y0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f2410g.getAdIdNumber());
            sb.append("...");
            c1768p.m5171a(str, sb.toString());
        }
        if (zMo4248y0) {
            if (!((Boolean) this.f1969a.m4801a(C1831z4.f3743J0)).booleanValue()) {
                if (this.f2532q.m4239m1()) {
                    mo3667e();
                }
                C1711r7.c cVarM4231d1 = this.f2532q.m4231d1();
                C1711r7.c cVar = C1711r7.c.COMPANION_AD;
                if (cVarM4231d1 == cVar) {
                    m3876k();
                    m3877l();
                } else {
                    m3878m();
                }
                if (!this.f2532q.m4239m1()) {
                    mo3667e();
                }
                if (this.f2532q.m4231d1() == cVar) {
                    m3878m();
                } else {
                    m3876k();
                    m3877l();
                }
            } else if (this.f2532q.m4239m1()) {
                mo3667e();
                ArrayList arrayList = new ArrayList();
                AbstractCallableC1516c0 abstractCallableC1516c0M3879n = m3879n();
                if (abstractCallableC1516c0M3879n != null) {
                    arrayList.add(abstractCallableC1516c0M3879n);
                }
                C1526d0 c1526d0M3880o = m3880o();
                if (c1526d0M3880o != null) {
                    arrayList.add(c1526d0M3880o);
                }
                C1536e0 c1536e0M3881p = m3881p();
                if (c1536e0M3881p != null) {
                    arrayList.add(c1536e0M3881p);
                }
                m3660a(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (this.f2532q.m4231d1() == C1711r7.c.COMPANION_AD) {
                    AbstractCallableC1516c0 abstractCallableC1516c0M3879n2 = m3879n();
                    if (abstractCallableC1516c0M3879n2 != null) {
                        arrayList2.add(abstractCallableC1516c0M3879n2);
                    }
                    C1526d0 c1526d0M3880o2 = m3880o();
                    if (c1526d0M3880o2 != null) {
                        arrayList2.add(c1526d0M3880o2);
                    }
                    m3660a(arrayList2);
                    mo3667e();
                    C1536e0 c1536e0M3881p2 = m3881p();
                    if (c1536e0M3881p2 != null) {
                        arrayList3.add(c1536e0M3881p2);
                    }
                    m3660a(arrayList3);
                } else {
                    C1536e0 c1536e0M3881p3 = m3881p();
                    if (c1536e0M3881p3 != null) {
                        arrayList2.add(c1536e0M3881p3);
                    }
                    m3660a(arrayList2);
                    mo3667e();
                    AbstractCallableC1516c0 abstractCallableC1516c0M3879n3 = m3879n();
                    if (abstractCallableC1516c0M3879n3 != null) {
                        arrayList3.add(abstractCallableC1516c0M3879n3);
                    }
                    C1526d0 c1526d0M3880o3 = m3880o();
                    if (c1526d0M3880o3 != null) {
                        arrayList3.add(c1526d0M3880o3);
                    }
                    m3660a(arrayList3);
                }
            }
        } else if (((Boolean) this.f1969a.m4801a(C1831z4.f3743J0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            AbstractCallableC1516c0 abstractCallableC1516c0M3879n4 = m3879n();
            if (abstractCallableC1516c0M3879n4 != null) {
                arrayList4.add(abstractCallableC1516c0M3879n4);
            }
            C1536e0 c1536e0M3881p4 = m3881p();
            if (c1536e0M3881p4 != null) {
                arrayList4.add(c1536e0M3881p4);
            }
            C1526d0 c1526d0M3880o4 = m3880o();
            if (c1526d0M3880o4 != null) {
                arrayList4.add(c1526d0M3880o4);
            }
            m3660a(arrayList4);
            mo3667e();
        } else {
            m3876k();
            m3878m();
            m3877l();
            mo3667e();
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Finished caching VAST ad #" + this.f2532q.getAdIdNumber());
        }
        this.f2532q.m4240n1();
        m3669i();
    }
}
