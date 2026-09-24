package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.C2726ri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C3213fr implements IDefaultEncrypt {

    /* JADX INFO: renamed from: ri */
    private final PangleEncryptConstant.CryptDataScene f10654ri;

    public C3213fr(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.f10654ri = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        C3330su.m14970ri(1, this.f10654ri, i);
        return C2726ri.m10278ri(jSONObject);
    }
}
