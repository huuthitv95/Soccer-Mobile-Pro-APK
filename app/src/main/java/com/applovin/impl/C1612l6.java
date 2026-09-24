package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.applovin.impl.l6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1612l6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final WeakReference f2016g;

    /* JADX INFO: renamed from: h */
    private final Object f2017h;

    protected C1612l6(C1786u4 c1786u4, Object obj, String str, C1748l c1748l) {
        super(str, c1748l);
        this.f2016g = new WeakReference(c1786u4);
        this.f2017h = obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m3141a(long j, C1786u4 c1786u4, Object obj, String str, C1748l c1748l) {
        if (j <= 0) {
            return;
        }
        c1748l.m4853s0().m2605a(new C1612l6(c1786u4, obj, str, c1748l), C1552f6.b.TIMEOUT, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C1786u4 c1786u4 = (C1786u4) this.f2016g.get();
        if (c1786u4 == null || c1786u4.m5307d()) {
            return;
        }
        this.f1969a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1969a.m4782Q().m5175d(this.f1970b, "Attempting to timeout pending task " + c1786u4.m5306c() + " with " + this.f2017h);
        }
        c1786u4.m5305c(this.f2017h);
    }
}
