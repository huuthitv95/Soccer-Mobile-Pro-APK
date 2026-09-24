package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.di */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6717di implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ C460455 A00;

    public ViewOnClickListenerC6717di(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0S instanceof C479085) {
                if (!this.A00.A0D) {
                    this.A00.A0Z.ACQ();
                    this.A00.A0E = true;
                    this.A00.A0p(((C479085) this.A00.A0S).A0M().toString());
                    long jA0q = ((AbstractC5428Ij) this.A00).A06.A0q();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (jA0q >= 0) {
                        this.A00.A0P.postDelayed(this.A00.A0l, ((AbstractC5428Ij) this.A00).A06.A0q());
                    }
                }
                this.A00.A0u(this.A00.A0D ? false : true);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
