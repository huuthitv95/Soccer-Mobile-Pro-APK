package com.bytedance.sdk.openadsdk.core.p200co.p208lr;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.core.model.C3284lr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3162fi extends AbstractViewOnTouchListenerC2318ik<FrameLayout> {
    public C3162fi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public FrameLayout mo7552ri() {
        FrameLayout frameLayout = new FrameLayout(this.f5888lr);
        C3284lr c3284lr = new C3284lr();
        c3284lr.m14199ri(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.f5888lr);
        pAGLogoView.initData(c3284lr);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
    }
}
