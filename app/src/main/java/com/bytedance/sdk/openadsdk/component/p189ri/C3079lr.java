package com.bytedance.sdk.openadsdk.component.p189ri;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.jbs.C2972lr;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3079lr {
    /* JADX INFO: renamed from: lr */
    public static C3235mj m12324lr(wjv wjvVar, Activity activity, final C2981ri c2981ri, C2972lr c2972lr) {
        C3235mj c3235mj = new C3235mj(activity.getApplicationContext(), wjvVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.ri.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(c2981ri.m11605ik()));
                m13536ri(map);
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        c3235mj.m13528ri((View) c2972lr);
        m12327ri(activity.getApplicationContext(), wjvVar, c3235mj);
        m12328ri(c3235mj, wjvVar);
        return c3235mj;
    }

    /* JADX INFO: renamed from: ri */
    public static C3080ri m12325ri(wjv wjvVar, Activity activity, C2981ri c2981ri) {
        C3080ri c3080ri = new C3080ri(activity.getApplicationContext(), wjvVar, "open_ad", 4, c2981ri);
        c3080ri.m13528ri(activity.findViewById(R.id.content));
        m12327ri(activity.getApplicationContext(), wjvVar, c3080ri);
        m12328ri(c3080ri, wjvVar);
        return c3080ri;
    }

    /* JADX INFO: renamed from: ri */
    public static jbs m12326ri(wjv wjvVar, Activity activity, final C2981ri c2981ri, C2972lr c2972lr) {
        jbs jbsVar = new jbs(activity, wjvVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.ri.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(c2981ri.m11605ik()));
                m13536ri(map);
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        jbsVar.m13528ri(c2972lr);
        m12327ri(activity.getApplicationContext(), wjvVar, jbsVar);
        m12328ri(jbsVar, wjvVar);
        return jbsVar;
    }

    /* JADX INFO: renamed from: ri */
    private static void m12327ri(Context context, wjv wjvVar, C3220lr c3220lr) {
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        c3220lr.m13534ri(C3371ka.m15240ri(context, "open_ad"));
    }

    /* JADX INFO: renamed from: ri */
    public static void m12328ri(C3220lr c3220lr, wjv wjvVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(wjvVar.rzk()));
        map.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(C3279dw.m14090ik(wjvVar) ? 3 : 1));
        c3220lr.m13536ri(map);
    }
}
