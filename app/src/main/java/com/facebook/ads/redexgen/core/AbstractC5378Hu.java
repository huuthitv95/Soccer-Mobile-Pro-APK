package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5378Hu {
    public final InterfaceC5361Hd A00;

    public abstract boolean A0B(C45944v c45944v) throws C44963K;

    public abstract boolean A0C(C45944v c45944v, long j) throws C44963K;

    public AbstractC5378Hu(InterfaceC5361Hd interfaceC5361Hd) {
        this.A00 = interfaceC5361Hd;
    }

    public final boolean A00(C45944v c45944v, long j) throws C44963K {
        return A0B(c45944v) && A0C(c45944v, j);
    }
}
