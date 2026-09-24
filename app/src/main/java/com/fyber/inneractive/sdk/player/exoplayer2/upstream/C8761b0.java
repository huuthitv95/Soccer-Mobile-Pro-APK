package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8726k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.ThreadFactoryC8826y;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8761b0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f20452a;

    /* JADX INFO: renamed from: b */
    public HandlerC8800y f20453b;

    /* JADX INFO: renamed from: c */
    public IOException f20454c;

    public C8761b0(String str) {
        int i = AbstractC8827z.f20671a;
        this.f20452a = Executors.newSingleThreadExecutor(new ThreadFactoryC8826y(str));
    }

    /* JADX INFO: renamed from: a */
    public final void m21286a(RunnableC8726k runnableC8726k) {
        HandlerC8800y handlerC8800y = this.f20453b;
        if (handlerC8800y != null) {
            handlerC8800y.m21318a(true);
        }
        if (runnableC8726k != null) {
            this.f20452a.execute(runnableC8726k);
        }
        this.f20452a.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21287a() {
        return this.f20453b != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m21288b() throws IOException {
        IOException iOException = this.f20454c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC8800y handlerC8800y = this.f20453b;
        if (handlerC8800y != null) {
            int i = handlerC8800y.f20602c;
            IOException iOException2 = handlerC8800y.f20604e;
            if (iOException2 != null && handlerC8800y.f20605f > i) {
                throw iOException2;
            }
        }
    }
}
