package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6923h3 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C6008SA A01;
    public final /* synthetic */ C6140UK A02;

    public C6923h3(C6008SA c6008sa, C6140UK c6140uk, Drawable drawable) {
        this.A01 = c6008sa;
        this.A02 = c6140uk;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A02.A1P(this.A00);
    }
}
