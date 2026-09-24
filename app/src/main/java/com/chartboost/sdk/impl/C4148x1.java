package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C4148x1 implements Comparable {

    /* JADX INFO: renamed from: b */
    public final EnumC4095ue f16799b;

    /* JADX INFO: renamed from: c */
    public final String f16800c;

    /* JADX INFO: renamed from: d */
    public final String f16801d;

    /* JADX INFO: renamed from: e */
    public final String f16802e;

    /* JADX INFO: renamed from: f */
    public final String f16803f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f16804g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f16805h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f16806i;

    public C4148x1(EnumC4095ue enumC4095ue, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.f16799b = enumC4095ue;
        this.f16800c = str;
        this.f16801d = str2;
        this.f16802e = str3;
        this.f16804g = atomicInteger;
        this.f16805h = atomicReference;
        this.f16806i = atomicInteger2;
        this.f16803f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4148x1 c4148x1) {
        return this.f16799b.m19590b() - c4148x1.f16799b.m19590b();
    }

    /* JADX INFO: renamed from: a */
    public void m19832a(Executor executor, boolean z) {
        InterfaceC4060t1 interfaceC4060t1;
        if ((this.f16804g.decrementAndGet() == 0 || !z) && (interfaceC4060t1 = (InterfaceC4060t1) this.f16805h.getAndSet(null)) != null) {
            executor.execute(new RunnableC4082u1(interfaceC4060t1, z, this.f16806i.get()));
        }
    }
}
