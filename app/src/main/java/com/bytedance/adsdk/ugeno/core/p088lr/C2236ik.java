package com.bytedance.adsdk.ugeno.core.p088lr;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2236ik {

    /* JADX INFO: renamed from: di */
    private final int f5535di;

    /* JADX INFO: renamed from: fi */
    private boolean f5536fi;

    /* JADX INFO: renamed from: ik */
    private C2226aw f5537ik;

    /* JADX INFO: renamed from: ka */
    private Context f5538ka;

    /* JADX INFO: renamed from: lr */
    private float f5539lr;

    /* JADX INFO: renamed from: ri */
    private float f5540ri;

    public C2236ik(Context context, C2226aw c2226aw) {
        this.f5538ka = context;
        this.f5537ik = c2226aw;
        this.f5535di = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7373ri(InterfaceC2247vr interfaceC2247vr, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5540ri = motionEvent.getX();
            this.f5539lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f5540ri) >= this.f5535di || Math.abs(y - this.f5539lr) >= this.f5535di) {
                    this.f5536fi = true;
                }
            } else if (action == 3) {
                this.f5536fi = false;
            }
        } else {
            if (this.f5536fi) {
                this.f5536fi = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f5540ri) >= this.f5535di || Math.abs(y2 - this.f5539lr) >= this.f5535di) {
                this.f5536fi = false;
            } else if (interfaceC2247vr != null) {
                interfaceC2247vr.mo7436ri(this.f5537ik, abstractViewOnTouchListenerC2318ik, abstractViewOnTouchListenerC2318ik);
                return true;
            }
        }
        return true;
    }
}
