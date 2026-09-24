package com.mbridge.msdk.mbbanner.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.metadata.C13106a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BannerUtils {
    private static final String TAG = "BannerUtils";

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36737a = 0;

    private static synchronized List<C13106a> fillIdInList(List<C13106a> list, List<CampaignEx> list2) {
        if (list2 != null) {
            if (list2.size() > 0) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                for (CampaignEx campaignEx : list2) {
                    if (campaignEx != null) {
                        C13106a c13106a = new C13106a(campaignEx.getId(), campaignEx.getCreativeId());
                        if (list.size() >= 20) {
                            list.remove(0);
                        }
                        list.add(c13106a);
                    }
                }
            }
        }
        return list;
    }

    public static void inserCloseId(String str, List<CampaignEx> list) {
        Map<String, List<C13106a>> map = C13091b.f35891b;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (C13182a1.m37597b(str)) {
            if (map.containsKey(str)) {
                map.put(str, fillIdInList(map.get(str), list));
            } else {
                map.put(str, fillIdInList(new ArrayList(), list));
            }
        }
        C13091b.f35891b = map;
    }

    public static CampaignEx managerCampaignEX(String str, CampaignEx campaignEx) {
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
                Iterator<String> itKeys = jSONObject.keys();
                try {
                    if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception unused) {
                }
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
            } catch (JSONException e) {
                e.printStackTrace();
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
                    strValueOf = String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), Integer.valueOf(jSONObjectOptJSONObject.getString(C13088a.f35866h)).intValue()));
                    strValueOf2 = String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), Integer.valueOf(jSONObjectOptJSONObject.getString(C13088a.f35867i)).intValue()));
                } else {
                    strValueOf = "-999";
                    strValueOf2 = "-999";
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
                            strOptString3 = String.valueOf(C13229v0.m37876a(C13008c.m36588n().m36542d(), Integer.valueOf(strOptString3).intValue()));
                        }
                        sb.append(next2);
                        sb.append(C11744X3.j.f26434b);
                        sb.append(strOptString3);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb));
                }
            }
            return campaignWithBackData2;
        } catch (Throwable unused2) {
            return campaignEx;
        }
    }

    public static void uisList(Context context, List<CampaignEx> list) {
        if (context == null || list == null || list.size() == 0) {
            return;
        }
        C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(context));
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (c13020jM36706a != null && !c13020jM36706a.m36707a(campaignEx.getId())) {
                C13073g c13073g = new C13073g();
                c13073g.m36859a(campaignEx.getId());
                c13073g.m36861b(campaignEx.getFca());
                c13073g.m36863c(campaignEx.getFcb());
                c13073g.m36857a(0);
                c13073g.m36865d(0);
                c13073g.m36858a(System.currentTimeMillis());
                c13020jM36706a.m36708b(c13073g);
            }
        }
    }

    public static String getCloseIds(String str) {
        List<C13106a> list;
        try {
            Map<String, List<C13106a>> map = C13091b.f35891b;
            if (map == null || !C13182a1.m37597b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                C13106a c13106a = list.get(i);
                jSONObject.put("cid", c13106a.m37182a());
                jSONObject.put("crid", c13106a.m37183b());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
