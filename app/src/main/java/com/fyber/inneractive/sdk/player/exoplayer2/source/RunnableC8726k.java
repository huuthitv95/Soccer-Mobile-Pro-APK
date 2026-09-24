package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.k */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8726k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8729n f20355a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8731p f20356b;

    public RunnableC8726k(C8731p c8731p, C8729n c8729n) {
        this.f20356b = c8731p;
        this.f20355a = c8729n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8729n c8729n = this.f20355a;
        if (c8729n.f20371c != null) {
            c8729n.f20371c = null;
        }
        int size = this.f20356b.f20395o.size();
        for (int i = 0; i < size; i++) {
            ((C8538g) this.f20356b.f20395o.valueAt(i)).m21056b();
        }
    }
}
