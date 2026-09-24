package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m43475d2 = {"Lcom/facebook/common/clock/IntervalClock;", "Lcom/facebook/common/time/MonotonicClock;", "<init>", "()V", "nowNanos", "", "now", "fbandroid.java.com.facebook.common.clock.clock"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class C5034CK implements InterfaceC6958hc {
    public static final C5034CK A00 = new C5034CK();

    @Override // com.facebook.ads.redexgen.core.InterfaceC6958hc
    public final long ACf() {
        return SystemClock.elapsedRealtime();
    }
}
