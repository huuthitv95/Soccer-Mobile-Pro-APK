package com.bytedance.sdk.openadsdk.p269vr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p217di.xha;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3600fi extends xha {
    public C3600fi(Context context) {
        this(context, null);
    }

    public C3600fi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3600fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16683ri(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m16683ri(Context context) {
        setId(slm.f13311vz);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setId(slm.f13274ib);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        c3195mj.setLayoutParams(layoutParams);
        c3195mj.setIncludeFontPadding(false);
        c3195mj.setText(C2729uq.m10311ri(context, "tt_video_without_wifi_tips"));
        c3195mj.setTextColor(Color.parseColor("#cacaca"));
        c3195mj.setTextSize(2, 14.0f);
        addView(c3195mj);
        xha xhaVar = new xha(context);
        xhaVar.setId(slm.mvf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, slm.f13274ib);
        layoutParams2.addRule(13);
        xhaVar.setLayoutParams(layoutParams2);
        addView(xhaVar);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(slm.cem);
        int iM16589lr = C3583qd.m16589lr(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams3.addRule(15);
        c3193ka.setLayoutParams(layoutParams3);
        c3193ka.setImageDrawable(C2729uq.m10303ik(context, "tt_new_play_video"));
        c3193ka.setScaleType(ImageView.ScaleType.FIT_XY);
        xhaVar.addView(c3193ka);
    }
}
