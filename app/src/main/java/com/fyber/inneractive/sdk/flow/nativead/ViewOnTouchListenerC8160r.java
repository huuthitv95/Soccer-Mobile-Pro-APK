package com.fyber.inneractive.sdk.flow.nativead;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.flow.C8235w0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.r */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC8160r extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f18172a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8166u f18173b;

    /* JADX INFO: renamed from: c */
    public String f18174c;

    public ViewOnTouchListenerC8160r(Context context, InterfaceC8166u interfaceC8166u) {
        this.f18173b = interfaceC8166u;
        this.f18172a = new GestureDetector(context, this);
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
        ((C8235w0) this.f18173b).m20638b(this.f18174c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f18174c = view.getTag() instanceof String ? view.getTag().toString() : null;
        return this.f18172a.onTouchEvent(motionEvent);
    }
}
