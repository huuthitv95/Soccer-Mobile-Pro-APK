package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qf */
/* JADX INFO: loaded from: classes3.dex */
public final class C4008qf {

    /* JADX INFO: renamed from: p */
    public static final a f15945p = new a(null);

    /* JADX INFO: renamed from: q */
    public static final b f15946q = b.FILL;

    /* JADX INFO: renamed from: a */
    public final String f15947a;

    /* JADX INFO: renamed from: b */
    public final String f15948b;

    /* JADX INFO: renamed from: c */
    public final Map f15949c;

    /* JADX INFO: renamed from: d */
    public final long f15950d;

    /* JADX INFO: renamed from: e */
    public final C3840j5 f15951e;

    /* JADX INFO: renamed from: f */
    public final List f15952f;

    /* JADX INFO: renamed from: g */
    public final C3670bj f15953g;

    /* JADX INFO: renamed from: h */
    public final C4177y8 f15954h;

    /* JADX INFO: renamed from: i */
    public final int f15955i;

    /* JADX INFO: renamed from: j */
    public final boolean f15956j;

    /* JADX INFO: renamed from: k */
    public final boolean f15957k;

    /* JADX INFO: renamed from: l */
    public final boolean f15958l;

    /* JADX INFO: renamed from: m */
    public final b f15959m;

    /* JADX INFO: renamed from: n */
    public final Integer f15960n;

    /* JADX INFO: renamed from: o */
    public final Integer f15961o;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qf$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4008qf m19192a(JSONObject jsonObject) throws JSONException {
            Iterator<String> itKeys;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObject = jsonObject.getJSONObject("config");
            List listM19028a = C3978p7.m19028a(jSONObject.optJSONArray("event_trackers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("ext");
            if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.checkNotNull(next);
                    Object obj = jSONObjectOptJSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    linkedHashMap.put(next, obj);
                }
            }
            String string = jsonObject.getString("adm");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("markup_type");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            long jOptLong = jSONObject.optLong("auto_advance_time", -1L);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("countdown");
            Integer numValueOf = null;
            C3840j5 c3840j5M18188a = jSONObjectOptJSONObject2 != null ? C3840j5.f14871c.m18188a(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("vast");
            C3670bj c3670bjM16956a = jSONObjectOptJSONObject3 != null ? C3670bj.f13594g.m16956a(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("html");
            C4177y8 c4177y8M20051a = jSONObjectOptJSONObject4 != null ? C4177y8.f17032g.m20051a(jSONObjectOptJSONObject4) : null;
            int iOptInt = jSONObject.optInt("ignore_safe_area", 0);
            boolean zOptBoolean = jSONObject.optBoolean("dedupe_clicks", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("reset_user_click_detector_after_click", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("optional", false);
            b bVarM19196a = jSONObject.has("fit_type") ? b.f15962c.m19196a(jSONObject.getString("fit_type")) : C4008qf.f15946q;
            Integer numValueOf2 = (!jSONObject.has("height") || jSONObject.isNull("height")) ? null : Integer.valueOf(jSONObject.getInt("height"));
            if (jSONObject.has("width") && !jSONObject.isNull("width")) {
                numValueOf = Integer.valueOf(jSONObject.getInt("width"));
            }
            return new C4008qf(string, string2, linkedHashMap, jOptLong, c3840j5M18188a, listM19028a, c3670bjM16956a, c4177y8M20051a, iOptInt, zOptBoolean, zOptBoolean2, zOptBoolean3, bVarM19196a, numValueOf2, numValueOf);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qf$b */
    public enum b {
        ASPECT("aspect"),
        FILL("fill"),
        FIXED("fixed");


        /* JADX INFO: renamed from: b */
        public final String f15968b;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ EnumEntries f15967h = EnumEntriesKt.enumEntries(m19193a());

        /* JADX INFO: renamed from: c */
        public static final a f15962c = new a(null);

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.qf$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m19196a(String str) {
                Object next;
                Iterator<E> it = b.m19194b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((b) next).m19195c(), str));
                b bVar = (b) next;
                return bVar == null ? b.FILL : bVar;
            }
        }

        b(String str) {
            this.f15968b = str;
        }

        /* JADX INFO: renamed from: b */
        public static EnumEntries m19194b() {
            return f15967h;
        }

        /* JADX INFO: renamed from: c */
        public final String m19195c() {
            return this.f15968b;
        }
    }

    public C4008qf(String adm, String markupType, Map ext, long j, C3840j5 c3840j5, List eventTrackers, C3670bj c3670bj, C4177y8 c4177y8, int i, boolean z, boolean z2, boolean z3, b fitType, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(ext, "ext");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(fitType, "fitType");
        this.f15947a = adm;
        this.f15948b = markupType;
        this.f15949c = ext;
        this.f15950d = j;
        this.f15951e = c3840j5;
        this.f15952f = eventTrackers;
        this.f15953g = c3670bj;
        this.f15954h = c4177y8;
        this.f15955i = i;
        this.f15956j = z;
        this.f15957k = z2;
        this.f15958l = z3;
        this.f15959m = fitType;
        this.f15960n = num;
        this.f15961o = num2;
    }

    public /* synthetic */ C4008qf(String str, String str2, Map map, long j, C3840j5 c3840j5, List list, C3670bj c3670bj, C4177y8 c4177y8, int i, boolean z, boolean z2, boolean z3, b bVar, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? null : c3840j5, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : c3670bj, (i2 & 128) != 0 ? null : c4177y8, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? b.FILL : bVar, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: b */
    public final String m19177b() {
        return this.f15947a;
    }

    /* JADX INFO: renamed from: c */
    public final long m19178c() {
        return this.f15950d;
    }

    /* JADX INFO: renamed from: d */
    public final C3840j5 m19179d() {
        return this.f15951e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19180e() {
        return this.f15956j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4008qf)) {
            return false;
        }
        C4008qf c4008qf = (C4008qf) obj;
        return Intrinsics.areEqual(this.f15947a, c4008qf.f15947a) && Intrinsics.areEqual(this.f15948b, c4008qf.f15948b) && Intrinsics.areEqual(this.f15949c, c4008qf.f15949c) && this.f15950d == c4008qf.f15950d && Intrinsics.areEqual(this.f15951e, c4008qf.f15951e) && Intrinsics.areEqual(this.f15952f, c4008qf.f15952f) && Intrinsics.areEqual(this.f15953g, c4008qf.f15953g) && Intrinsics.areEqual(this.f15954h, c4008qf.f15954h) && this.f15955i == c4008qf.f15955i && this.f15956j == c4008qf.f15956j && this.f15957k == c4008qf.f15957k && this.f15958l == c4008qf.f15958l && this.f15959m == c4008qf.f15959m && Intrinsics.areEqual(this.f15960n, c4008qf.f15960n) && Intrinsics.areEqual(this.f15961o, c4008qf.f15961o);
    }

    /* JADX INFO: renamed from: f */
    public final List m19181f() {
        return this.f15952f;
    }

    /* JADX INFO: renamed from: g */
    public final Map m19182g() {
        return this.f15949c;
    }

    /* JADX INFO: renamed from: h */
    public final b m19183h() {
        return this.f15959m;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f15947a.hashCode() * 31) + this.f15948b.hashCode()) * 31) + this.f15949c.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f15950d)) * 31;
        C3840j5 c3840j5 = this.f15951e;
        int iHashCode2 = (((iHashCode + (c3840j5 == null ? 0 : c3840j5.hashCode())) * 31) + this.f15952f.hashCode()) * 31;
        C3670bj c3670bj = this.f15953g;
        int iHashCode3 = (iHashCode2 + (c3670bj == null ? 0 : c3670bj.hashCode())) * 31;
        C4177y8 c4177y8 = this.f15954h;
        int iHashCode4 = (((((((((((iHashCode3 + (c4177y8 == null ? 0 : c4177y8.hashCode())) * 31) + this.f15955i) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15956j)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15957k)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15958l)) * 31) + this.f15959m.hashCode()) * 31;
        Integer num = this.f15960n;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15961o;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Integer m19184i() {
        return this.f15960n;
    }

    /* JADX INFO: renamed from: j */
    public final C4177y8 m19185j() {
        return this.f15954h;
    }

    /* JADX INFO: renamed from: k */
    public final int m19186k() {
        return this.f15955i;
    }

    /* JADX INFO: renamed from: l */
    public final String m19187l() {
        return this.f15948b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m19188m() {
        return this.f15958l;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m19189n() {
        return this.f15957k;
    }

    /* JADX INFO: renamed from: o */
    public final C3670bj m19190o() {
        return this.f15953g;
    }

    /* JADX INFO: renamed from: p */
    public final Integer m19191p() {
        return this.f15961o;
    }

    public String toString() {
        return "RenderableConfig(adm=" + this.f15947a + ", markupType=" + this.f15948b + ", ext=" + this.f15949c + ", autoAdvanceTime=" + this.f15950d + ", countdown=" + this.f15951e + ", eventTrackers=" + this.f15952f + ", vast=" + this.f15953g + ", html=" + this.f15954h + ", ignoreSafeAreaFlags=" + this.f15955i + ", dedupeClicks=" + this.f15956j + ", resetUserClickDetectorAfterClick=" + this.f15957k + ", optional=" + this.f15958l + ", fitType=" + this.f15959m + ", height=" + this.f15960n + ", width=" + this.f15961o + ")";
    }
}
