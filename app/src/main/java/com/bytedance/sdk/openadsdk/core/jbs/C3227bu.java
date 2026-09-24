package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3227bu extends AbstractC3238ri {

    /* JADX INFO: renamed from: aw */
    private FrameLayout f10784aw;

    /* JADX INFO: renamed from: co */
    private C3222ac f10785co;

    /* JADX INFO: renamed from: ri */
    private FrameLayout f10786ri;

    public C3227bu(Context context) {
        super(context);
        this.f10877lr = context;
    }

    /* JADX INFO: renamed from: ik */
    private void m13612ik() {
        C3192ik c3192ik = new C3192ik(this.f10877lr);
        this.f10786ri = c3192ik;
        addView(c3192ik, new FrameLayout.LayoutParams(-1, -1));
        C3192ik c3192ik2 = new C3192ik(this.f10877lr);
        this.f10784aw = c3192ik2;
        this.f10786ri.addView(c3192ik2, new FrameLayout.LayoutParams(-1, -1));
        this.f10784aw.removeAllViews();
    }

    /* JADX INFO: renamed from: lr */
    private void m13613lr() {
        this.xha = C3583qd.m16589lr(this.f10877lr, this.f10785co.getExpectExpressWidth());
        this.f10878mj = C3583qd.m16589lr(this.f10877lr, this.f10785co.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.f10878mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.f10878mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f10875ik.jxw();
        m13612ik();
    }

    public View getBackupContainerBackgroundView() {
        return this.f10786ri;
    }

    public FrameLayout getVideoContainer() {
        return this.f10784aw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    protected void mo11556ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        C3222ac c3222ac = this.f10785co;
        if (c3222ac != null) {
            c3222ac.mo9002ri(view, i, slmVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13614ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C3222ac c3222ac, ViewGroup viewGroup) {
        if (wjvVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.f10875ik = wjvVar;
        this.f10785co = c3222ac;
        if (wjvVar.lji() == 7) {
            this.f10873di = "rewarded_video";
        } else {
            this.f10873di = "fullscreen_interstitial_ad";
        }
        m13613lr();
        if (C3273ac.m13965ik(wjvVar)) {
            this.f10785co.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f10785co.addView(this, layoutParams);
        }
        View viewFindViewById = viewGroup.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13254ar);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(com.bytedance.sdk.openadsdk.utils.slm.f13254ar);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C2751lr.m10463lr().m10473ri(str, viewFindViewById);
            }
        }
    }
}
