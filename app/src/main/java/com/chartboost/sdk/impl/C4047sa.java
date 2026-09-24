package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.sa */
/* JADX INFO: loaded from: classes3.dex */
public final class C4047sa {

    /* JADX INFO: renamed from: a */
    public final String f16239a;

    /* JADX INFO: renamed from: b */
    public final String f16240b;

    /* JADX INFO: renamed from: c */
    public final String f16241c;

    /* JADX INFO: renamed from: d */
    public final String f16242d;

    /* JADX INFO: renamed from: e */
    public final List f16243e;

    /* JADX INFO: renamed from: f */
    public final List f16244f;

    /* JADX INFO: renamed from: g */
    public final List f16245g;

    /* JADX INFO: renamed from: h */
    public final List f16246h;

    /* JADX INFO: renamed from: i */
    public final List f16247i;

    public C4047sa(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        this.f16239a = str;
        this.f16240b = str2;
        this.f16241c = str3;
        this.f16242d = str4;
        this.f16243e = impressions;
        this.f16244f = creatives;
        this.f16245g = extensions;
        this.f16246h = adVerifications;
        this.f16247i = viewableImpressions;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4047sa m19399a(C4047sa c4047sa, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4047sa.f16239a;
        }
        if ((i & 2) != 0) {
            str2 = c4047sa.f16240b;
        }
        if ((i & 4) != 0) {
            str3 = c4047sa.f16241c;
        }
        if ((i & 8) != 0) {
            str4 = c4047sa.f16242d;
        }
        if ((i & 16) != 0) {
            list = c4047sa.f16243e;
        }
        if ((i & 32) != 0) {
            list2 = c4047sa.f16244f;
        }
        if ((i & 64) != 0) {
            list3 = c4047sa.f16245g;
        }
        if ((i & 128) != 0) {
            list4 = c4047sa.f16246h;
        }
        if ((i & 256) != 0) {
            list5 = c4047sa.f16247i;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        List list10 = list;
        String str5 = str3;
        return c4047sa.m19400a(str, str2, str5, str4, list10, list8, list9, list6, list7);
    }

    /* JADX INFO: renamed from: a */
    public final C4047sa m19400a(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        return new C4047sa(str, str2, str3, str4, impressions, creatives, extensions, adVerifications, viewableImpressions);
    }

    /* JADX INFO: renamed from: a */
    public final List m19401a() {
        return this.f16246h;
    }

    /* JADX INFO: renamed from: b */
    public final List m19402b() {
        return this.f16244f;
    }

    /* JADX INFO: renamed from: c */
    public final List m19403c() {
        return this.f16245g;
    }

    /* JADX INFO: renamed from: d */
    public final List m19404d() {
        return this.f16243e;
    }

    /* JADX INFO: renamed from: e */
    public final List m19405e() {
        return this.f16247i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4047sa)) {
            return false;
        }
        C4047sa c4047sa = (C4047sa) obj;
        return Intrinsics.areEqual(this.f16239a, c4047sa.f16239a) && Intrinsics.areEqual(this.f16240b, c4047sa.f16240b) && Intrinsics.areEqual(this.f16241c, c4047sa.f16241c) && Intrinsics.areEqual(this.f16242d, c4047sa.f16242d) && Intrinsics.areEqual(this.f16243e, c4047sa.f16243e) && Intrinsics.areEqual(this.f16244f, c4047sa.f16244f) && Intrinsics.areEqual(this.f16245g, c4047sa.f16245g) && Intrinsics.areEqual(this.f16246h, c4047sa.f16246h) && Intrinsics.areEqual(this.f16247i, c4047sa.f16247i);
    }

    public int hashCode() {
        String str = this.f16239a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16240b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16241c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16242d;
        return ((((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f16243e.hashCode()) * 31) + this.f16244f.hashCode()) * 31) + this.f16245g.hashCode()) * 31) + this.f16246h.hashCode()) * 31) + this.f16247i.hashCode();
    }

    public String toString() {
        return "InLine(adSystem=" + this.f16239a + ", adTitle=" + this.f16240b + ", description=" + this.f16241c + ", error=" + this.f16242d + ", impressions=" + this.f16243e + ", creatives=" + this.f16244f + ", extensions=" + this.f16245g + ", adVerifications=" + this.f16246h + ", viewableImpressions=" + this.f16247i + ")";
    }
}
