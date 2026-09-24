package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2891ka {
    /* JADX INFO: renamed from: ri */
    public static void m11120ri(final wjv wjvVar, final C2894ri c2894ri, final C2889fi.ri riVar) {
        wjvVar.m14359ar();
        dzy.m16401lr(new AbstractRunnableC2676ik("mrc_report") { // from class: com.bytedance.sdk.openadsdk.ay.lr.ka.1
            @Override // java.lang.Runnable
            public void run() {
                if (wjvVar.udw()) {
                    if (wjvVar.vgs()) {
                        C3099ik.m12502ri(wjvVar.amj(), new C3099ik.lr("show_urls", wjvVar));
                    } else {
                        C3414ik.m15534ri(wjvVar);
                    }
                }
                String strM16476ri = C3571ig.m16476ri(wjvVar);
                final JSONObject jSONObject = new JSONObject();
                C2894ri c2894ri2 = c2894ri;
                JSONObject jSONObjectM15527ri = null;
                if (c2894ri2 != null) {
                    try {
                        jSONObject.put("root_view", C2894ri.m11133ri(c2894ri2));
                        C2889fi.ri riVar2 = riVar;
                        if (riVar2 != null) {
                            if (riVar2.f8614ri != -1) {
                                jSONObject.put("dynamic_show_type", riVar.f8614ri);
                            }
                            if (riVar.f8613lr != -1) {
                                jSONObjectM15527ri = C3414ik.m15527ri(riVar.f8613lr + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectM15527ri;
                C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, strM16476ri, "mrc_show", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ay.lr.ka.1.1
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ik */
                    public JSONObject mo11121ik() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        return jSONObject2;
                    }
                });
            }
        });
    }
}
