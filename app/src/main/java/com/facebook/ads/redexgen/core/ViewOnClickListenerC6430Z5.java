package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Z5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6430Z5 implements View.OnClickListener {
    public final /* synthetic */ C5716NO A00;

    public ViewOnClickListenerC6430Z5(C5716NO c5716no) {
        this.A00 = c5716no;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0T.A04(EnumC6199VH.A07, null);
            this.A00.A0W.A4j(this.A00.A0X.A7w());
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
