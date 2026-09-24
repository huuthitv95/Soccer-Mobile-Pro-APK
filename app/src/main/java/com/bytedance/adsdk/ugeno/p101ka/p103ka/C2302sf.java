package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.jbs;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2302sf extends AbstractC2296ik implements jbs.InterfaceC2344ri {

    /* JADX INFO: renamed from: aw */
    private Handler f5829aw;

    /* JADX INFO: renamed from: co */
    private boolean f5830co;

    /* JADX INFO: renamed from: sf */
    private int f5831sf;

    public C2302sf(Context context) {
        super(context);
        this.f5831sf = 500;
        this.f5829aw = new jbs(Looper.getMainLooper(), this);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7795ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5829aw.sendEmptyMessageDelayed(1102, this.f5831sf);
        } else {
            if (action == 1) {
                if (!this.f5830co || this.f5817ri == null) {
                    Handler handler = this.f5829aw;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    this.f5830co = false;
                    return false;
                }
                this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                this.f5830co = false;
                Handler handler2 = this.f5829aw;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                return true;
            }
            if (action == 3) {
                Handler handler3 = this.f5829aw;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.f5830co = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.InterfaceC2344ri
    /* JADX INFO: renamed from: ri */
    public void mo7364ri(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.f5830co = true;
        Handler handler = this.f5829aw;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.f5831sf = C2343ik.m8030ri(this.f5811fi.get("delay"), 500);
        return m7795ri(this.f5814lr, motionEvent);
    }
}
