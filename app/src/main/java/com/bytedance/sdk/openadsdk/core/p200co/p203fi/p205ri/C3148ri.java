package com.bytedance.sdk.openadsdk.core.p200co.p203fi.p205ri;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p213lr.C3174ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.fi.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3148ri extends AbstractC2308ri {
    public C3148ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
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
        if (this.f5835di == null || this.f5835di.isEmpty()) {
            return;
        }
        String str = this.f5835di.get("id");
        if (TextUtils.isEmpty(str) || (abstractViewOnTouchListenerC2318ikM7849lr = this.f5837ik.m7849lr(this.f5837ik)) == null) {
            return;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ikM7849lr.m7839fi(str);
        if (abstractViewOnTouchListenerC2318ikM7839fi instanceof C3174ri) {
            C3174ri c3174ri = (C3174ri) abstractViewOnTouchListenerC2318ikM7839fi;
            c3174ri.m13235ka();
            c3174ri.m13236ri(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.co.fi.ri.ri.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C3148ri.this.m7800ik();
                }
            });
        }
    }
}
