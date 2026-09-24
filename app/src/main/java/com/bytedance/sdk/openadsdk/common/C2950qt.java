package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2950qt extends RelativeLayout {
    public C2950qt(Context context) {
        super(context);
        m11398ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m11398ri() {
        Context context = getContext();
        int iM16589lr = C3583qd.m16589lr(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, C3583qd.m16589lr(context, 44.0f)));
        setBackgroundColor(-1);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(520093720);
        c3193ka.setClickable(true);
        c3193ka.setFocusable(true);
        c3193ka.setImageDrawable(C3586sf.m16645ri(context, "tt_leftbackicon_selector"));
        int iM16589lr2 = C3583qd.m16589lr(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM16589lr2, iM16589lr2);
        layoutParams.leftMargin = iM16589lr;
        layoutParams.addRule(15);
        addView(c3193ka, layoutParams);
        C3193ka c3193ka2 = new C3193ka(context);
        c3193ka2.setId(520093716);
        c3193ka2.setClickable(true);
        c3193ka2.setFocusable(true);
        c3193ka2.setImageDrawable(C3586sf.m16645ri(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM16589lr2, iM16589lr2);
        layoutParams2.leftMargin = iM16589lr;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(c3193ka2, layoutParams2);
        C3193ka c3193ka3 = new C3193ka(context);
        c3193ka3.setId(com.bytedance.sdk.openadsdk.utils.slm.jxw);
        c3193ka3.setImageDrawable(C2729uq.m10303ik(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iM16589lr2, iM16589lr2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iM16589lr;
        addView(c3193ka3, layoutParams3);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setId(com.bytedance.sdk.openadsdk.utils.slm.f13288nh);
        c3195mj.setSingleLine(true);
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj.setGravity(17);
        c3195mj.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3195mj.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, com.bytedance.sdk.openadsdk.utils.slm.jxw);
        int iM16589lr3 = C3583qd.m16589lr(context, 25.0f);
        layoutParams4.rightMargin = iM16589lr3;
        layoutParams4.leftMargin = iM16589lr3;
        addView(c3195mj, layoutParams4);
    }
}
