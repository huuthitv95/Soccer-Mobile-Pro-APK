package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3341ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends com.bytedance.sdk.openadsdk.core.p217di.xha {

    /* JADX INFO: renamed from: ik */
    private final C3195mj f9044ik;

    /* JADX INFO: renamed from: lr */
    private final C3193ka f9045lr;

    /* JADX INFO: renamed from: ri */
    private final C3193ka f9046ri;

    public xha(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iM16589lr = C3583qd.m16589lr(context, 12.0f);
        int iM16589lr2 = C3583qd.m16589lr(context, 16.0f);
        int iM16589lr3 = C3583qd.m16589lr(context, 20.0f);
        int iM16589lr4 = C3583qd.m16589lr(context, 24.0f);
        int iM16589lr5 = C3583qd.m16589lr(context, 28.0f);
        C3193ka c3193ka = new C3193ka(context);
        this.f9046ri = c3193ka;
        c3193ka.setId(520093713);
        int iM16589lr6 = C3583qd.m16589lr(getContext(), 5.0f);
        c3193ka.setPadding(iM16589lr6, iM16589lr6, iM16589lr6, iM16589lr6);
        c3193ka.setScaleType(ImageView.ScaleType.CENTER);
        c3193ka.setBackground(C3341ka.m15010ri());
        c3193ka.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM16589lr5, iM16589lr5);
        layoutParams.topMargin = iM16589lr3;
        layoutParams.leftMargin = iM16589lr2;
        layoutParams.setMarginStart(iM16589lr2);
        c3193ka.setLayoutParams(layoutParams);
        C3193ka c3193ka2 = new C3193ka(context);
        this.f9045lr = c3193ka2;
        c3193ka2.setId(520093714);
        c3193ka2.setPadding(iM16589lr6, iM16589lr6, iM16589lr6, iM16589lr6);
        c3193ka2.setScaleType(ImageView.ScaleType.CENTER);
        c3193ka2.setBackground(C3341ka.m15010ri());
        c3193ka2.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_close_btn"));
        if (c3193ka2.getDrawable() != null) {
            c3193ka2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM16589lr5, iM16589lr5);
        layoutParams2.topMargin = iM16589lr3;
        layoutParams2.rightMargin = iM16589lr2;
        layoutParams2.setMarginEnd(iM16589lr2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        c3193ka2.setLayoutParams(layoutParams2);
        c3193ka2.setVisibility(4);
        C3195mj c3195mj = new C3195mj(context);
        this.f9044ik = c3195mj;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iM16589lr4);
        layoutParams3.topMargin = iM16589lr3;
        layoutParams3.rightMargin = iM16589lr2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iM16589lr2);
        layoutParams3.addRule(21);
        c3195mj.setLayoutParams(layoutParams3);
        c3195mj.setBackground(C3341ka.m15009lr());
        c3195mj.setGravity(17);
        c3195mj.setPadding(iM16589lr, 0, iM16589lr, 0);
        c3195mj.setTextColor(-1);
        c3195mj.setTextSize(1, 14.0f);
        c3195mj.setVisibility(4);
        addView(c3193ka);
        addView(c3195mj);
        addView(c3193ka2);
    }

    public C3195mj getTopCountDown() {
        return this.f9044ik;
    }

    public View getTopDislike() {
        return this.f9046ri;
    }

    public C3193ka getTopSkip() {
        return this.f9045lr;
    }
}
