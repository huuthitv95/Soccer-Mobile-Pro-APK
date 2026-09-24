package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends C3220lr {
    public jbs(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr
    /* JADX INFO: renamed from: ri */
    protected C3277co mo13525ri(float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float fM16589lr;
        float fM16589lr2;
        long j3;
        long j4;
        int[] iArrM16626ri = C3583qd.m16626ri(view);
        if (iArrM16626ri == null || iArrM16626ri.length != 2) {
            fM16589lr = f3;
            fM16589lr2 = f4;
        } else {
            int i3 = iArrM16626ri[0];
            int i4 = iArrM16626ri[1];
            if (this.tan == 0) {
                f = (C3583qd.m16589lr(this.f10698ka, f) + i3) - 0.5f;
                f2 = (C3583qd.m16589lr(this.f10698ka, f2) + i4) - 0.5f;
                fM16589lr = (C3583qd.m16589lr(this.f10698ka, f3) + i3) - 0.5f;
                fM16589lr2 = (C3583qd.m16589lr(this.f10698ka, f4) + i4) - 0.5f;
            } else {
                fM16589lr = f3;
                fM16589lr2 = f4;
            }
        }
        if (this.f10696fi != null) {
            j3 = this.f10696fi.f11348fi;
            j4 = this.f10696fi.f11347di;
        } else {
            j3 = j;
            j4 = j2;
        }
        this.tan = 0;
        return new C3277co.ri().m14046di(f).m14048fi(f2).m14052ka(fM16589lr).m14050ik(fM16589lr2).m14056lr(j3).m14061ri(j4).m14065ri(iArrM16626ri).m14058lr(C3583qd.m16585ik(view)).m14053ka(this.f10684su).m14049fi(this.igq).m14047di(this.f10686zf).m14055lr(C3304qt.m14669lr().m14700ri() ? 1 : 2).m14062ri(sparseArray).m14063ri(str).m14060ri(i2).m14064ri(jSONObject).m14057lr(jSONObject2).m14066ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m13676ri(com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        this.f10696fi = slmVar;
    }
}
