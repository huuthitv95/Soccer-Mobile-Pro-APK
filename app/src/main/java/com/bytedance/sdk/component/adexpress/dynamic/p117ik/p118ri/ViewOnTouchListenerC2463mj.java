package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2463mj implements View.OnTouchListener {

    /* JADX INFO: renamed from: di */
    private float f6648di;

    /* JADX INFO: renamed from: fi */
    private float f6649fi;

    /* JADX INFO: renamed from: ik */
    private final int f6650ik = 10;

    /* JADX INFO: renamed from: ka */
    private float f6651ka;

    /* JADX INFO: renamed from: lr */
    private final boolean f6652lr;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC2454mj f6653ri;
    private float xha;

    public ViewOnTouchListenerC2463mj(InterfaceC2454mj interfaceC2454mj, boolean z) {
        this.f6653ri = interfaceC2454mj;
        this.f6652lr = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC2454mj interfaceC2454mj;
        InterfaceC2454mj interfaceC2454mj2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6651ka = motionEvent.getX();
            this.f6649fi = motionEvent.getY();
            Float.valueOf(this.f6651ka);
            new StringBuilder(", mStartY: ").append(this.f6649fi);
        } else if (action == 1) {
            this.f6648di = motionEvent.getX();
            this.xha = motionEvent.getY();
            Float.valueOf(this.f6648di);
            new StringBuilder(", mEndY: ").append(this.xha);
            if (this.f6652lr || (interfaceC2454mj2 = this.f6653ri) == null) {
                float f = this.f6648di - this.f6651ka;
                float f2 = this.xha - this.f6649fi;
                float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                Float.valueOf(fSqrt);
                float fM8832lr = xha.m8832lr(C2490ka.m8811ri(), Math.abs(fSqrt));
                Float.valueOf(fM8832lr);
                Integer.valueOf(10);
                if (fM8832lr > 10.0f && (interfaceC2454mj = this.f6653ri) != null) {
                    interfaceC2454mj.mo8445ri();
                }
            } else {
                interfaceC2454mj2.mo8445ri();
            }
        }
        return true;
    }
}
