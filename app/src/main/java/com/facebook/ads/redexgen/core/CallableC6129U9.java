package com.facebook.ads.redexgen.core;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.U9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC6129U9 implements Callable<Boolean> {
    public final /* synthetic */ C6290Wn A00;
    public final /* synthetic */ String A01;

    public CallableC6129U9(C6290Wn c6290Wn, String str) {
        this.A00 = c6290Wn;
        this.A01 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        this.A00.A05();
        synchronized (C6131UB.A04) {
            C6131UB.A04.put(this.A01, 2);
        }
        return true;
    }
}
