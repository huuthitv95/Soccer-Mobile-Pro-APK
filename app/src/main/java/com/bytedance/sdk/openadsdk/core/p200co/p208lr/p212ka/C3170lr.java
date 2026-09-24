package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3170lr extends AbstractC2296ik {

    /* JADX INFO: renamed from: co */
    private boolean f10425co;

    /* JADX INFO: renamed from: sf */
    private float f10426sf;

    public C3170lr(Context context) {
        super(context);
        this.f10426sf = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (C2343ik.m8029ri(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                if (this.f5817ri != null && !this.f10425co) {
                    this.f10425co = true;
                    this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                }
                return true;
            }
            this.f10426sf = C2343ik.m8030ri(this.f5811fi.get("rate"), 100);
            float fM8029ri = C2343ik.m8029ri(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fM8029ri + " mTargetProgress=" + this.f10426sf);
            if (fM8029ri >= this.f10426sf) {
                if (this.f5817ri != null && !this.f10425co) {
                    this.f10425co = true;
                    this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                }
                return true;
            }
        }
        return false;
    }
}
