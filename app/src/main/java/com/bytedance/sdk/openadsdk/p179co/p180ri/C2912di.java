package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2912di extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<dzy> f8716ri;

    public C2912di(dzy dzyVar) {
        this.f8716ri = new WeakReference<>(dzyVar);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11208ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("interactiveFinish", new C2912di(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<dzy> weakReference = this.f8716ri;
        if (weakReference != null && weakReference.get() != null) {
            dzy dzyVar = this.f8716ri.get();
            wjv wjvVarM13417ka = dzyVar.m13417ka();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iQuz = wjvVarM13417ka != null ? wjvVarM13417ka.quz() : 0;
                if (iOptInt >= 0 && iQuz >= 0) {
                    iOptInt = Math.min(iOptInt, iQuz);
                } else if (iOptInt < 0) {
                    iOptInt = iQuz >= 0 ? iQuz : 0;
                }
                if (z) {
                    dzyVar.m13413ik(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e) {
                C2707ac.m10196ik("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }
}
