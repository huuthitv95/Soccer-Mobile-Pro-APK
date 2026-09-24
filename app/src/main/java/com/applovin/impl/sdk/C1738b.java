package com.applovin.impl.sdk;

import com.applovin.impl.C1593j7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1783u1;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.applovin.impl.sdk.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1738b {

    /* JADX INFO: renamed from: a */
    private final C1748l f2928a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f2929b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f2930c;

    /* JADX INFO: renamed from: d */
    private C1593j7 f2931d;

    private C1738b(InterfaceC1783u1 interfaceC1783u1, C1734a.a aVar, C1748l c1748l) {
        this.f2929b = new WeakReference(interfaceC1783u1);
        this.f2930c = new WeakReference(aVar);
        this.f2928a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    public static C1738b m4580a(InterfaceC1783u1 interfaceC1783u1, C1734a.a aVar, C1748l c1748l) {
        C1738b c1738b = new C1738b(interfaceC1783u1, aVar, c1748l);
        c1738b.m4583a(interfaceC1783u1.getTimeToLiveMillis());
        return c1738b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m4581c() {
        m4585d();
        this.f2928a.m4828f().m4429a(this);
    }

    /* JADX INFO: renamed from: a */
    public void m4582a() {
        C1593j7 c1593j7 = this.f2931d;
        if (c1593j7 != null) {
            c1593j7.m3023a();
            this.f2931d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4583a(long j) {
        m4582a();
        if (((Boolean) this.f2928a.m4801a(C1831z4.f3905d1)).booleanValue() || !this.f2928a.m4846o0().isApplicationPaused()) {
            this.f2931d = C1593j7.m3012a(j, this.f2928a, new Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4581c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1783u1 m4584b() {
        return (InterfaceC1783u1) this.f2929b.get();
    }

    /* JADX INFO: renamed from: d */
    public void m4585d() {
        m4582a();
        InterfaceC1783u1 interfaceC1783u1M4584b = m4584b();
        if (interfaceC1783u1M4584b == null) {
            return;
        }
        interfaceC1783u1M4584b.setExpired();
        C1734a.a aVar = (C1734a.a) this.f2930c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(interfaceC1783u1M4584b);
    }
}
