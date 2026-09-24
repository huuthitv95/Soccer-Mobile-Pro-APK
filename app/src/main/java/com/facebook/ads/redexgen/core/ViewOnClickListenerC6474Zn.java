package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6474Zn implements View.OnClickListener {
    public final /* synthetic */ C6468Zh A00;
    public final /* synthetic */ C5644MD A01;

    public ViewOnClickListenerC6474Zn(C5644MD c5644md, C6468Zh c6468Zh) {
        this.A01 = c5644md;
        this.A00 = c6468Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC5798Oi.A04);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
