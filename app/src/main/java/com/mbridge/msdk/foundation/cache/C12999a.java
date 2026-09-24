package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.C13076j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13013c;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a */
/* JADX INFO: compiled from: BaseCandidateCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class C12999a {

    /* JADX INFO: renamed from: e */
    private static String f35444e = "BaseCandidateCache";

    /* JADX INFO: renamed from: f */
    public static int f35445f = 4;

    /* JADX INFO: renamed from: a */
    protected C13013c f35446a;

    /* JADX INFO: renamed from: b */
    private JSONArray f35447b;

    /* JADX INFO: renamed from: c */
    private JSONObject f35448c;

    /* JADX INFO: renamed from: d */
    private String f35449d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a$a */
    /* JADX INFO: compiled from: BaseCandidateCache.java */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.f35452b, bVar2.f35452b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a$b */
    /* JADX INFO: compiled from: BaseCandidateCache.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        private C13000b f35451a;

        /* JADX INFO: renamed from: b */
        private double f35452b;

        public b(double d, C13000b c13000b) {
            this.f35452b = d;
            this.f35451a = c13000b;
        }

        /* JADX INFO: renamed from: a */
        public C13000b m36490a() {
            return this.f35451a;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36477a(int i) {
        C13013c c13013c = this.f35446a;
        if (c13013c != null) {
            c13013c.m36633a(this.f35449d, i);
            m36478a(f35445f, 1, null, true, "", "", i, this.f35449d);
        }
    }

    /* JADX INFO: renamed from: b */
    public double m36483b(String str) {
        C13001c c13001cM36475a = m36475a(str);
        if (c13001cM36475a != null && c13001cM36475a.m36521g() != C13001c.f35465k && c13001cM36475a.m36521g() != C13001c.f35463i) {
            try {
                String[] strArrSplit = C13207k0.m37712a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1.0d;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m36484c(String str) {
        JSONArray jSONArray = this.f35447b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f35447b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < this.f35447b.length(); i++) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f35447b.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.f35448c = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m36485d(String str) {
        C13001c c13001cM36475a = m36475a(str);
        if (c13001cM36475a != null && c13001cM36475a.m36521g() != C13001c.f35465k && c13001cM36475a.m36521g() != C13001c.f35463i) {
            String[] strArrSplit = C13207k0.m37712a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public void m36486e(String str) {
        this.f35449d = str;
    }

    /* JADX INFO: renamed from: a */
    public C13001c m36475a(String str) {
        C13001c c13001c = new C13001c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f35447b;
            if (jSONArray != null && jSONArray.length() != 0) {
                String strM37712a = C13207k0.m37712a(str.split("_")[3]);
                if (TextUtils.isEmpty(strM37712a)) {
                    c13001c.m36518d("bid token exception:decode error");
                    c13001c.m36510a(C13001c.f35463i);
                    return c13001c;
                }
                String[] strArrSplit = strM37712a.split("\\|");
                if (strArrSplit.length == 0) {
                    c13001c.m36518d("bid token can not get bid price");
                    c13001c.m36510a(C13001c.f35463i);
                    return c13001c;
                }
                if (strArrSplit.length > 0) {
                    try {
                        Double.parseDouble(strArrSplit[0]);
                    } catch (Exception unused) {
                        c13001c.m36518d("bid token can not cast bid price");
                        c13001c.m36510a(C13001c.f35463i);
                        return c13001c;
                    }
                }
                if (TextUtils.isEmpty(this.f35449d)) {
                    c13001c.m36518d("unitId is empty");
                    c13001c.m36510a(C13001c.f35465k);
                }
                return c13001c;
            }
            c13001c.m36518d("config is empty");
            c13001c.m36510a(C13001c.f35463i);
            return c13001c;
        }
        c13001c.m36518d("bid token exception");
        c13001c.m36510a(C13001c.f35463i);
        return c13001c;
    }

    /* JADX INFO: renamed from: b */
    private List<Map<Integer, String>> m36472b(List<Map<Integer, String>> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Map<Integer, String> map = list.get(i2);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), m36468a(entry.getValue(), i, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m36482a(JSONArray jSONArray) {
        this.f35447b = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public void m36481a(List<CampaignEx> list, C13154c c13154c, String str, int i, String str2, int i2, double d) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CampaignEx campaignEx = list.get(i3);
                        campaignEx.setReadyState(0);
                        if (c13154c != null) {
                            campaignEx.setNLRid(c13154c.m37463t());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i);
                        String strM37713b = C13207k0.m37713b(d + "");
                        campaignEx.setNoticeUrl(m36468a(campaignEx.getNoticeUrl(), i2, str, strM37713b));
                        campaignEx.setClickURL(m36468a(campaignEx.getClickURL(), i2, str, strM37713b));
                        campaignEx.setImpressionURL(m36468a(campaignEx.getImpressionURL(), i2, str, strM37713b));
                        campaignEx.setOnlyImpressionURL(m36468a(campaignEx.getOnlyImpressionURL(), i2, str, strM37713b));
                        campaignEx.setAdvImp(m36469a(campaignEx.getAdvImpList(), i2, str, strM37713b));
                        C13076j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.m36892d(m36471a(nativeVideoTracking.m36901i(), i2, str, strM37713b));
                            nativeVideoTracking.m36891c(m36471a(nativeVideoTracking.m36899h(), i2, str, strM37713b));
                            nativeVideoTracking.m36904k(m36471a(nativeVideoTracking.m36915p(), i2, str, strM37713b));
                            nativeVideoTracking.m36920s(m36471a(nativeVideoTracking.m36930y(), i2, str, strM37713b));
                            nativeVideoTracking.m36889a(m36471a(nativeVideoTracking.m36893d(), i2, str, strM37713b));
                            nativeVideoTracking.m36890b(m36471a(nativeVideoTracking.m36897g(), i2, str, strM37713b));
                            nativeVideoTracking.m36894e(m36471a(nativeVideoTracking.m36903j(), i2, str, strM37713b));
                            nativeVideoTracking.m36923t(m36471a(nativeVideoTracking.m36931z(), i2, str, strM37713b));
                            nativeVideoTracking.m36924u(m36471a(nativeVideoTracking.m36931z(), i2, str, strM37713b));
                            nativeVideoTracking.m36926v(m36471a(nativeVideoTracking.m36887B(), i2, str, strM37713b));
                            nativeVideoTracking.m36895f(m36471a(nativeVideoTracking.m36905k(), i2, str, strM37713b));
                            nativeVideoTracking.m36896g(m36471a(nativeVideoTracking.m36907l(), i2, str, strM37713b));
                            nativeVideoTracking.m36898h(m36471a(nativeVideoTracking.m36909m(), i2, str, strM37713b));
                            nativeVideoTracking.m36900i(m36471a(nativeVideoTracking.m36911n(), i2, str, strM37713b));
                            nativeVideoTracking.m36902j(m36471a(nativeVideoTracking.m36913o(), i2, str, strM37713b));
                            nativeVideoTracking.m36906l(m36471a(nativeVideoTracking.m36917q(), i2, str, strM37713b));
                            nativeVideoTracking.m36916q(m36471a(nativeVideoTracking.m36928w(), i2, str, strM37713b));
                            nativeVideoTracking.m36908m(m36471a(nativeVideoTracking.m36919r(), i2, str, strM37713b));
                            nativeVideoTracking.m36918r(m36471a(nativeVideoTracking.m36929x(), i2, str, strM37713b));
                            nativeVideoTracking.m36910n(m36471a(nativeVideoTracking.m36921s(), i2, str, strM37713b));
                            nativeVideoTracking.m36888a(m36472b(nativeVideoTracking.m36922t(), i2, str, strM37713b));
                            nativeVideoTracking.m36914p(m36471a(nativeVideoTracking.m36927v(), i2, str, strM37713b));
                            nativeVideoTracking.m36912o(m36471a(nativeVideoTracking.m36925u(), i2, str, strM37713b));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(m36470a(campaignEx.getPv_urls(), i2, str, strM37713b));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13001c m36474a() {
        C13001c c13001c = new C13001c();
        try {
            JSONArray jSONArray = this.f35447b;
            if (jSONArray != null && jSONArray.length() != 0) {
                if (this.f35446a == null) {
                    c13001c.m36518d("db error");
                    c13001c.m36510a(C13001c.f35465k);
                    return c13001c;
                }
                return c13001c;
            }
            c13001c.m36518d("setting config is null");
            c13001c.m36510a(C13001c.f35463i);
            return c13001c;
        } catch (Exception unused) {
            c13001c.m36518d("checkConfigAndDB exception");
            c13001c.m36510a(C13001c.f35465k);
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C13000b> m36476a(int i, long j) {
        if (i >= 0) {
            m36477a(i);
        }
        C13013c c13013c = this.f35446a;
        if (c13013c != null) {
            return c13013c.m36632a(this.f35449d, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m36480a(List<b> list, int i) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new a());
                    int size = list.size() - i;
                    if (size > 0) {
                        List<b> listSubList = list.subList(0, size);
                        if (this.f35446a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i2 = 0; i2 < listSubList.size(); i2++) {
                            C13000b c13000b = listSubList.get(i2).f35451a;
                            this.f35446a.m36634a(this.f35449d, c13000b.m36505e(), c13000b.m36503d());
                            m36478a(f35445f, 1, null, true, c13000b.m36505e(), c13000b.m36503d(), -1, this.f35449d);
                        }
                    }
                }
            } catch (Exception e) {
                C13219q0.m37815a(f35444e, e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m36468a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (C13188c1.m37647c(str) > 0) {
            return str + "&ca_sce=" + i + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    /* JADX INFO: renamed from: a */
    private String m36469a(Map<Integer, String> map, int i, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", m36468a(value, i, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    private String[] m36471a(String[] strArr, int i, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2] = m36468a(strArr[i2], i, str, str2);
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: a */
    private List<String> m36470a(List<String> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(m36468a(list.get(i2), i, str, str2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public long m36473a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strM37712a = C13207k0.m37712a(ecppv);
        if (TextUtils.isEmpty(strM37712a)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strM37712a) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return 0L;
            }
            JSONObject jSONObjectM36484c = m36484c(m36485d(str));
            int iOptInt = jSONObjectM36484c != null ? jSONObjectM36484c.optInt("max_cache_num", 20) : 20;
            C13013c c13013c = this.f35446a;
            if (c13013c == null || iOptInt <= 0) {
                return -1L;
            }
            return c13013c.m36630a(list, this.f35449d);
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36479a(String str, String str2, int i, String str3) {
        try {
            if (this.f35446a != null && !TextUtils.isEmpty(str3)) {
                if (i == 1) {
                    this.f35446a.m36629a(str2, str, this.f35449d, i);
                    m36478a(f35445f, 3, null, true, str2, str, -1, this.f35449d);
                } else if (i == 2) {
                    this.f35446a.m36634a(this.f35449d, str2, str);
                    m36478a(f35445f, 1, null, true, str2, str, -1, this.f35449d);
                } else {
                    if (i != 3) {
                        return;
                    }
                    this.f35446a.m36636b(str2, str, this.f35449d);
                    m36478a(f35445f, 4, null, true, str2, str, -1, this.f35449d);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b A[Catch: Exception -> 0x01ae, TryCatch #2 {Exception -> 0x01ae, blocks: (B:3:0x0011, B:7:0x002e, B:9:0x0066, B:12:0x0076, B:14:0x007c, B:17:0x0083, B:19:0x008e, B:22:0x0095, B:24:0x009b, B:26:0x00a3, B:28:0x00b3, B:30:0x00fe, B:37:0x0114, B:41:0x011d, B:43:0x0123, B:45:0x0131, B:46:0x0135, B:48:0x0140, B:50:0x0146, B:52:0x014e, B:54:0x0159, B:56:0x016b, B:65:0x0187, B:68:0x0193, B:70:0x019b, B:71:0x01a0, B:57:0x0170, B:31:0x0103), top: B:80:0x0011 }] */
    /* JADX INFO: renamed from: a */
    public void m36478a(int i, int i2, List<CampaignEx> list, boolean z, String str, String str2, int i3, String str3) {
        String str4;
        C13154c c13154c;
        String str5;
        String currentLocalRid;
        C13013c c13013c;
        C13157e c13157e = new C13157e();
        try {
            c13157e.m37501a("type", i2 + "");
            c13157e.m37501a("result", z ? "1" : "2");
            c13157e.m37501a("max_usage_limit", i3 + "");
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, str3 + "");
            c13157e.m37501a("scene", UserDataStore.DATE_OF_BIRTH);
            JSONObject jSONObject = this.f35448c;
            if (jSONObject != null) {
                c13157e.m37501a("config", jSONObject.toString());
            }
            String str6 = "rid";
            if (i2 == 1 && TextUtils.isEmpty(str2) && (c13013c = this.f35446a) != null) {
                try {
                    List<C13000b> listM36631a = c13013c.m36631a(str3, -1, -1L);
                    JSONArray jSONArray = new JSONArray();
                    if (listM36631a != null && listM36631a.size() > 0) {
                        int i4 = 0;
                        while (i4 < listM36631a.size()) {
                            C13000b c13000b = listM36631a.get(i4);
                            if (c13000b != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(str6, c13000b.m36505e());
                                str4 = str6;
                                try {
                                    jSONObject2.put("ts", c13000b.m36508h());
                                    jSONObject2.put("lrid", c13000b.m36503d());
                                    jSONObject2.put("ecppv", C13207k0.m37713b(c13000b.m36496b() + ""));
                                    jSONObject2.put("state", c13000b.m36507g());
                                    jSONObject2.put("showCount", c13000b.m36506f());
                                    jSONObject2.put("interval_ts", c13000b.m36500c());
                                    jSONArray.put(jSONObject2);
                                } catch (JSONException e) {
                                    e = e;
                                    e.printStackTrace();
                                    c13154c = null;
                                    if (list != null) {
                                        str5 = str4;
                                        currentLocalRid = str2;
                                    } else {
                                        str5 = str4;
                                        currentLocalRid = str2;
                                    }
                                    c13157e.m37501a(str5, str);
                                    c13157e.m37501a("lrid", currentLocalRid);
                                    if (c13154c == null) {
                                        c13154c = new C13154c();
                                    }
                                    c13154c.m37456n(str3);
                                    c13154c.m37423a("m_candidate_db", c13157e);
                                    C13156d.m37475b().m37484a("m_candidate_db", c13154c);
                                }
                            } else {
                                str4 = str6;
                            }
                            i4++;
                            str6 = str4;
                        }
                    }
                    str4 = str6;
                    c13157e.m37501a("cache", jSONArray.toString());
                } catch (JSONException e2) {
                    e = e2;
                    str4 = str6;
                }
            } else {
                str4 = "rid";
            }
            c13154c = null;
            if (list != null || list.size() <= 0) {
                str5 = str4;
                currentLocalRid = str2;
            } else {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    int i5 = 0;
                    CampaignEx campaignEx = list.get(0);
                    if (campaignEx != null) {
                        currentLocalRid = campaignEx.getCurrentLocalRid();
                        try {
                            c13154c = C13156d.m37475b().m37489b(currentLocalRid);
                        } catch (JSONException e3) {
                            e = e3;
                            str5 = str4;
                            e.printStackTrace();
                            c13157e.m37501a(str5, str);
                            c13157e.m37501a("lrid", currentLocalRid);
                            if (c13154c == null) {
                                c13154c = new C13154c();
                            }
                            c13154c.m37456n(str3);
                            c13154c.m37423a("m_candidate_db", c13157e);
                            C13156d.m37475b().m37484a("m_candidate_db", c13154c);
                        }
                    } else {
                        currentLocalRid = str2;
                    }
                    while (i5 < list.size()) {
                        CampaignEx campaignEx2 = list.get(i5);
                        if (campaignEx2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            str5 = str4;
                            try {
                                jSONObject3.put(str5, campaignEx2.getRequestId());
                                jSONObject3.put("rid_n", campaignEx2.getRequestIdNotice());
                                jSONArray2.put(jSONObject3);
                            } catch (JSONException e4) {
                                e = e4;
                                e.printStackTrace();
                                c13157e.m37501a(str5, str);
                                c13157e.m37501a("lrid", currentLocalRid);
                                if (c13154c == null) {
                                    c13154c = new C13154c();
                                }
                                c13154c.m37456n(str3);
                                c13154c.m37423a("m_candidate_db", c13157e);
                                C13156d.m37475b().m37484a("m_candidate_db", c13154c);
                            }
                        } else {
                            str5 = str4;
                        }
                        i5++;
                        str4 = str5;
                    }
                    str5 = str4;
                    c13157e.m37501a("c_info", jSONArray2.toString());
                } catch (JSONException e5) {
                    e = e5;
                    str5 = str4;
                    currentLocalRid = str2;
                }
            }
            c13157e.m37501a(str5, str);
            c13157e.m37501a("lrid", currentLocalRid);
            if (c13154c == null) {
                c13154c = new C13154c();
            }
            c13154c.m37456n(str3);
            c13154c.m37423a("m_candidate_db", c13157e);
            C13156d.m37475b().m37484a("m_candidate_db", c13154c);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
