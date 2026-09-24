package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1519c3;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1565h;
import com.applovin.impl.C1709r5;
import com.applovin.impl.C1785u3;
import com.applovin.impl.C1794v3;
import com.applovin.impl.C1803w3;
import com.applovin.impl.C1814x5;
import com.applovin.impl.C1831z4;
import com.applovin.impl.EnumC1575i;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.applovin.impl.mediation.d */
/* JADX INFO: loaded from: classes3.dex */
public class C1648d {

    /* JADX INFO: renamed from: a */
    private final C1748l f2225a;

    /* JADX INFO: renamed from: b */
    private final Map f2226b = new HashMap(4);

    /* JADX INFO: renamed from: c */
    private final Object f2227c = new Object();

    /* JADX INFO: renamed from: d */
    private final Map f2228d = new HashMap(4);

    /* JADX INFO: renamed from: e */
    private final Object f2229e = new Object();

    /* JADX INFO: renamed from: f */
    private final Map f2230f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final Object f2231g = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.mediation.d$a */
    class a implements C1709r5.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f2232a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f2233b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f2234c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1519c3 f2235d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Context f2236e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AbstractC1644a.a f2237f;

        a(long j, Map map, String str, C1519c3 c1519c3, Context context, AbstractC1644a.a aVar) {
            this.f2232a = j;
            this.f2233b = map;
            this.f2234c = str;
            this.f2235d = c1519c3;
            this.f2236e = context;
            this.f2237f = aVar;
        }

        @Override // com.applovin.impl.C1709r5.b
        /* JADX INFO: renamed from: a */
        public void mo3441a(JSONArray jSONArray) {
            this.f2233b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f2232a));
            this.f2233b.put("calfc", Integer.valueOf(C1648d.this.m3438b(this.f2234c)));
            C1814x5 c1814x5 = new C1814x5(this.f2235d, jSONArray, this.f2236e, C1648d.this.f2225a, this.f2237f);
            if (((Boolean) C1648d.this.f2225a.m4801a(AbstractC1776t3.f3364q8)).booleanValue()) {
                C1648d.this.f2225a.m4853s0().m2604a((AbstractRunnableC1601k5) c1814x5, C1552f6.b.MEDIATION);
            } else {
                C1648d.this.f2225a.m4853s0().m2603a(c1814x5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.mediation.d$b */
    static class b implements AbstractC1644a.a {

        /* JADX INFO: renamed from: a */
        private final C1748l f2239a;

        /* JADX INFO: renamed from: b */
        private final WeakReference f2240b;

        /* JADX INFO: renamed from: c */
        private final C1648d f2241c;

        /* JADX INFO: renamed from: d */
        private final c f2242d;

        /* JADX INFO: renamed from: e */
        private final MaxAdFormat f2243e;

        /* JADX INFO: renamed from: f */
        private final Map f2244f;

        /* JADX INFO: renamed from: g */
        private final Map f2245g;

        /* JADX INFO: renamed from: h */
        private final Map f2246h;

        /* JADX INFO: renamed from: i */
        private final int f2247i;

        /* JADX INFO: renamed from: j */
        private long f2248j;

        /* JADX INFO: renamed from: k */
        private long f2249k;

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1648d c1648d, C1748l c1748l, Context context) {
            this.f2239a = c1748l;
            this.f2240b = new WeakReference(context);
            this.f2241c = c1648d;
            this.f2242d = cVar;
            this.f2243e = maxAdFormat;
            this.f2245g = map2;
            this.f2244f = map;
            this.f2246h = map3;
            this.f2248j = j;
            this.f2249k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f2247i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f2247i = Math.min(2, ((Integer) c1748l.m4801a(AbstractC1776t3.f3354j8)).intValue());
            } else {
                this.f2247i = ((Integer) c1748l.m4801a(AbstractC1776t3.f3354j8)).intValue();
            }
        }

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1648d c1648d, C1748l c1748l, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, c1648d, c1748l, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3442a(int i, String str) {
            this.f2245g.put("retry_delay_sec", Integer.valueOf(i));
            this.f2245g.put("retry_attempt", Integer.valueOf(this.f2242d.f2252c));
            Context contextM4756p = (Context) this.f2240b.get();
            if (contextM4756p == null) {
                contextM4756p = C1748l.m4756p();
            }
            this.f2246h.put("art", EnumC1575i.EXPONENTIAL_RETRY.m2850b());
            this.f2246h.put("era", Integer.valueOf(this.f2242d.f2252c));
            this.f2249k = System.currentTimeMillis();
            this.f2241c.m3431a(str, this.f2243e, this.f2244f, this.f2245g, this.f2246h, contextM4756p, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.f2241c.m3434c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2248j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f2239a.m4797Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f2249k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z = maxError2.getCode() == -5603 && AbstractC1701q7.m4092c(this.f2239a) && ((Boolean) this.f2239a.m4801a(C1831z4.f3693C6)).booleanValue();
            if (this.f2239a.m4812a(AbstractC1776t3.f3355k8, this.f2243e) && this.f2242d.f2252c < this.f2247i && !z) {
                c.m3449e(this.f2242d);
                final int iPow = (int) Math.pow(2.0d, this.f2242d.f2252c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3442a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f2242d.f2252c = 0;
            this.f2242d.f2251b.set(false);
            if (this.f2242d.f2253d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f2242d.f2250a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                AbstractC1793v2.m5376a(this.f2242d.f2253d, str, maxError2);
                this.f2242d.f2253d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) maxAd;
            abstractC1482a3.m1854i(this.f2242d.f2250a);
            abstractC1482a3.m1841a(SystemClock.elapsedRealtime() - this.f2248j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) abstractC1482a3.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f2239a.m4797Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f2249k, abstractC1482a3.getRequestLatencyMillis());
            }
            this.f2241c.m3430a(maxAd.getAdUnitId());
            this.f2242d.f2252c = 0;
            if (this.f2242d.f2253d == null) {
                this.f2241c.m3426a(abstractC1482a3);
                this.f2242d.f2251b.set(false);
                return;
            }
            abstractC1482a3.m1816B().m3569c().m3285a(this.f2242d.f2253d);
            this.f2242d.f2253d.onAdLoaded(abstractC1482a3);
            if (abstractC1482a3.m1831R().endsWith("load")) {
                this.f2242d.f2253d.onAdRevenuePaid(abstractC1482a3);
            }
            this.f2242d.f2253d = null;
            if (((Boolean) this.f2239a.m4801a(AbstractC1776t3.f3352h8)).booleanValue() || !this.f2241c.m3437a(maxAd)) {
                this.f2242d.f2251b.set(false);
                return;
            }
            Context contextM4756p = (Context) this.f2240b.get();
            if (contextM4756p == null) {
                contextM4756p = C1748l.m4756p();
            }
            this.f2248j = SystemClock.elapsedRealtime();
            this.f2249k = System.currentTimeMillis();
            this.f2246h.put("art", EnumC1575i.SEQUENTIAL_OR_PRECACHE.m2850b());
            this.f2241c.m3431a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f2244f, this.f2245g, this.f2246h, contextM4756p, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.d$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final String f2250a;

        /* JADX INFO: renamed from: b */
        private final AtomicBoolean f2251b;

        /* JADX INFO: renamed from: c */
        private int f2252c;

        /* JADX INFO: renamed from: d */
        private volatile AbstractC1644a.a f2253d;

        private c(String str) {
            this.f2251b = new AtomicBoolean();
            this.f2250a = str;
        }

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ int m3449e(c cVar) {
            int i = cVar.f2252c;
            cVar.f2252c = i + 1;
            return i;
        }
    }

    public C1648d(C1748l c1748l) {
        this.f2225a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private int m3422a(Map map, C1785u3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.m5288b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* JADX INFO: renamed from: a */
    private C1565h m3423a(String str, MaxAdFormat maxAdFormat) {
        if (!((Boolean) this.f2225a.m4801a(C1831z4.f3795P4)).booleanValue()) {
            return new C1565h(-1, -1, -1, -1);
        }
        C1803w3 c1803w3M4814a0 = this.f2225a.m4814a0();
        C1785u3 c1785u3 = C1785u3.f3405e;
        Map mapM5525a = c1803w3M4814a0.m5525a(c1785u3, C1794v3.m5461a(str));
        C1785u3.a aVar = C1785u3.a.SESSION;
        int iM3422a = m3422a(mapM5525a, aVar);
        C1785u3.a aVar2 = C1785u3.a.INSTALL;
        int iM3422a2 = m3422a(mapM5525a, aVar2);
        Map mapM5525a2 = this.f2225a.m4814a0().m5525a(c1785u3, C1794v3.m5460a(maxAdFormat));
        return new C1565h(iM3422a, iM3422a2, m3422a(mapM5525a2, aVar), m3422a(mapM5525a2, aVar2));
    }

    /* JADX INFO: renamed from: a */
    private c m3424a(String str, String str2) {
        c cVar;
        synchronized (this.f2227c) {
            String strM3432b = m3432b(str, str2);
            cVar = (c) this.f2226b.get(strM3432b);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f2226b.put(strM3432b, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3426a(AbstractC1482a3 abstractC1482a3) {
        synchronized (this.f2229e) {
            if (this.f2228d.containsKey(abstractC1482a3.getAdUnitId())) {
                C1768p.m5167h("AppLovinSdk", "Ad in cache already: " + abstractC1482a3.getAdUnitId());
            }
            this.f2228d.put(abstractC1482a3.getAdUnitId(), abstractC1482a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3430a(String str) {
        synchronized (this.f2231g) {
            this.f2225a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2225a.m4782Q().m5171a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f2230f.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3431a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, AbstractC1644a.a aVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1519c3 c1519c3 = new C1519c3(str, maxAdFormat, map, map2, map3, m3423a(str, maxAdFormat));
        this.f2225a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1709r5(c1519c3, context, this.f2225a, new a(jElapsedRealtime, map3, str, c1519c3, context, aVar)), C1552f6.b.MEDIATION);
    }

    /* JADX INFO: renamed from: b */
    private String m3432b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3434c(String str) {
        synchronized (this.f2231g) {
            this.f2225a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2225a.m4782Q().m5171a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f2230f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f2230f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: e */
    private AbstractC1482a3 m3435e(String str) {
        AbstractC1482a3 abstractC1482a3;
        synchronized (this.f2229e) {
            abstractC1482a3 = (AbstractC1482a3) this.f2228d.get(str);
            this.f2228d.remove(str);
        }
        return abstractC1482a3;
    }

    /* JADX INFO: renamed from: a */
    public void m3436a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1575i enumC1575i, Map map, Map map2, Context context, AbstractC1644a.a aVar) {
        AbstractC1482a3 abstractC1482a3M3435e = (this.f2225a.m4857u0().m2929d() || AbstractC1701q7.m4111h(C1748l.m4756p())) ? null : m3435e(str);
        if (abstractC1482a3M3435e != null) {
            abstractC1482a3M3435e.m1854i(str2);
            abstractC1482a3M3435e.m1816B().m3569c().m3285a(aVar);
            aVar.onAdLoaded(abstractC1482a3M3435e);
            if (abstractC1482a3M3435e.m1831R().endsWith("load")) {
                aVar.onAdRevenuePaid(abstractC1482a3M3435e);
            }
            if (((Boolean) this.f2225a.m4801a(AbstractC1776t3.f3352h8)).booleanValue() && m3437a((MaxAd) abstractC1482a3M3435e)) {
                return;
            }
        }
        c cVarM3424a = m3424a(str, str2);
        if (cVarM3424a.f2251b.compareAndSet(false, true)) {
            if (abstractC1482a3M3435e == null) {
                cVarM3424a.f2253d = aVar;
            }
            Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            mapSynchronizedMap.put("art", enumC1575i.m2850b());
            if (StringUtils.isValidString(str2)) {
                mapSynchronizedMap.put("alt", str2);
            }
            m3431a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarM3424a, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f2225a, context, null));
            return;
        }
        if (cVarM3424a.f2253d != null && cVarM3424a.f2253d != aVar) {
            C1768p.m5169j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        cVarM3424a.f2253d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3437a(MaxAd maxAd) {
        return ((!this.f2225a.m4821c(AbstractC1776t3.f3350f8).contains(maxAd.getAdUnitId()) && !this.f2225a.m4812a(AbstractC1776t3.f3349e8, maxAd.getFormat())) || this.f2225a.m4857u0().m2928c() || this.f2225a.m4857u0().m2929d()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public int m3438b(String str) {
        int iIntValue;
        synchronized (this.f2231g) {
            Integer num = (Integer) this.f2230f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public void m3439c(String str, String str2) {
        synchronized (this.f2227c) {
            this.f2226b.remove(m3432b(str, str2));
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m3440d(String str) {
        boolean z;
        synchronized (this.f2229e) {
            z = this.f2228d.get(str) != null;
        }
        return z;
    }
}
