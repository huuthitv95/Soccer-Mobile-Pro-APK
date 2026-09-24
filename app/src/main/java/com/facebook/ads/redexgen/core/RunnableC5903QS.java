package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC5903QS implements Runnable {
    public final /* synthetic */ C47487P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC5903QS(C47487P c47487p, ArrayList arrayList) {
        this.A00 = c47487p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C5910QZ change : this.A01) {
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
