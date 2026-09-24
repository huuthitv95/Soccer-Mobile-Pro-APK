package com.bytedance.adsdk.ugeno.p090di.p091lr;

import android.view.View;
import com.bytedance.adsdk.ugeno.p107mj.C2321ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2254lr implements C2321ik.fi {
    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.fi
    /* JADX INFO: renamed from: ri */
    public void mo7478ri(View view, float f) {
        int width = view.getWidth();
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f < 0.0f) {
            view.setTranslationX((-width) * f);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f);
        }
        view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f)));
    }
}
