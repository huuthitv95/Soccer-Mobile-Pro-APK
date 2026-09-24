package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1711r7 extends AbstractC1736b implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: n */
    private final String f2742n;

    /* JADX INFO: renamed from: o */
    private final String f2743o;

    /* JADX INFO: renamed from: p */
    private final C1487a8 f2744p;

    /* JADX INFO: renamed from: q */
    private final long f2745q;

    /* JADX INFO: renamed from: r */
    private final C1544e8 f2746r;

    /* JADX INFO: renamed from: s */
    private final C1789u7 f2747s;

    /* JADX INFO: renamed from: t */
    private final String f2748t;

    /* JADX INFO: renamed from: u */
    private final C1780t7 f2749u;

    /* JADX INFO: renamed from: v */
    private final C1661n4 f2750v;

    /* JADX INFO: renamed from: w */
    private final Set f2751w;

    /* JADX INFO: renamed from: x */
    private final Set f2752x;

    /* JADX INFO: renamed from: com.applovin.impl.r7$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private JSONObject f2753a;

        /* JADX INFO: renamed from: b */
        private JSONObject f2754b;

        /* JADX INFO: renamed from: c */
        private C1748l f2755c;

        /* JADX INFO: renamed from: d */
        private long f2756d;

        /* JADX INFO: renamed from: e */
        private String f2757e;

        /* JADX INFO: renamed from: f */
        private String f2758f;

        /* JADX INFO: renamed from: g */
        private C1487a8 f2759g;

        /* JADX INFO: renamed from: h */
        private C1544e8 f2760h;

        /* JADX INFO: renamed from: i */
        private C1789u7 f2761i;

        /* JADX INFO: renamed from: j */
        private C1780t7 f2762j;

        /* JADX INFO: renamed from: k */
        private Set f2763k;

        /* JADX INFO: renamed from: l */
        private Set f2764l;

        /* JADX INFO: renamed from: a */
        public b m4273a(long j) {
            this.f2756d = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4274a(C1487a8 c1487a8) {
            this.f2759g = c1487a8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4275a(C1544e8 c1544e8) {
            this.f2760h = c1544e8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4276a(C1748l c1748l) {
            if (c1748l == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.f2755c = c1748l;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4277a(C1780t7 c1780t7) {
            this.f2762j = c1780t7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4278a(C1789u7 c1789u7) {
            this.f2761i = c1789u7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4279a(String str) {
            this.f2758f = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4280a(Set set) {
            this.f2764l = set;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m4281a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f2753a = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1711r7 m4282a() {
            return new C1711r7(this);
        }

        /* JADX INFO: renamed from: b */
        public b m4283b(String str) {
            this.f2757e = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m4284b(Set set) {
            this.f2763k = set;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m4285b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.f2754b = jSONObject;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.r7$c */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* JADX INFO: renamed from: com.applovin.impl.r7$d */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private C1711r7(b bVar) {
        super(bVar.f2753a, bVar.f2754b, bVar.f2755c);
        this.f2742n = bVar.f2757e;
        this.f2744p = bVar.f2759g;
        this.f2743o = bVar.f2758f;
        this.f2746r = bVar.f2760h;
        this.f2747s = bVar.f2761i;
        this.f2749u = bVar.f2762j;
        this.f2751w = bVar.f2763k;
        this.f2752x = bVar.f2764l;
        this.f2750v = new C1661n4(this);
        Uri uriMo4235i0 = mo4235i0();
        if (uriMo4235i0 != null) {
            this.f2748t = uriMo4235i0.toString();
        } else {
            this.f2748t = "";
        }
        this.f2745q = bVar.f2756d;
    }

    /* JADX INFO: renamed from: a */
    public static C1711r7 m4214a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f2754b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, AbstractC13068b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f2753a = jSONObject3;
        bVar.f2755c = c1748l;
        bVar.f2756d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f2757e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f2758f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f2759g = C1487a8.m1888a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), c1748l);
        bVar.f2760h = C1544e8.m2514a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), c1748l);
        bVar.f2761i = C1789u7.m5314a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), c1748l);
        bVar.f2762j = C1780t7.m5247a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), c1748l);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            C1514b8 c1514b8M2138a = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), c1748l);
            if (c1514b8M2138a != null) {
                hashSet.add(c1514b8M2138a);
            }
        }
        bVar.f2763k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            C1514b8 c1514b8M2138a2 = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), c1748l);
            if (c1514b8M2138a2 != null) {
                hashSet2.add(c1514b8M2138a2);
            }
        }
        bVar.f2764l = hashSet2;
        C1711r7 c1711r7 = new C1711r7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                c1711r7.m4523a(next, string);
            }
        }
        return c1711r7;
    }

    /* JADX INFO: renamed from: a */
    private Set m4215a(c cVar, String[] strArr) {
        C1789u7 c1789u7;
        C1544e8 c1544e8;
        if (strArr == null || strArr.length <= 0) {
            return Collections.EMPTY_SET;
        }
        Map mapM5317d = (cVar != c.VIDEO || (c1544e8 = this.f2746r) == null) ? (cVar != c.COMPANION_AD || (c1789u7 = this.f2747s) == null) ? null : c1789u7.m5317d() : c1544e8.m2520e();
        HashSet hashSet = new HashSet();
        if (mapM5317d != null && !mapM5317d.isEmpty()) {
            for (String str : strArr) {
                if (mapM5317d.containsKey(str)) {
                    hashSet.addAll((Collection) mapM5317d.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: b1 */
    private Set m4216b1() {
        C1789u7 c1789u7 = this.f2747s;
        return c1789u7 != null ? c1789u7.m5315b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: e1 */
    private String m4217e1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: renamed from: i1 */
    private Set m4218i1() {
        C1544e8 c1544e8 = this.f2746r;
        return c1544e8 != null ? c1544e8.m2517b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ List m4219o(C1591j5 c1591j5) {
        return AbstractC1701q7.m4039a(c1591j5.m3000a("vimp_urls", new JSONObject()), getClCode(), null, m4217e1(), m4487J(), m4485H0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: A */
    public List mo4220A() {
        List listM4039a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.r7$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4219o((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4039a = AbstractC1701q7.m4039a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, m4217e1(), m4487J(), m4485H0(), this.sdk);
        }
        return listM4039a;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: A0 */
    public void mo4221A0() {
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: I */
    public String mo4222I() {
        return this.f2748t;
    }

    /* JADX INFO: renamed from: Y0 */
    public C1780t7 m4223Y0() {
        return this.f2749u;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: Z */
    public Uri mo4224Z() {
        return m4225Z0();
    }

    /* JADX INFO: renamed from: Z0 */
    public Uri m4225Z0() {
        C1544e8 c1544e8 = this.f2746r;
        if (c1544e8 != null) {
            return c1544e8.m2518c();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Set m4226a(d dVar, String str) {
        return m4227a(dVar, new String[]{str});
    }

    /* JADX INFO: renamed from: a */
    public Set m4227a(d dVar, String[] strArr) {
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f2751w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return m4218i1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return m4216b1();
        }
        if (dVar == d.VIDEO) {
            return m4215a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return m4215a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return m4232f1().m5598b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return m4232f1().m5602f();
        }
        if (dVar == d.ERROR) {
            return this.f2752x;
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5174b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f2745q);
        JsonUtils.putString(jSONObject, "title", this.f2742n);
        JsonUtils.putString(jSONObject, "ad_description", this.f2743o);
        C1487a8 c1487a8 = this.f2744p;
        if (c1487a8 != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", c1487a8.mo1889a());
        }
        C1544e8 c1544e8 = this.f2746r;
        if (c1544e8 != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", c1544e8.mo1889a());
        }
        C1789u7 c1789u7 = this.f2747s;
        if (c1789u7 != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", c1789u7.mo1889a());
        }
        C1780t7 c1780t7 = this.f2749u;
        if (c1780t7 != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", c1780t7.mo1889a());
        }
        if (this.f2751w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f2751w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1514b8) it.next()).mo1889a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f2752x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f2752x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C1514b8) it2.next()).mo1889a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : m4545l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", c1591j5.m2999a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a1 */
    public C1789u7 m4228a1() {
        return this.f2747s;
    }

    /* JADX INFO: renamed from: c */
    public void m4229c(String str) {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3009b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public String m4230c1() {
        return getStringFromAdObject("html_template", "");
    }

    /* JADX INFO: renamed from: d1 */
    public c m4231d1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711r7) || !super.equals(obj)) {
            return false;
        }
        C1711r7 c1711r7 = (C1711r7) obj;
        String str = this.f2742n;
        if (str == null ? c1711r7.f2742n != null : !str.equals(c1711r7.f2742n)) {
            return false;
        }
        String str2 = this.f2743o;
        if (str2 == null ? c1711r7.f2743o != null : !str2.equals(c1711r7.f2743o)) {
            return false;
        }
        C1487a8 c1487a8 = this.f2744p;
        if (c1487a8 == null ? c1711r7.f2744p != null : !c1487a8.equals(c1711r7.f2744p)) {
            return false;
        }
        C1544e8 c1544e8 = this.f2746r;
        if (c1544e8 == null ? c1711r7.f2746r != null : !c1544e8.equals(c1711r7.f2746r)) {
            return false;
        }
        C1789u7 c1789u7 = this.f2747s;
        if (c1789u7 == null ? c1711r7.f2747s != null : !c1789u7.equals(c1711r7.f2747s)) {
            return false;
        }
        C1780t7 c1780t7 = this.f2749u;
        if (c1780t7 == null ? c1711r7.f2749u != null : !c1780t7.equals(c1711r7.f2749u)) {
            return false;
        }
        Set set = this.f2751w;
        if (set == null ? c1711r7.f2751w != null : !set.equals(c1711r7.f2751w)) {
            return false;
        }
        Set set2 = this.f2752x;
        Set set3 = c1711r7.f2752x;
        if (set2 != null) {
            return set2.equals(set3);
        }
        return set3 == null;
    }

    /* JADX INFO: renamed from: f1 */
    public C1816x7 m4232f1() {
        C1544e8 c1544e8 = this.f2746r;
        if (c1544e8 != null) {
            return c1544e8.m2521f();
        }
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public long m4233g1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public C1661n4 getAdEventTracker() {
        return this.f2750v;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f2745q;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    /* JADX INFO: renamed from: h1 */
    public C1487a8 m4234h1() {
        return this.f2744p;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listM2522g;
        C1544e8 c1544e8 = this.f2746r;
        return (c1544e8 == null || (listM2522g = c1544e8.m2522g()) == null || listM2522g.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f2742n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2743o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1487a8 c1487a8 = this.f2744p;
        int iHashCode4 = (iHashCode3 + (c1487a8 != null ? c1487a8.hashCode() : 0)) * 31;
        C1544e8 c1544e8 = this.f2746r;
        int iHashCode5 = (iHashCode4 + (c1544e8 != null ? c1544e8.hashCode() : 0)) * 31;
        C1789u7 c1789u7 = this.f2747s;
        int iHashCode6 = (iHashCode5 + (c1789u7 != null ? c1789u7.hashCode() : 0)) * 31;
        C1780t7 c1780t7 = this.f2749u;
        int iHashCode7 = (iHashCode6 + (c1780t7 != null ? c1780t7.hashCode() : 0)) * 31;
        Set set = this.f2751w;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f2752x;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: i0 */
    public Uri mo4235i0() {
        C1554f8 c1554f8M4237k1 = m4237k1();
        if (c1554f8M4237k1 != null) {
            return c1554f8M4237k1.m2632e();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f2749u != null;
    }

    /* JADX INFO: renamed from: j1 */
    public C1544e8 m4236j1() {
        return this.f2746r;
    }

    /* JADX INFO: renamed from: k1 */
    public C1554f8 m4237k1() {
        Long lM4326f = AbstractC1714s0.m4326f(this.sdk);
        return this.f2746r.m2516a(lM4326f != null ? lM4326f.longValue() : 0L);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m4238l1() {
        return m4232f1() != null;
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m4239m1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: n1 */
    public void m4240n1() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3010c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m4241o1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m4242p1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m4243q1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m4244r1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s1 */
    public boolean m4245s1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f2742n + "', adDescription='" + this.f2743o + "', systemInfo=" + this.f2744p + ", videoCreative=" + this.f2746r + ", companionAd=" + this.f2747s + ", adVerifications=" + this.f2749u + ", impressionTrackers=" + this.f2751w + ", errorTrackers=" + this.f2752x + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: u0 */
    public boolean mo4246u0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: x0 */
    public boolean mo4247x0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && m4225Z0() != null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: y0 */
    public boolean mo4248y0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }
}
