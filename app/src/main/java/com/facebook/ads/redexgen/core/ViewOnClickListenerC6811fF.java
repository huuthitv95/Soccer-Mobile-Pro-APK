package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6811fF implements View.OnClickListener {
    public final /* synthetic */ C448234 A00;

    public ViewOnClickListenerC6811fF(C448234 c448234) {
        this.A00 = c448234;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(EnumC6199VH.A0x, null);
                }
                this.A00.A01.A0F().A3g();
                switch (this.A00.getVideoView().getState()) {
                    case A07:
                    case A04:
                    case A05:
                    case A06:
                        this.A00.getVideoView().A0e(EnumC6789et.A04, 12);
                        break;
                    case A0A:
                        this.A00.getVideoView().A0i(true, 8);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
