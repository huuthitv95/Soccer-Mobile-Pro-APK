package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0w */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C43520w extends C43751J {
    public C46946X A00;
    public List<C6740e5> A01;

    public C43520w(C6902gi c6902gi) {
        super(c6902gi);
        this.A00 = new C46946X(this, 1, null, null, null);
    }

    public final void A20(C6847fp c6847fp) {
        if (this.A00 != null) {
            this.A00.A0c(c6847fp);
        }
    }

    public C46946X getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
