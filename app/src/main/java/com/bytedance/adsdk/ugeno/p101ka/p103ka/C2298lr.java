package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.C2335ri;
import com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2298lr extends AbstractC2296ik implements InterfaceC2329lr {

    /* JADX INFO: renamed from: sf */
    private String f5822sf;

    public C2298lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr
    /* JADX INFO: renamed from: lr */
    public void mo7793lr() {
        if ((TextUtils.equals(this.f5822sf, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.f5822sf)) && this.f5817ri != null) {
            this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr
    /* JADX INFO: renamed from: ri */
    public void mo7794ri() {
        if ((TextUtils.equals(this.f5822sf, "start") || TextUtils.isEmpty(this.f5822sf)) && this.f5817ri != null) {
            this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7849lr;
        C2335ri c2335riM7833co;
        if (this.f5811fi != null && this.f5811fi.size() > 0) {
            String str = this.f5811fi.get("name");
            this.f5822sf = this.f5811fi.get("state");
            if (!TextUtils.isEmpty(str) && (abstractViewOnTouchListenerC2318ikM7849lr = this.f5814lr.m7849lr(this.f5814lr)) != null && (c2335riM7833co = abstractViewOnTouchListenerC2318ikM7849lr.m7854mj(str).m7833co(str)) != null) {
                c2335riM7833co.m8012ri(this);
            }
        }
        return false;
    }
}
