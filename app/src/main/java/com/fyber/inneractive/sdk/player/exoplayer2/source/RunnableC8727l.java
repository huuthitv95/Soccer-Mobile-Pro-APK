package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.controller.C8463f;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.l */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8727l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IOException f20357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8731p f20358b;

    public RunnableC8727l(C8731p c8731p, IOException iOException) {
        this.f20358b = c8731p;
        this.f20357a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8456b0 c8456b0 = this.f20358b.f20385e;
        IOException iOException = this.f20357a;
        if (((C8463f) c8456b0.f18822a.get()) != null) {
            iOException.getCause();
        }
    }
}
