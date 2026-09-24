package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.g */
/* JADX INFO: compiled from: Setting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13635g extends C13630b {
    /* JADX INFO: renamed from: D */
    public static C13635g m39703D(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C13630b.m39385b(new JSONObject(str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("Setting", "parseSetting", e);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public String m39704P0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", m39527k());
            jSONObject.put("cfc", m39535m());
            jSONObject.put("cfb", m39406F0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, m39477b0());
            jSONObject.put("awct", m39518i());
            jSONObject.put("rurl", m39427M0());
            jSONObject.put("ujds", m39430N0());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, m39486c0());
            jSONObject.put("tcto", m39562s0());
            jSONObject.put("mv_wildcard", m39436Q());
            jSONObject.put("is_startup_crashsystem", m39404F());
            jSONObject.put("sfct", m39550p0());
            jSONObject.put("pcrn", m39450X());
            jSONObject.put("adct", m39494e());
            jSONObject.put("atrqt", m39512h());
            jSONObject.put("omsdkjs_url", m39446V());
            jSONObject.put("mcs", m39431O());
            jSONObject.put("GDPR_area", m39415I0());
            jSONObject.put("alrbs", m39500f());
            jSONObject.put(UserDataStore.CITY, m39567u());
            jSONObject.put("isDefault", m39401E());
            jSONObject.put("st_net", m39558r0());
            jSONObject.put("vtag", m39590z0());
            return jSONObject.toString();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            C13219q0.m37817b("Setting", "toJSON", th);
            return null;
        }
    }
}
