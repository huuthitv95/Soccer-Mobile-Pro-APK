package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.view.C3068fi;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.C3341ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2996ik extends AbstractC2998lr {
    public C2996ik(C3022ri c3022ri) {
        super(c3022ri);
    }

    /* JADX INFO: renamed from: lr */
    private void m11719lr(C3072mj c3072mj) {
        if (c3072mj == null) {
            return;
        }
        Context context = c3072mj.getContext();
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(1);
        c3072mj.addView(c3191fi, new FrameLayout.LayoutParams(-1, -1));
        C3192ik c3192ik = new C3192ik(context);
        c3192ik.setId(slm.dzy);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        c3191fi.addView(c3192ik, layoutParams);
        C3192ik c3192ik2 = new C3192ik(context);
        c3192ik2.setId(slm.f13259co);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        c3192ik.addView(c3192ik2, layoutParams2);
        c3192ik2.addView(m11734ri(context));
        if (this.f9204lr.m14552vz() != 3 && this.f9204lr.m14552vz() != 5) {
            C3193ka c3193ka = new C3193ka(context);
            c3193ka.setId(slm.f13285mf);
            c3193ka.setVisibility(8);
            c3193ka.setBackground(C3341ka.m15010ri());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = C3583qd.m16589lr(context, 20.0f);
            layoutParams3.bottomMargin = C3583qd.m16589lr(context, 10.0f);
            c3192ik.addView(c3193ka, layoutParams3);
        }
        C3192ik c3192ik3 = new C3192ik(context);
        c3192ik3.setId(slm.ihz);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        c3191fi.addView(c3192ik3, layoutParams4);
        c3192ik3.addView(C2997ka.m11725ri(context, this.f9207ri.f9389lr));
        C3068fi.m12238ri(c3192ik3, this.f9204lr);
        C3068fi.m12237ri(c3192ik);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m11720ri(wjv wjvVar) {
        Boolean.valueOf(C3273ac.m13965ik(wjvVar));
        return C3273ac.m13965ik(wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: di */
    public void mo11715di() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: fi */
    public boolean mo11716fi() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ka */
    public boolean mo11717ka() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11718ri(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11721ri(C3072mj c3072mj) {
        m11719lr(c3072mj);
    }
}
