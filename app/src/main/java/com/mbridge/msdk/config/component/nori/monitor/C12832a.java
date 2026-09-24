package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.nori.monitor.a */
/* JADX INFO: compiled from: MonitorNetworkRequestLink.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12832a {

    /* JADX INFO: renamed from: H */
    private static boolean f34327H = MBridgeConstans.DEBUG;

    /* JADX INFO: renamed from: I */
    private static final AtomicInteger f34328I = new AtomicInteger(0);

    /* JADX INFO: renamed from: J */
    private static final AtomicInteger f34329J = new AtomicInteger(0);

    /* JADX INFO: renamed from: F */
    private Map<String, Object> f34335F;

    /* JADX INFO: renamed from: G */
    private Map<String, Integer> f34336G;

    /* JADX INFO: renamed from: a */
    private boolean f34337a;

    /* JADX INFO: renamed from: b */
    private int f34338b;

    /* JADX INFO: renamed from: c */
    private long f34339c;

    /* JADX INFO: renamed from: d */
    private long f34340d;

    /* JADX INFO: renamed from: e */
    private long f34341e;

    /* JADX INFO: renamed from: f */
    private long f34342f;

    /* JADX INFO: renamed from: g */
    private long f34343g;

    /* JADX INFO: renamed from: h */
    private long f34344h;

    /* JADX INFO: renamed from: i */
    private long f34345i;

    /* JADX INFO: renamed from: j */
    private long f34346j;

    /* JADX INFO: renamed from: k */
    private long f34347k;

    /* JADX INFO: renamed from: l */
    private long f34348l;

    /* JADX INFO: renamed from: m */
    private long f34349m = 0;

    /* JADX INFO: renamed from: n */
    private long f34350n = 0;

    /* JADX INFO: renamed from: o */
    private long f34351o = 0;

    /* JADX INFO: renamed from: p */
    private long f34352p = 0;

    /* JADX INFO: renamed from: q */
    private long f34353q = 0;

    /* JADX INFO: renamed from: r */
    private long f34354r = 0;

    /* JADX INFO: renamed from: s */
    private long f34355s = 0;

    /* JADX INFO: renamed from: t */
    private long f34356t = 0;

    /* JADX INFO: renamed from: u */
    private long f34357u = 0;

    /* JADX INFO: renamed from: v */
    private long f34358v = 0;

    /* JADX INFO: renamed from: w */
    private long f34359w = 0;

    /* JADX INFO: renamed from: x */
    private long f34360x = 0;

    /* JADX INFO: renamed from: y */
    private long f34361y = 0;

    /* JADX INFO: renamed from: z */
    private long f34362z = 0;

    /* JADX INFO: renamed from: A */
    private long f34330A = 0;

    /* JADX INFO: renamed from: B */
    private long f34331B = 0;

    /* JADX INFO: renamed from: C */
    private long f34332C = 0;

    /* JADX INFO: renamed from: D */
    private long f34333D = 0;

    /* JADX INFO: renamed from: E */
    private long f34334E = 0;

    /* JADX INFO: renamed from: a */
    public void m35645a(int i, int i2, int i3) {
        if (this.f34337a) {
            return;
        }
        HashMap map = new HashMap();
        this.f34336G = map;
        map.put("threadPoolSize", Integer.valueOf(i));
        this.f34336G.put("activeThreads", Integer.valueOf(i2));
        this.f34336G.put("queuedTasks", Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public void m35650b() {
        if (this.f34337a) {
            return;
        }
        m35661l();
    }

    /* JADX INFO: renamed from: c */
    public void m35652c() {
        if (this.f34337a) {
            return;
        }
        this.f34343g = (System.nanoTime() - this.f34353q) / 1000000;
    }

    /* JADX INFO: renamed from: d */
    public void m35653d() {
    }

    /* JADX INFO: renamed from: e */
    public void m35654e() {
        if (this.f34337a) {
            return;
        }
        this.f34353q = System.nanoTime();
    }

    /* JADX INFO: renamed from: f */
    public void m35655f() {
    }

    /* JADX INFO: renamed from: g */
    public void m35656g() {
    }

    /* JADX INFO: renamed from: h */
    public void m35657h() {
        if (this.f34337a) {
            return;
        }
        this.f34342f = (System.nanoTime() - this.f34351o) / 1000000;
    }

    /* JADX INFO: renamed from: i */
    public void m35658i() {
        if (this.f34337a) {
            return;
        }
        this.f34351o = System.nanoTime();
    }

    /* JADX INFO: renamed from: j */
    public Map<String, Object> m35659j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f34337a));
        map2.put("retryCount", Integer.valueOf(this.f34338b));
        map2.put("requestBodySize", Long.valueOf(this.f34339c));
        map2.put("responseBodySize", Long.valueOf(this.f34340d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f34341e));
        map3.put("dnsTime", Long.valueOf(this.f34342f));
        map3.put("connectionTime", Long.valueOf(this.f34343g));
        map3.put("requestTime", Long.valueOf(this.f34344h));
        map3.put("serverTime", Long.valueOf(this.f34345i));
        map3.put("responseTime", Long.valueOf(this.f34346j));
        map3.put("queueTime", Long.valueOf(this.f34347k));
        map3.put("parsingTime", Long.valueOf(this.f34348l));
        map.put("timingInfo", map3);
        map.put(C11744X3.j.f26447h0, this.f34335F);
        map.put("threadPoolInfo", this.f34336G);
        return map;
    }

    /* JADX INFO: renamed from: k */
    public void m35660k() {
        if (this.f34337a) {
            return;
        }
        this.f34341e = (System.nanoTime() - this.f34349m) / 1000000;
    }

    /* JADX INFO: renamed from: l */
    public void m35661l() {
        if (this.f34337a) {
            return;
        }
        this.f34347k = (System.nanoTime() - this.f34349m) / 1000000;
    }

    /* JADX INFO: renamed from: m */
    public void m35662m() {
        if (this.f34337a) {
            return;
        }
        this.f34349m = System.nanoTime();
    }

    /* JADX INFO: renamed from: n */
    public void m35663n() {
        if (this.f34337a) {
            return;
        }
        this.f34359w = System.nanoTime();
    }

    /* JADX INFO: renamed from: o */
    public void m35664o() {
        if (this.f34337a) {
            return;
        }
        this.f34358v = System.nanoTime();
    }

    /* JADX INFO: renamed from: p */
    public void m35665p() {
        if (this.f34337a) {
            return;
        }
        this.f34357u = System.nanoTime();
    }

    /* JADX INFO: renamed from: q */
    public void m35666q() {
        if (this.f34337a) {
            return;
        }
        this.f34330A = System.nanoTime();
    }

    /* JADX INFO: renamed from: r */
    public void m35667r() {
        if (this.f34337a) {
            return;
        }
        this.f34362z = System.nanoTime();
    }

    /* JADX INFO: renamed from: s */
    public void m35668s() {
        if (this.f34337a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f34361y = jNanoTime;
        this.f34345i = (jNanoTime - this.f34360x) / 1000000;
    }

    /* JADX INFO: renamed from: t */
    public void m35669t() {
        if (this.f34337a) {
            return;
        }
        this.f34355s = System.nanoTime();
    }

    /* JADX INFO: renamed from: u */
    public void m35670u() {
        if (this.f34337a) {
            return;
        }
        this.f34354r = System.nanoTime();
    }

    /* JADX INFO: renamed from: b */
    public void m35651b(long j) {
        if (this.f34337a) {
            return;
        }
        this.f34346j = (System.nanoTime() - this.f34361y) / 1000000;
        this.f34340d = j;
    }

    /* JADX INFO: renamed from: a */
    public void m35649a(boolean z) {
        this.f34337a = z;
        if (z) {
            this.f34338b++;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35646a(long j) {
        if (this.f34337a) {
            return;
        }
        this.f34344h = (System.nanoTime() - this.f34357u) / 1000000;
        this.f34339c = j;
    }

    /* JADX INFO: renamed from: a */
    public void m35644a() {
        if (this.f34337a) {
            return;
        }
        m35660k();
    }

    /* JADX INFO: renamed from: a */
    public void m35647a(IOException iOException) {
        if (this.f34337a) {
            return;
        }
        m35660k();
    }

    /* JADX INFO: renamed from: a */
    public void m35648a(String str) {
        if (f34327H) {
            try {
                int iM37747h = C13211m0.m37747h();
                int iM37779x = C13211m0.m37779x();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iM37747h));
                map.put("total_memory_mb", Integer.valueOf(iM37779x));
                m35659j().put("task_rejection", map);
            } catch (Exception e) {
                C13219q0.m37816b("NetworkRequestMonitor", "Failed to record task rejection: " + e.getMessage());
            }
        }
    }
}
