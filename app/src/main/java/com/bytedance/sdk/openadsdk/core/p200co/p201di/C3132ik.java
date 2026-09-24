package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2283aw;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2316sf;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3132ik implements InterfaceC2283aw {

    /* JADX INFO: renamed from: ri */
    private boolean f10226ri = false;

    /* JADX INFO: renamed from: ri */
    private boolean m13064ri(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2283aw
    /* JADX INFO: renamed from: ri */
    public boolean mo7741ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent, InterfaceC2316sf interfaceC2316sf, AbstractC2296ik abstractC2296ik) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10226ri = true;
        } else if ((action == 1 || action == 3) && this.f10226ri) {
            this.f10226ri = false;
            if (m13064ri(abstractViewOnTouchListenerC2318ik.m7879sf(), motionEvent.getX(), motionEvent.getY()) && interfaceC2316sf != null) {
                interfaceC2316sf.mo7771ri(abstractViewOnTouchListenerC2318ik, abstractC2296ik.m7785ka(), abstractC2296ik.xha().m7744lr());
            }
        }
        return true;
    }
}
