package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1482a3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.sdk.q */
/* JADX INFO: loaded from: classes3.dex */
public class C1769q {

    /* JADX INFO: renamed from: a */
    private final C1768p f3254a;

    /* JADX INFO: renamed from: b */
    private final Map f3255b = new HashMap(5);

    /* JADX INFO: renamed from: c */
    private final Object f3256c = new Object();

    /* JADX INFO: renamed from: d */
    private final Map f3257d = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e */
    private final Map f3258e = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: com.applovin.impl.sdk.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final String f3259a;

        /* JADX INFO: renamed from: b */
        private final String f3260b;

        /* JADX INFO: renamed from: c */
        private final String f3261c;

        public a(String str, String str2, String str3) {
            this.f3259a = str;
            this.f3260b = str2;
            this.f3261c = str3;
        }

        /* JADX INFO: renamed from: a */
        public String m5185a() {
            return this.f3260b;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m5186a(Object obj) {
            return obj instanceof a;
        }

        /* JADX INFO: renamed from: b */
        public String m5187b() {
            return this.f3259a;
        }

        /* JADX INFO: renamed from: c */
        public String m5188c() {
            return this.f3261c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m5186a(this)) {
                return false;
            }
            String strM5187b = m5187b();
            String strM5187b2 = aVar.m5187b();
            if (strM5187b != null ? !strM5187b.equals(strM5187b2) : strM5187b2 != null) {
                return false;
            }
            String strM5185a = m5185a();
            String strM5185a2 = aVar.m5185a();
            if (strM5185a != null ? !strM5185a.equals(strM5185a2) : strM5185a2 != null) {
                return false;
            }
            String strM5188c = m5188c();
            String strM5188c2 = aVar.m5188c();
            return strM5188c != null ? strM5188c.equals(strM5188c2) : strM5188c2 == null;
        }

        public int hashCode() {
            String strM5187b = m5187b();
            int iHashCode = strM5187b == null ? 43 : strM5187b.hashCode();
            String strM5185a = m5185a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strM5185a == null ? 43 : strM5185a.hashCode());
            String strM5188c = m5188c();
            return (iHashCode2 * 59) + (strM5188c != null ? strM5188c.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + m5187b() + ", adapterName=" + m5185a() + ", networkName=" + m5188c() + ")";
        }
    }

    C1769q(C1748l c1748l) {
        this.f3254a = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    public String m5179a(String str) {
        return (String) this.f3258e.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m5180a(AbstractC1482a3 abstractC1482a3) {
        synchronized (this.f3256c) {
            String adUnitId = abstractC1482a3.getAdUnitId();
            a aVar = (a) this.f3255b.get(adUnitId);
            if (aVar == null) {
                if (C1768p.m5160a()) {
                    this.f3254a.m5171a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (abstractC1482a3.m1817C().equals(aVar.m5187b())) {
                if (C1768p.m5160a()) {
                    this.f3254a.m5171a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.f3255b.remove(adUnitId);
            } else if (C1768p.m5160a()) {
                this.f3254a.m5171a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + abstractC1482a3 + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m5181b(String str) {
        return (String) this.f3257d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public void m5182b(AbstractC1482a3 abstractC1482a3) {
        this.f3257d.put(abstractC1482a3.getAdUnitId(), abstractC1482a3.m1833T());
    }

    /* JADX INFO: renamed from: c */
    public a m5183c(String str) {
        a aVar;
        synchronized (this.f3256c) {
            aVar = (a) this.f3255b.get(str);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public void m5184c(AbstractC1482a3 abstractC1482a3) {
        synchronized (this.f3256c) {
            if (C1768p.m5160a()) {
                this.f3254a.m5171a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + abstractC1482a3);
            }
            this.f3255b.put(abstractC1482a3.getAdUnitId(), new a(abstractC1482a3.m1817C(), abstractC1482a3.m3200c(), abstractC1482a3.getNetworkName()));
        }
        this.f3258e.put(abstractC1482a3.getAdUnitId(), abstractC1482a3.m1833T());
    }
}
