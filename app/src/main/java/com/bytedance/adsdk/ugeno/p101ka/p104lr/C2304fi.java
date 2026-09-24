package com.bytedance.adsdk.ugeno.p101ka.p104lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2304fi extends AbstractC2308ri {
    public C2304fi(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        super(abstractViewOnTouchListenerC2318ik, str, riVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m7797ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        for (String str : this.f5835di.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                abstractViewOnTouchListenerC2318ik.mo7553ri(str, this.f5835di.get(str));
            }
        }
        abstractViewOnTouchListenerC2318ik.m7878ri(this.f5835di.containsKey("width"), this.f5835di.containsKey("height"));
        abstractViewOnTouchListenerC2318ik.mo7550lr();
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri
    /* JADX INFO: renamed from: ri */
    public void mo7759ri() {
        if (this.f5835di == null || this.f5835di.size() <= 0) {
            return;
        }
        String str = this.f5835di.get("id");
        if (TextUtils.isEmpty(str)) {
            m7797ri(this.f5837ik);
            return;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7849lr = this.f5837ik.m7849lr(this.f5837ik);
        if (abstractViewOnTouchListenerC2318ikM7849lr == null) {
            return;
        }
        m7797ri(abstractViewOnTouchListenerC2318ikM7849lr.m7839fi(str));
    }
}
