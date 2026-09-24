package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5273GD implements InterfaceC6733dy {
    public final /* synthetic */ C5271GB A00;

    public C5273GD(C5271GB c5271gb) {
        this.A00 = c5271gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6733dy
    public final void AIY() {
        this.A00.A0B();
        if (!this.A00.A0E || this.A00.A01 == null) {
            if (this.A00.A07 == null) {
                this.A00.A0C.A4j(this.A00.A0D.A81());
                this.A00.A0C.A4j(this.A00.A0D.A7w());
                return;
            }
            this.A00.A04 = this.A00.A05(this.A00.A0D, this.A00.A07, Boolean.valueOf(this.A00.A05.A1n()));
            if (this.A00.A02 != null && this.A00.A00 != null) {
                this.A00.A04.AAu(this.A00.A02, this.A00.A03, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof C5663MW) {
            this.A00.A04 = this.A00.A01;
            ((C5663MW) this.A00.A04).A0b();
        }
    }
}
