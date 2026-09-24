package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.u7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1789u7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private int f3429a;

    /* JADX INFO: renamed from: b */
    private int f3430b;

    /* JADX INFO: renamed from: c */
    private Uri f3431c;

    /* JADX INFO: renamed from: d */
    private C1834z7 f3432d;

    /* JADX INFO: renamed from: e */
    private final Set f3433e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Map f3434f = new HashMap();

    private C1789u7() {
    }

    /* JADX INFO: renamed from: a */
    public static C1789u7 m5313a(C1702q8 c1702q8, C1789u7 c1789u7, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        C1702q8 c1702q8M4126c;
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1789u7 == null) {
            try {
                c1789u7 = new C1789u7();
            } catch (Throwable th) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("VastCompanionAd", "Error occurred while initializing", th);
                }
                c1748l.m4764E().m4333a("VastCompanionAd", th);
                return null;
            }
        }
        if (c1789u7.f3429a == 0 && c1789u7.f3430b == 0) {
            int i = StringUtils.parseInt((String) c1702q8.m4123a().get("width"));
            int i2 = StringUtils.parseInt((String) c1702q8.m4123a().get("height"));
            if (i > 0 && i2 > 0) {
                c1789u7.f3429a = i;
                c1789u7.f3430b = i2;
            }
        }
        c1789u7.f3432d = C1834z7.m5755a(c1702q8, c1789u7.f3432d, c1748l);
        if (c1789u7.f3431c == null && (c1702q8M4126c = c1702q8.m4126c("CompanionClickThrough")) != null) {
            String strM4128d = c1702q8M4126c.m4128d();
            if (StringUtils.isValidString(strM4128d)) {
                c1789u7.f3431c = Uri.parse(strM4128d);
            }
        }
        AbstractC1534d8.m2438a(c1702q8.m4122a("CompanionClickTracking"), c1789u7.f3433e, abstractC1798v7, c1748l);
        AbstractC1534d8.m2436a(c1702q8, c1789u7.f3434f, abstractC1798v7, c1748l);
        return c1789u7;
    }

    /* JADX INFO: renamed from: a */
    public static C1789u7 m5314a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        C1834z7 c1834z7M5756a = C1834z7.m5756a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), c1748l);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            C1514b8 c1514b8M2138a = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray, i3, (JSONObject) null), c1748l);
            if (c1514b8M2138a != null) {
                hashSet.add(c1514b8M2138a);
            }
        }
        C1789u7 c1789u7 = new C1789u7();
        c1789u7.f3429a = i;
        c1789u7.f3430b = i2;
        c1789u7.f3431c = uri;
        c1789u7.f3432d = c1834z7M5756a;
        c1789u7.f3433e.addAll(hashSet);
        return c1789u7;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f3429a);
        JsonUtils.putInt(jSONObject, "height", this.f3430b);
        Uri uri = this.f3431c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        C1834z7 c1834z7 = this.f3432d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", c1834z7 != null ? c1834z7.mo1889a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f3433e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1514b8) it.next()).mo1889a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public Set m5315b() {
        return this.f3433e;
    }

    /* JADX INFO: renamed from: c */
    public Uri m5316c() {
        return this.f3431c;
    }

    /* JADX INFO: renamed from: d */
    public Map m5317d() {
        return this.f3434f;
    }

    /* JADX INFO: renamed from: e */
    public C1834z7 m5318e() {
        return this.f3432d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1789u7)) {
            return false;
        }
        C1789u7 c1789u7 = (C1789u7) obj;
        if (this.f3429a != c1789u7.f3429a || this.f3430b != c1789u7.f3430b) {
            return false;
        }
        Uri uri = this.f3431c;
        if (uri == null ? c1789u7.f3431c != null : !uri.equals(c1789u7.f3431c)) {
            return false;
        }
        C1834z7 c1834z7 = this.f3432d;
        if (c1834z7 == null ? c1789u7.f3432d != null : !c1834z7.equals(c1789u7.f3432d)) {
            return false;
        }
        Set set = this.f3433e;
        if (set == null ? c1789u7.f3433e != null : !set.equals(c1789u7.f3433e)) {
            return false;
        }
        Map map = this.f3434f;
        Map map2 = c1789u7.f3434f;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        int i = ((this.f3429a * 31) + this.f3430b) * 31;
        Uri uri = this.f3431c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C1834z7 c1834z7 = this.f3432d;
        int iHashCode2 = (iHashCode + (c1834z7 != null ? c1834z7.hashCode() : 0)) * 31;
        Set set = this.f3433e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f3434f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f3429a + ", height=" + this.f3430b + ", destinationUri=" + this.f3431c + ", nonVideoResource=" + this.f3432d + ", clickTrackers=" + this.f3433e + ", eventTrackers=" + this.f3434f + AbstractJsonLexerKt.END_OBJ;
    }
}
