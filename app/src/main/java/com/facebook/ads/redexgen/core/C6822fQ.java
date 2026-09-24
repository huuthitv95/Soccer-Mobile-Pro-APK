package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6822fQ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5086DB A02;

    public C6822fQ(C5086DB c5086db, int i, int i2) {
        this.A02 = c5086db;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC6815fJ enumC6815fJ;
        C5086DB c5086db = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC6815fJ = EnumC6815fJ.A02;
        } else {
            enumC6815fJ = EnumC6815fJ.A04;
        }
        c5086db.A01 = enumC6815fJ;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
