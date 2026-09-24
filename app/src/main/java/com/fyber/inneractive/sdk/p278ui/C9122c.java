package com.fyber.inneractive.sdk.p278ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.C7809R;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9122c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnimatorSet f21416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FyberAdIdentifierLocal f21417b;

    public C9122c(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f21417b = fyberAdIdentifierLocal;
        this.f21416a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f21417b;
        if (fyberAdIdentifierLocal.f21392o) {
            fyberAdIdentifierLocal.f21390m.setImageResource(C7809R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f21417b;
            FyberAdIdentifierLocal.m21930a(fyberAdIdentifierLocal2.f21390m, fyberAdIdentifierLocal2.f21408g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f21395r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f21390m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f21390m.setImageResource(C7809R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.m21930a(this.f21417b.f21390m, null);
        }
        this.f21416a.start();
        this.f21417b.f21393p = this.f21416a;
    }
}
