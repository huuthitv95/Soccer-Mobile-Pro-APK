package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3073qt extends C3075sf {
    public C3073qt(C3022ri c3022ri) {
        super(c3022ri);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.C3075sf
    /* JADX INFO: renamed from: ri */
    public void mo12229ri(int i, int i2) {
        super.mo12229ri(i, i2);
        if (wjv.m14332fi(this.f9651ka) && this.f9651ka.hws() == 3 && this.f9651ka.jxw() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f9650ik.f9396pv.findViewById(slm.f13259co);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f9651ka.bbu() == 1) {
                    int iM16589lr = C3583qd.m16589lr(C3299nr.m14642ri(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iM16589lr;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.C3075sf
    /* JADX INFO: renamed from: ri */
    protected boolean mo12234ri() {
        return false;
    }
}
