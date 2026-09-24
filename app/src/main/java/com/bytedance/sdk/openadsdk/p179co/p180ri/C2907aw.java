package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2907aw extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private WeakReference<C2634di> f8705ri;

    public C2907aw(C2634di c2634di) {
        this.f8705ri = new WeakReference<>(c2634di);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11200ri(C2705vr c2705vr, C2634di c2634di) {
        c2705vr.m10186ri("preventTouchEvent", new C2907aw(c2634di));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            C2634di c2634di = this.f8705ri.get();
            if (c2634di == null) {
                jSONObject2.put("success", false);
                return jSONObject2;
            }
            c2634di.setIsPreventTouchEvent(zOptBoolean);
            jSONObject2.put("success", true);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
