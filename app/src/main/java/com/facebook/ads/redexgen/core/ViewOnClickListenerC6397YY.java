package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6397YY implements View.OnClickListener {
    public final /* synthetic */ C5740Nm A00;
    public final /* synthetic */ C6200VI A01;
    public final /* synthetic */ C6398YZ A02;
    public final /* synthetic */ InterfaceC6406Yh A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC6397YY(C6398YZ c6398yz, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, String str, C5740Nm c5740Nm) {
        this.A02 = c6398yz;
        this.A01 = c6200vi;
        this.A03 = interfaceC6406Yh;
        this.A04 = str;
        this.A00 = c5740Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC6199VH.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C6307X6.A0O(new C6307X6(), this.A02.A03, AbstractC6312XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
