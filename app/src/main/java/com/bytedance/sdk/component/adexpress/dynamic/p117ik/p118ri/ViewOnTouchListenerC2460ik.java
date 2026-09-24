package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2460ik implements View.OnTouchListener {

    /* JADX INFO: renamed from: di */
    private InterfaceC2454mj f6626di;

    /* JADX INFO: renamed from: fi */
    private boolean f6627fi;

    /* JADX INFO: renamed from: ik */
    private float f6628ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private float f6629ka;

    /* JADX INFO: renamed from: lr */
    private float f6630lr;

    /* JADX INFO: renamed from: mj */
    private boolean f6631mj;

    /* JADX INFO: renamed from: ri */
    private float f6632ri;
    private int xha;

    public ViewOnTouchListenerC2460ik(InterfaceC2454mj interfaceC2454mj) {
        this(interfaceC2454mj, 5);
    }

    public ViewOnTouchListenerC2460ik(InterfaceC2454mj interfaceC2454mj, int i) {
        this.xha = 5;
        this.f6631mj = true;
        this.f6626di = interfaceC2454mj;
        if (i > 0) {
            this.xha = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC2454mj interfaceC2454mj;
        InterfaceC2454mj interfaceC2454mj2;
        InterfaceC2454mj interfaceC2454mj3;
        if (this.jbs) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6632ri = motionEvent.getX();
            this.f6630lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f6629ka = motionEvent.getX();
                this.f6628ik = motionEvent.getY();
                if (Math.abs(this.f6629ka - this.f6632ri) > 10.0f) {
                    this.f6627fi = true;
                }
                if (Math.abs(this.f6629ka - this.f6632ri) > 8.0f || Math.abs(this.f6628ik - this.f6630lr) > 8.0f) {
                    this.f6631mj = false;
                }
                int iM8832lr = xha.m8832lr(C2490ka.m8811ri(), Math.abs(this.f6629ka - this.f6632ri));
                if (this.f6629ka > this.f6632ri && iM8832lr > this.xha && (interfaceC2454mj3 = this.f6626di) != null) {
                    interfaceC2454mj3.mo8445ri();
                    this.jbs = true;
                }
            }
        } else {
            if (!this.f6627fi && !this.f6631mj) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iM8832lr2 = xha.m8832lr(C2490ka.m8811ri(), Math.abs(this.f6629ka - this.f6632ri));
            if (this.f6629ka > this.f6632ri && iM8832lr2 > this.xha && (interfaceC2454mj2 = this.f6626di) != null) {
                interfaceC2454mj2.mo8445ri();
                this.jbs = true;
            }
            float fAbs = Math.abs(x - this.f6632ri);
            float fAbs2 = Math.abs(y - this.f6630lr);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (interfaceC2454mj = this.f6626di) != null) {
                interfaceC2454mj.mo8444lr();
                this.jbs = true;
            }
        }
        return true;
    }
}
