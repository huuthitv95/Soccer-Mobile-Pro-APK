package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2461ka implements View.OnTouchListener {

    /* JADX INFO: renamed from: di */
    private float f6633di;

    /* JADX INFO: renamed from: fi */
    private boolean f6634fi = true;

    /* JADX INFO: renamed from: ik */
    private float f6635ik;
    private InterfaceC2454mj jbs;

    /* JADX INFO: renamed from: ka */
    private float f6636ka;

    /* JADX INFO: renamed from: lr */
    private float f6637lr;

    /* JADX INFO: renamed from: mj */
    private boolean f6638mj;

    /* JADX INFO: renamed from: qt */
    private int f6639qt;

    /* JADX INFO: renamed from: ri */
    private float f6640ri;

    /* JADX INFO: renamed from: sf */
    private boolean f6641sf;
    private float xha;

    public ViewOnTouchListenerC2461ka(InterfaceC2454mj interfaceC2454mj, int i, boolean z) {
        this.jbs = interfaceC2454mj;
        this.f6639qt = i;
        this.f6641sf = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC2454mj interfaceC2454mj;
        InterfaceC2454mj interfaceC2454mj2;
        InterfaceC2454mj interfaceC2454mj3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6640ri = motionEvent.getX();
            this.f6637lr = motionEvent.getY();
            this.f6633di = motionEvent.getY();
            this.f6634fi = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.xha = y;
                if (Math.abs(y - this.f6633di) > 10.0f) {
                    this.f6638mj = true;
                }
                this.f6636ka = motionEvent.getX();
                this.f6635ik = motionEvent.getY();
                if (Math.abs(this.f6636ka - this.f6640ri) > 8.0f || Math.abs(this.f6635ik - this.f6637lr) > 8.0f) {
                    this.f6634fi = false;
                }
            }
        } else {
            if (!this.f6638mj && !this.f6634fi) {
                return false;
            }
            if (this.f6641sf || (interfaceC2454mj3 = this.jbs) == null) {
                int iM8832lr = xha.m8832lr(C2490ka.m8811ri(), Math.abs(this.xha - this.f6633di));
                if (this.xha - this.f6633di < 0.0f && iM8832lr > this.f6639qt && (interfaceC2454mj2 = this.jbs) != null) {
                    interfaceC2454mj2.mo8445ri();
                } else if (this.f6634fi && (interfaceC2454mj = this.jbs) != null) {
                    interfaceC2454mj.mo8445ri();
                }
            } else {
                interfaceC2454mj3.mo8445ri();
            }
        }
        return true;
    }
}
