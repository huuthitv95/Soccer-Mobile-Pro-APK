package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import com.ironsource.C12434q2;
import com.ironsource.sdk.controller.InterfaceC12497f;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fe */
/* JADX INFO: loaded from: classes3.dex */
public final class C3757fe {

    /* JADX INFO: renamed from: a */
    public final C3768g2 f14213a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fe$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f14214a;

        /* JADX INFO: renamed from: b */
        public final String f14215b;

        /* JADX INFO: renamed from: c */
        public final double f14216c;

        /* JADX INFO: renamed from: d */
        public final String f14217d;

        /* JADX INFO: renamed from: e */
        public final String f14218e;

        /* JADX INFO: renamed from: f */
        public final String f14219f;

        /* JADX INFO: renamed from: g */
        public final int f14220g;

        /* JADX INFO: renamed from: h */
        public final b f14221h;

        public a(String id, String impid, double d, String burl, String crid, String adm, int i, b ext) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(impid, "impid");
            Intrinsics.checkNotNullParameter(burl, "burl");
            Intrinsics.checkNotNullParameter(crid, "crid");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(ext, "ext");
            this.f14214a = id;
            this.f14215b = impid;
            this.f14216c = d;
            this.f14217d = burl;
            this.f14218e = crid;
            this.f14219f = adm;
            this.f14220g = i;
            this.f14221h = ext;
        }

        public /* synthetic */ a(String str, String str2, double d, String str3, String str4, String str5, int i, b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null) : bVar);
        }

        /* JADX INFO: renamed from: a */
        public final String m17708a() {
            return this.f14219f;
        }

        /* JADX INFO: renamed from: b */
        public final b m17709b() {
            return this.f14221h;
        }

        /* JADX INFO: renamed from: c */
        public final int m17710c() {
            return this.f14220g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f14214a, aVar.f14214a) && Intrinsics.areEqual(this.f14215b, aVar.f14215b) && Double.compare(this.f14216c, aVar.f14216c) == 0 && Intrinsics.areEqual(this.f14217d, aVar.f14217d) && Intrinsics.areEqual(this.f14218e, aVar.f14218e) && Intrinsics.areEqual(this.f14219f, aVar.f14219f) && this.f14220g == aVar.f14220g && Intrinsics.areEqual(this.f14221h, aVar.f14221h);
        }

        public int hashCode() {
            return (((((((((((((this.f14214a.hashCode() * 31) + this.f14215b.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43483m(this.f14216c)) * 31) + this.f14217d.hashCode()) * 31) + this.f14218e.hashCode()) * 31) + this.f14219f.hashCode()) * 31) + this.f14220g) * 31) + this.f14221h.hashCode();
        }

        public String toString() {
            return "BidModel(id=" + this.f14214a + ", impid=" + this.f14215b + ", price=" + this.f14216c + ", burl=" + this.f14217d + ", crid=" + this.f14218e + ", adm=" + this.f14219f + ", mtype=" + this.f14220g + ", ext=" + this.f14221h + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fe$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f14222a;

        /* JADX INFO: renamed from: b */
        public final String f14223b;

        /* JADX INFO: renamed from: c */
        public final String f14224c;

        /* JADX INFO: renamed from: d */
        public final String f14225d;

        /* JADX INFO: renamed from: e */
        public final String f14226e;

        /* JADX INFO: renamed from: f */
        public final String f14227f;

        /* JADX INFO: renamed from: g */
        public final List f14228g;

        /* JADX INFO: renamed from: h */
        public final String f14229h;

        /* JADX INFO: renamed from: i */
        public final int f14230i;

        /* JADX INFO: renamed from: j */
        public final String f14231j;

        /* JADX INFO: renamed from: k */
        public final C4113va f14232k;

        /* JADX INFO: renamed from: l */
        public final EnumC4184yf f14233l;

        /* JADX INFO: renamed from: m */
        public final List f14234m;

        public b(String impressionid, String crtype, String adId, String cgn, String template, String videoUrl, List imptrackers, String params, int i, String baseUrl, C4113va infoIcon, EnumC4184yf renderEngine, List scripts) {
            Intrinsics.checkNotNullParameter(impressionid, "impressionid");
            Intrinsics.checkNotNullParameter(crtype, "crtype");
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(cgn, "cgn");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(imptrackers, "imptrackers");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            Intrinsics.checkNotNullParameter(renderEngine, "renderEngine");
            Intrinsics.checkNotNullParameter(scripts, "scripts");
            this.f14222a = impressionid;
            this.f14223b = crtype;
            this.f14224c = adId;
            this.f14225d = cgn;
            this.f14226e = template;
            this.f14227f = videoUrl;
            this.f14228g = imptrackers;
            this.f14229h = params;
            this.f14230i = i;
            this.f14231j = baseUrl;
            this.f14232k = infoIcon;
            this.f14233l = renderEngine;
            this.f14234m = scripts;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i, String str8, C4113va c4113va, EnumC4184yf enumC4184yf, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, (i2 & 128) == 0 ? str7 : "", (i2 & 256) != 0 ? EnumC3816i4.CLICK_PREFERENCE_EMBEDDED.m17958b() : i, (i2 & 512) != 0 ? "https://live.chartboost.com" : str8, (i2 & 1024) != 0 ? new C4113va(null, null, null, null, null, null, 63, null) : c4113va, (i2 & 2048) != 0 ? EnumC4184yf.UNKNOWN : enumC4184yf, (i2 & 4096) != 0 ? CollectionsKt.emptyList() : list2);
        }

        /* JADX INFO: renamed from: a */
        public final String m17711a() {
            return this.f14224c;
        }

        /* JADX INFO: renamed from: b */
        public final String m17712b() {
            return this.f14231j;
        }

        /* JADX INFO: renamed from: c */
        public final String m17713c() {
            return this.f14225d;
        }

        /* JADX INFO: renamed from: d */
        public final int m17714d() {
            return this.f14230i;
        }

        /* JADX INFO: renamed from: e */
        public final String m17715e() {
            return this.f14223b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f14222a, bVar.f14222a) && Intrinsics.areEqual(this.f14223b, bVar.f14223b) && Intrinsics.areEqual(this.f14224c, bVar.f14224c) && Intrinsics.areEqual(this.f14225d, bVar.f14225d) && Intrinsics.areEqual(this.f14226e, bVar.f14226e) && Intrinsics.areEqual(this.f14227f, bVar.f14227f) && Intrinsics.areEqual(this.f14228g, bVar.f14228g) && Intrinsics.areEqual(this.f14229h, bVar.f14229h) && this.f14230i == bVar.f14230i && Intrinsics.areEqual(this.f14231j, bVar.f14231j) && Intrinsics.areEqual(this.f14232k, bVar.f14232k) && this.f14233l == bVar.f14233l && Intrinsics.areEqual(this.f14234m, bVar.f14234m);
        }

        /* JADX INFO: renamed from: f */
        public final String m17716f() {
            return this.f14222a;
        }

        /* JADX INFO: renamed from: g */
        public final List m17717g() {
            return this.f14228g;
        }

        /* JADX INFO: renamed from: h */
        public final C4113va m17718h() {
            return this.f14232k;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.f14222a.hashCode() * 31) + this.f14223b.hashCode()) * 31) + this.f14224c.hashCode()) * 31) + this.f14225d.hashCode()) * 31) + this.f14226e.hashCode()) * 31) + this.f14227f.hashCode()) * 31) + this.f14228g.hashCode()) * 31) + this.f14229h.hashCode()) * 31) + this.f14230i) * 31) + this.f14231j.hashCode()) * 31) + this.f14232k.hashCode()) * 31) + this.f14233l.hashCode()) * 31) + this.f14234m.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final String m17719i() {
            return this.f14229h;
        }

        /* JADX INFO: renamed from: j */
        public final EnumC4184yf m17720j() {
            return this.f14233l;
        }

        /* JADX INFO: renamed from: k */
        public final List m17721k() {
            return this.f14234m;
        }

        /* JADX INFO: renamed from: l */
        public final String m17722l() {
            return this.f14226e;
        }

        /* JADX INFO: renamed from: m */
        public final String m17723m() {
            return this.f14227f;
        }

        public String toString() {
            return "ExtensionModel(impressionid=" + this.f14222a + ", crtype=" + this.f14223b + ", adId=" + this.f14224c + ", cgn=" + this.f14225d + ", template=" + this.f14226e + ", videoUrl=" + this.f14227f + ", imptrackers=" + this.f14228g + ", params=" + this.f14229h + ", clkp=" + this.f14230i + ", baseUrl=" + this.f14231j + ", infoIcon=" + this.f14232k + ", renderEngine=" + this.f14233l + ", scripts=" + this.f14234m + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fe$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public String f14235a;

        /* JADX INFO: renamed from: b */
        public String f14236b;

        /* JADX INFO: renamed from: c */
        public String f14237c;

        /* JADX INFO: renamed from: d */
        public String f14238d;

        /* JADX INFO: renamed from: e */
        public List f14239e;

        /* JADX INFO: renamed from: f */
        public List f14240f;

        public c(String id, String nbr, String currency, String bidId, List seatbidList, List assets) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(nbr, "nbr");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(bidId, "bidId");
            Intrinsics.checkNotNullParameter(seatbidList, "seatbidList");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.f14235a = id;
            this.f14236b = nbr;
            this.f14237c = currency;
            this.f14238d = bidId;
            this.f14239e = seatbidList;
            this.f14240f = assets;
        }

        /* JADX INFO: renamed from: a */
        public final List m17724a() {
            return this.f14240f;
        }

        /* JADX INFO: renamed from: b */
        public final Map m17725b() {
            List list = this.f14240f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((C4038s1) obj).f16218b, obj);
            }
            return MapsKt.toMutableMap(linkedHashMap);
        }

        /* JADX INFO: renamed from: c */
        public final List m17726c() {
            return this.f14239e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f14235a, cVar.f14235a) && Intrinsics.areEqual(this.f14236b, cVar.f14236b) && Intrinsics.areEqual(this.f14237c, cVar.f14237c) && Intrinsics.areEqual(this.f14238d, cVar.f14238d) && Intrinsics.areEqual(this.f14239e, cVar.f14239e) && Intrinsics.areEqual(this.f14240f, cVar.f14240f);
        }

        public int hashCode() {
            return (((((((((this.f14235a.hashCode() * 31) + this.f14236b.hashCode()) * 31) + this.f14237c.hashCode()) * 31) + this.f14238d.hashCode()) * 31) + this.f14239e.hashCode()) * 31) + this.f14240f.hashCode();
        }

        public String toString() {
            return "OpenRTBModel(id=" + this.f14235a + ", nbr=" + this.f14236b + ", currency=" + this.f14237c + ", bidId=" + this.f14238d + ", seatbidList=" + this.f14239e + ", assets=" + this.f14240f + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fe$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f14241a;

        /* JADX INFO: renamed from: b */
        public final List f14242b;

        public d(String seat, List bidList) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            Intrinsics.checkNotNullParameter(bidList, "bidList");
            this.f14241a = seat;
            this.f14242b = bidList;
        }

        public /* synthetic */ d(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX INFO: renamed from: a */
        public final List m17727a() {
            return this.f14242b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f14241a, dVar.f14241a) && Intrinsics.areEqual(this.f14242b, dVar.f14242b);
        }

        public int hashCode() {
            return (this.f14241a.hashCode() * 31) + this.f14242b.hashCode();
        }

        public String toString() {
            return "SeatbidModel(seat=" + this.f14241a + ", bidList=" + this.f14242b + ")";
        }
    }

    public C3757fe(C3768g2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f14213a = base64Wrapper;
    }

    /* JADX INFO: renamed from: a */
    public final C3651b0 m17694a(AbstractC3628a0 adType, JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        c cVarM17707d = m17707d(jSONObject);
        a aVarM17702b = m17702b(m17705c(cVarM17707d.m17726c()).m17727a());
        b bVarM17709b = aVarM17702b.m17709b();
        C4038s1 c4038s1M17699a = m17699a(cVarM17707d.m17724a());
        Map mapM17725b = cVarM17707d.m17725b();
        mapM17725b.put("body", c4038s1M17699a);
        String strM17723m = bVarM17709b.m17723m();
        String strM18463a = AbstractC3881l0.m18463a(strM17723m);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("imptrackers", bVarM17709b.m17717g());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m17701a(linkedHashMap2, aVarM17702b, adType);
        return new C3651b0("", bVarM17709b.m17711a(), bVarM17709b.m17712b(), bVarM17709b.m17716f(), bVarM17709b.m17718h(), bVarM17709b.m17713c(), "", bVarM17709b.m17715e(), mapM17725b, strM17723m, strM18463a, "", "", "", 0, "", "dummy_template", c4038s1M17699a, linkedHashMap2, bVarM17709b.m17720j(), bVarM17709b.m17721k(), linkedHashMap, aVarM17702b.m17708a(), bVarM17709b.m17719i(), AbstractC3881l0.m18462a(aVarM17702b.m17710c()), EnumC3816i4.f14553c.m17959a(bVarM17709b.m17714d()), this.f14213a.m17751b(aVarM17702b.m17708a()));
    }

    /* JADX INFO: renamed from: a */
    public final a m17695a(JSONObject jSONObject, b bVar) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("impid");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        double d2 = jSONObject.getDouble("price");
        String strOptString = jSONObject.optString(C12434q2.f31753y);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("crid");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("adm");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        return new a(string, string2, d2, strOptString, strOptString2, strOptString3, jSONObject.optInt("mtype"), bVar);
    }

    /* JADX INFO: renamed from: a */
    public final b m17696a(JSONObject jSONObject) throws JSONException {
        List listEmptyList;
        List listEmptyList2;
        C4113va c4113vaM17703b;
        String strOptString = jSONObject.optString("impressionid");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("crtype");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString(InterfaceC12497f.b.f32089c);
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        String strOptString4 = jSONObject.optString("cgn");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
        String string = jSONObject.getString("template");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString5 = jSONObject.optString("videoUrl");
        Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("imptrackers");
        if (jSONArrayOptJSONArray == null || (listEmptyList = AbstractC3912m8.asList(jSONArrayOptJSONArray)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String strOptString6 = jSONObject.optString("params");
        Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
        int iOptInt = jSONObject.optInt("clkp");
        String strOptString7 = jSONObject.optString("baseurl");
        Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(...)");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("infoicon");
        C4113va c4113va = (jSONObjectOptJSONObject == null || (c4113vaM17703b = m17703b(jSONObjectOptJSONObject)) == null) ? new C4113va(null, null, null, null, null, null, 63, null) : c4113vaM17703b;
        EnumC4184yf enumC4184yfM20060a = EnumC4184yf.f17052c.m20060a(jSONObject.optString("renderingengine"));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("scripts");
        if (jSONArrayOptJSONArray2 == null || (listEmptyList2 = AbstractC3912m8.asList(jSONArrayOptJSONArray2)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return new b(strOptString, strOptString2, strOptString3, strOptString4, string, strOptString5, list, strOptString6, iOptInt, strOptString7, c4113va, enumC4184yfM20060a, listEmptyList2);
    }

    /* JADX INFO: renamed from: a */
    public final c m17697a(JSONObject jSONObject, List list, List list2) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString("nbr");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(BidResponsed.KEY_CUR, "USD");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("bidid");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        return new c(string, strOptString, strOptString2, strOptString3, list, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C4038s1 m17698a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new C4038s1("html", strSubstring, str);
    }

    /* JADX INFO: renamed from: a */
    public final C4038s1 m17699a(List list) {
        C4038s1 c4038s1 = (C4038s1) CollectionsKt.firstOrNull(list);
        return c4038s1 == null ? new C4038s1("", "", "") : c4038s1;
    }

    /* JADX INFO: renamed from: a */
    public final String m17700a(AbstractC3628a0 abstractC3628a0) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return "true";
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g) || Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return "false";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m17701a(Map map, a aVar, AbstractC3628a0 abstractC3628a0) {
        map.put("{% encoding %}", "base64");
        map.put("{% adm %}", aVar.m17708a());
        map.put("{{ ad_type }}", m17704b(abstractC3628a0));
        map.put("{{ show_close_button }}", m17700a(abstractC3628a0));
        map.put("{{ preroll_popup }}", "false");
        map.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            map.put("{% is_banner %}", "true");
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m17702b(List list) {
        a aVar = (a) CollectionsKt.firstOrNull(list);
        if (aVar != null) {
            return aVar;
        }
        return new a(null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, null, null, 0, null, 255, null);
    }

    /* JADX INFO: renamed from: b */
    public final C4113va m17703b(JSONObject jSONObject) {
        C4113va.a aVarM17706c;
        C4113va.a aVarM17706c2;
        C4113va.a aVarM17706c3;
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughurl");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        C4113va.b bVarM19692a = C4113va.b.f16585c.m19692a(jSONObject.optInt(C11744X3.i.f26338L));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("margin");
        C4113va.a aVar = (jSONObjectOptJSONObject == null || (aVarM17706c3 = m17706c(jSONObjectOptJSONObject)) == null) ? new C4113va.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVarM17706c3;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("padding");
        C4113va.a aVar2 = (jSONObjectOptJSONObject2 == null || (aVarM17706c2 = m17706c(jSONObjectOptJSONObject2)) == null) ? new C4113va.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVarM17706c2;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("size");
        return new C4113va(strOptString, strOptString2, bVarM19692a, aVar, aVar2, (jSONObjectOptJSONObject3 == null || (aVarM17706c = m17706c(jSONObjectOptJSONObject3)) == null) ? new C4113va.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null) : aVarM17706c);
    }

    /* JADX INFO: renamed from: b */
    public final String m17704b(AbstractC3628a0 abstractC3628a0) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return "10";
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return "8";
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
            return "9";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final d m17705c(List list) {
        d dVar = (d) CollectionsKt.firstOrNull(list);
        if (dVar != null) {
            return dVar;
        }
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final C4113va.a m17706c(JSONObject jSONObject) {
        return new C4113va.a(jSONObject.optDouble("w"), jSONObject.optDouble(CmcdData.Factory.STREAMING_FORMAT_HLS));
    }

    /* JADX INFO: renamed from: d */
    public final c m17707d(JSONObject jSONObject) throws JSONException {
        List<JSONObject> listAsList;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("seatbid");
        b bVar = new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray != null && (listAsList = AbstractC3912m8.asList(jSONArrayOptJSONArray)) != null) {
            for (JSONObject jSONObject2 : listAsList) {
                String strOptString = jSONObject2.optString("seat");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("bid");
                if (jSONArrayOptJSONArray2 != null) {
                    Intrinsics.checkNotNull(jSONArrayOptJSONArray2);
                    List<JSONObject> listAsList2 = AbstractC3912m8.asList(jSONArrayOptJSONArray2);
                    if (listAsList2 != null) {
                        for (JSONObject jSONObject3 : listAsList2) {
                            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("ext");
                            if (jSONObjectOptJSONObject != null) {
                                Intrinsics.checkNotNull(jSONObjectOptJSONObject);
                                bVar = m17696a(jSONObjectOptJSONObject);
                                C4038s1 c4038s1M17698a = m17698a(bVar.m17722l());
                                if (c4038s1M17698a != null) {
                                    arrayList.add(c4038s1M17698a);
                                }
                            }
                            arrayList2.add(m17695a(jSONObject3, bVar));
                        }
                    }
                }
                Intrinsics.checkNotNull(strOptString);
                arrayList3.add(new d(strOptString, arrayList2));
            }
        }
        return m17697a(jSONObject, arrayList3, arrayList);
    }
}
