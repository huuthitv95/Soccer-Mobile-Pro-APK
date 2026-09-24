package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2697ik;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2882ka;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2920ri extends AbstractC2697ik<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<dzy> f8731ri;

    public C2920ri(dzy dzyVar) {
        this.f8731ri = new WeakReference<>(dzyVar);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11221ri(C2705vr c2705vr, final dzy dzyVar) {
        c2705vr.m10185ri("getNetworkData", new AbstractC2697ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.ri.1
            @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik.lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2697ik mo10158ri() {
                return new C2920ri(dzyVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo10155ri(JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        dzy dzyVar = this.f8731ri.get();
        if (dzyVar == null) {
            m10151ik();
        } else {
            dzyVar.m13456ri(jSONObject, new InterfaceC2882ka() { // from class: com.bytedance.sdk.openadsdk.co.ri.ri.2
                @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2882ka
                /* JADX INFO: renamed from: ri */
                public void mo11093ri(boolean z, C3289ri c3289ri) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            C2920ri.this.m10154ri(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", dzy.m13383ri(c3289ri));
                            C2920ri.this.m10154ri(jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
