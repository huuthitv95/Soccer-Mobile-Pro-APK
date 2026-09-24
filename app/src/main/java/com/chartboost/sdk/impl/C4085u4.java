package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u4 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4085u4 {

    /* JADX INFO: renamed from: a */
    public final String f16442a;

    /* JADX INFO: renamed from: b */
    public final Integer f16443b;

    /* JADX INFO: renamed from: c */
    public final Integer f16444c;

    /* JADX INFO: renamed from: d */
    public final Integer f16445d;

    /* JADX INFO: renamed from: e */
    public final Integer f16446e;

    /* JADX INFO: renamed from: f */
    public final Integer f16447f;

    /* JADX INFO: renamed from: g */
    public final Integer f16448g;

    /* JADX INFO: renamed from: h */
    public final String f16449h;

    /* JADX INFO: renamed from: i */
    public final String f16450i;

    /* JADX INFO: renamed from: j */
    public final String f16451j;

    /* JADX INFO: renamed from: k */
    public final String f16452k;

    /* JADX INFO: renamed from: l */
    public final String f16453l;

    /* JADX INFO: renamed from: m */
    public final List f16454m;

    /* JADX INFO: renamed from: n */
    public final List f16455n;

    /* JADX INFO: renamed from: o */
    public final List f16456o;

    /* JADX INFO: renamed from: p */
    public final List f16457p;

    /* JADX INFO: renamed from: q */
    public final String f16458q;

    /* JADX INFO: renamed from: r */
    public final List f16459r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3946nj f16460s;

    public C4085u4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, InterfaceC3946nj interfaceC3946nj) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(companionClickTracking, "companionClickTracking");
        this.f16442a = str;
        this.f16443b = num;
        this.f16444c = num2;
        this.f16445d = num3;
        this.f16446e = num4;
        this.f16447f = num5;
        this.f16448g = num6;
        this.f16449h = str2;
        this.f16450i = str3;
        this.f16451j = str4;
        this.f16452k = str5;
        this.f16453l = str6;
        this.f16454m = staticResources;
        this.f16455n = iFrameResources;
        this.f16456o = htmlResources;
        this.f16457p = trackingEvents;
        this.f16458q = str7;
        this.f16459r = companionClickTracking;
        this.f16460s = interfaceC3946nj;
    }

    public /* synthetic */ C4085u4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, List list5, InterfaceC3946nj interfaceC3946nj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, list, list2, list3, list4, str7, (131072 & i) != 0 ? CollectionsKt.emptyList() : list5, (i & 262144) != 0 ? null : interfaceC3946nj);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4085u4 m19549a(C4085u4 c4085u4, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, List list5, InterfaceC3946nj interfaceC3946nj, int i, Object obj) {
        InterfaceC3946nj interfaceC3946nj2;
        List list6;
        String str8 = (i & 1) != 0 ? c4085u4.f16442a : str;
        Integer num7 = (i & 2) != 0 ? c4085u4.f16443b : num;
        Integer num8 = (i & 4) != 0 ? c4085u4.f16444c : num2;
        Integer num9 = (i & 8) != 0 ? c4085u4.f16445d : num3;
        Integer num10 = (i & 16) != 0 ? c4085u4.f16446e : num4;
        Integer num11 = (i & 32) != 0 ? c4085u4.f16447f : num5;
        Integer num12 = (i & 64) != 0 ? c4085u4.f16448g : num6;
        String str9 = (i & 128) != 0 ? c4085u4.f16449h : str2;
        String str10 = (i & 256) != 0 ? c4085u4.f16450i : str3;
        String str11 = (i & 512) != 0 ? c4085u4.f16451j : str4;
        String str12 = (i & 1024) != 0 ? c4085u4.f16452k : str5;
        String str13 = (i & 2048) != 0 ? c4085u4.f16453l : str6;
        List list7 = (i & 4096) != 0 ? c4085u4.f16454m : list;
        List list8 = (i & 8192) != 0 ? c4085u4.f16455n : list2;
        String str14 = str8;
        List list9 = (i & 16384) != 0 ? c4085u4.f16456o : list3;
        List list10 = (i & 32768) != 0 ? c4085u4.f16457p : list4;
        String str15 = (i & 65536) != 0 ? c4085u4.f16458q : str7;
        List list11 = (i & 131072) != 0 ? c4085u4.f16459r : list5;
        if ((i & 262144) != 0) {
            list6 = list11;
            interfaceC3946nj2 = c4085u4.f16460s;
        } else {
            interfaceC3946nj2 = interfaceC3946nj;
            list6 = list11;
        }
        return c4085u4.m19551a(str14, num7, num8, num9, num10, num11, num12, str9, str10, str11, str12, str13, list7, list8, list9, list10, str15, list6, interfaceC3946nj2);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3946nj m19550a() {
        return this.f16460s;
    }

    /* JADX INFO: renamed from: a */
    public final C4085u4 m19551a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, InterfaceC3946nj interfaceC3946nj) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(companionClickTracking, "companionClickTracking");
        return new C4085u4(str, num, num2, num3, num4, num5, num6, str2, str3, str4, str5, str6, staticResources, iFrameResources, htmlResources, trackingEvents, str7, companionClickTracking, interfaceC3946nj);
    }

    /* JADX INFO: renamed from: b */
    public final String m19552b() {
        return this.f16458q;
    }

    /* JADX INFO: renamed from: c */
    public final List m19553c() {
        return this.f16459r;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m19554d() {
        return this.f16444c;
    }

    /* JADX INFO: renamed from: e */
    public final List m19555e() {
        return this.f16456o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4085u4)) {
            return false;
        }
        C4085u4 c4085u4 = (C4085u4) obj;
        return Intrinsics.areEqual(this.f16442a, c4085u4.f16442a) && Intrinsics.areEqual(this.f16443b, c4085u4.f16443b) && Intrinsics.areEqual(this.f16444c, c4085u4.f16444c) && Intrinsics.areEqual(this.f16445d, c4085u4.f16445d) && Intrinsics.areEqual(this.f16446e, c4085u4.f16446e) && Intrinsics.areEqual(this.f16447f, c4085u4.f16447f) && Intrinsics.areEqual(this.f16448g, c4085u4.f16448g) && Intrinsics.areEqual(this.f16449h, c4085u4.f16449h) && Intrinsics.areEqual(this.f16450i, c4085u4.f16450i) && Intrinsics.areEqual(this.f16451j, c4085u4.f16451j) && Intrinsics.areEqual(this.f16452k, c4085u4.f16452k) && Intrinsics.areEqual(this.f16453l, c4085u4.f16453l) && Intrinsics.areEqual(this.f16454m, c4085u4.f16454m) && Intrinsics.areEqual(this.f16455n, c4085u4.f16455n) && Intrinsics.areEqual(this.f16456o, c4085u4.f16456o) && Intrinsics.areEqual(this.f16457p, c4085u4.f16457p) && Intrinsics.areEqual(this.f16458q, c4085u4.f16458q) && Intrinsics.areEqual(this.f16459r, c4085u4.f16459r) && Intrinsics.areEqual(this.f16460s, c4085u4.f16460s);
    }

    /* JADX INFO: renamed from: f */
    public final List m19556f() {
        return this.f16455n;
    }

    /* JADX INFO: renamed from: g */
    public final List m19557g() {
        return this.f16454m;
    }

    /* JADX INFO: renamed from: h */
    public final List m19558h() {
        return this.f16457p;
    }

    public int hashCode() {
        String str = this.f16442a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f16443b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f16444c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f16445d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f16446e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f16447f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f16448g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.f16449h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16450i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16451j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16452k;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f16453l;
        int iHashCode12 = (((((((((iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f16454m.hashCode()) * 31) + this.f16455n.hashCode()) * 31) + this.f16456o.hashCode()) * 31) + this.f16457p.hashCode()) * 31;
        String str7 = this.f16458q;
        int iHashCode13 = (((iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.f16459r.hashCode()) * 31;
        InterfaceC3946nj interfaceC3946nj = this.f16460s;
        return iHashCode13 + (interfaceC3946nj != null ? interfaceC3946nj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Integer m19559i() {
        return this.f16443b;
    }

    public String toString() {
        return "CompanionAd(id=" + this.f16442a + ", width=" + this.f16443b + ", height=" + this.f16444c + ", assetWidth=" + this.f16445d + ", assetHeight=" + this.f16446e + ", expandedWidth=" + this.f16447f + ", expandedHeight=" + this.f16448g + ", apiFramework=" + this.f16449h + ", adSlotID=" + this.f16450i + ", pxratio=" + this.f16451j + ", altText=" + this.f16452k + ", adParameters=" + this.f16453l + ", staticResources=" + this.f16454m + ", iFrameResources=" + this.f16455n + ", htmlResources=" + this.f16456o + ", trackingEvents=" + this.f16457p + ", companionClickThrough=" + this.f16458q + ", companionClickTracking=" + this.f16459r + ", bestResource=" + this.f16460s + ")";
    }
}
