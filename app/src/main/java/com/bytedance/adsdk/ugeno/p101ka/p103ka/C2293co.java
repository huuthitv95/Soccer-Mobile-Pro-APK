package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.jbs;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2293co extends AbstractC2296ik implements jbs.InterfaceC2344ri {

    /* JADX INFO: renamed from: co */
    private Handler f5802co;

    /* JADX INFO: renamed from: sf */
    private int f5803sf;

    public C2293co(Context context) {
        super(context);
        this.f5803sf = 500;
        this.f5802co = new jbs(Looper.getMainLooper(), this);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7776ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5802co.sendEmptyMessageDelayed(1101, this.f5803sf);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.f5802co.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.InterfaceC2344ri
    /* JADX INFO: renamed from: ri */
    public void mo7364ri(Message message) {
        if (message.what != 1101) {
            return;
        }
        if (this.f5817ri != null) {
            this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
        }
        Handler handler = this.f5802co;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.f5803sf = C2343ik.m8030ri(this.f5811fi.get("delay"), 500);
        return m7776ri(this.f5814lr, motionEvent);
    }
}
