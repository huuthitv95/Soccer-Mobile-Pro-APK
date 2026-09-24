package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6436ZB implements View.OnClickListener {
    public final /* synthetic */ C5740Nm A00;
    public final /* synthetic */ C6200VI A01;
    public final /* synthetic */ InterfaceC6406Yh A02;
    public final /* synthetic */ C6437ZC A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC6436ZB(C6437ZC c6437zc, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, String str, C5740Nm c5740Nm) {
        this.A03 = c6437zc;
        this.A01 = c6200vi;
        this.A02 = interfaceC6406Yh;
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
            if (this.A03.A01.A0O(this.A03.A02.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C6307X6.A0O(new C6307X6(), this.A03.A02, AbstractC6312XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
