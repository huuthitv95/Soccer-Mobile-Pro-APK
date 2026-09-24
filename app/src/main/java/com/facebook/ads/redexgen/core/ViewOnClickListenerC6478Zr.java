package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6478Zr implements View.OnClickListener {
    public final /* synthetic */ C5800Ok A00;
    public final /* synthetic */ C6468Zh A01;
    public final /* synthetic */ C5644MD A02;

    public ViewOnClickListenerC6478Zr(C5644MD c5644md, C6468Zh c6468Zh, C5800Ok c5800Ok) {
        this.A02 = c5644md;
        this.A01 = c6468Zh;
        this.A00 = c5800Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
