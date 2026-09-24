package com.bytedance.sdk.openadsdk.p269vr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p217di.xha;
import com.bytedance.sdk.openadsdk.core.widget.C3346ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3603lr extends xha {
    public C3603lr(Context context) {
        this(context, null);
    }

    public C3603lr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3603lr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16686ri(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m16686ri(Context context) {
        setId(slm.f13281jm);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        C3193ka c3193ka = new C3193ka(getContext());
        c3193ka.setId(slm.ezp);
        c3193ka.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c3193ka.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        c3193ka.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        c3193ka.setBackgroundColor(Color.parseColor("#7f000000"));
        c3193ka.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(c3193ka);
        xha xhaVar = new xha(context);
        xhaVar.setId(slm.adz);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        xhaVar.setLayoutParams(layoutParams);
        addView(xhaVar);
        int iM16589lr = C3583qd.m16589lr(context, 44.0f);
        C3346ri c3346ri = new C3346ri(context);
        c3346ri.setId(slm.f13283kt);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams2.addRule(14);
        c3346ri.setLayoutParams(layoutParams2);
        c3346ri.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xhaVar.addView(c3346ri);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setId(slm.feb);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams3.addRule(8, slm.f13283kt);
        layoutParams3.addRule(19, slm.f13283kt);
        layoutParams3.addRule(5, slm.f13283kt);
        layoutParams3.addRule(7, slm.f13283kt);
        layoutParams3.addRule(18, slm.f13283kt);
        layoutParams3.addRule(6, slm.f13283kt);
        layoutParams3.addRule(14);
        c3195mj.setLayoutParams(layoutParams3);
        c3195mj.setBackground(C3586sf.m16645ri(context, "tt_circle_solid_mian"));
        c3195mj.setGravity(17);
        c3195mj.setTextColor(-1);
        c3195mj.setTextSize(2, 19.0f);
        c3195mj.setTypeface(Typeface.defaultFromStyle(1));
        c3195mj.setVisibility(8);
        xhaVar.addView(c3195mj);
        C3195mj c3195mj2 = new C3195mj(context);
        c3195mj2.setId(slm.zyn);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, slm.f13283kt);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = C3583qd.m16589lr(context, 6.0f);
        c3195mj2.setLayoutParams(layoutParams4);
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj2.setMaxLines(1);
        c3195mj2.setTextColor(-1);
        c3195mj2.setTextSize(2, 12.0f);
        xhaVar.addView(c3195mj2);
        C3195mj c3195mj3 = new C3195mj(context);
        c3195mj3.setId(slm.tnn);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 100.0f), C3583qd.m16589lr(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, slm.zyn);
        layoutParams5.topMargin = C3583qd.m16589lr(context, 20.0f);
        c3195mj3.setLayoutParams(layoutParams5);
        c3195mj3.setMinWidth(C3583qd.m16589lr(context, 72.0f));
        c3195mj3.setMaxLines(1);
        c3195mj3.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj3.setTextColor(-1);
        c3195mj3.setTextSize(2, 14.0f);
        c3195mj3.setBackground(C3586sf.m16645ri(context, "tt_ad_cover_btn_begin_bg"));
        c3195mj3.setGravity(17);
        int iM16589lr2 = C3583qd.m16589lr(context, 10.0f);
        int iM16589lr3 = C3583qd.m16589lr(context, 2.0f);
        c3195mj3.setPadding(iM16589lr2, iM16589lr3, iM16589lr2, iM16589lr3);
        c3195mj3.setVisibility(8);
        xhaVar.addView(c3195mj3);
    }
}
