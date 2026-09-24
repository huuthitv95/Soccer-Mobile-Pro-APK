package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5216FH extends AbstractC5926Qq<C5211FC> {
    public final int A00;
    public final C6902gi A01;
    public final ViewOnClickListenerC5560Kr A02;
    public final List<String> A03;

    public C5216FH(C6902gi c6902gi, List<String> screenshotUrls, int i, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c6902gi;
        this.A02 = viewOnClickListenerC5560Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C5211FC A0F(ViewGroup viewGroup, int i) {
        C5212FD c5212fd = new C5212FD(this.A01);
        if (C6171Up.A1D(this.A01)) {
            c5212fd.setOnClickListener(new ViewOnClickListenerC6769eZ(this));
        }
        return new C5211FC(c5212fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(C5211FC c5211fc, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        c5211fc.A0p().setLayoutParams(marginLayoutParams);
        c5211fc.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final int A0B() {
        return this.A03.size();
    }
}
