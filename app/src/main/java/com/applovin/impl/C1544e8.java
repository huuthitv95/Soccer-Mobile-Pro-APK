package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.e8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1544e8 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private List f1435a;

    /* JADX INFO: renamed from: b */
    private List f1436b;

    /* JADX INFO: renamed from: c */
    private int f1437c;

    /* JADX INFO: renamed from: d */
    private Uri f1438d;

    /* JADX INFO: renamed from: e */
    private final Set f1439e;

    /* JADX INFO: renamed from: f */
    private C1816x7 f1440f;

    /* JADX INFO: renamed from: g */
    private final Map f1441g;

    private C1544e8() {
        this.f1435a = Collections.EMPTY_LIST;
        this.f1436b = Collections.EMPTY_LIST;
        this.f1439e = new HashSet();
        this.f1441g = new HashMap();
    }

    private C1544e8(AbstractC1798v7 abstractC1798v7) {
        this.f1435a = Collections.EMPTY_LIST;
        this.f1436b = Collections.EMPTY_LIST;
        this.f1439e = new HashSet();
        this.f1441g = new HashMap();
        this.f1436b = abstractC1798v7.m5487f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2511a(C1554f8 c1554f8, C1554f8 c1554f9) {
        return Long.compare(c1554f8.m2629b(), c1554f9.m2629b());
    }

    /* JADX INFO: renamed from: a */
    private static int m2512a(String str, C1748l c1748l) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, CertificateUtil.DELIMITER);
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static C1544e8 m2513a(C1702q8 c1702q8, C1544e8 c1544e8, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        C1702q8 c1702q8M4126c;
        C1816x7 c1816x7M5596a;
        List listM4122a;
        C1702q8 c1702q8M4126c2;
        List listM2515a;
        C1702q8 c1702q8M4126c3;
        int iM2512a;
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (abstractC1798v7 == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1544e8 == null) {
            try {
                c1544e8 = new C1544e8(abstractC1798v7);
            } catch (Throwable th) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("VastVideoCreative", "Error occurred while initializing", th);
                }
                c1748l.m4764E().m4333a("VastVideoCreative", th);
                return null;
            }
        }
        if (c1544e8.f1437c == 0 && (c1702q8M4126c3 = c1702q8.m4126c("Duration")) != null && (iM2512a = m2512a(c1702q8M4126c3.m4128d(), c1748l)) > 0) {
            c1544e8.f1437c = iM2512a;
        }
        C1702q8 c1702q8M4126c4 = c1702q8.m4126c("MediaFiles");
        if (c1702q8M4126c4 != null && (listM2515a = m2515a(c1702q8M4126c4, c1748l)) != null && listM2515a.size() > 0) {
            List list = c1544e8.f1435a;
            if (list != null) {
                listM2515a.addAll(list);
            }
            c1544e8.f1435a = listM2515a;
        }
        C1702q8 c1702q8M4126c5 = c1702q8.m4126c("VideoClicks");
        if (c1702q8M4126c5 != null) {
            if (c1544e8.f1438d == null && (c1702q8M4126c2 = c1702q8M4126c5.m4126c("ClickThrough")) != null) {
                String strM4128d = c1702q8M4126c2.m4128d();
                if (StringUtils.isValidString(strM4128d)) {
                    c1544e8.f1438d = Uri.parse(strM4128d);
                }
            }
            AbstractC1534d8.m2438a(c1702q8M4126c5.m4122a("ClickTracking"), c1544e8.f1439e, abstractC1798v7, c1748l);
        }
        C1702q8 c1702q8M4126c6 = c1702q8.m4126c("Icons");
        if (c1702q8M4126c6 != null && (c1816x7M5596a = C1816x7.m5596a((c1702q8M4126c = c1702q8M4126c6.m4126c("Icon")), c1748l)) != null) {
            C1702q8 c1702q8M4126c7 = c1702q8M4126c.m4126c("IconClicks");
            if (c1702q8M4126c7 != null && (listM4122a = c1702q8M4126c7.m4122a("IconClickTracking")) != null) {
                AbstractC1534d8.m2438a(listM4122a, c1816x7M5596a.f3565a, abstractC1798v7, c1748l);
            }
            List listM4122a2 = c1702q8M4126c.m4122a("IconViewTracking");
            if (listM4122a2 != null) {
                AbstractC1534d8.m2438a(listM4122a2, c1816x7M5596a.f3566b, abstractC1798v7, c1748l);
            }
            c1544e8.f1440f = c1816x7M5596a;
        }
        AbstractC1534d8.m2436a(c1702q8, c1544e8.f1441g, abstractC1798v7, c1748l);
        return c1544e8;
    }

    /* JADX INFO: renamed from: a */
    public static C1544e8 m2514a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        C1544e8 c1544e8 = new C1544e8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        c1544e8.f1435a = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            C1554f8 c1554f8M2627a = C1554f8.m2627a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), c1748l);
            if (c1554f8M2627a != null) {
                c1544e8.f1435a.add(c1554f8M2627a);
            }
        }
        c1544e8.f1436b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        c1544e8.f1437c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        c1544e8.f1438d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            C1514b8 c1514b8M2138a = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), c1748l);
            if (c1514b8M2138a != null) {
                c1544e8.f1439e.add(c1514b8M2138a);
            }
        }
        c1544e8.f1440f = C1816x7.m5597a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), c1748l);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                C1514b8 c1514b8M2138a2 = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray3, i3, (JSONObject) null), c1748l);
                if (c1514b8M2138a2 != null) {
                    hashSet.add(c1514b8M2138a2);
                }
            }
            c1544e8.f1441g.put(next, hashSet);
        }
        return c1544e8;
    }

    /* JADX INFO: renamed from: a */
    private static List m2515a(C1702q8 c1702q8, C1748l c1748l) {
        List listM4122a = c1702q8.m4122a("MediaFile");
        ArrayList arrayList = new ArrayList(listM4122a.size());
        List<String> listExplode = CollectionUtils.explode((String) c1748l.m4801a(C1831z4.f3843V4));
        List<String> listExplode2 = CollectionUtils.explode((String) c1748l.m4801a(C1831z4.f3835U4));
        Iterator it = listM4122a.iterator();
        while (it.hasNext()) {
            C1554f8 c1554f8M2626a = C1554f8.m2626a((C1702q8) it.next(), c1748l);
            if (c1554f8M2626a != null) {
                try {
                    String strM2630c = c1554f8M2626a.m2630c();
                    if (!StringUtils.isValidString(strM2630c) || listExplode.contains(strM2630c)) {
                        if (((Boolean) c1748l.m4801a(C1831z4.f3851W4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c1554f8M2626a.m2632e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(c1554f8M2626a);
                            }
                        }
                        c1748l.m4782Q();
                        if (C1768p.m5160a()) {
                            c1748l.m4782Q().m5178k("VastVideoCreative", "Video file not supported: " + c1554f8M2626a);
                        }
                    } else {
                        arrayList.add(c1554f8M2626a);
                    }
                } catch (Throwable th) {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5172a("VastVideoCreative", "Failed to validate video file: " + c1554f8M2626a, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public C1554f8 m2516a(long j) {
        List list = this.f1435a;
        C1554f8 c1554f8 = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<C1554f8> arrayList = new ArrayList(3);
        for (String str : this.f1436b) {
            for (C1554f8 c1554f9 : this.f1435a) {
                String strM2630c = c1554f9.m2630c();
                if (StringUtils.isValidString(strM2630c) && str.equalsIgnoreCase(strM2630c)) {
                    arrayList.add(c1554f9);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f1435a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.e8$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1544e8.m2511a((C1554f8) obj, (C1554f8) obj2);
            }
        });
        for (C1554f8 c1554f10 : arrayList) {
            if (c1554f10.m2629b() > j) {
                break;
            }
            c1554f8 = c1554f10;
        }
        return c1554f8 != null ? c1554f8 : (C1554f8) arrayList.get(0);
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f1435a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1554f8) it.next()).mo1889a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f1436b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f1437c);
        Uri uri = this.f1438d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f1439e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((C1514b8) it2.next()).mo1889a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        C1816x7 c1816x7 = this.f1440f;
        if (c1816x7 != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", c1816x7.mo1889a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f1441g.keySet()) {
            Set set = (Set) this.f1441g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((C1514b8) it3.next()).mo1889a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public Set m2517b() {
        return this.f1439e;
    }

    /* JADX INFO: renamed from: c */
    public Uri m2518c() {
        return this.f1438d;
    }

    /* JADX INFO: renamed from: d */
    public int m2519d() {
        return this.f1437c;
    }

    /* JADX INFO: renamed from: e */
    public Map m2520e() {
        return this.f1441g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1544e8)) {
            return false;
        }
        C1544e8 c1544e8 = (C1544e8) obj;
        if (this.f1437c != c1544e8.f1437c) {
            return false;
        }
        List list = this.f1435a;
        if (list == null ? c1544e8.f1435a != null : !list.equals(c1544e8.f1435a)) {
            return false;
        }
        Uri uri = this.f1438d;
        if (uri == null ? c1544e8.f1438d != null : !uri.equals(c1544e8.f1438d)) {
            return false;
        }
        Set set = this.f1439e;
        if (set == null ? c1544e8.f1439e != null : !set.equals(c1544e8.f1439e)) {
            return false;
        }
        Map map = this.f1441g;
        Map map2 = c1544e8.f1441g;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    /* JADX INFO: renamed from: f */
    public C1816x7 m2521f() {
        return this.f1440f;
    }

    /* JADX INFO: renamed from: g */
    public List m2522g() {
        return this.f1435a;
    }

    public int hashCode() {
        List list = this.f1435a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f1437c) * 31;
        Uri uri = this.f1438d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f1439e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f1441g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f1435a + ", durationSeconds=" + this.f1437c + ", destinationUri=" + this.f1438d + ", clickTrackers=" + this.f1439e + ", eventTrackers=" + this.f1441g + ", industryIcon=" + this.f1440f + AbstractJsonLexerKt.END_OBJ;
    }
}
