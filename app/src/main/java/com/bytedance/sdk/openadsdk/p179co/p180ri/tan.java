package com.bytedance.sdk.openadsdk.p179co.p180ri;

import android.view.ViewGroup;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ik */
    private wjv f8736ik;

    /* JADX INFO: renamed from: ka */
    private String f8737ka;

    /* JADX INFO: renamed from: lr */
    private dzy f8738lr;

    /* JADX INFO: renamed from: ri */
    private C2634di f8739ri;

    public tan(C2634di c2634di, String str, dzy dzyVar, wjv wjvVar) {
        this.f8739ri = c2634di;
        this.f8737ka = str;
        this.f8738lr = dzyVar;
        this.f8736ik = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11226ri(C2705vr c2705vr, C2634di c2634di, dzy dzyVar, wjv wjvVar) {
        c2705vr.m10186ri("closeWebview", new tan(c2634di, "closeWebview", dzyVar, wjvVar));
        c2705vr.m10186ri("makeVisible", new tan(c2634di, "makeVisible", dzyVar, wjvVar));
        c2705vr.m10186ri("getCurrentVisibleState", new tan(c2634di, "getCurrentVisibleState", dzyVar, wjvVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f8737ka;
        str2.hashCode();
        switch (str2) {
            case "getCurrentVisibleState":
                wjv wjvVar = this.f8736ik;
                if (wjvVar != null) {
                    jSONObject2.put("visibleState", !C3302pv.m14656ri(this.f8739ri, 20, wjvVar.m14404go(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.tan.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tan.this.f8739ri != null) {
                            tan.this.f8739ri.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) tan.this.f8739ri.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(tan.this.f8739ri);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f8739ri == null) {
                    jSONObject2.put("success", false);
                    return jSONObject2;
                }
                jSONObject2.put("success", true);
                com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.tan.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tan.this.f8739ri != null) {
                            tan.this.f8739ri.setVisibility(0);
                        }
                    }
                });
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
