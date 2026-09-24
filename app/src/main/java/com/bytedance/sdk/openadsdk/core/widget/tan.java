package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class tan {

    /* JADX INFO: renamed from: di */
    private int f11857di;

    /* JADX INFO: renamed from: fi */
    private float f11858fi;

    /* JADX INFO: renamed from: ka */
    private float f11860ka;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC3355ri f11864ri;

    /* JADX INFO: renamed from: sf */
    private boolean f11865sf;
    private int xha;

    /* JADX INFO: renamed from: lr */
    private final boolean f11861lr = false;

    /* JADX INFO: renamed from: ik */
    private boolean f11859ik = false;

    /* JADX INFO: renamed from: mj */
    private boolean f11862mj = true;
    private boolean jbs = false;

    /* JADX INFO: renamed from: qt */
    private final View.OnTouchListener f11863qt = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tan.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (tan.this.f11864ri.wjv()) {
                return !tan.this.f11859ik;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                tan tanVar = tan.this;
                tanVar.f11865sf = tanVar.m15110ri(motionEvent);
                tan.this.f11860ka = x;
                tan.this.f11858fi = y;
                tan.this.f11857di = (int) x;
                tan.this.xha = (int) y;
                tan.this.f11862mj = true;
                if (tan.this.f11864ri != null && tan.this.f11859ik) {
                    tan.this.f11864ri.mo12855ri(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - tan.this.f11857di) > 20.0f || Math.abs(y - tan.this.xha) > 20.0f) {
                    tan.this.f11862mj = false;
                }
                tan.this.f11862mj = true;
                tan.this.jbs = false;
                tan.this.f11860ka = 0.0f;
                tan.this.f11858fi = 0.0f;
                tan.this.f11857di = 0;
                if (tan.this.f11864ri != null) {
                    tan.this.f11864ri.mo12855ri(view, tan.this.f11862mj);
                }
                tan.this.f11865sf = false;
            } else if (action == 3) {
                tan.this.f11865sf = false;
            }
            return !tan.this.f11859ik;
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.tan$ri */
    public interface InterfaceC3355ri {
        /* JADX INFO: renamed from: ri */
        void mo12855ri(View view, boolean z);

        boolean wjv();
    }

    public tan(InterfaceC3355ri interfaceC3355ri) {
        this.f11864ri = interfaceC3355ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m15110ri(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iM16580ik = C3583qd.m16580ik(C3299nr.m14642ri().getApplicationContext());
        int iM16578fi = C3583qd.m16578fi(C3299nr.m14642ri().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iM16580ik;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iM16578fi;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }

    /* JADX INFO: renamed from: ri */
    public void m15113ri(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f11863qt);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15114ri(boolean z) {
        this.f11859ik = z;
    }
}
