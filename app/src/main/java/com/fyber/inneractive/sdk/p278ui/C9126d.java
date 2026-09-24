package com.fyber.inneractive.sdk.p278ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9126d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f21420a;

    public C9126d(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f21420a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f21420a;
        fyberAdIdentifierLocal.f21393p = null;
        fyberAdIdentifierLocal.f21392o = !fyberAdIdentifierLocal.f21392o;
    }
}
