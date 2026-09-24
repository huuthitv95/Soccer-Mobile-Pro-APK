package com.bytedance.sdk.openadsdk.core.p223mj;

import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3270ik {
    /* JADX INFO: renamed from: lr */
    private static JSONObject m13930lr(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static void m13931ri(String str, long j) {
        JSONObject jSONObjectM13930lr = m13930lr(str, j);
        C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        c2741kaM10412lr.m10365ik(C3571ig.m16450ka("/api/ad/union/sdk/stats/"));
        c2741kaM10412lr.m10385fi(jSONObjectM13930lr.toString());
        c2741kaM10412lr.m10373ri(6);
        c2741kaM10412lr.m10371lr("uploadFrequentEvent");
        c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.mj.ik.1
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                iOException.getMessage();
                if (abstractC2740ik != null) {
                    C3594uq.m16664ri(abstractC2740ik.m10363fi());
                }
            }
        });
    }
}
