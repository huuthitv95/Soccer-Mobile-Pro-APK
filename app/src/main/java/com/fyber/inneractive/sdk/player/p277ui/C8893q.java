package com.fyber.inneractive.sdk.player.p277ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.util.C9152g1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8893q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f20917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int[] f20918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f20919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC8902s f20920d;

    public C8893q(AbstractC8902s abstractC8902s, View view, int[] iArr, int i) {
        this.f20920d = abstractC8902s;
        this.f20917a = view;
        this.f20918b = iArr;
        this.f20919c = i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20917a.getRootView().getLocationOnScreen(this.f20918b);
            float rawX = motionEvent.getRawX() - this.f20918b[0];
            float rawY = motionEvent.getRawY() - this.f20918b[1];
            C9152g1 c9152g1 = this.f20920d.f20876a;
            c9152g1.f21450a = rawX;
            c9152g1.f21451b = rawY;
        }
        AbstractC8902s abstractC8902s = this.f20920d;
        InterfaceC8890n interfaceC8890n = abstractC8902s.f20882g;
        if (interfaceC8890n != null) {
            ((AbstractC8485z) interfaceC8890n).m20932a(this.f20919c, abstractC8902s.f20876a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
