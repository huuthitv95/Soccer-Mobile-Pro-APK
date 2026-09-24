package com.fyber.inneractive.sdk.network;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.s0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8413s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f18707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Exception f18708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC8416t0 f18710d;

    public RunnableC8413s0(AbstractC8416t0 abstractC8416t0, Object obj, Exception exc, boolean z) {
        this.f18710d = abstractC8416t0;
        this.f18707a = obj;
        this.f18708b = exc;
        this.f18709c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18710d.f18712b.mo20331a(this.f18707a, this.f18708b, this.f18709c);
    }
}
