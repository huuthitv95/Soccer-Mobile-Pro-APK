package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n;
import com.fyber.inneractive.sdk.util.C9152g1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.e */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC8087e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final int f17989a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8890n f17990b;

    /* JADX INFO: renamed from: c */
    public final int[] f17991c = new int[2];

    /* JADX INFO: renamed from: d */
    public final C9152g1 f17992d = new C9152g1();

    public ViewOnTouchListenerC8087e(int i, InterfaceC8890n interfaceC8890n) {
        this.f17989a = i;
        this.f17990b = interfaceC8890n;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getRootView().getLocationOnScreen(this.f17991c);
        float rawX = motionEvent.getRawX() - this.f17991c[0];
        float rawY = motionEvent.getRawY() - this.f17991c[1];
        C9152g1 c9152g1 = this.f17992d;
        c9152g1.f21450a = rawX;
        c9152g1.f21451b = rawY;
        ((AbstractC8485z) this.f17990b).m20932a(this.f17989a, c9152g1);
        return true;
    }
}
