package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC5904QT implements Runnable {
    public final /* synthetic */ C47487P A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC5904QT(C47487P c47487p, ArrayList arrayList) {
        this.A00 = c47487p;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (AbstractC5956RK holder : this.A01) {
            this.A00.A0d(holder);
        }
        this.A01.clear();
        this.A00.A01.remove(this.A01);
    }
}
