package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lr */
    private String f8720lr;

    /* JADX INFO: renamed from: ri */
    private final dzy f8721ri;

    public jbs(dzy dzyVar, String str) {
        this.f8721ri = dzyVar;
        this.f8720lr = str;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11211ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("endcardDynamicCreatives", new jbs(dzyVar, "endcardDynamicCreatives"));
        c2705vr.m10186ri("multiOpenCovert", new jbs(dzyVar, "multiOpenCovert"));
        c2705vr.m10186ri("skipToNextAd", new jbs(dzyVar, "skipToNextAd"));
        c2705vr.m10186ri("speedVideoOrTimer", new jbs(dzyVar, "speedVideoOrTimer"));
        c2705vr.m10186ri("openPlayable", new jbs(dzyVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        if ("endcardDynamicCreatives".equals(this.f8720lr)) {
            return this.f8721ri.jbs(jSONObject);
        }
        if ("multiOpenCovert".equals(this.f8720lr)) {
            this.f8721ri.m13429qt(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.f8720lr)) {
            this.f8721ri.m13457ri(jSONObject, this.f8720lr);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.f8720lr)) {
            return this.f8721ri.m13426mj(jSONObject);
        }
        if ("openPlayable".equals(this.f8720lr)) {
            return this.f8721ri.xha(jSONObject);
        }
        return null;
    }
}
