package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC5902QR implements Runnable {
    public final /* synthetic */ C47487P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC5902QR(C47487P c47487p, ArrayList arrayList) {
        this.A00 = c47487p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C5911Qa c5911Qa : this.A01) {
            this.A00.A0e(c5911Qa.A04, c5911Qa.A00, c5911Qa.A01, c5911Qa.A02, c5911Qa.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
