package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2701nr;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2919qt extends AbstractC2701nr<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    public static final HashSet<String> f8729ri = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));

    /* JADX INFO: renamed from: lr */
    private final dzy f8730lr;

    public C2919qt(dzy dzyVar) {
        this.f8730lr = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11218ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10189ri(f8729ri, new C2919qt(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.f8730lr.jbs(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.f8730lr.m13429qt(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.f8730lr.m13457ri(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.f8730lr.m13426mj(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.f8730lr.xha(jSONObject);
        }
        return null;
    }
}
