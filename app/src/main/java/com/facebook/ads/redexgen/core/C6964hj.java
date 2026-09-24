package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6964hj implements InterfaceC5959RN {
    public final /* synthetic */ AbstractC5938R2 A00;

    public C6964hj(AbstractC5938R2 abstractC5938R2) {
        this.A00 = abstractC5938R2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5959RN
    public final View A7H(int i) {
        return this.A00.A0v(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5959RN
    public final int A7J(View view) {
        return this.A00.A0p(view) + ((C5939R3) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5959RN
    public final int A7K(View view) {
        return this.A00.A0m(view) - ((C5939R3) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5959RN
    public final int A8g() {
        return this.A00.A0j() - this.A00.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5959RN
    public final int A8h() {
        return this.A00.A0g();
    }
}
