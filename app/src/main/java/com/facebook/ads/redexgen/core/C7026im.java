package com.facebook.ads.redexgen.core;

import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.im */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7026im extends AbstractRunnableC6266WP {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC7024ik A01;

    public C7026im(AbstractC7024ik abstractC7024ik, Message message) {
        this.A01 = abstractC7024ik;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6266WP
    public final void A01() {
        this.A01.A05.A9j(this.A00);
    }
}
