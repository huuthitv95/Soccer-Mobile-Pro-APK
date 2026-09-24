package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Campaign;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class DomainCampaignEx extends Campaign {
    private static final String JSON_KEY_AD_TRACKING_DLE = "D+S8+FxXJFPsYFc3+F5/Hv==";
    private static final String JSON_KEY_AD_TRACKING_DLS = "D+S8+FxXJFPsYFc3+bfTD+zT";
    private static final String JSON_KEY_AD_TRACKING_I = "D+S8+FQ/hbxtY7M=";
    public static final String KEY_BIND_ID = "bind_id";
    public static final String KEY_GH_ID = "gh_id";
    public static final String KEY_GH_PATH = "gh_path";
    private static String TAG = "DomainCampaignEx";
    private String bindId;
    private String ghId;
    private String ghPath;

    public static JSONObject campaignToJsonObject(JSONObject jSONObject, CampaignEx campaignEx) throws JSONException {
        return jSONObject;
    }

    public static JSONObject object2TrackingStr(JSONObject jSONObject, C13076j c13076j) {
        if (jSONObject == null || c13076j == null) {
            return null;
        }
        try {
            if (c13076j.m36886A() != null) {
                jSONObject.put(C13207k0.m37712a(JSON_KEY_AD_TRACKING_DLS), CampaignEx.processNativeVideoTrackingArray2Json(c13076j.m36886A()));
            }
            if (c13076j.m36931z() != null) {
                jSONObject.put(C13207k0.m37712a(JSON_KEY_AD_TRACKING_DLE), CampaignEx.processNativeVideoTrackingArray2Json(c13076j.m36931z()));
            }
            if (c13076j.m36887B() != null) {
                jSONObject.put(C13207k0.m37712a(JSON_KEY_AD_TRACKING_I), CampaignEx.processNativeVideoTrackingArray2Json(c13076j.m36887B()));
                return jSONObject;
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("DomainCampaignEx", e.getMessage(), e);
            }
        }
        return jSONObject;
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, CampaignEx campaignEx) {
        String strOptString = jSONObject.optString(KEY_GH_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            campaignEx.setGhId(strOptString);
            String strOptString2 = jSONObject.optString(KEY_GH_PATH);
            if (!TextUtils.isEmpty(strOptString2)) {
                campaignEx.setGhPath(C13207k0.m37712a(strOptString2));
            }
            campaignEx.setBindId(jSONObject.optString(KEY_BIND_ID));
        }
        return campaignEx;
    }

    public static CampaignEx parseCampaignWithBackData(JSONObject jSONObject, CampaignEx campaignEx) {
        String strOptString = jSONObject.optString(KEY_GH_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            campaignEx.setGhId(strOptString);
            String strOptString2 = jSONObject.optString(KEY_GH_PATH);
            if (!TextUtils.isEmpty(strOptString2)) {
                campaignEx.setGhPath(C13207k0.m37712a(strOptString2));
            }
            campaignEx.setBindId(jSONObject.optString(KEY_BIND_ID));
        }
        return campaignEx;
    }

    protected static String replaceValueByKey(CampaignUnit campaignUnit, CampaignEx campaignEx, String str) {
        if (campaignUnit != null && !TextUtils.isEmpty(str) && campaignEx != null) {
            try {
                HashMap<String, String> rks = campaignUnit.getRks();
                if (rks != null) {
                    rks.entrySet().iterator();
                    for (Map.Entry<String, String> entry : rks.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> aks = campaignEx.getAks();
                if (aks != null) {
                    aks.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : aks.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> epMap = campaignUnit.getEpMap();
                if (epMap != null) {
                    for (Map.Entry<String, String> entry3 : epMap.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                return str.replaceAll("\\{c\\}", URLEncoder.encode(campaignUnit.assembCParams(), C11341A5.f23802O));
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("DomainCampaignEx", th.getMessage(), th);
                }
            }
        }
        return str;
    }

    public static C13076j trackingStr2Object(JSONObject jSONObject, C13076j c13076j) {
        if (jSONObject == null || c13076j == null) {
            return null;
        }
        try {
            c13076j.m36924u(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C13207k0.m37712a(JSON_KEY_AD_TRACKING_DLS))));
            c13076j.m36923t(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C13207k0.m37712a(JSON_KEY_AD_TRACKING_DLE))));
            c13076j.m36926v(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C13207k0.m37712a(JSON_KEY_AD_TRACKING_I))));
            return c13076j;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("DomainCampaignEx", e.getMessage(), e);
            }
            return c13076j;
        }
    }

    @Deprecated
    public String getBindId() {
        return this.bindId;
    }

    public String getGhId() {
        return this.ghId;
    }

    public String getGhPath() {
        return this.ghPath;
    }

    public boolean needShowIDialog(CampaignEx campaignEx) {
        return false;
    }

    public void setBindId(String str) {
        this.bindId = str;
    }

    public void setGhId(String str) {
        this.ghId = str;
    }

    public void setGhPath(String str) {
        this.ghPath = str;
    }
}
