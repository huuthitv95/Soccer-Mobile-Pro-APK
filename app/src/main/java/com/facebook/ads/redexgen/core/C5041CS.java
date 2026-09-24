package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5041CS extends BroadcastReceiver {
    public final /* synthetic */ C5046CX A00;

    public C5041CS(C5046CX c5046cx) {
        this.A00 = c5046cx;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
