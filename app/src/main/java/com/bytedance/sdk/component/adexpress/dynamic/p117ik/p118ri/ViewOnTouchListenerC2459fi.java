package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2459fi implements View.OnTouchListener {

    /* JADX INFO: renamed from: fi */
    private int f6621fi;

    /* JADX INFO: renamed from: ik */
    private boolean f6622ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2454mj f6623ka;

    /* JADX INFO: renamed from: lr */
    private float f6624lr;

    /* JADX INFO: renamed from: ri */
    private float f6625ri;

    public ViewOnTouchListenerC2459fi(InterfaceC2454mj interfaceC2454mj, int i) {
        this.f6623ka = interfaceC2454mj;
        this.f6621fi = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC2454mj interfaceC2454mj;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6625ri = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f6624lr = y;
                if (Math.abs(y - this.f6625ri) > 10.0f) {
                    this.f6622ik = true;
                }
            }
        } else {
            if (!this.f6622ik) {
                return false;
            }
            int iM8832lr = xha.m8832lr(C2490ka.m8811ri(), Math.abs(this.f6624lr - this.f6625ri));
            if (this.f6624lr - this.f6625ri < 0.0f && iM8832lr > this.f6621fi && (interfaceC2454mj = this.f6623ka) != null) {
                interfaceC2454mj.mo8445ri();
                this.f6625ri = 0.0f;
                this.f6624lr = 0.0f;
                this.f6622ik = false;
            }
        }
        return true;
    }
}
