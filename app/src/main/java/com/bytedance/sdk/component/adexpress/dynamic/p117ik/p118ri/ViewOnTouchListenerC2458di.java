package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2458di implements View.OnTouchListener {

    /* JADX INFO: renamed from: ik */
    private static int f6616ik = 10;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2454mj f6617fi;

    /* JADX INFO: renamed from: ka */
    private boolean f6618ka;

    /* JADX INFO: renamed from: lr */
    private float f6619lr;

    /* JADX INFO: renamed from: ri */
    private float f6620ri;

    public ViewOnTouchListenerC2458di(InterfaceC2454mj interfaceC2454mj) {
        this.f6617fi = interfaceC2454mj;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6620ri = motionEvent.getX();
            this.f6619lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f6620ri) >= f6616ik || Math.abs(y - this.f6619lr) >= f6616ik) {
                    this.f6618ka = true;
                }
            } else if (action == 3) {
                this.f6618ka = false;
            }
        } else {
            if (this.f6618ka) {
                this.f6618ka = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f6620ri) >= f6616ik || Math.abs(y2 - this.f6619lr) >= f6616ik) {
                this.f6618ka = false;
            } else {
                InterfaceC2454mj interfaceC2454mj = this.f6617fi;
                if (interfaceC2454mj != null) {
                    interfaceC2454mj.mo8445ri();
                }
            }
        }
        return true;
    }
}
