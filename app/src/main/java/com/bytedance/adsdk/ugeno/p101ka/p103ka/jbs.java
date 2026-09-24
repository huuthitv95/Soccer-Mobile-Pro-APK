package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2283aw;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2296ik {

    /* JADX INFO: renamed from: aw */
    private boolean f5818aw;
    private InterfaceC2283aw bgr;

    /* JADX INFO: renamed from: co */
    private float f5819co;

    /* JADX INFO: renamed from: sf */
    private float f5820sf;

    public jbs(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ri */
    public void m7790ri(InterfaceC2283aw interfaceC2283aw) {
        this.bgr = interfaceC2283aw;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX INFO: renamed from: ri */
    public boolean m7791ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5820sf = motionEvent.getRawX();
            this.f5819co = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.f5818aw) {
                this.f5818aw = false;
                this.f5820sf = 0.0f;
                this.f5819co = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.f5820sf) < 15.0f || Math.abs(rawY - this.f5819co) >= 15.0f) {
                this.f5818aw = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
            if (this.f5817ri != null) {
                this.f5817ri.mo7771ri(abstractViewOnTouchListenerC2318ik, this.f5810di, this.f5812ik.m7744lr());
                this.f5820sf = 0.0f;
                this.f5819co = 0.0f;
                return true;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.f5820sf) >= 15.0f || Math.abs(rawY2 - this.f5819co) >= 15.0f) {
                this.f5818aw = true;
            }
        } else if (action == 3) {
            this.f5818aw = false;
            if (this.f5818aw) {
                this.f5818aw = false;
                this.f5820sf = 0.0f;
                this.f5819co = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.f5820sf) < 15.0f) {
            }
            this.f5818aw = false;
            Log.d("GesThrough_UGTapEvent", "Non-tap event");
            return false;
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        InterfaceC2283aw interfaceC2283aw = this.bgr;
        return interfaceC2283aw != null ? interfaceC2283aw.mo7741ri(this.f5814lr, motionEvent, this.f5817ri, this) : m7791ri(this.f5814lr, motionEvent);
    }
}
