package com.bytedance.adsdk.ugeno.p090di.p091lr;

import android.view.View;
import com.bytedance.adsdk.ugeno.p107mj.C2321ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2255ri implements C2321ik.fi {
    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.fi
    /* JADX INFO: renamed from: ri */
    public void mo7478ri(View view, float f) {
        float width = f < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f * 90.0f);
    }
}
