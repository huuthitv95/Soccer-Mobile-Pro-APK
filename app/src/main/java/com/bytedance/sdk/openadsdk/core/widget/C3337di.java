package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3337di extends C3193ka {

    /* JADX INFO: renamed from: lr */
    private int f11724lr;

    /* JADX INFO: renamed from: ri */
    private float f11725ri;

    public C3337di(Context context) {
        super(context);
        this.f11725ri = 2.25f;
        this.f11724lr = 12;
        m15001ri();
    }

    public C3337di(Context context, int i, float f) {
        super(context);
        this.f11725ri = f;
        this.f11724lr = i;
        m15001ri();
    }

    /* JADX INFO: renamed from: lr */
    public static C3193ka m14999lr(Context context) {
        return new C3337di(context, 28, 5.0f);
    }

    /* JADX INFO: renamed from: ri */
    public static C3193ka m15000ri(Context context) {
        return new C3337di(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m15001ri() {
        setBackground(C3341ka.m15010ri());
        setImageResource(C2729uq.m10305ka(getContext(), "tt_close_btn"));
        int iM16589lr = C3583qd.m16589lr(getContext(), this.f11725ri);
        setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3193ka, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iM16589lr = C3583qd.m16589lr(getContext(), this.f11724lr);
            layoutParams.width = iM16589lr;
            layoutParams.height = iM16589lr;
        }
        super.setLayoutParams(layoutParams);
    }
}
