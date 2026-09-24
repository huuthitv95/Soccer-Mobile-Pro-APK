package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC6051Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C6056Sx A01;

    public CallableC6051Ss(C6056Sx c6056Sx, C6052St c6052St) {
        this.A01 = c6056Sx;
        new Handler(Looper.getMainLooper()).post(new C6905gl(this, c6056Sx, c6052St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6052St c6052St) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6833fb c6833fbA06 = C6833fb.A06(this.A01.A04.A02());
        Uri uriA00 = AbstractC6312XB.A00(c6052St.A08);
        long jA0S = c6052St.A00;
        if (jA0S == -1) {
            jA0S = C6171Up.A0S(this.A01.A04);
        }
        c6833fbA06.A0I(uriA00, new C6904gk(this, c6052St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
