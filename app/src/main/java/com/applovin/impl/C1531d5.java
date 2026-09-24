package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.d5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1531d5 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1360a;

    /* JADX INFO: renamed from: b */
    private final Map f1361b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f1362c = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.d5$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1363a;

        static {
            int[] iArr = new int[b.values().length];
            f1363a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1363a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1363a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d5$b */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* JADX INFO: renamed from: com.applovin.impl.d5$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        private final C1541e5 f1368a;

        /* JADX INFO: renamed from: b */
        private final long f1369b;

        /* JADX INFO: renamed from: c */
        private final long f1370c;

        private c(C1541e5 c1541e5, long j) {
            this.f1368a = c1541e5;
            this.f1369b = j;
            this.f1370c = SystemClock.elapsedRealtime();
        }

        /* synthetic */ c(C1541e5 c1541e5, long j, a aVar) {
            this(c1541e5, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public boolean m2408d() {
            return SystemClock.elapsedRealtime() - this.f1370c > this.f1369b;
        }

        /* JADX INFO: renamed from: a */
        public long m2409a() {
            return this.f1370c;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m2410a(Object obj) {
            return obj instanceof c;
        }

        /* JADX INFO: renamed from: b */
        public long m2411b() {
            return this.f1369b;
        }

        /* JADX INFO: renamed from: c */
        public C1541e5 m2412c() {
            return this.f1368a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.m2410a((Object) this) || m2411b() != cVar.m2411b() || m2409a() != cVar.m2409a()) {
                return false;
            }
            C1541e5 c1541e5M2412c = m2412c();
            C1541e5 c1541e5M2412c2 = cVar.m2412c();
            return c1541e5M2412c != null ? c1541e5M2412c.equals(c1541e5M2412c2) : c1541e5M2412c2 == null;
        }

        public int hashCode() {
            long jM2411b = m2411b();
            long jM2409a = m2409a();
            C1541e5 c1541e5M2412c = m2412c();
            return ((((((int) (jM2411b ^ (jM2411b >>> 32))) + 59) * 59) + ((int) ((jM2409a >>> 32) ^ jM2409a))) * 59) + (c1541e5M2412c == null ? 43 : c1541e5M2412c.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + m2412c() + ", expirationTimeMillis=" + m2411b() + ", cacheTimestampMillis=" + m2409a() + ")";
        }
    }

    public C1531d5(C1748l c1748l) {
        this.f1360a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private String m2402a(C1551f5 c1551f5, String str, MaxAdFormat maxAdFormat) {
        String strM3200c = c1551f5.m3200c();
        int i = a.f1363a[c1551f5.m2584t().ordinal()];
        if (i == 1) {
            return strM3200c + "_" + maxAdFormat.getLabel();
        }
        if (i != 2) {
            return strM3200c;
        }
        return strM3200c + "_" + str;
    }

    /* JADX INFO: renamed from: a */
    public void m2403a(C1541e5 c1541e5, C1551f5 c1551f5, String str, MaxAdFormat maxAdFormat) {
        if (c1541e5 == null) {
            return;
        }
        long jM2586v = c1551f5.m2586v();
        if (jM2586v <= 0) {
            return;
        }
        this.f1360a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1360a.m4782Q().m5171a("SignalCacheManager", "Caching signal for: " + c1551f5);
        }
        String strM2402a = m2402a(c1551f5, str, maxAdFormat);
        c cVar = new c(c1541e5, jM2586v, null);
        synchronized (this.f1362c) {
            this.f1361b.put(strM2402a, cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public C1541e5 m2404b(C1551f5 c1551f5, String str, MaxAdFormat maxAdFormat) {
        String strM2402a = m2402a(c1551f5, str, maxAdFormat);
        synchronized (this.f1362c) {
            c cVar = (c) this.f1361b.get(strM2402a);
            if (cVar == null) {
                return null;
            }
            if (cVar.m2408d()) {
                this.f1361b.remove(strM2402a);
                return null;
            }
            this.f1360a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1360a.m4782Q().m5171a("SignalCacheManager", "Returning cached signal for: " + c1551f5);
            }
            return cVar.f1368a;
        }
    }
}
