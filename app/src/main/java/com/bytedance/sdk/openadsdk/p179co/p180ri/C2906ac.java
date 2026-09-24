package com.bytedance.sdk.openadsdk.p179co.p180ri;

import android.view.ViewGroup;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p168ri.AbstractC2701nr;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2906ac extends AbstractC2701nr<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    public static final HashSet<String> f8699ri = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));

    /* JADX INFO: renamed from: ik */
    private dzy f8700ik;

    /* JADX INFO: renamed from: ka */
    private wjv f8701ka;

    /* JADX INFO: renamed from: lr */
    private C2634di f8702lr;

    public C2906ac(C2634di c2634di, dzy dzyVar, wjv wjvVar) {
        this.f8702lr = c2634di;
        this.f8700ik = dzyVar;
        this.f8701ka = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11198ri(C2705vr c2705vr, C2634di c2634di, dzy dzyVar, wjv wjvVar) {
        c2705vr.m10189ri(f8699ri, new C2906ac(c2634di, dzyVar, wjvVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        str.hashCode();
        switch (str) {
            case "getCurrentVisibleState":
                wjv wjvVar = this.f8701ka;
                if (wjvVar != null) {
                    jSONObject2.put("visibleState", !C3302pv.m14656ri(this.f8702lr, 20, wjvVar.m14404go(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.ac.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C2906ac.this.f8702lr != null) {
                            C2906ac.this.f8702lr.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) C2906ac.this.f8702lr.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(C2906ac.this.f8702lr);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f8702lr == null) {
                    jSONObject2.put("success", false);
                    return jSONObject2;
                }
                jSONObject2.put("success", true);
                com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.co.ri.ac.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C2906ac.this.f8702lr != null) {
                            C2906ac.this.f8702lr.setVisibility(0);
                        }
                    }
                });
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
