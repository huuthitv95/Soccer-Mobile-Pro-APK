package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.pangle.PangleConstants;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.videocommon.entity.C14215b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.setting.c */
/* JADX INFO: compiled from: RewardUnitSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14223c {

    /* JADX INFO: renamed from: W */
    private static C13017g f41108W;

    /* JADX INFO: renamed from: X */
    public static String f41109X;

    /* JADX INFO: renamed from: E */
    private int f41114E;

    /* JADX INFO: renamed from: G */
    private int f41116G;

    /* JADX INFO: renamed from: U */
    private JSONArray f41130U;

    /* JADX INFO: renamed from: V */
    private JSONObject f41131V;

    /* JADX INFO: renamed from: a */
    private String f41132a;

    /* JADX INFO: renamed from: b */
    private String f41133b;

    /* JADX INFO: renamed from: c */
    private List<C14215b> f41134c;

    /* JADX INFO: renamed from: d */
    private long f41135d;

    /* JADX INFO: renamed from: t */
    private ArrayList<Integer> f41151t;

    /* JADX INFO: renamed from: e */
    private int f41136e = -1;

    /* JADX INFO: renamed from: f */
    private int f41137f = 0;

    /* JADX INFO: renamed from: g */
    private int f41138g = 0;

    /* JADX INFO: renamed from: h */
    private int f41139h = 1;

    /* JADX INFO: renamed from: i */
    private int f41140i = 1;

    /* JADX INFO: renamed from: j */
    private int f41141j = 1;

    /* JADX INFO: renamed from: k */
    private int f41142k = 1;

    /* JADX INFO: renamed from: l */
    private int f41143l = 5;

    /* JADX INFO: renamed from: m */
    private int f41144m = 1;

    /* JADX INFO: renamed from: n */
    private int f41145n = 3;

    /* JADX INFO: renamed from: o */
    private int f41146o = 80;

    /* JADX INFO: renamed from: p */
    private int f41147p = 100;

    /* JADX INFO: renamed from: q */
    private int f41148q = 0;

    /* JADX INFO: renamed from: r */
    private double f41149r = 1.0d;

    /* JADX INFO: renamed from: s */
    private int f41150s = -1;

    /* JADX INFO: renamed from: u */
    private int f41152u = 3;

    /* JADX INFO: renamed from: v */
    private int f41153v = 1;

    /* JADX INFO: renamed from: w */
    private int f41154w = 100;

    /* JADX INFO: renamed from: x */
    private int f41155x = 60;

    /* JADX INFO: renamed from: y */
    private int f41156y = 0;

    /* JADX INFO: renamed from: z */
    private int f41157z = 70;

    /* JADX INFO: renamed from: A */
    private int f41110A = 0;

    /* JADX INFO: renamed from: B */
    private int f41111B = -1;

    /* JADX INFO: renamed from: C */
    private int f41112C = -1;

    /* JADX INFO: renamed from: D */
    private int f41113D = -1;

    /* JADX INFO: renamed from: F */
    private int f41115F = 20;

    /* JADX INFO: renamed from: H */
    private int f41117H = 0;

    /* JADX INFO: renamed from: I */
    private int f41118I = 1;

    /* JADX INFO: renamed from: J */
    private String f41119J = "";

    /* JADX INFO: renamed from: K */
    private int f41120K = 1;

    /* JADX INFO: renamed from: L */
    private String f41121L = "";

    /* JADX INFO: renamed from: M */
    private int f41122M = 1;

    /* JADX INFO: renamed from: N */
    private String f41123N = "Virtual Item";

    /* JADX INFO: renamed from: O */
    private String f41124O = "";

    /* JADX INFO: renamed from: P */
    private String f41125P = "";

    /* JADX INFO: renamed from: Q */
    private int f41126Q = 0;

    /* JADX INFO: renamed from: R */
    private int f41127R = 1;

    /* JADX INFO: renamed from: S */
    private int f41128S = 60;

    /* JADX INFO: renamed from: T */
    private String f41129T = "";

    /* JADX INFO: renamed from: a */
    public static C14223c m42680a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (f41108W == null) {
            f41108W = C13017g.m36693a(C13008c.m36588n().m36542d());
        }
        C14223c c14223c = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("vtag", "");
                String strOptString2 = jSONObject.optString("rid", "");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("unitId");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        C14223c c14223c2 = new C14223c();
                        try {
                            c14223c2.m42733j(strOptString);
                            c14223c2.m42724g(strOptString2);
                            List<C14215b> listM42616a = C14215b.m42616a(jSONObjectOptJSONObject.optJSONArray("adSourceList"));
                            c14223c2.m42727h(strOptString3);
                            c14223c2.m42703a(listM42616a);
                            c14223c2.m42726h(jSONObjectOptJSONObject.optInt("callbackType"));
                            int iOptInt = jSONObjectOptJSONObject.optInt("aqn", 1);
                            if (iOptInt <= 0) {
                                iOptInt = 1;
                            }
                            c14223c2.m42717e(iOptInt);
                            int iOptInt2 = jSONObjectOptJSONObject.optInt("acn", 1);
                            if (iOptInt2 < 0) {
                                iOptInt2 = 1;
                            }
                            c14223c2.m42707b(iOptInt2);
                            c14223c2.m42691E(jSONObjectOptJSONObject.optInt("vcn", 5));
                            c14223c2.m42755u(jSONObjectOptJSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5));
                            c14223c2.m42741n(jSONObjectOptJSONObject.optInt("dlnet", 1));
                            c14223c2.m42743o(jSONObjectOptJSONObject.optInt("endscreen_type", 2));
                            c14223c2.m42689D(jSONObjectOptJSONObject.optInt("tv_start", 3));
                            c14223c2.m42687C(jSONObjectOptJSONObject.optInt("tv_end", 80));
                            c14223c2.m42763y(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                            c14223c2.m42729i(jSONObjectOptJSONObject.optInt("cd_rate", 0));
                            c14223c2.m42701a(jSONObject.optLong("current_time"));
                            c14223c2.m42683A(jSONObjectOptJSONObject.optInt("orientation", 0));
                            c14223c2.m42739m(jSONObjectOptJSONObject.optInt("daily_play_cap", 0));
                            c14223c2.m42698I(jSONObjectOptJSONObject.optInt("video_skip_time", -1));
                            c14223c2.m42697H(jSONObjectOptJSONObject.optInt("video_skip_result", 2));
                            c14223c2.m42695G(jSONObjectOptJSONObject.optInt("video_interactive_type", -1));
                            c14223c2.m42735k(jSONObjectOptJSONObject.optInt("close_button_delay", 1));
                            c14223c2.m42759w(jSONObjectOptJSONObject.optInt("playclosebtn_tm", -1));
                            c14223c2.m42757v(jSONObjectOptJSONObject.optInt("play_ctdown", 0));
                            c14223c2.m42732j(jSONObjectOptJSONObject.optInt("close_alert", 0));
                            c14223c2.m42761x(jSONObjectOptJSONObject.optInt("rdrct", 20));
                            c14223c2.m42745p(jSONObjectOptJSONObject.optInt("load_global_timeout", 70));
                            c14223c2.m42765z(jSONObjectOptJSONObject.optInt("rfpv", -1));
                            c14223c2.m42700a(jSONObjectOptJSONObject.optDouble("vdcmp", 1.0d));
                            c14223c2.m42712c(jSONObjectOptJSONObject.optString("atzu"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("atl_type");
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            try {
                                if (jSONArrayOptJSONArray2 != null) {
                                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i)));
                                    }
                                } else {
                                    arrayList.add(4);
                                    arrayList.add(6);
                                }
                                c14223c2.m42702a(arrayList);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            int iOptInt3 = jSONObjectOptJSONObject.optInt("atl_dyt", 0);
                            c14223c2.m42720f(iOptInt3 > 0 ? iOptInt3 : 3);
                            int iOptInt4 = jSONObjectOptJSONObject.optInt("tmorl", 1);
                            if (iOptInt4 > 2 || iOptInt4 <= 0) {
                                iOptInt4 = 1;
                            }
                            c14223c2.m42685B(iOptInt4);
                            c14223c2.m42721f(jSONObjectOptJSONObject.optString(PangleConstants.PLACEMENT_ID));
                            c14223c2.m42751s(jSONObjectOptJSONObject.optInt("ltafemty", 10));
                            c14223c2.m42753t(jSONObjectOptJSONObject.optInt("ltorwc", 60));
                            c14223c2.m42708b(jSONObjectOptJSONObject.optString("ab_id"));
                            c14223c2.m42714d(jSONObjectOptJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                            c14223c2.m42723g(jSONObjectOptJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                            c14223c2.m42730i(jSONObjectOptJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                            c14223c2.m42711c(jSONObjectOptJSONObject.optInt("amount", 1));
                            c14223c2.m42715d(jSONObjectOptJSONObject.optString("icon", ""));
                            c14223c2.m42737l(jSONObjectOptJSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                            c14223c2.m42718e(jSONObjectOptJSONObject.optString("name", "Virtual Item"));
                            c14223c2.m42693F(jSONObjectOptJSONObject.optInt("video_error_rule", 1));
                            c14223c2.m42749r(jSONObjectOptJSONObject.optInt("loadtmo", 60));
                            c14223c2.m42704a(jSONObjectOptJSONObject.optJSONArray("local_cache_info"));
                            try {
                                String strOptString4 = jSONObjectOptJSONObject.optString("retry_strategy");
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    String strM37712a = C13207k0.m37712a(strOptString4);
                                    if (!TextUtils.isEmpty(strM37712a)) {
                                        c14223c2.m42709b(new JSONObject(strM37712a));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            return c14223c2;
                        } catch (Exception e2) {
                            e = e2;
                            c14223c = c14223c2;
                            e.printStackTrace();
                            return c14223c;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return c14223c;
    }

    /* JADX INFO: renamed from: a */
    public static C14223c m42681a(JSONObject jSONObject) {
        C14223c c14223c = null;
        if (jSONObject != null) {
            try {
                C14223c c14223c2 = new C14223c();
                try {
                    c14223c2.m42703a(C14215b.m42616a(jSONObject.optJSONArray("adSourceList")));
                    c14223c2.m42726h(jSONObject.optInt("callbackType"));
                    int iOptInt = jSONObject.optInt("aqn", 1);
                    if (iOptInt <= 0) {
                        iOptInt = 1;
                    }
                    c14223c2.m42717e(iOptInt);
                    int iOptInt2 = jSONObject.optInt("acn", 1);
                    if (iOptInt2 < 0) {
                        iOptInt2 = 1;
                    }
                    c14223c2.m42707b(iOptInt2);
                    c14223c2.m42691E(jSONObject.optInt("vcn", 5));
                    c14223c2.m42755u(jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5));
                    c14223c2.m42741n(jSONObject.optInt("dlnet", 1));
                    c14223c2.m42743o(jSONObject.optInt("endscreen_type", 2));
                    c14223c2.m42689D(jSONObject.optInt("tv_start", 3));
                    c14223c2.m42687C(jSONObject.optInt("tv_end", 80));
                    c14223c2.m42763y(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    c14223c2.m42701a(jSONObject.optLong("current_time"));
                    c14223c2.m42683A(jSONObject.optInt("orientation", 0));
                    c14223c2.m42739m(jSONObject.optInt("daily_play_cap", 0));
                    c14223c2.m42698I(jSONObject.optInt("video_skip_time", -1));
                    c14223c2.m42697H(jSONObject.optInt("video_skip_result", 2));
                    c14223c2.m42695G(jSONObject.optInt("video_interactive_type", -1));
                    c14223c2.m42735k(jSONObject.optInt("close_button_delay", 1));
                    c14223c2.m42759w(jSONObject.optInt("playclosebtn_tm", -1));
                    c14223c2.m42757v(jSONObject.optInt("play_ctdown", 0));
                    c14223c2.m42732j(jSONObject.optInt("close_alert", 0));
                    c14223c2.m42761x(jSONObject.optInt("rdrct", 20));
                    c14223c2.m42765z(jSONObject.optInt("rfpv", -1));
                    c14223c2.m42700a(jSONObject.optDouble("vdcmp", 1.0d));
                    c14223c2.m42745p(jSONObject.optInt("load_global_timeout", 70));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (jSONArrayOptJSONArray != null) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        c14223c2.m42702a(arrayList);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    c14223c2.m42720f(jSONObject.optInt("atl_dyt", 3));
                    int iOptInt3 = jSONObject.optInt("tmorl", 1);
                    if (iOptInt3 > 2 || iOptInt3 <= 0) {
                        iOptInt3 = 1;
                    }
                    c14223c2.m42685B(iOptInt3);
                    c14223c2.m42721f(jSONObject.optString(PangleConstants.PLACEMENT_ID));
                    c14223c2.m42751s(jSONObject.optInt("ltafemty", 10));
                    c14223c2.m42753t(jSONObject.optInt("ltorwc", 60));
                    c14223c2.m42708b(jSONObject.optString("ab_id"));
                    c14223c2.m42724g(jSONObject.optString("rid", ""));
                    c14223c2.m42714d(jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                    c14223c2.m42723g(jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                    c14223c2.m42730i(jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                    c14223c2.m42711c(jSONObject.optInt("amount", 1));
                    c14223c2.m42715d(jSONObject.optString("icon", ""));
                    c14223c2.m42737l(jSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                    c14223c2.m42718e(jSONObject.optString("name", "Virtual Item"));
                    c14223c2.m42693F(jSONObject.optInt("video_error_rule", 1));
                    c14223c2.m42749r(jSONObject.optInt("loadtmo", 60));
                    c14223c2.m42733j(jSONObject.optString("vtag", ""));
                    c14223c2.m42704a(jSONObject.optJSONArray("local_cache_info"));
                    try {
                        String strOptString = jSONObject.optString("retry_strategy");
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strM37712a = C13207k0.m37712a(strOptString);
                            if (!TextUtils.isEmpty(strM37712a)) {
                                c14223c2.m42709b(new JSONObject(strM37712a));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return c14223c2;
                } catch (Exception e2) {
                    e = e2;
                    c14223c = c14223c2;
                    e.printStackTrace();
                    return c14223c;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return c14223c;
    }

    /* JADX INFO: renamed from: A */
    public int m42682A() {
        return this.f41153v;
    }

    /* JADX INFO: renamed from: A */
    public void m42683A(int i) {
        this.f41156y = i;
    }

    /* JADX INFO: renamed from: B */
    public JSONArray m42684B() {
        return this.f41130U;
    }

    /* JADX INFO: renamed from: B */
    public void m42685B(int i) {
        this.f41153v = i;
    }

    /* JADX INFO: renamed from: C */
    public int m42686C() {
        return this.f41127R;
    }

    /* JADX INFO: renamed from: C */
    public void m42687C(int i) {
        this.f41146o = i;
    }

    /* JADX INFO: renamed from: D */
    public int m42688D() {
        return this.f41113D;
    }

    /* JADX INFO: renamed from: D */
    public void m42689D(int i) {
        this.f41145n = i;
    }

    /* JADX INFO: renamed from: E */
    public int m42690E() {
        return this.f41112C;
    }

    /* JADX INFO: renamed from: E */
    public void m42691E(int i) {
        this.f41142k = i;
    }

    /* JADX INFO: renamed from: F */
    public int m42692F() {
        return this.f41111B;
    }

    /* JADX INFO: renamed from: F */
    public void m42693F(int i) {
        this.f41127R = i;
    }

    /* JADX INFO: renamed from: G */
    public String m42694G() {
        return this.f41129T;
    }

    /* JADX INFO: renamed from: G */
    public void m42695G(int i) {
        this.f41113D = i;
    }

    /* JADX INFO: renamed from: H */
    public JSONObject m42696H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f41132a);
            jSONObject.put("callbackType", this.f41139h);
            List<C14215b> list = this.f41134c;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (C14215b c14215b : this.f41134c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c14215b.m42617a());
                    jSONObject2.put("timeout", c14215b.m42618b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f41140i);
            jSONObject.put("acn", this.f41141j);
            jSONObject.put("vcn", this.f41142k);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f41143l);
            jSONObject.put("dlnet", this.f41144m);
            jSONObject.put("tv_start", this.f41145n);
            jSONObject.put("tv_end", this.f41146o);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f41147p);
            jSONObject.put("endscreen_type", this.f41116G);
            jSONObject.put("daily_play_cap", this.f41110A);
            jSONObject.put("video_skip_time", this.f41111B);
            jSONObject.put("video_skip_result", this.f41112C);
            jSONObject.put("video_interactive_type", this.f41113D);
            jSONObject.put("orientation", this.f41156y);
            jSONObject.put("close_button_delay", this.f41114E);
            jSONObject.put("playclosebtn_tm", this.f41136e);
            jSONObject.put("play_ctdown", this.f41137f);
            jSONObject.put("close_alert", this.f41138g);
            jSONObject.put("rfpv", this.f41150s);
            jSONObject.put("vdcmp", this.f41149r);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f41151t;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f41151t.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f41152u);
            jSONObject.put("tmorl", this.f41153v);
            jSONObject.put(PangleConstants.PLACEMENT_ID, this.f41133b);
            jSONObject.put("ltafemty", this.f41154w);
            jSONObject.put("ltorwc", this.f41155x);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f41117H);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f41118I);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f41119J);
            jSONObject.put("amount", this.f41120K);
            jSONObject.put("icon", this.f41121L);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f41122M);
            jSONObject.put("name", this.f41123N);
            jSONObject.put("isDefault", this.f41126Q);
            jSONObject.put("video_error_rule", this.f41127R);
            jSONObject.put("loadtmo", this.f41128S);
            jSONObject.put("vtag", this.f41129T);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m42697H(int i) {
        this.f41112C = i;
    }

    /* JADX INFO: renamed from: I */
    public void m42698I(int i) {
        this.f41111B = i;
    }

    /* JADX INFO: renamed from: a */
    public String m42699a() {
        return this.f41124O;
    }

    /* JADX INFO: renamed from: a */
    public void m42700a(double d) {
        this.f41149r = d;
    }

    /* JADX INFO: renamed from: a */
    public void m42701a(long j) {
        this.f41135d = j;
    }

    /* JADX INFO: renamed from: a */
    public void m42702a(ArrayList<Integer> arrayList) {
        this.f41151t = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m42703a(List<C14215b> list) {
        this.f41134c = list;
    }

    /* JADX INFO: renamed from: a */
    public void m42704a(JSONArray jSONArray) {
        this.f41130U = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public boolean m42705a(int i) {
        ArrayList<Integer> arrayList = this.f41151t;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f41151t.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public int m42706b() {
        return this.f41141j;
    }

    /* JADX INFO: renamed from: b */
    public void m42707b(int i) {
        this.f41141j = i;
    }

    /* JADX INFO: renamed from: b */
    public void m42708b(String str) {
        this.f41124O = str;
        AbstractC13003a.f35476r.put(this.f41132a, str);
    }

    /* JADX INFO: renamed from: b */
    public void m42709b(JSONObject jSONObject) {
        this.f41131V = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public String m42710c() {
        return f41109X;
    }

    /* JADX INFO: renamed from: c */
    public void m42711c(int i) {
        if (i <= 0) {
            this.f41120K = 1;
        } else {
            this.f41120K = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m42712c(String str) {
        f41109X = str;
    }

    /* JADX INFO: renamed from: d */
    public int m42713d() {
        return this.f41120K;
    }

    /* JADX INFO: renamed from: d */
    public void m42714d(int i) {
        this.f41117H = i;
    }

    /* JADX INFO: renamed from: d */
    public void m42715d(String str) {
        this.f41121L = str;
    }

    /* JADX INFO: renamed from: e */
    public int m42716e() {
        return this.f41140i;
    }

    /* JADX INFO: renamed from: e */
    public void m42717e(int i) {
        this.f41140i = i;
    }

    /* JADX INFO: renamed from: e */
    public void m42718e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f41123N = this.f41119J;
        } else {
            this.f41123N = str;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m42719f() {
        return this.f41152u;
    }

    /* JADX INFO: renamed from: f */
    public void m42720f(int i) {
        this.f41152u = i;
    }

    /* JADX INFO: renamed from: f */
    public void m42721f(String str) {
        this.f41133b = str;
    }

    /* JADX INFO: renamed from: g */
    public int m42722g() {
        return this.f41148q;
    }

    /* JADX INFO: renamed from: g */
    public void m42723g(int i) {
        this.f41118I = i;
    }

    /* JADX INFO: renamed from: g */
    public void m42724g(String str) {
        this.f41125P = str;
    }

    /* JADX INFO: renamed from: h */
    public int m42725h() {
        return this.f41138g;
    }

    /* JADX INFO: renamed from: h */
    public void m42726h(int i) {
        this.f41139h = i;
    }

    /* JADX INFO: renamed from: h */
    public void m42727h(String str) {
        this.f41132a = str;
    }

    /* JADX INFO: renamed from: i */
    public int m42728i() {
        return this.f41114E;
    }

    /* JADX INFO: renamed from: i */
    public void m42729i(int i) {
        this.f41148q = i;
    }

    /* JADX INFO: renamed from: i */
    public void m42730i(String str) {
        this.f41119J = str;
    }

    /* JADX INFO: renamed from: j */
    public long m42731j() {
        return this.f41135d;
    }

    /* JADX INFO: renamed from: j */
    public void m42732j(int i) {
        this.f41138g = i;
    }

    /* JADX INFO: renamed from: j */
    public void m42733j(String str) {
        this.f41129T = str;
    }

    /* JADX INFO: renamed from: k */
    public int m42734k() {
        return this.f41110A;
    }

    /* JADX INFO: renamed from: k */
    public void m42735k(int i) {
        this.f41114E = i;
    }

    /* JADX INFO: renamed from: l */
    public int m42736l() {
        return this.f41144m;
    }

    /* JADX INFO: renamed from: l */
    public void m42737l(int i) {
        this.f41122M = i;
    }

    /* JADX INFO: renamed from: m */
    public int m42738m() {
        return this.f41116G;
    }

    /* JADX INFO: renamed from: m */
    public void m42739m(int i) {
        this.f41110A = i;
    }

    /* JADX INFO: renamed from: n */
    public int m42740n() {
        return this.f41157z;
    }

    /* JADX INFO: renamed from: n */
    public void m42741n(int i) {
        this.f41144m = i;
    }

    /* JADX INFO: renamed from: o */
    public int m42742o() {
        return this.f41128S;
    }

    /* JADX INFO: renamed from: o */
    public void m42743o(int i) {
        this.f41116G = i;
    }

    /* JADX INFO: renamed from: p */
    public int m42744p() {
        return this.f41154w;
    }

    /* JADX INFO: renamed from: p */
    public void m42745p(int i) {
        this.f41157z = i;
    }

    /* JADX INFO: renamed from: q */
    public int m42746q() {
        return this.f41155x;
    }

    /* JADX INFO: renamed from: q */
    public void m42747q(int i) {
        this.f41126Q = i;
    }

    /* JADX INFO: renamed from: r */
    public int m42748r() {
        return this.f41143l;
    }

    /* JADX INFO: renamed from: r */
    public void m42749r(int i) {
        this.f41128S = i;
    }

    /* JADX INFO: renamed from: s */
    public String m42750s() {
        return this.f41123N;
    }

    /* JADX INFO: renamed from: s */
    public void m42751s(int i) {
        this.f41154w = i;
    }

    /* JADX INFO: renamed from: t */
    public String m42752t() {
        return this.f41133b;
    }

    /* JADX INFO: renamed from: t */
    public void m42753t(int i) {
        this.f41155x = i;
    }

    /* JADX INFO: renamed from: u */
    public int m42754u() {
        return this.f41136e;
    }

    /* JADX INFO: renamed from: u */
    public void m42755u(int i) {
        this.f41143l = i;
    }

    /* JADX INFO: renamed from: v */
    public int m42756v() {
        return this.f41115F;
    }

    /* JADX INFO: renamed from: v */
    public void m42757v(int i) {
        this.f41137f = i;
    }

    /* JADX INFO: renamed from: w */
    public int m42758w() {
        return this.f41147p;
    }

    /* JADX INFO: renamed from: w */
    public void m42759w(int i) {
        this.f41136e = i;
    }

    /* JADX INFO: renamed from: x */
    public String m42760x() {
        return this.f41125P;
    }

    /* JADX INFO: renamed from: x */
    public void m42761x(int i) {
        this.f41115F = i;
    }

    /* JADX INFO: renamed from: y */
    public int m42762y() {
        return this.f41156y;
    }

    /* JADX INFO: renamed from: y */
    public void m42763y(int i) {
        this.f41147p = i;
    }

    /* JADX INFO: renamed from: z */
    public Queue<Integer> m42764z() {
        LinkedList linkedList;
        Exception e;
        try {
            List<C14215b> list = this.f41134c;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i = 0; i < this.f41134c.size(); i++) {
                try {
                    linkedList.add(Integer.valueOf(this.f41134c.get(i).m42618b()));
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return linkedList;
        } catch (Exception e3) {
            linkedList = null;
            e = e3;
        }
        e.printStackTrace();
        return linkedList;
    }

    /* JADX INFO: renamed from: z */
    public void m42765z(int i) {
        this.f41150s = i;
    }
}
