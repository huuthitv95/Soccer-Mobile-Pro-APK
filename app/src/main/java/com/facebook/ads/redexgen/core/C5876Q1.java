package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Q1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5876Q1 extends AbstractRunnableC6279Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC6390YR A01;

    public C5876Q1(DialogInterfaceOnClickListenerC6390YR dialogInterfaceOnClickListenerC6390YR, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC6390YR;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AGx(AbstractC6260WI.A03(this.A01.A01.A00), new C6867g9().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
