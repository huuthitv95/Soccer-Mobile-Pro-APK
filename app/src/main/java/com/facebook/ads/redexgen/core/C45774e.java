package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4e */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C45774e extends AbstractC5145E8 {
    public final /* synthetic */ C45684V A00;

    public C45774e(C45684V c45684v) {
        this.A00 = c45684v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5146E9 c5146e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC6729du(this));
    }
}
