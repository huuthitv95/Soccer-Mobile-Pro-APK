package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6050Sr extends AbstractRunnableC6279Wc {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6252WA A01;
    public final /* synthetic */ C6255WD A02;
    public final /* synthetic */ String A03;

    public C6050Sr(C6255WD c6255wd, String str, long j, C6252WA c6252wa) {
        this.A02 = c6255wd;
        this.A03 = str;
        this.A00 = j;
        this.A01 = c6252wa;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
