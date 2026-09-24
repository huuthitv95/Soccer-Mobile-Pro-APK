package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2403lr;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC2437mj {

    /* JADX INFO: renamed from: ri */
    private InterfaceC2403lr f6586ri;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m8423lr(C2500aw c2500aw) {
        try {
            JSONObject jSONObjectM8883ik = c2500aw.m8883ik();
            JSONObject jSONObject = new JSONObject(jSONObjectM8883ik.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectM8883ik.optJSONObject("creative");
            C2475mj c2475mjM8360ri = new C2432di(jSONObject, jSONObjectOptJSONObject, jSONObjectM8883ik.optJSONObject("AdSize"), new JSONObject(jSONObjectM8883ik.optString("diff_template_Plugin"))).m8360ri(c2500aw.m8885lr(), c2500aw.m8888qt(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), c2500aw);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                c2475mjM8360ri.m8633ri(jSONObject2.optString("color"));
                c2475mjM8360ri.m8636ri(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.f6586ri.mo8306ri(c2475mjM8360ri);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p116fi.InterfaceC2437mj
    /* JADX INFO: renamed from: ri */
    public void mo8408ri(InterfaceC2403lr interfaceC2403lr) {
        this.f6586ri = interfaceC2403lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p116fi.InterfaceC2437mj
    /* JADX INFO: renamed from: ri */
    public void mo8409ri(final C2500aw c2500aw) {
        if (c2500aw.m8879co() == 1) {
            m8423lr(c2500aw);
        } else {
            C2495ka.m8821ri(new AbstractRunnableC2676ik("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.fi.xha.1
                @Override // java.lang.Runnable
                public void run() {
                    xha.this.m8423lr(c2500aw);
                }
            }, 5);
        }
    }
}
