package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.sdk.o */
/* JADX INFO: loaded from: classes3.dex */
public class C1767o {

    /* JADX INFO: renamed from: l */
    private static final a f3238l = new a();

    /* JADX INFO: renamed from: a */
    private final C1748l f3239a;

    /* JADX INFO: renamed from: c */
    private long f3241c;

    /* JADX INFO: renamed from: d */
    private Long f3242d;

    /* JADX INFO: renamed from: e */
    private long f3243e;

    /* JADX INFO: renamed from: h */
    private long f3246h;

    /* JADX INFO: renamed from: i */
    private Object f3247i;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f3240b = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    private final Object f3244f = new Object();

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f3245g = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    private final Map f3248j = new HashMap();

    /* JADX INFO: renamed from: k */
    private final Object f3249k = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private long f3250a = -1;

        /* JADX INFO: renamed from: b */
        private int f3251b;

        /* JADX INFO: renamed from: a */
        static /* synthetic */ int m5153a(a aVar) {
            int i = aVar.f3251b;
            aVar.f3251b = i + 1;
            return i;
        }

        /* JADX INFO: renamed from: a */
        public int m5155a() {
            return this.f3251b;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m5156a(Object obj) {
            return obj instanceof a;
        }

        /* JADX INFO: renamed from: b */
        public long m5157b() {
            return this.f3250a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.m5156a((Object) this) && m5157b() == aVar.m5157b() && m5155a() == aVar.m5155a();
        }

        public int hashCode() {
            long jM5157b = m5157b();
            return ((((int) (jM5157b ^ (jM5157b >>> 32))) + 59) * 59) + m5155a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + m5157b() + ", attemptCount=" + m5155a() + ")";
        }
    }

    C1767o(C1748l c1748l) {
        this.f3239a = c1748l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5140a(Long l) {
        if (m5152e() && System.currentTimeMillis() - this.f3246h >= l.longValue()) {
            this.f3239a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f3245g.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5141a(Long l, Object obj) {
        if (this.f3240b.get() && System.currentTimeMillis() - this.f3241c >= l.longValue()) {
            this.f3239a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            HashMap map = new HashMap();
            if (obj instanceof AbstractC1736b) {
                map.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) obj));
            } else if (obj instanceof AbstractC1482a3) {
                map.putAll(AbstractC1568h2.m2785a((AbstractC1482a3) obj));
            }
            this.f3239a.m4764E().m2678a(C1548f2.f1537h1, "fullscreenAdDisplayStateTimeout", map);
            m5148b(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m5142a() {
        return this.f3247i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX INFO: renamed from: a */
    public void m5143a(final Object obj) {
        if (!AbstractC1821y3.m5701a(obj) && this.f3240b.compareAndSet(false, true)) {
            this.f3247i = obj;
            this.f3241c = System.currentTimeMillis();
            this.f3239a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f3241c);
            }
            ActivityManager.MemoryInfo memoryInfoM4022a = AbstractC1701q7.m4022a((ActivityManager) C1748l.m4756p().getSystemService("activity"));
            if (memoryInfoM4022a != null) {
                long j = this.f3243e;
                if (j > 0) {
                    this.f3242d = Long.valueOf(j - memoryInfoM4022a.availMem);
                    this.f3243e = 0L;
                } else {
                    this.f3242d = null;
                }
            } else {
                this.f3242d = null;
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l = (Long) this.f3239a.m4801a(C1831z4.f3768M1);
            if (l.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m5141a(l, obj);
                    }
                }, l.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5144a(String str) {
        synchronized (this.f3249k) {
            this.f3248j.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5145a(boolean z) {
        synchronized (this.f3244f) {
            this.f3245g.set(z);
            if (z) {
                this.f3246h = System.currentTimeMillis();
                this.f3239a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f3246h);
                }
                ActivityManager.MemoryInfo memoryInfoM4022a = AbstractC1701q7.m4022a((ActivityManager) C1748l.m4756p().getSystemService("activity"));
                if (memoryInfoM4022a != null) {
                    this.f3243e = memoryInfoM4022a.availMem;
                }
                final Long l = (Long) this.f3239a.m4801a(C1831z4.f3760L1);
                if (l.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m5140a(l);
                        }
                    }, l.longValue());
                }
            } else {
                this.f3246h = 0L;
                this.f3239a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m5146b() {
        return this.f3241c;
    }

    /* JADX INFO: renamed from: b */
    public a m5147b(String str) {
        a aVar;
        synchronized (this.f3249k) {
            aVar = (a) this.f3248j.get(str);
            if (aVar == null) {
                aVar = f3238l;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m5148b(Object obj) {
        if (!AbstractC1821y3.m5701a(obj) && this.f3240b.compareAndSet(true, false)) {
            this.f3247i = null;
            this.f3239a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3239a.m4782Q().m5171a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public Long m5149c() {
        return this.f3242d;
    }

    /* JADX INFO: renamed from: c */
    public void m5150c(String str) {
        synchronized (this.f3249k) {
            a aVar = (a) this.f3248j.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f3248j.put(str, aVar);
            }
            aVar.f3250a = System.currentTimeMillis();
            a.m5153a(aVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m5151d() {
        return this.f3240b.get();
    }

    /* JADX INFO: renamed from: e */
    public boolean m5152e() {
        return this.f3245g.get();
    }
}
