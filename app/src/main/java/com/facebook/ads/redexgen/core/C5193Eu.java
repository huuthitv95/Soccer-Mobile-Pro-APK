package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5193Eu implements InterfaceC6779ej {
    public final C6902gi A01;
    public final InterfaceC6192VA A02;
    public final C6776eg A03;
    public final C5183Ek A04;
    public final String A07;
    public final AbstractC5141E4 A06 = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C45484B c45484b) {
            if (this.A00.A00.booleanValue()) {
                return;
            }
            this.A00.A01.A0F().AJ2();
            this.A00.A08();
        }
    };
    public final AbstractC5147EA A05 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C45574K c45574k) {
            if (!this.A00.A00.booleanValue()) {
                this.A00.A01.A0F().AJ0();
                this.A00.A08();
            }
            this.A00.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C5193Eu(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C5183Ek c5183Ek, String str, boolean z, C5152EF c5152ef, Map<String, String> extraParams) {
        this.A01 = c6902gi;
        this.A02 = interfaceC6192VA;
        this.A07 = str;
        this.A04 = c5183Ek;
        this.A03 = new C6776eg(c5183Ek, str, z, extraParams);
        if (C6171Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            c5152ef.A0m(this);
        } else {
            this.A01.A0F().AIy();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        C5200F1 c5200f1 = new C5200F1(this);
        if (this.A04.A0q()) {
            ExecutorC6367Y4.A00(c5200f1);
        } else {
            this.A04.getStateHandler().post(c5200f1);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6779ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
