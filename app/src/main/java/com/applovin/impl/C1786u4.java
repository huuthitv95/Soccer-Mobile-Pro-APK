package com.applovin.impl;

import androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.applovin.impl.u4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1786u4 {

    /* JADX INFO: renamed from: i */
    public static final Executor f3414i = new Executor() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Executor f3415j = new DefaultDownloaderFactory$$ExternalSyntheticLambda0();

    /* JADX INFO: renamed from: b */
    private final String f3417b;

    /* JADX INFO: renamed from: g */
    private volatile Object f3422g;

    /* JADX INFO: renamed from: h */
    private volatile Object f3423h;

    /* JADX INFO: renamed from: a */
    private final Object f3416a = new Object();

    /* JADX INFO: renamed from: c */
    private final List f3418c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private volatile boolean f3419d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f3420e = false;

    /* JADX INFO: renamed from: f */
    private volatile boolean f3421f = false;

    /* JADX INFO: renamed from: com.applovin.impl.u4$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3283a(Object obj);
    }

    /* JADX INFO: renamed from: com.applovin.impl.u4$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2509a(boolean z, Object obj, Object obj2);
    }

    public C1786u4(String str) {
        this.f3417b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1786u4 m5290a(String str, Object obj) {
        return new C1786u4(str).m5303b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5291a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.mo3283a(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5292a(b bVar) {
        try {
            bVar.mo2509a(this.f3420e, this.f3422g, this.f3423h);
        } catch (Throwable th) {
            m5294a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5293a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5294a(Throwable th) {
        AbstractC1617m1.m3170a(th);
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l != null) {
            c1748l.m4764E().m4329a("Promise", "PromiseCallback: " + m5306c(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5295a(boolean z, Object obj, Object obj2, boolean z2) {
        synchronized (this.f3416a) {
            if (this.f3419d) {
                return;
            }
            this.f3422g = obj;
            this.f3423h = obj2;
            this.f3420e = z;
            this.f3421f = z2;
            this.f3419d = true;
            Iterator it = this.f3418c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f3418c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m5296b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m5292a(bVar);
                }
            });
        } catch (Throwable th) {
            m5294a(th);
        }
    }

    /* JADX INFO: renamed from: c */
    private Runnable m5297c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5296b(executor, bVar);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public C1786u4 m5298a(Object obj) {
        m5295a(false, (Object) null, obj, false);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m5299a(Executor executor, final a aVar) {
        m5300a(executor, new b() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.C1786u4.b
            /* JADX INFO: renamed from: a */
            public final void mo2509a(boolean z, Object obj, Object obj2) {
                C1786u4.m5291a(aVar, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m5300a(Executor executor, b bVar) {
        Runnable runnableM5297c = m5297c(executor, bVar);
        synchronized (this.f3416a) {
            if (this.f3419d) {
                runnableM5297c.run();
            } else {
                this.f3418c.add(runnableM5297c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5301a(Executor executor, final Runnable runnable) {
        m5300a(executor, new b() { // from class: com.applovin.impl.u4$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.C1786u4.b
            /* JADX INFO: renamed from: a */
            public final void mo2509a(boolean z, Object obj, Object obj2) {
                C1786u4.m5293a(runnable, z, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public boolean m5302a() {
        return this.f3419d && this.f3421f;
    }

    /* JADX INFO: renamed from: b */
    public C1786u4 m5303b(Object obj) {
        m5295a(true, obj, (Object) null, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Object m5304b() {
        AbstractC1617m1.m3174a(m5308e());
        return this.f3423h;
    }

    /* JADX INFO: renamed from: c */
    public C1786u4 m5305c(Object obj) {
        m5295a(false, (Object) null, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m5306c() {
        String str = this.f3417b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: renamed from: d */
    public boolean m5307d() {
        return this.f3419d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m5308e() {
        return this.f3419d && !this.f3420e;
    }

    public String toString() {
        String str;
        if (!this.f3419d) {
            str = "Waiting";
        } else if (this.f3420e) {
            str = "Success -> " + this.f3422g;
        } else {
            str = "Failed -> " + this.f3423h;
        }
        return "Promise(" + m5306c() + ": " + str + ")";
    }
}
