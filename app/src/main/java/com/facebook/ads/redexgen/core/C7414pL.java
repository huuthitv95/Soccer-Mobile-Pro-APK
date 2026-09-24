package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7414pL implements InterfaceC454245 {
    @Override // com.facebook.ads.redexgen.core.InterfaceC454245
    public final C7412pJ A5P(Looper looper, Handler.Callback callback) {
        return new C7412pJ(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC454245
    public final long A6J() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC454245
    public final long AKe() {
        return SystemClock.uptimeMillis();
    }
}
