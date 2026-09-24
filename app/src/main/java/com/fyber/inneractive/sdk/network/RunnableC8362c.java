package com.fyber.inneractive.sdk.network;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8362c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f18627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8373f f18628c;

    public RunnableC8362c(C8373f c8373f, int i, long j) {
        this.f18628c = c8373f;
        this.f18626a = i;
        this.f18627b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18628c.f18645d.sendEmptyMessageDelayed(this.f18626a, this.f18627b);
    }
}
