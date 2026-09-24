package com.mbridge.msdk.setting;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.pangle.PangleConstants;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.c */
/* JADX INFO: compiled from: BaseUnitSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13631c {

    /* JADX INFO: renamed from: A */
    private String f38043A;

    /* JADX INFO: renamed from: D */
    private int f38046D;

    /* JADX INFO: renamed from: E */
    private int f38047E;

    /* JADX INFO: renamed from: I */
    private int f38051I;

    /* JADX INFO: renamed from: K */
    private String f38053K;

    /* JADX INFO: renamed from: N */
    private int f38056N;

    /* JADX INFO: renamed from: b */
    private List<Integer> f38058b;

    /* JADX INFO: renamed from: c */
    private List<Integer> f38059c;

    /* JADX INFO: renamed from: d */
    private int f38060d;

    /* JADX INFO: renamed from: e */
    private int f38061e;

    /* JADX INFO: renamed from: f */
    private int f38062f;

    /* JADX INFO: renamed from: g */
    private int f38063g;

    /* JADX INFO: renamed from: h */
    private int f38064h;

    /* JADX INFO: renamed from: i */
    private int f38065i;

    /* JADX INFO: renamed from: k */
    private long f38067k;

    /* JADX INFO: renamed from: l */
    private long f38068l;

    /* JADX INFO: renamed from: m */
    private int f38069m;

    /* JADX INFO: renamed from: n */
    private int f38070n;

    /* JADX INFO: renamed from: o */
    private int f38071o;

    /* JADX INFO: renamed from: p */
    private long f38072p;

    /* JADX INFO: renamed from: q */
    private long f38073q;

    /* JADX INFO: renamed from: r */
    private int f38074r;

    /* JADX INFO: renamed from: s */
    private String f38075s;

    /* JADX INFO: renamed from: t */
    private int f38076t;

    /* JADX INFO: renamed from: u */
    private int f38077u;

    /* JADX INFO: renamed from: z */
    private String f38082z;

    /* JADX INFO: renamed from: a */
    private String f38057a = "";

    /* JADX INFO: renamed from: j */
    private int f38066j = 0;

    /* JADX INFO: renamed from: v */
    private int f38078v = 30;

    /* JADX INFO: renamed from: w */
    private int f38079w = 1;

    /* JADX INFO: renamed from: x */
    private int f38080x = 10;

    /* JADX INFO: renamed from: y */
    private int f38081y = 60;

    /* JADX INFO: renamed from: B */
    private int f38044B = 1;

    /* JADX INFO: renamed from: C */
    private String f38045C = "";

    /* JADX INFO: renamed from: F */
    private int f38048F = 100;

    /* JADX INFO: renamed from: G */
    private int f38049G = 60;

    /* JADX INFO: renamed from: H */
    private int f38050H = 5000;

    /* JADX INFO: renamed from: J */
    private int f38052J = 1;

    /* JADX INFO: renamed from: L */
    private String f38054L = "";

    /* JADX INFO: renamed from: M */
    private String f38055M = "";

    /* JADX INFO: renamed from: a */
    public static C13640l m39603a(JSONObject jSONObject) {
        C13640l c13640l = null;
        if (jSONObject != null) {
            try {
                C13640l c13640l2 = new C13640l();
                try {
                    c13640l2.m39637e(jSONObject.optString("unitId"));
                    c13640l2.m39620a(jSONObject.optString("ab_id"));
                    c13640l2.m39640f(jSONObject.optString("rid"));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
                        }
                        c13640l2.m39621a(arrayList);
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
                        }
                        c13640l2.m39626b(arrayList2);
                    }
                    c13640l2.m39677x(jSONObject.optInt("tpqn"));
                    c13640l2.m39628c(jSONObject.optInt("aqn"));
                    c13640l2.m39623b(jSONObject.optInt("acn"));
                    c13640l2.m39681z(jSONObject.optInt("wt"));
                    int i3 = 1;
                    c13640l2.m39659o(jSONObject.optInt("iscasf", 1));
                    c13640l2.m39675w(jSONObject.optInt("spmxrt", 5000));
                    c13640l2.m39629c(jSONObject.optLong("current_time"));
                    c13640l2.m39665r(jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET));
                    c13640l2.m39633d(jSONObject.optLong("dlct", 3600L));
                    c13640l2.m39632d(jSONObject.optInt("autoplay", 0));
                    c13640l2.m39651k(jSONObject.optInt("dlnet", 2));
                    c13640l2.m39630c(jSONObject.optString("no_offer"));
                    c13640l2.m39639f(jSONObject.optInt("cb_type"));
                    c13640l2.m39624b(jSONObject.optLong("clct", 86400L));
                    c13640l2.m39619a(jSONObject.optLong("clcq", 300L));
                    c13640l2.m39671u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    c13640l2.m39642g(jSONObject.optInt("cd_rate", 0));
                    c13640l2.m39647i(jSONObject.optInt("content", 1));
                    c13640l2.m39655m(jSONObject.optInt("impt", 0));
                    c13640l2.m39653l(jSONObject.optInt("icon_type", 1));
                    c13640l2.m39625b(jSONObject.optString("no_ads_url", ""));
                    c13640l2.m39669t(jSONObject.optInt("playclosebtn_tm", -1));
                    c13640l2.m39667s(jSONObject.optInt("play_ctdown", 0));
                    c13640l2.m39645h(jSONObject.optInt("close_alert", 0));
                    c13640l2.m39657n(jSONObject.optInt("intershowlimit", 30));
                    c13640l2.m39673v(jSONObject.optInt("refreshFq", 60));
                    c13640l2.m39636e(jSONObject.optInt("closeBtn", 0));
                    int iOptInt = jSONObject.optInt("tmorl", 1);
                    if (iOptInt <= 2 && iOptInt > 0) {
                        i3 = iOptInt;
                    }
                    c13640l2.m39679y(i3);
                    c13640l2.m39634d(jSONObject.optString(PangleConstants.PLACEMENT_ID, ""));
                    c13640l2.m39661p(jSONObject.optInt("ltafemty", 10));
                    c13640l2.m39663q(jSONObject.optInt("ltorwc", 60));
                    c13640l2.m39643g(jSONObject.optString("vtag", ""));
                    return c13640l2;
                } catch (Exception e) {
                    e = e;
                    c13640l = c13640l2;
                    e.printStackTrace();
                    return c13640l;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return c13640l;
    }

    /* JADX INFO: renamed from: A */
    public int m39604A() {
        return this.f38046D;
    }

    /* JADX INFO: renamed from: B */
    public int m39605B() {
        return this.f38047E;
    }

    /* JADX INFO: renamed from: C */
    public int m39606C() {
        return this.f38048F;
    }

    /* JADX INFO: renamed from: D */
    public int m39607D() {
        return this.f38049G;
    }

    /* JADX INFO: renamed from: E */
    public int m39608E() {
        return this.f38050H;
    }

    /* JADX INFO: renamed from: F */
    public int m39609F() {
        return this.f38051I;
    }

    /* JADX INFO: renamed from: G */
    public int m39610G() {
        return this.f38052J;
    }

    /* JADX INFO: renamed from: H */
    public String m39611H() {
        return this.f38053K;
    }

    /* JADX INFO: renamed from: I */
    public String m39612I() {
        return this.f38054L;
    }

    /* JADX INFO: renamed from: J */
    public String m39613J() {
        return this.f38055M;
    }

    /* JADX INFO: renamed from: K */
    public int m39614K() {
        return this.f38056N;
    }

    /* JADX INFO: renamed from: L */
    public int m39615L() {
        return this.f38063g;
    }

    /* JADX INFO: renamed from: M */
    public JSONObject m39616M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listM39622b = m39622b();
            if (listM39622b != null && listM39622b.size() > 0) {
                int size = listM39622b.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(listM39622b.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listM39627c = m39627c();
            if (listM39627c != null && listM39627c.size() > 0) {
                int size2 = listM39627c.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(listM39627c.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", m39609F());
            jSONObject.put("aqn", m39638f());
            jSONObject.put("acn", m39635e());
            jSONObject.put("wt", m39614K());
            jSONObject.put("current_time", m39658o());
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, m39678y());
            jSONObject.put("dlct", m39660p());
            jSONObject.put("autoplay", m39615L());
            jSONObject.put("dlnet", m39662q());
            jSONObject.put("no_offer", m39676x());
            jSONObject.put("cb_type", m39644h());
            jSONObject.put("clct", m39650k());
            jSONObject.put("clcq", m39648j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, m39606C());
            jSONObject.put("content", m39654m());
            jSONObject.put("impt", m39666s());
            jSONObject.put("icon_type", m39664r());
            jSONObject.put("no_ads_url", m39674w());
            jSONObject.put("playclosebtn_tm", m39605B());
            jSONObject.put("play_ctdown", m39604A());
            jSONObject.put("close_alert", m39652l());
            jSONObject.put("closeBtn", m39641g());
            jSONObject.put("refreshFq", m39607D());
            jSONObject.put("countdown", m39656n());
            jSONObject.put("allowSkip", m39631d());
            jSONObject.put("tmorl", m39610G());
            jSONObject.put("unitId", m39611H());
            jSONObject.put(PangleConstants.PLACEMENT_ID, m39680z());
            jSONObject.put("ltafemty", m39670u());
            jSONObject.put("ltorwc", m39672v());
            jSONObject.put("vtag", m39613J());
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m39617a() {
        return this.f38057a;
    }

    /* JADX INFO: renamed from: a */
    public void m39618a(int i) {
        this.f38060d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m39619a(long j) {
        this.f38067k = j;
    }

    /* JADX INFO: renamed from: a */
    public void m39620a(String str) {
        this.f38057a = str;
        AbstractC13003a.f35476r.put(this.f38053K, str);
    }

    /* JADX INFO: renamed from: a */
    public void m39621a(List<Integer> list) {
        this.f38058b = list;
    }

    /* JADX INFO: renamed from: b */
    public List<Integer> m39622b() {
        return this.f38058b;
    }

    /* JADX INFO: renamed from: b */
    public void m39623b(int i) {
        this.f38061e = i;
    }

    /* JADX INFO: renamed from: b */
    public void m39624b(long j) {
        this.f38068l = j;
    }

    /* JADX INFO: renamed from: b */
    public void m39625b(String str) {
        this.f38082z = str;
    }

    /* JADX INFO: renamed from: b */
    public void m39626b(List<Integer> list) {
        this.f38059c = list;
    }

    /* JADX INFO: renamed from: c */
    public List<Integer> m39627c() {
        return this.f38059c;
    }

    /* JADX INFO: renamed from: c */
    public void m39628c(int i) {
        this.f38062f = i;
    }

    /* JADX INFO: renamed from: c */
    public void m39629c(long j) {
        this.f38072p = j;
    }

    /* JADX INFO: renamed from: c */
    public void m39630c(String str) {
        this.f38043A = str;
    }

    /* JADX INFO: renamed from: d */
    public int m39631d() {
        return this.f38060d;
    }

    /* JADX INFO: renamed from: d */
    public void m39632d(int i) {
        this.f38063g = i;
    }

    /* JADX INFO: renamed from: d */
    public void m39633d(long j) {
        this.f38073q = j;
    }

    /* JADX INFO: renamed from: d */
    public void m39634d(String str) {
        this.f38045C = str;
    }

    /* JADX INFO: renamed from: e */
    public int m39635e() {
        return this.f38061e;
    }

    /* JADX INFO: renamed from: e */
    public void m39636e(int i) {
        this.f38064h = i;
    }

    /* JADX INFO: renamed from: e */
    public void m39637e(String str) {
        this.f38053K = str;
    }

    /* JADX INFO: renamed from: f */
    public int m39638f() {
        return this.f38062f;
    }

    /* JADX INFO: renamed from: f */
    public void m39639f(int i) {
        this.f38065i = i;
    }

    /* JADX INFO: renamed from: f */
    public void m39640f(String str) {
        this.f38054L = str;
    }

    /* JADX INFO: renamed from: g */
    public int m39641g() {
        return this.f38064h;
    }

    /* JADX INFO: renamed from: g */
    public void m39642g(int i) {
        this.f38066j = i;
    }

    /* JADX INFO: renamed from: g */
    public void m39643g(String str) {
        this.f38055M = str;
    }

    /* JADX INFO: renamed from: h */
    public int m39644h() {
        return this.f38065i;
    }

    /* JADX INFO: renamed from: h */
    public void m39645h(int i) {
        this.f38069m = i;
    }

    /* JADX INFO: renamed from: i */
    public int m39646i() {
        return this.f38066j;
    }

    /* JADX INFO: renamed from: i */
    public void m39647i(int i) {
        this.f38070n = i;
    }

    /* JADX INFO: renamed from: j */
    public long m39648j() {
        return this.f38067k;
    }

    /* JADX INFO: renamed from: j */
    public void m39649j(int i) {
        this.f38071o = i;
    }

    /* JADX INFO: renamed from: k */
    public long m39650k() {
        return this.f38068l;
    }

    /* JADX INFO: renamed from: k */
    public void m39651k(int i) {
        this.f38074r = i;
    }

    /* JADX INFO: renamed from: l */
    public int m39652l() {
        return this.f38069m;
    }

    /* JADX INFO: renamed from: l */
    public void m39653l(int i) {
        this.f38076t = i;
    }

    /* JADX INFO: renamed from: m */
    public int m39654m() {
        return this.f38070n;
    }

    /* JADX INFO: renamed from: m */
    public void m39655m(int i) {
        this.f38077u = i;
    }

    /* JADX INFO: renamed from: n */
    public int m39656n() {
        return this.f38071o;
    }

    /* JADX INFO: renamed from: n */
    public void m39657n(int i) {
        this.f38078v = i;
    }

    /* JADX INFO: renamed from: o */
    public long m39658o() {
        return this.f38072p;
    }

    /* JADX INFO: renamed from: o */
    public void m39659o(int i) {
        this.f38079w = i;
    }

    /* JADX INFO: renamed from: p */
    public long m39660p() {
        return this.f38073q;
    }

    /* JADX INFO: renamed from: p */
    public void m39661p(int i) {
        this.f38080x = i;
    }

    /* JADX INFO: renamed from: q */
    public int m39662q() {
        return this.f38074r;
    }

    /* JADX INFO: renamed from: q */
    public void m39663q(int i) {
        this.f38081y = i;
    }

    /* JADX INFO: renamed from: r */
    public int m39664r() {
        return this.f38076t;
    }

    /* JADX INFO: renamed from: r */
    public void m39665r(int i) {
        this.f38044B = i;
    }

    /* JADX INFO: renamed from: s */
    public int m39666s() {
        return this.f38077u;
    }

    /* JADX INFO: renamed from: s */
    public void m39667s(int i) {
        this.f38046D = i;
    }

    /* JADX INFO: renamed from: t */
    public int m39668t() {
        return this.f38079w;
    }

    /* JADX INFO: renamed from: t */
    public void m39669t(int i) {
        this.f38047E = i;
    }

    public String toString() {
        List<Integer> list = this.f38058b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f38058b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + m39678y() + " unitId = " + this.f38053K + " fbPlacementId = " + this.f38075s + str;
    }

    /* JADX INFO: renamed from: u */
    public int m39670u() {
        return this.f38080x;
    }

    /* JADX INFO: renamed from: u */
    public void m39671u(int i) {
        this.f38048F = i;
    }

    /* JADX INFO: renamed from: v */
    public int m39672v() {
        return this.f38081y;
    }

    /* JADX INFO: renamed from: v */
    public void m39673v(int i) {
        this.f38049G = i;
    }

    /* JADX INFO: renamed from: w */
    public String m39674w() {
        return this.f38082z;
    }

    /* JADX INFO: renamed from: w */
    public void m39675w(int i) {
        this.f38050H = i;
    }

    /* JADX INFO: renamed from: x */
    public String m39676x() {
        return this.f38043A;
    }

    /* JADX INFO: renamed from: x */
    public void m39677x(int i) {
        this.f38051I = i;
    }

    /* JADX INFO: renamed from: y */
    public int m39678y() {
        return this.f38044B;
    }

    /* JADX INFO: renamed from: y */
    public void m39679y(int i) {
        this.f38052J = i;
    }

    /* JADX INFO: renamed from: z */
    public String m39680z() {
        return this.f38045C;
    }

    /* JADX INFO: renamed from: z */
    public void m39681z(int i) {
        this.f38056N = i;
    }
}
