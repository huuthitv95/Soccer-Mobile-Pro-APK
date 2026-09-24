package com.mbridge.msdk.splash.common.util;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.common.util.a */
/* JADX INFO: compiled from: SplashUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13652a {

    /* JADX INFO: renamed from: a */
    private static final String f38190a = "a";

    /* JADX INFO: renamed from: a */
    public static CampaignEx m39824a(String str, CampaignEx campaignEx) throws JSONException {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception e) {
                    C13219q0.m37816b(f38190a, e.getMessage());
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                return campaignWithBackData;
            } catch (JSONException e2) {
                C13219q0.m37816b(f38190a, e2.getMessage());
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            if (campaignWithBackData2 == null) {
                campaignWithBackData2 = campaignEx;
            }
            if (!TextUtils.isEmpty(str)) {
                String strOptString2 = jSONObjectCampaignToJsonObject2.optString("unitId");
                if (!TextUtils.isEmpty(strOptString2)) {
                    campaignWithBackData2.setCampaignUnitId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(C13088a.f35868j);
                if (jSONObjectOptJSONObject != null) {
                    String string = jSONObjectOptJSONObject.getString(C13088a.f35866h);
                    String string2 = jSONObjectOptJSONObject.getString(C13088a.f35867i);
                    if (TextUtils.isEmpty(string)) {
                        string = "-999";
                    }
                    int i = Integer.parseInt(string);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = "-999";
                    }
                    int i2 = Integer.parseInt(string2);
                    strValueOf = i != -999 ? String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), i)) : "-999";
                    strValueOf2 = i2 != -999 ? String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), i2)) : "-999";
                } else {
                    strValueOf = "-999";
                    strValueOf2 = strValueOf;
                }
                campaignWithBackData2.setClickURL(C12684c.m34652a(campaignWithBackData2.getClickURL(), strValueOf, strValueOf2));
                String noticeUrl = campaignWithBackData2.getNoticeUrl();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    StringBuilder sb = new StringBuilder();
                    while (itKeys2.hasNext()) {
                        sb.append(C11744X3.j.f26436c);
                        String next2 = itKeys2.next();
                        String strOptString3 = jSONObjectOptJSONObject.optString(next2);
                        if (C13088a.f35866h.equals(next2) || C13088a.f35867i.equals(next2)) {
                            if (TextUtils.isEmpty(strOptString3)) {
                                strOptString3 = "-999";
                            }
                            int i3 = Integer.parseInt(strOptString3);
                            strOptString3 = i3 != -999 ? String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), i3)) : "-999";
                        }
                        sb.append(next2);
                        sb.append(C11744X3.j.f26434b);
                        sb.append(strOptString3);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb));
                }
            }
            return campaignWithBackData2;
        } catch (Throwable unused) {
            return campaignEx;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m39825a(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i == 4) {
                jSONObject2.put(C13088a.f35866h, -999);
                jSONObject2.put(C13088a.f35867i, -999);
            } else {
                jSONObject2.put(C13088a.f35866h, C13229v0.m37902b(C13008c.m36588n().m36542d(), f));
                jSONObject2.put(C13088a.f35867i, C13229v0.m37902b(C13008c.m36588n().m36542d(), f2));
            }
            jSONObject2.put(C13088a.f35871m, i);
            jSONObject2.put(C13088a.f35869k, C13008c.m36588n().m36542d().getResources().getConfiguration().orientation);
            jSONObject2.put(C13088a.f35870l, C13229v0.m37918d(C13008c.m36588n().m36542d()));
            jSONObject.put(C13088a.f35868j, jSONObject2);
        } catch (Exception e) {
            C13219q0.m37816b(f38190a, e.getMessage());
        }
        return jSONObject.toString();
    }
}
