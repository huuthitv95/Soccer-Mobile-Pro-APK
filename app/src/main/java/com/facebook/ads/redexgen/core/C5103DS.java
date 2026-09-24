package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5103DS implements InterfaceC6816fK {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC6815fJ A02 = EnumC6815fJ.A04;

    public C5103DS(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        AbstractC6374YB.A0V(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC6815fJ.A05;
            AbstractC6374YB.A0V(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C5106DV(this), this.A03);
            return;
        }
        AbstractC6374YB.A0V(this.A07, this.A05);
        this.A02 = EnumC6815fJ.A04;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC6815fJ.A03;
            AbstractC6374YB.A0V(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C5109DY(this), this.A03);
            return;
        }
        AbstractC6374YB.A0V(this.A07, this.A04);
        this.A02 = EnumC6815fJ.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6816fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6816fK
    public final EnumC6815fJ A9B() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6816fK
    public final void cancel() {
        EnumC6815fJ enumC6815fJ;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC6815fJ.A03) {
            enumC6815fJ = EnumC6815fJ.A04;
        } else {
            enumC6815fJ = EnumC6815fJ.A02;
        }
        this.A02 = enumC6815fJ;
    }
}
