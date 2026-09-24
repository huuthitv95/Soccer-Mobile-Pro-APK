package com.bytedance.sdk.openadsdk.p179co.p180ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p168ri.AbstractC2701nr;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.C3303qd;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2918nr extends AbstractC2701nr<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    public static final HashSet<String> f8727ri = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));

    /* JADX INFO: renamed from: lr */
    private wjv f8728lr;

    public C2918nr(wjv wjvVar) {
        this.f8728lr = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11216ri(C2705vr c2705vr, wjv wjvVar) {
        c2705vr.m10189ri(f8727ri, new C2918nr(wjvVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        String strPnk;
        wjv wjvVar = this.f8728lr;
        if (wjvVar == null || (strPnk = wjvVar.pnk()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                String strOptString = jSONObject.optString("key");
                if (TextUtils.isEmpty(strOptString) || !C3303qd.m14658ri().m14660lr(strPnk, strOptString)) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                jSONObject2.put("value", C3303qd.m14658ri().m14661ri(strPnk, strOptString));
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 1:
                C3303qd.m14658ri().m14662ri(strPnk);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                C3303qd.m14658ri().m14663ri(strPnk, strOptString2, strOptString3);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString("key");
                if (TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, C3303qd.m14658ri().m14659ik(strPnk, strOptString4) ? "0" : "1");
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
