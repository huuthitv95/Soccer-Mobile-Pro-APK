package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.bgr.C2901ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.view.C3068fi;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2997ka extends AbstractC2998lr {
    public C2997ka(C3022ri c3022ri) {
        super(c3022ri);
    }

    /* JADX INFO: renamed from: ik */
    private static ImageView m11722ik(Context context) {
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setScaleType(ImageView.ScaleType.FIT_XY);
        c3193ka.setImageResource(C2729uq.m10305ka(context, "tt_up_slide"));
        c3193ka.setId(slm.f13256ay);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 18.0f), C3583qd.m16589lr(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = C3583qd.m16589lr(context, 45.0f);
        c3193ka.setLayoutParams(layoutParams);
        return c3193ka;
    }

    /* JADX INFO: renamed from: lr */
    private static LinearLayout m11723lr(Context context) {
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setId(slm.wjv);
        c3191fi.setOrientation(1);
        c3191fi.setVisibility(8);
        c3191fi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c3191fi;
    }

    /* JADX INFO: renamed from: lr */
    static void m11724lr(FrameLayout frameLayout, wjv wjvVar) {
        Context context = frameLayout.getContext();
        C3192ik c3192ik = new C3192ik(context);
        c3192ik.setId(slm.ihz);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = C3583qd.m16589lr(C3299nr.m14642ri(), 58.0f);
        frameLayout.addView(c3192ik, layoutParams);
        c3192ik.addView(m11725ri(context, wjvVar));
        LinearLayout linearLayoutM11723lr = m11723lr(context);
        linearLayoutM11723lr.setBackgroundColor(Color.parseColor("#99161823"));
        c3192ik.addView(linearLayoutM11723lr);
        linearLayoutM11723lr.addView(m11722ik(context));
        C3068fi.m12238ri(c3192ik, wjvVar);
        C3192ik c3192ik2 = new C3192ik(context);
        c3192ik2.setId(slm.dzy);
        frameLayout.addView(c3192ik2, new FrameLayout.LayoutParams(-1, -1));
        C3192ik c3192ik3 = new C3192ik(context);
        c3192ik3.setId(slm.f13259co);
        c3192ik2.addView(c3192ik3, new FrameLayout.LayoutParams(-1, -1));
        c3192ik3.addView(m11734ri(context));
        C3192ik c3192ik4 = new C3192ik(context);
        c3192ik4.setId(slm.tan);
        c3192ik4.setVisibility(8);
        c3192ik4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        c3192ik3.addView(c3192ik4, layoutParams2);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(slm.f13253ac);
        c3193ka.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c3192ik4.addView(c3193ka, new FrameLayout.LayoutParams(-1, -1));
        C3068fi.m12237ri(c3192ik2);
    }

    /* JADX INFO: renamed from: ri */
    protected static C2634di m11725ri(Context context, wjv wjvVar) {
        C2634di c2634diM11177lr = C2901ri.m11167ri().m11177lr(wjvVar);
        if (c2634diM11177lr != null) {
            c2634diM11177lr.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) c2634diM11177lr.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(c2634diM11177lr);
            }
        } else {
            c2634diM11177lr = new C2634di(context, true, C2634di.ik.LANDING_PAGE_LOADING);
            c2634diM11177lr.setLayerType(2, null);
        }
        C3583qd.m16612ri((View) c2634diM11177lr, 0);
        c2634diM11177lr.setId(slm.f13307uq);
        c2634diM11177lr.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c2634diM11177lr;
    }

    /* JADX INFO: renamed from: ri */
    static void m11726ri(FrameLayout frameLayout, wjv wjvVar) {
        Context context = frameLayout.getContext();
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(1);
        frameLayout.addView(c3191fi, new FrameLayout.LayoutParams(-1, -1));
        C3192ik c3192ik = new C3192ik(context);
        c3192ik.setId(slm.dzy);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        c3191fi.addView(c3192ik, layoutParams);
        C3192ik c3192ik2 = new C3192ik(context);
        c3192ik2.setId(slm.f13259co);
        c3192ik.addView(c3192ik2, new FrameLayout.LayoutParams(-1, -1));
        c3192ik2.addView(m11734ri(context));
        C3192ik c3192ik3 = new C3192ik(context);
        c3192ik3.setId(slm.tan);
        c3192ik3.setVisibility(8);
        c3192ik3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        c3192ik2.addView(c3192ik3, layoutParams2);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(slm.f13253ac);
        c3193ka.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c3192ik3.addView(c3193ka, new FrameLayout.LayoutParams(-1, -1));
        C3068fi.m12237ri(c3192ik);
        C3192ik c3192ik4 = new C3192ik(context);
        c3192ik4.setId(slm.ihz);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        c3191fi.addView(c3192ik4, layoutParams3);
        c3192ik4.addView(m11725ri(context, wjvVar));
        LinearLayout linearLayoutM11723lr = m11723lr(context);
        linearLayoutM11723lr.setBackgroundColor(Color.parseColor("#70161823"));
        c3192ik4.addView(linearLayoutM11723lr);
        linearLayoutM11723lr.addView(m11722ik(context));
        C3068fi.m12238ri(c3192ik4, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11727ri(wjv wjvVar, FrameLayout frameLayout, C3022ri c3022ri) {
        if (C3273ac.m13971lr(wjvVar)) {
            m11726ri(frameLayout, wjvVar);
        } else if (C3273ac.m13968ka(wjvVar) || C3273ac.xha(wjvVar)) {
            m11724lr(frameLayout, wjvVar);
        } else {
            m11736ri(frameLayout, c3022ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m11728ri(wjv wjvVar) {
        return C3273ac.m13971lr(wjvVar) || C3273ac.m13968ka(wjvVar) || C3273ac.xha(wjvVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: di */
    public void mo11715di() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: fi */
    public boolean mo11716fi() {
        if (C3273ac.m13971lr(this.f9207ri.f9389lr)) {
            return true;
        }
        return (C3273ac.m13968ka(this.f9207ri.f9389lr) || C3273ac.xha(this.f9207ri.f9389lr)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ka */
    public boolean mo11717ka() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11718ri(FrameLayout frameLayout) {
        if (!C3273ac.m13968ka(this.f9207ri.f9389lr) || this.f9207ri.f9389lr.zyn() || this.f9207ri.aac == null) {
            return;
        }
        this.f9207ri.aac.mo16373ri(this.f9207ri.f9389lr.m14364ay().m14167lr() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11721ri(C3072mj c3072mj) {
        m11727ri(this.f9204lr, c3072mj, this.f9207ri);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: sf */
    public void mo11729sf() {
        if (C3273ac.m13971lr(this.f9207ri.f9389lr) && this.f9207ri.dzy != null && this.f9207ri.dzy.f9659vr != null) {
            if (this.f9207ri.dzy.f9659vr.m14001ka()) {
                this.f9207ri.dzy.mo12223lr(0);
                this.f9207ri.f9373aw.set(true);
            } else {
                this.f9207ri.bgr.set(true);
                m11751ri(true, false, true, 80);
            }
        }
        if (C3273ac.m13968ka(this.f9207ri.f9389lr) || C3273ac.xha(this.f9207ri.f9389lr)) {
            m11751ri(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    public RFEndCardBackUpLayout xha() {
        return null;
    }
}
