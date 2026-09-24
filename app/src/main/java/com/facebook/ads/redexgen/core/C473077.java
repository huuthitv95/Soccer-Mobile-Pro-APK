package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C473077 extends C6948hS {
    public C473077(C5976Re c5976Re) {
        super(c5976Re);
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final /* bridge */ /* synthetic */ void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A44(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final /* bridge */ /* synthetic */ void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A45(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final void A4j(String str) {
        super.A4j(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC6795ez.A08.A03();
        String rewardedVideoError = EnumC6795ez.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final /* bridge */ /* synthetic */ void A4k(String str, C6141UL c6141ul) {
        super.A4k(str, c6141ul);
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final /* bridge */ /* synthetic */ void AAo(String str, C5740Nm c5740Nm) {
        super.AAo(str, c5740Nm);
    }

    @Override // com.facebook.ads.redexgen.core.C6948hS, com.facebook.ads.redexgen.core.InterfaceC6406Yh
    public final /* bridge */ /* synthetic */ void ADJ(int i) {
        super.ADJ(i);
    }
}
