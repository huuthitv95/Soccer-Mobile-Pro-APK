package com.bytedance.sdk.openadsdk.core.p219ik;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3217fi extends C3221ri {
    public AbstractC3217fi(Context context, wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo11996ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3, boolean z);

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        if (m13538ri(view, z)) {
            mo11996ri(view, f, f2, f3, f4, sparseArray, this.f10686zf, this.f10684su, this.igq, z);
        }
        super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
    }
}
