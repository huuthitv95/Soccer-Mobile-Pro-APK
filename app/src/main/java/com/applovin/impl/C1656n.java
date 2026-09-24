package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.n */
/* JADX INFO: loaded from: classes3.dex */
public class C1656n implements Comparable {

    /* JADX INFO: renamed from: a */
    private final String f2374a;

    /* JADX INFO: renamed from: b */
    private final String f2375b;

    /* JADX INFO: renamed from: c */
    private final MaxAdFormat f2376c;

    /* JADX INFO: renamed from: d */
    private final C1666o f2377d;

    /* JADX INFO: renamed from: e */
    private final List f2378e;

    public C1656n(JSONObject jSONObject, Map map, C1748l c1748l) {
        this.f2374a = JsonUtils.getString(jSONObject, "name", "");
        this.f2375b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f2376c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f2378e = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f2378e.add(new C1666o(jSONObject2, map, this.f2376c, c1748l));
            }
        }
        this.f2377d = this.f2378e.isEmpty() ? null : (C1666o) this.f2378e.get(0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1656n c1656n) {
        return this.f2375b.compareToIgnoreCase(c1656n.f2375b);
    }

    /* JADX INFO: renamed from: a */
    public MaxAdFormat m3607a() {
        return this.f2376c;
    }

    /* JADX INFO: renamed from: b */
    public String m3608b() {
        MaxAdFormat maxAdFormat = this.f2376c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public String m3609c() {
        return this.f2374a;
    }

    /* JADX INFO: renamed from: d */
    public String m3610d() {
        return this.f2375b;
    }

    /* JADX INFO: renamed from: e */
    public String m3611e() {
        return "\n---------- " + this.f2375b + " ----------\nIdentifier - " + this.f2374a + "\nFormat     - " + m3608b();
    }

    /* JADX INFO: renamed from: f */
    public C1666o m3612f() {
        return this.f2377d;
    }

    /* JADX INFO: renamed from: g */
    public List m3613g() {
        return this.f2378e;
    }
}
