package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2968di extends AbstractC2970ik {

    /* JADX INFO: renamed from: aw */
    private final C3191fi f9005aw;
    private final slm bgr;

    public C2968di(Context context, wjv wjvVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        C3191fi c3191fi = new C3191fi(context);
        this.f9005aw = c3191fi;
        c3191fi.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = C3583qd.m16589lr(context, 24.0f);
        layoutParams.topMargin = C3583qd.m16589lr(context, 56.0f);
        c3191fi.setLayoutParams(layoutParams);
        c3191fi.setClickable(false);
        c3191fi.setGravity(16);
        c3191fi.setOrientation(0);
        this.f9009di = new C3335bu(context);
        this.f9009di.setId(520093759);
        this.f9009di.setLayoutParams(new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 24.0f), C3583qd.m16589lr(context, 24.0f)));
        this.xha = new C3195mj(context);
        this.xha.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = C3583qd.m16589lr(context, 8.0f);
        this.xha.setLayoutParams(layoutParams2);
        this.xha.setEllipsize(TextUtils.TruncateAt.END);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#161823"));
        this.xha.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = C3583qd.m16589lr(context, 24.0f);
        layoutParams3.rightMargin = C3583qd.m16589lr(context, 24.0f);
        xhaVar.setLayoutParams(layoutParams3);
        this.jbs = new C3335bu(context);
        this.jbs.setId(com.bytedance.sdk.openadsdk.utils.slm.zyu);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 80.0f), C3583qd.m16589lr(context, 80.0f));
        layoutParams4.addRule(14);
        this.jbs.setLayoutParams(layoutParams4);
        this.f9015qt = new C3195mj(context);
        this.f9015qt.setId(com.bytedance.sdk.openadsdk.utils.slm.rko);
        this.f9015qt.setTextSize(24.0f);
        this.f9015qt.setTextColor(Color.parseColor("#161823"));
        this.f9015qt.setGravity(17);
        this.f9015qt.setMaxLines(1);
        this.f9015qt.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, com.bytedance.sdk.openadsdk.utils.slm.zyu);
        layoutParams5.topMargin = C3583qd.m16589lr(context, 12.0f);
        layoutParams5.addRule(14);
        this.f9015qt.setLayoutParams(layoutParams5);
        this.f9017sf = new C3195mj(context);
        this.f9017sf.setId(com.bytedance.sdk.openadsdk.utils.slm.quz);
        this.f9017sf.setTextSize(16.0f);
        this.f9017sf.setTextColor(Color.parseColor("#80161823"));
        this.f9017sf.setGravity(17);
        this.f9017sf.setMaxLines(2);
        this.f9017sf.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, com.bytedance.sdk.openadsdk.utils.slm.rko);
        layoutParams6.topMargin = C3583qd.m16589lr(context, 4.0f);
        layoutParams6.addRule(14);
        this.f9017sf.setLayoutParams(layoutParams6);
        slm slmVar = new slm(context);
        this.bgr = slmVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = C3583qd.m16589lr(context, 12.0f);
        slmVar.setLayoutParams(layoutParams7);
        this.f9010fi = new C3195mj(context);
        this.f9010fi.setId(520093717);
        this.f9010fi.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        this.f9010fi.setEllipsize(TextUtils.TruncateAt.END);
        this.f9010fi.setLines(1);
        this.f9010fi.setGravity(17);
        this.f9010fi.setTextColor(-1);
        this.f9010fi.setTextSize(16.0f);
        this.f9010fi.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, C3583qd.m16589lr(context, 44.0f));
        layoutParams8.addRule(3, com.bytedance.sdk.openadsdk.utils.slm.quz);
        layoutParams8.topMargin = C3583qd.m16589lr(context, 54.0f);
        layoutParams8.addRule(14);
        this.f9010fi.setLayoutParams(layoutParams8);
        this.f9012ka = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        this.f9012ka.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams9.leftMargin = C3583qd.m16589lr(context, 16.0f);
        layoutParams9.bottomMargin = C3583qd.m16589lr(context, 24.0f);
        layoutParams9.addRule(12);
        this.f9012ka.setLayoutParams(layoutParams9);
        addView(this.f9014mj);
        c3191fi.addView(this.f9009di);
        c3191fi.addView(this.xha);
        addView(c3191fi);
        xhaVar.addView(this.jbs);
        xhaVar.addView(this.f9015qt);
        xhaVar.addView(this.f9017sf);
        xhaVar.addView(slmVar);
        xhaVar.addView(this.f9010fi);
        addView(xhaVar);
        addView(this.f9012ka);
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3193ka getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3195mj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public slm getScoreBar() {
        return this.bgr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public View getUserInfo() {
        return this.f9005aw;
    }
}
