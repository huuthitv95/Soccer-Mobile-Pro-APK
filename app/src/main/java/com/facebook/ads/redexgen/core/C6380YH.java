package com.facebook.ads.redexgen.core;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6380YH extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC6381YI A02;
    public final /* synthetic */ ViewOnTouchListenerC6382YJ A03;

    public C6380YH(ViewOnTouchListenerC6382YJ viewOnTouchListenerC6382YJ, InterfaceC6381YI interfaceC6381YI, int i, int i2) {
        this.A03 = viewOnTouchListenerC6382YJ;
        this.A02 = interfaceC6381YI;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float diffX = motionEvent2.getX() - motionEvent.getX();
        float diffY = Math.abs(y);
        if (diffY > Math.abs(diffX) && y > this.A00) {
            float diffY2 = Math.abs(f2);
            if (diffY2 > this.A01) {
                this.A02.AG8();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A02.AFx();
        return true;
    }
}
