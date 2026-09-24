package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.ironsource.C12538u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.videocommon.entity.C14216c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.setting.a */
/* JADX INFO: compiled from: RewardSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14221a {

    /* JADX INFO: renamed from: a */
    private Map<String, Integer> f41088a;

    /* JADX INFO: renamed from: b */
    private Map<String, C14216c> f41089b;

    /* JADX INFO: renamed from: c */
    private long f41090c;

    /* JADX INFO: renamed from: d */
    private long f41091d;

    /* JADX INFO: renamed from: e */
    private long f41092e;

    /* JADX INFO: renamed from: f */
    private long f41093f;

    /* JADX INFO: renamed from: g */
    private long f41094g;

    /* JADX INFO: renamed from: h */
    private long f41095h;

    /* JADX INFO: renamed from: j */
    private String f41097j;

    /* JADX INFO: renamed from: i */
    private int f41096i = 0;

    /* JADX INFO: renamed from: k */
    private String f41098k = "";

    /* JADX INFO: renamed from: l */
    private String f41099l = "";

    /* JADX INFO: renamed from: a */
    public static C14221a m42632a(String str) {
        C14221a c14221a = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                C14221a c14221a2 = new C14221a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    c14221a2.m42639b(jSONObject.optString("ab_id", ""));
                    c14221a2.m42643c(jSONObject.optString("rid", ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                            Integer.valueOf(iOptInt).getClass();
                            if (!TextUtils.isEmpty(next)) {
                                if (TextUtils.isEmpty(next) || iOptInt != 0) {
                                    map.put(next, Integer.valueOf(iOptInt));
                                } else {
                                    map.put(next, 1000);
                                }
                            }
                        }
                        c14221a2.m42636a(map);
                    }
                    c14221a2.m42640b(C14216c.m42621a(jSONObject.optJSONArray(C12538u.f32489j)));
                    c14221a2.m42642c(jSONObject.optLong("getpf", 43200L));
                    c14221a2.m42648e(jSONObject.optLong("ruct", 5400L));
                    c14221a2.m42645d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    c14221a2.m42638b(jSONObject.optLong("dlct", 3600L));
                    c14221a2.m42650f(jSONObject.optLong("vcct", 5L));
                    c14221a2.m42635a(jSONObject.optLong("current_time"));
                    c14221a2.m42646d(jSONObject.optString("vtag", ""));
                    return c14221a2;
                } catch (Exception e) {
                    e = e;
                    c14221a = c14221a2;
                    e.printStackTrace();
                    return c14221a;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return c14221a;
    }

    /* JADX INFO: renamed from: a */
    public String m42633a() {
        return this.f41097j;
    }

    /* JADX INFO: renamed from: a */
    public void m42634a(int i) {
        this.f41096i = i;
    }

    /* JADX INFO: renamed from: a */
    public void m42635a(long j) {
        this.f41095h = j;
    }

    /* JADX INFO: renamed from: a */
    public void m42636a(Map<String, Integer> map) {
        this.f41088a = map;
    }

    /* JADX INFO: renamed from: b */
    public long m42637b() {
        return this.f41095h;
    }

    /* JADX INFO: renamed from: b */
    public void m42638b(long j) {
        this.f41093f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m42639b(String str) {
        this.f41097j = str;
    }

    /* JADX INFO: renamed from: b */
    public void m42640b(Map<String, C14216c> map) {
        this.f41089b = map;
    }

    /* JADX INFO: renamed from: c */
    public long m42641c() {
        return this.f41093f;
    }

    /* JADX INFO: renamed from: c */
    public void m42642c(long j) {
        this.f41090c = j;
    }

    /* JADX INFO: renamed from: c */
    public void m42643c(String str) {
        this.f41099l = str;
    }

    /* JADX INFO: renamed from: d */
    public long m42644d() {
        return this.f41090c * 1000;
    }

    /* JADX INFO: renamed from: d */
    public void m42645d(long j) {
        this.f41092e = j;
    }

    /* JADX INFO: renamed from: d */
    public void m42646d(String str) {
        this.f41098k = str;
    }

    /* JADX INFO: renamed from: e */
    public long m42647e() {
        return this.f41092e * 1000;
    }

    /* JADX INFO: renamed from: e */
    public void m42648e(long j) {
        this.f41091d = j;
    }

    /* JADX INFO: renamed from: f */
    public String m42649f() {
        return this.f41099l;
    }

    /* JADX INFO: renamed from: f */
    public void m42650f(long j) {
        this.f41094g = j;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, C14216c> m42651g() {
        return this.f41089b;
    }

    /* JADX INFO: renamed from: h */
    public long m42652h() {
        return this.f41091d * 1000;
    }

    /* JADX INFO: renamed from: i */
    public long m42653i() {
        return this.f41094g;
    }

    /* JADX INFO: renamed from: j */
    public String m42654j() {
        return this.f41098k;
    }

    /* JADX INFO: renamed from: k */
    public JSONObject m42655k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f41088a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f41088a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Map<String, C14216c> map2 = this.f41089b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, C14216c> entry2 : this.f41089b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        C14216c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.m42626c());
                            jSONObject3.put("amount", value.m42623a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put(C12538u.f32489j, jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f41090c);
            jSONObject.put("ruct", this.f41091d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f41092e);
            jSONObject.put("dlct", this.f41093f);
            jSONObject.put("vcct", this.f41094g);
            jSONObject.put("current_time", this.f41095h);
            jSONObject.put("vtag", this.f41098k);
            jSONObject.put("isDefault", this.f41096i);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
