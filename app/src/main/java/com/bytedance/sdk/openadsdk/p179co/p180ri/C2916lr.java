package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2697ik;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.dzy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2916lr extends AbstractC2697ik<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<dzy> f8723ri;

    public C2916lr(dzy dzyVar) {
        this.f8723ri = new WeakReference<>(dzyVar);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11213ri(C2705vr c2705vr, final dzy dzyVar) {
        c2705vr.m10185ri("interstitial_webview_close", new AbstractC2697ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.lr.1
            @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik.lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2697ik mo10158ri() {
                return new C2916lr(dzyVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo10155ri(JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        C3304qt.m14669lr().m14703vr();
        dzy dzyVar = this.f8723ri.get();
        if (dzyVar == null) {
            m10151ik();
        } else {
            dzyVar.m13427mj();
        }
    }
}
