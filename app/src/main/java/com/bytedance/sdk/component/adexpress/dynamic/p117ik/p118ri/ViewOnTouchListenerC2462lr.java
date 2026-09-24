package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.jbs;
import com.bytedance.sdk.component.adexpress.p124ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2462lr implements View.OnTouchListener {

    /* JADX INFO: renamed from: di */
    private InterfaceC2454mj f6642di;

    /* JADX INFO: renamed from: fi */
    private jbs f6643fi;

    /* JADX INFO: renamed from: ik */
    private long f6644ik;

    /* JADX INFO: renamed from: ka */
    private boolean f6645ka;

    /* JADX INFO: renamed from: lr */
    private float f6646lr;

    /* JADX INFO: renamed from: ri */
    private float f6647ri;

    public ViewOnTouchListenerC2462lr(jbs jbsVar, InterfaceC2454mj interfaceC2454mj) {
        this.f6643fi = jbsVar;
        this.f6642di = interfaceC2454mj;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6644ik = System.currentTimeMillis();
            this.f6647ri = motionEvent.getX();
            this.f6646lr = motionEvent.getY();
            this.f6643fi.m8441fi();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f6647ri) >= xha.m8833ri(C2490ka.m8811ri(), 10.0f) || Math.abs(y - this.f6646lr) >= xha.m8833ri(C2490ka.m8811ri(), 10.0f)) {
                    this.f6645ka = true;
                    this.f6643fi.m8440di();
                }
            }
        } else {
            if (this.f6645ka) {
                return false;
            }
            if (System.currentTimeMillis() - this.f6644ik >= 1500) {
                InterfaceC2454mj interfaceC2454mj = this.f6642di;
                if (interfaceC2454mj != null) {
                    interfaceC2454mj.mo8445ri();
                }
            } else {
                this.f6643fi.m8440di();
            }
        }
        return true;
    }
}
