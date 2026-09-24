package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.mediationsdk.C12333d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.o */
/* JADX INFO: loaded from: classes3.dex */
public class C1666o {

    /* JADX INFO: renamed from: a */
    private final String f2436a;

    /* JADX INFO: renamed from: b */
    private final String f2437b;

    /* JADX INFO: renamed from: c */
    private final C1624m8 f2438c;

    /* JADX INFO: renamed from: d */
    private final List f2439d;

    /* JADX INFO: renamed from: e */
    private final List f2440e;

    /* JADX INFO: renamed from: f */
    private boolean f2441f = false;

    C1666o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1748l c1748l) {
        this.f2436a = JsonUtils.getString(jSONObject, "name", "");
        this.f2437b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f2438c = m3709a(jSONObject);
        this.f2439d = m3710a("bidders", jSONObject, map, maxAdFormat, c1748l);
        this.f2440e = m3710a(C12333d.f31044h, jSONObject, map, maxAdFormat, c1748l);
    }

    /* JADX INFO: renamed from: a */
    private C1624m8 m3709a(JSONObject jSONObject) {
        return new C1624m8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    /* JADX INFO: renamed from: a */
    private List m3710a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, C1748l c1748l) {
        C1559g3 c1559g3;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (c1559g3 = (C1559g3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (c1559g3.m2690C()) {
                    this.f2441f = true;
                }
                arrayList.add(new C1604k8(jSONObject2, maxAdFormat, c1559g3, c1748l));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public List m3711a() {
        return this.f2439d;
    }

    /* JADX INFO: renamed from: b */
    public String m3712b() {
        return this.f2437b;
    }

    /* JADX INFO: renamed from: c */
    public String m3713c() {
        return this.f2436a;
    }

    /* JADX INFO: renamed from: d */
    public C1624m8 m3714d() {
        return this.f2438c;
    }

    /* JADX INFO: renamed from: e */
    public List m3715e() {
        return this.f2440e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3716f() {
        return this.f2441f;
    }
}
