package com.mbridge.msdk.foundation.p289db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.a */
/* JADX INFO: compiled from: FrequencyDaoMiddle.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13024a {

    /* JADX INFO: renamed from: a */
    private static String f35591a = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: b */
    private static C13024a f35592b = null;

    /* JADX INFO: renamed from: c */
    private static String f35593c = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: d */
    private static JSONArray f35594d = new JSONArray();

    private C13024a() {
        m36731c();
    }

    /* JADX INFO: renamed from: b */
    public static C13024a m36730b() {
        if (f35592b == null) {
            synchronized (C13024a.class) {
                if (f35592b == null) {
                    f35592b = new C13024a();
                }
            }
        }
        return f35592b;
    }

    /* JADX INFO: renamed from: c */
    private void m36731c() {
        try {
            String str = (String) C13235y0.m37956a(C13008c.m36588n().m36542d(), f35593c, f35594d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f35594d = new JSONArray(str);
        } catch (Exception e) {
            C13219q0.m37816b(f35591a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36732d() {
        try {
            if (f35594d != null) {
                C13235y0.m37957b(C13008c.m36588n().m36542d(), f35593c, f35594d.toString());
            }
        } catch (Exception e) {
            C13219q0.m37816b(f35591a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36734a(C13073g c13073g) {
        JSONObject jSONObjectM36729a;
        if (c13073g == null || (jSONObjectM36729a = m36729a(c13073g.m36856a(), c13073g.m36862c(), c13073g.m36864d(), c13073g.m36867f(), c13073g.m36866e(), c13073g.m36860b())) == null) {
            return;
        }
        if (f35594d == null) {
            f35594d = new JSONArray();
        }
        f35594d.put(jSONObjectM36729a);
        m36732d();
    }

    /* JADX INFO: renamed from: a */
    public void m36735a(String str) {
        if (f35594d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < f35594d.length(); i++) {
                try {
                    JSONObject jSONObject = f35594d.getJSONObject(i);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    C13219q0.m37816b(f35591a, e.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f35594d = jSONArray;
            }
            m36732d();
        }
    }

    /* JADX INFO: renamed from: a */
    public String[] m36736a() {
        ArrayList arrayList = new ArrayList();
        if (f35594d != null) {
            for (int i = 0; i < f35594d.length(); i++) {
                try {
                    JSONObject jSONObject = f35594d.getJSONObject(i);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e) {
                    C13219q0.m37816b(f35591a, e.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: a */
    public void m36733a(long j) {
        if (f35594d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < f35594d.length(); i++) {
                try {
                    JSONObject jSONObject = f35594d.getJSONObject(i);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    C13219q0.m37816b(f35591a, e.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f35594d = jSONArray;
            }
        }
        m36732d();
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m36729a(String str, int i, int i2, long j, int i3, int i4) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
                jSONObject.put("fc_a", i);
                jSONObject.put("fc_b", i2);
                jSONObject.put("ts", j);
                jSONObject.put("impression_count", i3);
                jSONObject.put("click_count", i4);
                return jSONObject;
            } catch (Exception e) {
                e = e;
                C13219q0.m37816b(f35591a, e.getMessage());
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
            jSONObject = null;
        }
    }
}
