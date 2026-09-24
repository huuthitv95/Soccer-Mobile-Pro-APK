package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5G */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C46155G extends AbstractC5145E8 {
    public final /* synthetic */ C46145F A00;

    public C46155G(C46145F c46145f) {
        this.A00 = c46145f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5146E9 c5146e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC6707dY(this));
    }
}
