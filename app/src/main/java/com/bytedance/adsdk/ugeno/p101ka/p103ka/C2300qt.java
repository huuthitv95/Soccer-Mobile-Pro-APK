package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.jbs;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2300qt extends AbstractC2296ik implements jbs.InterfaceC2344ri {

    /* JADX INFO: renamed from: aw */
    private Handler f5826aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private int f5827co;

    /* JADX INFO: renamed from: sf */
    private int f5828sf;

    public C2300qt(Context context) {
        super(context);
        this.f5827co = 0;
        this.f5826aw = new jbs(Looper.getMainLooper(), this);
        this.bgr = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.InterfaceC2344ri
    /* JADX INFO: renamed from: ri */
    public void mo7364ri(Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.bgr);
        this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
        int i3 = this.bgr + (-1);
        this.bgr = i3;
        if (i3 < 0 && (i2 = this.f5827co) != 0) {
            this.f5826aw.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 <= 0 || (i = this.f5827co) == 0) {
            this.f5826aw.removeMessages(1001);
        } else {
            this.f5826aw.sendEmptyMessageDelayed(1001, i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (this.f5811fi != null) {
            int iM8030ri = C2343ik.m8030ri(this.f5811fi.get("loop"), 0);
            this.f5828sf = iM8030ri;
            if (iM8030ri <= 0) {
                this.bgr = -1;
            } else {
                this.bgr = iM8030ri;
            }
            this.f5827co = C2343ik.m8030ri(this.f5811fi.get("duration"), 0);
        }
        this.f5826aw.sendEmptyMessageDelayed(1001, this.f5827co);
        return true;
    }
}
