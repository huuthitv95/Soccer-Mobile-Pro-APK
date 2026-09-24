package com.chartboost.sdk.impl;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u1 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC4082u1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final InterfaceC4060t1 f16431b;

    /* JADX INFO: renamed from: c */
    public final boolean f16432c;

    public RunnableC4082u1(InterfaceC4060t1 interfaceC4060t1, boolean z, int i) {
        this.f16431b = interfaceC4060t1;
        this.f16432c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16431b.mo16798a(this.f16432c);
    }
}
