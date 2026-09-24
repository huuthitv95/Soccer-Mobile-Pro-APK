package com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.fi.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3145ka extends AbstractC2296ik {

    /* JADX INFO: renamed from: sf */
    private boolean f10295sf;

    public C3145ka(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (this.f5811fi == null || this.f5811fi.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.f10295sf = false;
        }
        if (this.f5811fi.containsKey("percent")) {
            float fM8029ri = C2343ik.m8029ri(this.f5811fi.get("percent"), -1.0f);
            if (fM8029ri >= 0.0f && jLongValue >= (fM8029ri / 100.0f) * jLongValue2 && !this.f10295sf) {
                this.f10295sf = true;
                if (this.f5817ri != null) {
                    this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                }
            }
        } else if (jLongValue >= C2343ik.m8030ri(this.f5811fi.get("interval"), -1) && !this.f10295sf) {
            this.f10295sf = true;
            if (this.f5817ri != null) {
                this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
            }
        }
        return true;
    }
}
