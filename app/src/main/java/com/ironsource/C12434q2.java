package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12434q2 {

    /* JADX INFO: renamed from: A */
    public static final String f31742A = "nurl";

    /* JADX INFO: renamed from: o */
    public static final String f31743o = "adMarkup";

    /* JADX INFO: renamed from: p */
    public static final String f31744p = "instance";

    /* JADX INFO: renamed from: q */
    public static final String f31745q = "adData";

    /* JADX INFO: renamed from: r */
    public static final String f31746r = "price";

    /* JADX INFO: renamed from: s */
    public static final String f31747s = "serverData";

    /* JADX INFO: renamed from: t */
    public static final String f31748t = "loadTimeout";

    /* JADX INFO: renamed from: u */
    public static final String f31749u = "order";

    /* JADX INFO: renamed from: v */
    public static final String f31750v = "show";

    /* JADX INFO: renamed from: w */
    public static final String f31751w = "price";

    /* JADX INFO: renamed from: x */
    public static final String f31752x = "notifications";

    /* JADX INFO: renamed from: y */
    public static final String f31753y = "burl";

    /* JADX INFO: renamed from: z */
    public static final String f31754z = "lurl";

    /* JADX INFO: renamed from: a */
    private String f31755a;

    /* JADX INFO: renamed from: b */
    private String f31756b;

    /* JADX INFO: renamed from: c */
    private JSONObject f31757c;

    /* JADX INFO: renamed from: d */
    private String f31758d;

    /* JADX INFO: renamed from: e */
    private Integer f31759e;

    /* JADX INFO: renamed from: f */
    private int f31760f;

    /* JADX INFO: renamed from: g */
    private int f31761g;

    /* JADX INFO: renamed from: h */
    private int f31762h;

    /* JADX INFO: renamed from: i */
    private final List<String> f31763i;

    /* JADX INFO: renamed from: j */
    private final List<String> f31764j;

    /* JADX INFO: renamed from: k */
    private final List<String> f31765k;

    /* JADX INFO: renamed from: l */
    private JSONObject f31766l;

    /* JADX INFO: renamed from: m */
    private C12586wb f31767m;

    /* JADX INFO: renamed from: n */
    private boolean f31768n;

    public C12434q2(String str) {
        this.f31755a = null;
        this.f31756b = "";
        this.f31757c = null;
        this.f31758d = "";
        this.f31759e = null;
        this.f31760f = -1;
        this.f31761g = -1;
        this.f31762h = -1;
        this.f31763i = new ArrayList();
        this.f31764j = new ArrayList();
        this.f31765k = new ArrayList();
        this.f31766l = null;
        this.f31767m = null;
        this.f31768n = true;
        this.f31755a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m33138a(JSONObject jSONObject, int i) {
        this.f31760f = i;
        this.f31761g = i;
        this.f31762h = i;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("show", i);
            this.f31761g = iOptInt;
            this.f31762h = jSONObject.optInt("price", iOptInt);
        }
    }

    /* JADX INFO: renamed from: a */
    public C11698U8 m33140a(String str) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m33142b() {
        return this.f31763i;
    }

    /* JADX INFO: renamed from: c */
    public String m33143c() {
        return this.f31755a;
    }

    /* JADX INFO: renamed from: d */
    public C12586wb m33144d() {
        return this.f31767m;
    }

    /* JADX INFO: renamed from: e */
    public int m33145e() {
        return this.f31760f;
    }

    /* JADX INFO: renamed from: f */
    public Integer m33146f() {
        return this.f31759e;
    }

    /* JADX INFO: renamed from: g */
    public List<String> m33147g() {
        return this.f31764j;
    }

    /* JADX INFO: renamed from: h */
    public List<String> m33148h() {
        return this.f31765k;
    }

    /* JADX INFO: renamed from: i */
    public String m33149i() {
        return this.f31758d;
    }

    /* JADX INFO: renamed from: j */
    public int m33150j() {
        return this.f31762h;
    }

    /* JADX INFO: renamed from: k */
    public String m33151k() {
        return this.f31756b;
    }

    /* JADX INFO: renamed from: l */
    public int m33152l() {
        return this.f31761g;
    }

    /* JADX INFO: renamed from: m */
    public JSONObject m33153m() {
        return this.f31766l;
    }

    /* JADX INFO: renamed from: n */
    public boolean m33154n() {
        return this.f31768n;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m33141a() {
        return this.f31757c;
    }

    /* JADX INFO: renamed from: a */
    private void m33139a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C12194fa.m31483b(jSONObject.getJSONArray(str)));
        }
    }

    public C12434q2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C12434q2(JSONObject jSONObject, int i, JSONObject jSONObject2) {
        this.f31755a = null;
        this.f31756b = "";
        this.f31757c = null;
        this.f31758d = "";
        this.f31759e = null;
        this.f31760f = -1;
        this.f31761g = -1;
        this.f31762h = -1;
        ArrayList arrayList = new ArrayList();
        this.f31763i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f31764j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f31765k = arrayList3;
        this.f31766l = null;
        this.f31767m = null;
        this.f31768n = true;
        try {
            if (jSONObject.has(f31744p)) {
                this.f31755a = jSONObject.getString(f31744p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f31756b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f31747s)) {
                this.f31756b = jSONObject.getJSONObject(f31747s).toString();
            }
            this.f31757c = jSONObject.optJSONObject("adData");
            this.f31758d = jSONObject.optString("price", "0");
            if (jSONObject.has(f31752x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f31752x);
                m33139a(jSONObject3, f31753y, arrayList);
                m33139a(jSONObject3, f31754z, arrayList2);
                m33139a(jSONObject3, f31742A, arrayList3);
            }
            this.f31766l = C12194fa.m31480a(jSONObject2, jSONObject.optJSONObject(C12333d.f31040d));
            this.f31767m = jSONObject.has(C12333d.f31041e) ? C12586wb.m34052a(jSONObject.getJSONObject(C12333d.f31041e)) : null;
            this.f31759e = jSONObject.has(f31748t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f31748t))) : null;
            m33138a(jSONObject.optJSONObject(f31749u), i);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            this.f31768n = false;
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
    }
}
