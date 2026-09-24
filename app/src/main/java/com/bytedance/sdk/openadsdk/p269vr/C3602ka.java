package com.bytedance.sdk.openadsdk.p269vr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.p217di.C3190di;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.xha;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3602ka extends xha {
    public C3602ka(Context context) {
        this(context, null);
    }

    public C3602ka(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3602ka(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16685ri(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m16685ri(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iM16589lr = C3583qd.m16589lr(context, 60.0f);
        C3192ik c3192ik = new C3192ik(context);
        c3192ik.setId(slm.evm);
        c3192ik.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        c3192ik.setBackgroundColor(0);
        addView(c3192ik);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(slm.f13301sz);
        c3193ka.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c3193ka.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c3192ik.addView(c3193ka);
        C3190di c3190di = new C3190di(context);
        c3190di.setId(slm.f13266fb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams.gravity = 17;
        c3190di.setLayoutParams(layoutParams);
        c3190di.setIndeterminateDrawable(C3586sf.m16645ri(context, "tt_video_loading_progress_bar"));
        c3192ik.addView(c3190di);
        C3193ka c3193ka2 = new C3193ka(context);
        c3193ka2.setId(slm.bzf);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        c3193ka2.setLayoutParams(layoutParams2);
        c3193ka2.setScaleType(ImageView.ScaleType.CENTER);
        c3193ka2.setImageDrawable(C3586sf.m16645ri(context, "tt_play_movebar_textpage"));
        c3193ka2.setVisibility(8);
        addView(c3193ka2);
        C3603lr c3603lr = new C3603lr(context);
        c3603lr.setId(slm.f13281jm);
        c3603lr.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(c3603lr);
    }
}
