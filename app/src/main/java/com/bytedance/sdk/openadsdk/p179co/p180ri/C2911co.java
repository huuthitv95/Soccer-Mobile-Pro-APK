package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2701nr;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2911co extends AbstractC2701nr<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private static final HashSet<String> f8714ri = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));

    /* JADX INFO: renamed from: lr */
    private final dzy f8715lr;

    public C2911co(dzy dzyVar) {
        this.f8715lr = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11206ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10189ri(f8714ri, new C2911co(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        str.hashCode();
        switch (str) {
            case "popupDismiss":
                this.f8715lr.slm();
                return null;
            case "popupShow":
                this.f8715lr.m13461vr();
                return null;
            case "getCurrentCountdownStatus":
                return this.f8715lr.m13402bu();
            case "popupRenderDidFinish":
                this.f8715lr.m13428nr();
                return null;
            case "changeCountdownStatus":
                this.f8715lr.m13460sf(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
