package com.fyber.inneractive.sdk.player.p277ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.r */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC8894r implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GestureDetector f20921a;

    public ViewOnTouchListenerC8894r(GestureDetector gestureDetector) {
        this.f20921a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f20921a.onTouchEvent(motionEvent);
    }
}
