package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8774k extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConditionVariable f20506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8775l f20507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8774k(C8775l c8775l, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f20507b = c8775l;
        this.f20506a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f20507b) {
            this.f20506a.open();
            try {
                C8775l.m21299a(this.f20507b);
            } catch (C8764a e) {
                this.f20507b.f20513f = e;
            }
            this.f20507b.f20509b.getClass();
        }
    }
}
