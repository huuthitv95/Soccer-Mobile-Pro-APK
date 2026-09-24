package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.e */
/* JADX INFO: compiled from: ClickTime.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13071e {

    /* JADX INFO: renamed from: a */
    private String f35662a;

    /* JADX INFO: renamed from: b */
    private String f35663b;

    /* JADX INFO: renamed from: c */
    private String f35664c;

    /* JADX INFO: renamed from: d */
    private int f35665d;

    /* JADX INFO: renamed from: e */
    private int f35666e;

    /* JADX INFO: renamed from: f */
    private String f35667f;

    /* JADX INFO: renamed from: g */
    private String f35668g;

    /* JADX INFO: renamed from: h */
    private String f35669h;

    /* JADX INFO: renamed from: i */
    private int f35670i;

    /* JADX INFO: renamed from: j */
    private String f35671j;

    /* JADX INFO: renamed from: k */
    private int f35672k;

    /* JADX INFO: renamed from: l */
    private String f35673l;

    /* JADX INFO: renamed from: m */
    private int f35674m;

    /* JADX INFO: renamed from: n */
    private String f35675n;

    /* JADX INFO: renamed from: o */
    private String f35676o;

    /* JADX INFO: renamed from: p */
    private int f35677p;

    /* JADX INFO: renamed from: q */
    private String f35678q;

    /* JADX INFO: renamed from: a */
    public String m36814a() {
        return this.f35662a;
    }

    /* JADX INFO: renamed from: b */
    public String m36817b() {
        return this.f35664c;
    }

    /* JADX INFO: renamed from: c */
    public int m36820c() {
        return this.f35665d;
    }

    /* JADX INFO: renamed from: d */
    public String m36823d() {
        return this.f35663b;
    }

    /* JADX INFO: renamed from: e */
    public void m36827e(int i) {
        this.f35674m = i;
    }

    /* JADX INFO: renamed from: f */
    public void m36830f(int i) {
        this.f35677p = i;
    }

    /* JADX INFO: renamed from: g */
    public String m36832g() {
        return this.f35668g;
    }

    /* JADX INFO: renamed from: h */
    public void m36835h(String str) {
        this.f35673l = str;
    }

    /* JADX INFO: renamed from: i */
    public void m36837i(String str) {
        this.f35675n = str;
    }

    /* JADX INFO: renamed from: j */
    public String m36838j() {
        return this.f35671j;
    }

    /* JADX INFO: renamed from: k */
    public void m36841k(String str) {
        this.f35678q = str;
    }

    /* JADX INFO: renamed from: l */
    public String m36842l() {
        return this.f35673l;
    }

    /* JADX INFO: renamed from: m */
    public int m36843m() {
        return this.f35674m;
    }

    /* JADX INFO: renamed from: n */
    public String m36844n() {
        return this.f35675n;
    }

    /* JADX INFO: renamed from: o */
    public String m36845o() {
        return this.f35676o;
    }

    /* JADX INFO: renamed from: p */
    public int m36846p() {
        return this.f35677p;
    }

    /* JADX INFO: renamed from: q */
    public String m36847q() {
        return this.f35678q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f35662a + ", click_duration=" + this.f35663b + ", lastUrl=" + this.f35671j + ", code=" + this.f35666e + ", excepiton=" + this.f35668g + ", header=" + this.f35669h + ", content=" + this.f35667f + ", type=" + this.f35677p + ", click_type=" + this.f35665d + C11744X3.j.f26440e;
    }

    /* JADX INFO: renamed from: a */
    public void m36815a(int i) {
        this.f35665d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m36819b(String str) {
        this.f35664c = str;
    }

    /* JADX INFO: renamed from: c */
    public void m36821c(int i) {
        this.f35670i = i;
    }

    /* JADX INFO: renamed from: d */
    public void m36824d(int i) {
        this.f35672k = i;
    }

    /* JADX INFO: renamed from: e */
    public int m36826e() {
        return this.f35666e;
    }

    /* JADX INFO: renamed from: f */
    public String m36829f() {
        return this.f35667f;
    }

    /* JADX INFO: renamed from: g */
    public void m36833g(String str) {
        this.f35671j = str;
    }

    /* JADX INFO: renamed from: h */
    public String m36834h() {
        return this.f35669h;
    }

    /* JADX INFO: renamed from: i */
    public int m36836i() {
        return this.f35670i;
    }

    /* JADX INFO: renamed from: j */
    public void m36839j(String str) {
        this.f35676o = str;
    }

    /* JADX INFO: renamed from: k */
    public int m36840k() {
        return this.f35672k;
    }

    /* JADX INFO: renamed from: a */
    public void m36816a(String str) {
        this.f35662a = str;
    }

    /* JADX INFO: renamed from: b */
    public void m36818b(int i) {
        this.f35666e = i;
    }

    /* JADX INFO: renamed from: c */
    public void m36822c(String str) {
        this.f35663b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m36825d(String str) {
        this.f35667f = str;
    }

    /* JADX INFO: renamed from: e */
    public void m36828e(String str) {
        this.f35668g = str;
    }

    /* JADX INFO: renamed from: f */
    public void m36831f(String str) {
        this.f35669h = str;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m36813a(C13071e c13071e) {
        if (c13071e == null) {
            return null;
        }
        String strM36838j = c13071e.m36838j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", c13071e.m36844n());
            jSONObject.put("rid_n", c13071e.m36845o());
            jSONObject.put("click_type", c13071e.m36820c());
            jSONObject.put("type", c13071e.m36846p());
            jSONObject.put("cid", c13071e.m36814a());
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, c13071e.m36823d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13071e.m36847q());
            jSONObject.put("last_url", strM36838j);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, c13071e.m36826e());
            jSONObject.put("exception", c13071e.m36832g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, c13071e.m36836i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, c13071e.m36840k());
            jSONObject.put("click_time", c13071e.m36817b());
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", c13071e.m36843m());
                jSONObject.put("network_str", c13071e.m36842l());
            }
            return jSONObject;
        } catch (Throwable th) {
            C13219q0.m37816b("ClickTime", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<JSONObject> m36812a(List<C13071e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (C13071e c13071e : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", c13071e.m36844n());
                jSONObject.put("rid_n", c13071e.m36845o());
                jSONObject.put("cid", c13071e.m36814a());
                jSONObject.put("click_type", c13071e.m36820c());
                jSONObject.put("type", c13071e.m36846p());
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, c13071e.m36823d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13071e.m36847q());
                jSONObject.put("last_url", c13071e.m36838j());
                jSONObject.put("content", c13071e.m36829f());
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, c13071e.m36826e());
                jSONObject.put("exception", c13071e.m36832g());
                jSONObject.put("header", c13071e.m36834h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, c13071e.m36836i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, c13071e.m36840k());
                jSONObject.put("click_time", c13071e.m36817b());
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", c13071e.m36843m());
                    jSONObject.put("network_str", c13071e.m36842l());
                }
                String strM36847q = c13071e.m36847q();
                if (!TextUtils.isEmpty(strM36847q)) {
                    String str = AbstractC13003a.f35476r.get(strM36847q);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }
}
