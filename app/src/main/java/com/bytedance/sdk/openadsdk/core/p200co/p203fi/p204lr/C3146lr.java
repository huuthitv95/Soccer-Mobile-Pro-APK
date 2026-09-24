package com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p213lr.C3174ri;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.fi.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3146lr extends AbstractC2296ik {

    /* JADX INFO: renamed from: sf */
    private String f10296sf;

    public C3146lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7849lr;
        if (this.f5811fi != null && this.f5811fi.size() > 0) {
            String str = this.f5811fi.get("id");
            this.f10296sf = this.f5811fi.get("state");
            if (TextUtils.isEmpty(str) || (abstractViewOnTouchListenerC2318ikM7849lr = this.f5814lr.m7849lr(this.f5814lr)) == null) {
                return false;
            }
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ikM7849lr.m7839fi(str);
            if (abstractViewOnTouchListenerC2318ikM7839fi instanceof C3174ri) {
                ((C3174ri) abstractViewOnTouchListenerC2318ikM7839fi).m13236ri(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.co.fi.lr.lr.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(C3146lr.this.f10296sf, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || C3146lr.this.f5817ri == null) {
                            return;
                        }
                        C3146lr.this.f5817ri.mo7771ri(C3146lr.this.f5814lr, C3146lr.this.f5810di, C3146lr.this.f5812ik.m7744lr());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(C3146lr.this.f10296sf, "start") || C3146lr.this.f5817ri == null) {
                            return;
                        }
                        C3146lr.this.f5817ri.mo7771ri(C3146lr.this.f5814lr, C3146lr.this.f5810di, C3146lr.this.f5812ik.m7744lr());
                    }
                });
            }
        }
        return false;
    }
}
