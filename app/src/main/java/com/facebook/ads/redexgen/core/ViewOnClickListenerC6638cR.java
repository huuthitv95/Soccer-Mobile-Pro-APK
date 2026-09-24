package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6638cR implements View.OnClickListener {
    public final /* synthetic */ C5521KE A00;

    public ViewOnClickListenerC6638cR(C5521KE c5521ke) {
        this.A00 = c5521ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0M) {
                this.A00.A0N = true;
                if (this.A00.A0b != null) {
                    this.A00.A0f(((C479085) this.A00.A0b).A0M().toString());
                }
                if (this.A00.A0E.A0q() >= 0) {
                    this.A00.A08.postDelayed(this.A00.A0h, this.A00.A0E.A0q());
                }
            }
            this.A00.A0i(this.A00.A0M ? false : true);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
