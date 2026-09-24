package com.bytedance.adsdk.ugeno.p090di.p091lr;

import android.view.View;
import com.bytedance.adsdk.ugeno.p107mj.C2321ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2252ik implements C2321ik.fi {

    /* JADX INFO: renamed from: ri */
    final float f5594ri = 0.8f;

    /* JADX INFO: renamed from: lr */
    final float f5593lr = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.fi
    /* JADX INFO: renamed from: ri */
    public void mo7478ri(View view, float f) {
        float f2 = ((f < 0.0f ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = (f * (f < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(Math.abs(f3));
    }
}
