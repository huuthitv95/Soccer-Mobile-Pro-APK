package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4917AQ implements InterfaceC7408pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C46435i A01;
    public final ArrayList<InterfaceC46545t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public /* synthetic */ Map A8t() {
        return AbstractC46325X.A00(this);
    }

    public AbstractC4917AQ(boolean z) {
        this.A03 = z;
    }

    @MetaExoPlayerCustomization
    private final void A0D(C46435i c46435i, boolean z) {
        this.A01 = c46435i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c46435i, this.A03, z);
        }
    }

    public final void A0E() {
        C46435i c46435i = (C46435i) AbstractC46115C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c46435i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        C46435i c46435i = (C46435i) AbstractC46115C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).ADK(this, c46435i, this.A03, i);
        }
    }

    public final void A0G(C46435i c46435i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C46435i c46435i) {
        A0D(c46435i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void A43(InterfaceC46545t interfaceC46545t) {
        AbstractC45353y.A01(interfaceC46545t);
        if (!this.A02.contains(interfaceC46545t)) {
            this.A02.add(interfaceC46545t);
            this.A00++;
        }
    }
}
