package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C47116o extends AbstractC5145E8 {
    public final /* synthetic */ C47036g A00;

    public C47116o(C47036g c47036g) {
        this.A00 = c47036g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5146E9 c5146e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC6422Yx(this));
    }
}
