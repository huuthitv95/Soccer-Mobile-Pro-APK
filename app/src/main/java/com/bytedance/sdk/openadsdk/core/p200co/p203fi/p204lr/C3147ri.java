package com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.fi.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3147ri extends AbstractC2296ik {

    /* JADX INFO: renamed from: sf */
    private boolean f10298sf;

    public C3147ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        Map<String, String> map = this.f5811fi;
        if (this.f5811fi != null && !this.f5811fi.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iM8030ri = C2343ik.m8030ri(obj.toString(), -1);
                if (this.f5811fi.containsKey("remainingSeconds")) {
                    int iM8030ri2 = C2343ik.m8030ri(this.f5811fi.get("remainingSeconds"), -1);
                    Integer.valueOf(iM8030ri);
                    Integer.valueOf(iM8030ri2);
                    if (iM8030ri >= 0 && iM8030ri2 >= 0 && iM8030ri == iM8030ri2 && !this.f10298sf) {
                        this.f10298sf = true;
                        if (this.f5817ri != null) {
                            this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
