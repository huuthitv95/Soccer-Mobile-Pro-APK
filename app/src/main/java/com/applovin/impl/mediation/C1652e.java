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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.applovin.impl.mediation.e */
/* JADX INFO: loaded from: classes3.dex */
public class C1652e {

    /* JADX INFO: renamed from: a */
    private final C1748l f2290a;

    /* JADX INFO: renamed from: b */
    private final Map f2291b = new HashMap(4);

    /* JADX INFO: renamed from: c */
    private final Object f2292c = new Object();

    /* JADX INFO: renamed from: d */
    private final Map f2293d = new HashMap(4);

    /* JADX INFO: renamed from: e */
    private final Object f2294e = new Object();

    /* JADX INFO: renamed from: f */
    private final Map f2295f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g */
    private final Map f2296g = new HashMap();

    /* JADX INFO: renamed from: h */
    private final Object f2297h = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.mediation.e$a */
    class a implements C1709r5.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f2298a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f2299b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f2300c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1519c3 f2301d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Context f2302e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AbstractC1644a.a f2303f;

        a(long j, Map map, String str, C1519c3 c1519c3, Context context, AbstractC1644a.a aVar) {
            this.f2298a = j;
            this.f2299b = map;
            this.f2300c = str;
            this.f2301d = c1519c3;
            this.f2302e = context;
            this.f2303f = aVar;
        }

        @Override // com.applovin.impl.C1709r5.b
        /* JADX INFO: renamed from: a */
        public void mo3441a(JSONArray jSONArray) {
            this.f2299b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f2298a));
            this.f2299b.put("calfc", Integer.valueOf(C1652e.this.m3487b(this.f2300c)));
            C1814x5 c1814x5 = new C1814x5(this.f2301d, jSONArray, this.f2302e, C1652e.this.f2290a, this.f2303f);
            if (((Boolean) C1652e.this.f2290a.m4801a(AbstractC1776t3.f3364q8)).booleanValue()) {
                C1652e.this.f2290a.m4853s0().m2604a((AbstractRunnableC1601k5) c1814x5, C1552f6.b.MEDIATION);
            } else {
                C1652e.this.f2290a.m4853s0().m2603a(c1814x5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.mediation.e$b */
    static class b implements AbstractC1644a.a {

        /* JADX INFO: renamed from: a */
        private final C1748l f2305a;

        /* JADX INFO: renamed from: b */
        private final WeakReference f2306b;

        /* JADX INFO: renamed from: c */
        private final C1652e f2307c;

        /* JADX INFO: renamed from: d */
        private final c f2308d;

        /* JADX INFO: renamed from: e */
        private final MaxAdFormat f2309e;

        /* JADX INFO: renamed from: f */
        private final Map f2310f;

        /* JADX INFO: renamed from: g */
        private final Map f2311g;

        /* JADX INFO: renamed from: h */
        private final Map f2312h;

        /* JADX INFO: renamed from: i */
        private final int f2313i;

        /* JADX INFO: renamed from: j */
        private long f2314j;

        /* JADX INFO: renamed from: k */
        private long f2315k;

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1652e c1652e, C1748l c1748l, Context context) {
            this.f2305a = c1748l;
            this.f2306b = new WeakReference(context);
            this.f2307c = c1652e;
            this.f2308d = cVar;
            this.f2309e = maxAdFormat;
            this.f2311g = map2;
            this.f2310f = map;
            this.f2312h = map3;
            this.f2314j = j;
            this.f2315k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f2313i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f2313i = Math.min(2, ((Integer) c1748l.m4801a(AbstractC1776t3.f3354j8)).intValue());
            } else {
                this.f2313i = ((Integer) c1748l.m4801a(AbstractC1776t3.f3354j8)).intValue();
            }
        }

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1652e c1652e, C1748l c1748l, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, c1652e, c1748l, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3492a(int i, String str) {
            this.f2311g.put("retry_delay_sec", Integer.valueOf(i));
            this.f2311g.put("retry_attempt", Integer.valueOf(this.f2308d.f2318c));
            Context contextM4756p = (Context) this.f2306b.get();
            if (contextM4756p == null) {
                contextM4756p = C1748l.m4756p();
            }
            this.f2312h.put("art", EnumC1575i.EXPONENTIAL_RETRY.m2850b());
            this.f2312h.put("era", Integer.valueOf(this.f2308d.f2318c));
            this.f2315k = System.currentTimeMillis();
            this.f2307c.m3480a(str, this.f2309e, this.f2310f, this.f2311g, this.f2312h, contextM4756p, this);
        }

        /* JADX INFO: renamed from: a */
        private void m3493a(MaxAd maxAd) {
            Context contextM4756p = (Context) this.f2306b.get();
            if (contextM4756p == null) {
                contextM4756p = C1748l.m4756p();
            }
            this.f2314j = SystemClock.elapsedRealtime();
            this.f2315k = System.currentTimeMillis();
            this.f2312h.put("art", EnumC1575i.SEQUENTIAL_OR_PRECACHE.m2850b());
            this.f2307c.m3480a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f2310f, this.f2311g, this.f2312h, contextM4756p, this);
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
            this.f2307c.m3490d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2314j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f2305a.m4797Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f2315k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z = maxError2.getCode() == -5603 && AbstractC1701q7.m4092c(this.f2305a) && ((Boolean) this.f2305a.m4801a(C1831z4.f3693C6)).booleanValue();
            if (this.f2305a.m4812a(AbstractC1776t3.f3355k8, this.f2309e) && this.f2308d.f2318c < this.f2313i && !z) {
                c.m3500e(this.f2308d);
                final int iPow = (int) Math.pow(2.0d, this.f2308d.f2318c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.e$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3492a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f2308d.f2318c = 0;
            this.f2308d.f2317b.set(false);
            if (this.f2308d.f2319d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f2308d.f2316a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                AbstractC1793v2.m5376a(this.f2308d.f2319d, str, maxError2);
                this.f2308d.f2319d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) maxAd;
            abstractC1482a3.m1854i(this.f2308d.f2316a);
            abstractC1482a3.m1841a(SystemClock.elapsedRealtime() - this.f2314j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) abstractC1482a3.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f2305a.m4797Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f2315k, abstractC1482a3.getRequestLatencyMillis());
            }
            this.f2307c.m3479a(maxAd.getAdUnitId());
            this.f2308d.f2318c = 0;
            if (this.f2308d.f2319d == null) {
                this.f2307c.m3475a(abstractC1482a3);
                this.f2308d.f2317b.set(false);
                int iM1828O = abstractC1482a3.m1828O();
                synchronized (this.f2307c.f2294e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f2307c.f2293d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iM1828O) {
                    int i = sizeSafely + 1;
                    this.f2305a.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2305a.m4782Q().m5171a("MediationAdLoadManagerV2", "Preloading waterfall " + i + " of " + iM1828O);
                    }
                    m3493a(maxAd);
                    return;
                }
                return;
            }
            abstractC1482a3.m1816B().m3569c().m3285a(this.f2308d.f2319d);
            this.f2308d.f2319d.onAdLoaded(abstractC1482a3);
            this.f2307c.f2295f.put(maxAd.getAdUnitId(), abstractC1482a3);
            if (abstractC1482a3.m1831R().endsWith("load")) {
                this.f2308d.f2319d.onAdRevenuePaid(abstractC1482a3);
            }
            this.f2308d.f2319d = null;
            if ((!this.f2305a.m4821c(AbstractC1776t3.f3350f8).contains(maxAd.getAdUnitId()) && !this.f2305a.m4812a(AbstractC1776t3.f3349e8, maxAd.getFormat())) || this.f2305a.m4857u0().m2928c() || this.f2305a.m4857u0().m2929d()) {
                this.f2308d.f2317b.set(false);
                return;
            }
            int iM1828O2 = abstractC1482a3.m1828O();
            this.f2305a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2305a.m4782Q().m5171a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iM1828O2);
            }
            m3493a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.e$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final String f2316a;

        /* JADX INFO: renamed from: b */
        private final AtomicBoolean f2317b;

        /* JADX INFO: renamed from: c */
        private int f2318c;

        /* JADX INFO: renamed from: d */
        private volatile AbstractC1644a.a f2319d;

        private c(String str) {
            this.f2317b = new AtomicBoolean();
            this.f2316a = str;
        }

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ int m3500e(c cVar) {
            int i = cVar.f2318c;
            cVar.f2318c = i + 1;
            return i;
        }
    }

    public C1652e(C1748l c1748l) {
        this.f2290a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private int m3471a(Map map, C1785u3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.m5288b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* JADX INFO: renamed from: a */
    private C1565h m3472a(String str, MaxAdFormat maxAdFormat) {
        if (!((Boolean) this.f2290a.m4801a(C1831z4.f3795P4)).booleanValue()) {
            return new C1565h(-1, -1, -1, -1);
        }
        C1803w3 c1803w3M4814a0 = this.f2290a.m4814a0();
        C1785u3 c1785u3 = C1785u3.f3405e;
        Map mapM5525a = c1803w3M4814a0.m5525a(c1785u3, C1794v3.m5461a(str));
        C1785u3.a aVar = C1785u3.a.SESSION;
        int iM3471a = m3471a(mapM5525a, aVar);
        C1785u3.a aVar2 = C1785u3.a.INSTALL;
        int iM3471a2 = m3471a(mapM5525a, aVar2);
        Map mapM5525a2 = this.f2290a.m4814a0().m5525a(c1785u3, C1794v3.m5460a(maxAdFormat));
        return new C1565h(iM3471a, iM3471a2, m3471a(mapM5525a2, aVar), m3471a(mapM5525a2, aVar2));
    }

    /* JADX INFO: renamed from: a */
    private c m3473a(String str, String str2) {
        c cVar;
        synchronized (this.f2292c) {
            String strM3481b = m3481b(str, str2);
            cVar = (c) this.f2291b.get(strM3481b);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f2291b.put(strM3481b, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3475a(AbstractC1482a3 abstractC1482a3) {
        synchronized (this.f2294e) {
            Queue arrayDeque = (Queue) this.f2293d.get(abstractC1482a3.getAdUnitId());
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                this.f2293d.put(abstractC1482a3.getAdUnitId(), arrayDeque);
            }
            arrayDeque.add(abstractC1482a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3479a(String str) {
        synchronized (this.f2297h) {
            this.f2290a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2290a.m4782Q().m5171a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f2296g.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3480a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, AbstractC1644a.a aVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1519c3 c1519c3 = new C1519c3(str, maxAdFormat, map, map2, map3, m3472a(str, maxAdFormat));
        this.f2290a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1709r5(c1519c3, context, this.f2290a, new a(jElapsedRealtime, map3, str, c1519c3, context, aVar)), C1552f6.b.MEDIATION);
    }

    /* JADX INFO: renamed from: b */
    private String m3481b(String str, String str2) {
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

    /* JADX INFO: renamed from: f */
    private AbstractC1482a3 m3485f(String str) {
        synchronized (this.f2294e) {
            Queue queue = (Queue) this.f2293d.get(str);
            if (CollectionUtils.isEmpty(queue)) {
                return null;
            }
            return (AbstractC1482a3) queue.poll();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3486a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1575i enumC1575i, Map map, Map map2, Context context, AbstractC1644a.a aVar) {
        AbstractC1482a3 abstractC1482a3M3485f = (this.f2290a.m4857u0().m2929d() || AbstractC1701q7.m4111h(C1748l.m4756p())) ? null : m3485f(str);
        if (abstractC1482a3M3485f != null) {
            abstractC1482a3M3485f.m1854i(str2);
            abstractC1482a3M3485f.m1816B().m3569c().m3285a(aVar);
            aVar.onAdLoaded(abstractC1482a3M3485f);
            this.f2295f.put(str, abstractC1482a3M3485f);
            if (abstractC1482a3M3485f.m1831R().endsWith("load")) {
                aVar.onAdRevenuePaid(abstractC1482a3M3485f);
            }
        }
        c cVarM3473a = m3473a(str, str2);
        if (cVarM3473a.f2317b.compareAndSet(false, true)) {
            if (abstractC1482a3M3485f == null) {
                cVarM3473a.f2319d = aVar;
            }
            Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            mapSynchronizedMap.put("art", enumC1575i.m2850b());
            if (StringUtils.isValidString(str2)) {
                mapSynchronizedMap.put("alt", str2);
            }
            m3480a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarM3473a, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f2290a, context, null));
            return;
        }
        if (cVarM3473a.f2319d != null && cVarM3473a.f2319d != aVar) {
            C1768p.m5169j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        cVarM3473a.f2319d = aVar;
    }

    /* JADX INFO: renamed from: b */
    public int m3487b(String str) {
        int iIntValue;
        synchronized (this.f2297h) {
            Integer num = (Integer) this.f2296g.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public Queue m3488c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) this.f2295f.get(str);
        if (abstractC1482a3 != null) {
            arrayDeque.add(abstractC1482a3);
        }
        synchronized (this.f2292c) {
            Queue queue = (Queue) this.f2293d.get(str);
            if (queue != null) {
                arrayDeque.addAll(queue);
            }
        }
        return arrayDeque;
    }

    /* JADX INFO: renamed from: c */
    public void m3489c(String str, String str2) {
        synchronized (this.f2292c) {
            this.f2291b.remove(m3481b(str, str2));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3490d(String str) {
        synchronized (this.f2297h) {
            this.f2290a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2290a.m4782Q().m5171a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f2296g.get(str);
            if (num == null) {
                num = 0;
            }
            this.f2296g.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m3491e(String str) {
        boolean z;
        synchronized (this.f2294e) {
            z = !CollectionUtils.isEmpty((Queue) this.f2293d.get(str));
        }
        return z;
    }
}
