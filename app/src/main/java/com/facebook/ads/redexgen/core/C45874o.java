package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45874o extends BroadcastReceiver {
    public final /* synthetic */ C45884p A00;

    public C45874o(C45884p c45884p) {
        this.A00 = c45884p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C45884p.A00(context);
        if (AbstractC46115C.A02 >= 31 && iA00 == 5) {
            C45854m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
