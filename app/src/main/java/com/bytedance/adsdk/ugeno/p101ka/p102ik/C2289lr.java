package com.bytedance.adsdk.ugeno.p101ka.p102ik;

import com.bytedance.adsdk.ugeno.C2317lr;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2289lr extends AbstractC2308ri {
    public C2289lr(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        super(abstractViewOnTouchListenerC2318ik, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri
    /* JADX INFO: renamed from: ri */
    public void mo7759ri() {
        if (this.f5837ik == null) {
            return;
        }
        int iM8030ri = C2343ik.m8030ri(this.f5835di.get(C11744X3.i.f26338L), 0);
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7849lr = this.f5837ik.m7849lr(this.f5837ik);
        if (abstractViewOnTouchListenerC2318ikM7849lr == null) {
            return;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7835di = abstractViewOnTouchListenerC2318ikM7849lr.m7835di("SwiperView");
        if (abstractViewOnTouchListenerC2318ikM7835di instanceof C2317lr) {
            ((C2317lr) abstractViewOnTouchListenerC2318ikM7835di).m7821ri(iM8030ri);
        }
    }
}
