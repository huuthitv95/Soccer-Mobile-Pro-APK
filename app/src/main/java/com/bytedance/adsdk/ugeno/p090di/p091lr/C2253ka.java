package com.bytedance.adsdk.ugeno.p090di.p091lr;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.p107mj.C2321ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2253ka implements C2321ik.fi {

    /* JADX INFO: renamed from: ri */
    private String f5595ri;

    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.fi
    /* JADX INFO: renamed from: ri */
    public void mo7478ri(View view, float f) {
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        }
        if (TextUtils.equals(this.f5595ri, "cube")) {
            float height = f < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7479ri(String str) {
        this.f5595ri = str;
    }
}
