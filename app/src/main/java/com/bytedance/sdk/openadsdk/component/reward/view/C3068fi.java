package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.common.C2932co;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3068fi {
    /* JADX INFO: renamed from: ri */
    public static void m12237ri(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        C3070ka c3070ka = new C3070ka(context);
        c3070ka.setId(slm.bgr);
        c3070ka.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(c3070ka, layoutParams);
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setId(slm.f13309vr);
        c3191fi.setVisibility(8);
        frameLayout.addView(c3191fi, new FrameLayout.LayoutParams(-1, -1));
        C2634di c2634di = new C2634di(context, true, C2634di.ik.ENDCARD);
        c2634di.setLayerType(2, null);
        c2634di.setVisibility(4);
        c2634di.setId(slm.slm);
        frameLayout.addView(c2634di, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(slm.f13257bu);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new RFEndCardBackUpLayout(context), new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ri */
    public static void m12238ri(FrameLayout frameLayout, wjv wjvVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(context);
        xhaVar.setId(slm.f13270fr);
        xhaVar.setBackgroundColor(Color.parseColor("#F8F8F8"));
        frameLayout.addView(xhaVar, new FrameLayout.LayoutParams(-1, -1));
        C2932co c2932co = new C2932co(context);
        c2932co.setId(slm.f13300su);
        xhaVar.addView(c2932co, new RelativeLayout.LayoutParams(-1, -1));
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setId(slm.igq);
        c3191fi.setOrientation(1);
        c3191fi.setVisibility(8);
        c3191fi.setGravity(1);
        c3191fi.setId(slm.f13276ig);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        xhaVar.addView(c3191fi, layoutParams);
        C3335bu c3335bu = new C3335bu(context);
        c3335bu.setId(slm.f13263dw);
        c3191fi.addView(c3335bu, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 80.0f), C3583qd.m16589lr(context, 80.0f)));
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setId(slm.ory);
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(c3195mj, layoutParams2);
        C3195mj c3195mj2 = new C3195mj(context);
        c3195mj2.setId(slm.hcw);
        c3195mj2.setGravity(17);
        c3195mj2.setTextColor(Color.parseColor("#80161823"));
        c3195mj2.setTextSize(2, 16.0f);
        c3195mj2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int iM16589lr = C3583qd.m16589lr(context, 60.0f);
        layoutParams3.leftMargin = iM16589lr;
        layoutParams3.rightMargin = iM16589lr;
        layoutParams3.setMarginStart(layoutParams3.leftMargin);
        layoutParams3.setMarginEnd(layoutParams3.rightMargin);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi.addView(c3195mj2, layoutParams3);
        C3195mj c3195mj3 = new C3195mj(context);
        c3195mj3.setId(slm.f13290oh);
        c3195mj3.setGravity(17);
        c3195mj3.setTextColor(-1);
        c3195mj3.setText(C2729uq.m10311ri(context, "tt_video_mobile_go_detail"));
        c3195mj3.setBackground(C3586sf.m16645ri(context, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 255.0f), C3583qd.m16589lr(context, 44.0f));
        layoutParams4.topMargin = C3583qd.m16589lr(context, 32.0f);
        c3191fi.addView(c3195mj3, layoutParams4);
        C3195mj c3195mj4 = new C3195mj(context);
        c3195mj4.setId(slm.f13319zf);
        c3195mj4.setGravity(17);
        c3195mj4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3195mj4.setText("Sorry,this AD fails to load...");
        c3195mj4.setVisibility(8);
        c3195mj4.setGravity(1);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(13);
        xhaVar.addView(c3195mj4, layoutParams5);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(slm.f13312xd);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams6.addRule(12);
        layoutParams6.leftMargin = C3583qd.m16589lr(context, 16.0f);
        layoutParams6.setMarginStart(layoutParams6.leftMargin);
        layoutParams6.bottomMargin = C3583qd.m16589lr(context, 20.0f);
        xhaVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams6);
    }
}
