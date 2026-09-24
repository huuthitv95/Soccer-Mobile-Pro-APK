package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5195Ew {
    public InterfaceC5194Ev A00;
    public InterfaceC5205F6 A01;

    public abstract boolean A0Y();

    public abstract C5196Ex A0b(InterfaceC47747p[] interfaceC47747pArr, C7302nW c7302nW, C7320no c7320no, Timeline timeline) throws C4904AD;

    public abstract void A0c(Object obj);

    public final InterfaceC5205F6 A00() {
        return (InterfaceC5205F6) AbstractC45353y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC5194Ev interfaceC5194Ev, InterfaceC5205F6 interfaceC5205F6) {
        this.A00 = interfaceC5194Ev;
        this.A01 = interfaceC5205F6;
    }
}
