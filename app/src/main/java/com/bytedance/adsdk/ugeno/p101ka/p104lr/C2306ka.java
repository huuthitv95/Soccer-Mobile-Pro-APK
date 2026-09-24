package com.bytedance.adsdk.ugeno.p101ka.p104lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.C2335ri;
import com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2306ka extends AbstractC2308ri {
    public C2306ka(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        super(abstractViewOnTouchListenerC2318ik, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri
    /* JADX INFO: renamed from: lr */
    public void mo7798lr() {
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri
    /* JADX INFO: renamed from: ri */
    public void mo7759ri() {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7849lr;
        C2335ri c2335riM7833co;
        if (this.f5835di == null || this.f5835di.size() <= 0) {
            return;
        }
        String str = this.f5835di.get("name");
        if (TextUtils.isEmpty(str) || (abstractViewOnTouchListenerC2318ikM7849lr = this.f5837ik.m7849lr(this.f5837ik)) == null || (c2335riM7833co = abstractViewOnTouchListenerC2318ikM7849lr.m7854mj(str).m7833co(str)) == null) {
            return;
        }
        c2335riM7833co.m8007lr();
        c2335riM7833co.m8012ri(new InterfaceC2329lr() { // from class: com.bytedance.adsdk.ugeno.ka.lr.ka.1
            @Override // com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr
            /* JADX INFO: renamed from: lr */
            public void mo7793lr() {
                C2306ka.this.m7800ik();
            }

            @Override // com.bytedance.adsdk.ugeno.p108ri.InterfaceC2329lr
            /* JADX INFO: renamed from: ri */
            public void mo7794ri() {
            }
        });
    }
}
