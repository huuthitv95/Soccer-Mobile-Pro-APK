package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC6559bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC6560bB A00;

    public ViewOnTouchListenerC6559bA(ViewOnClickListenerC6560bB viewOnClickListenerC6560bB) {
        this.A00 = viewOnClickListenerC6560bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
