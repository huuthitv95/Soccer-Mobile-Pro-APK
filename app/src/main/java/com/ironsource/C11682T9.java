package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.T9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11682T9 {

    /* JADX INFO: renamed from: a */
    static String f25775a = "ManRewInst_";

    /* JADX INFO: renamed from: a */
    public static String m27525a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f25775a + jSONObject.optString("name");
    }

    /* JADX INFO: renamed from: b */
    public static String m27526b() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m27523a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public static String m27524a(C11471H9 c11471h9) {
        if (c11471h9.m25999i()) {
            return C12386n8.e.Banner.toString();
        }
        if (c11471h9.m26004n()) {
            return C12386n8.e.RewardedVideo.toString();
        }
        return C12386n8.e.Interstitial.toString();
    }
}
