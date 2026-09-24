package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5190Er extends AbstractRunnableC6279Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5183Ek A02;
    public final /* synthetic */ EnumC6844fm A03;

    public C5190Er(C5183Ek c5183Ek, EnumC6844fm enumC6844fm, int i, int i2) {
        this.A02 = c5183Ek;
        this.A03 = enumC6844fm;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A03 == EnumC6844fm.A07) {
            this.A02.A0M(EnumC6199VH.A0y);
            this.A02.A0B.A0F().A3j();
            this.A02.A0C.A02(C5183Ek.A0J);
            return;
        }
        if (this.A03 == EnumC6844fm.A03) {
            this.A02.A0M(EnumC6199VH.A0t);
            this.A02.A04 = true;
            this.A02.A0C.A02(C5183Ek.A0H);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC6844fm.A06) {
            this.A02.A0M(EnumC6199VH.A0s);
            this.A02.A0B.A0F().A3b();
            this.A02.A04 = true;
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0C.A02(new C45574K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC6844fm.A0A) {
            if (C6171Up.A1z(this.A02.A0B)) {
                this.A02.A0B.A0B().AGc();
            }
            this.A02.A0M(EnumC6199VH.A0w);
            this.A02.A0B.A0F().A3q();
            this.A02.A0C.A02(C5183Ek.A0I);
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC6844fm.A05) {
            this.A02.A0M(EnumC6199VH.A0v);
            this.A02.A0B.A0F().A3f();
            C6142UM c6142um = this.A02.A0C;
            final int i = this.A00;
            c6142um.A02(new AbstractC5148EB(i) { // from class: com.facebook.ads.redexgen.X.4B
            });
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC6844fm.A04) {
            this.A02.A0M(EnumC6199VH.A0u);
            this.A02.A0B.A0F().A3c();
            this.A02.A0C.A02(C5183Ek.A0L);
            this.A02.A08.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC6844fm.A09) {
            this.A02.A0M(EnumC6199VH.A0s);
            this.A02.A0B.A0F().A3l();
            this.A02.A04 = true;
            this.A02.A08.removeCallbacksAndMessages(null);
            this.A02.A0C.A02(new C45574K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
