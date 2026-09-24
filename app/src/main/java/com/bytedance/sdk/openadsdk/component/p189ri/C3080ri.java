package com.bytedance.sdk.openadsdk.component.p189ri;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3080ri extends C3221ri {

    /* JADX INFO: renamed from: ri */
    private final C2981ri f9673ri;

    public C3080ri(Context context, wjv wjvVar, String str, int i, C2981ri c2981ri) {
        super(context, wjvVar, str, i);
        this.f9673ri = c2981ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            m13535ri("click_bar");
        } else {
            m13535ri("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.f9673ri.m11605ik()));
        m13536ri(map);
        super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
        C2889fi.m11114ri(this.f10695di, 9);
    }
}
