package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3844j9 {

    /* JADX INFO: renamed from: a */
    public final String f14886a;

    /* JADX INFO: renamed from: b */
    public final Integer f14887b;

    /* JADX INFO: renamed from: c */
    public final Integer f14888c;

    /* JADX INFO: renamed from: d */
    public final String f14889d;

    /* JADX INFO: renamed from: e */
    public final String f14890e;

    /* JADX INFO: renamed from: f */
    public final String f14891f;

    /* JADX INFO: renamed from: g */
    public final String f14892g;

    /* JADX INFO: renamed from: h */
    public final String f14893h;

    /* JADX INFO: renamed from: i */
    public final String f14894i;

    /* JADX INFO: renamed from: j */
    public final String f14895j;

    /* JADX INFO: renamed from: k */
    public final String f14896k;

    /* JADX INFO: renamed from: l */
    public final List f14897l;

    /* JADX INFO: renamed from: m */
    public final List f14898m;

    /* JADX INFO: renamed from: n */
    public final List f14899n;

    /* JADX INFO: renamed from: o */
    public final C3890l9 f14900o;

    /* JADX INFO: renamed from: p */
    public final List f14901p;

    public C3844j9(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List staticResources, List iFrameResources, List htmlResources, C3890l9 c3890l9, List iconViewTracking) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(iconViewTracking, "iconViewTracking");
        this.f14886a = str;
        this.f14887b = num;
        this.f14888c = num2;
        this.f14889d = str2;
        this.f14890e = str3;
        this.f14891f = str4;
        this.f14892g = str5;
        this.f14893h = str6;
        this.f14894i = str7;
        this.f14895j = str8;
        this.f14896k = str9;
        this.f14897l = staticResources;
        this.f14898m = iFrameResources;
        this.f14899n = htmlResources;
        this.f14900o = c3890l9;
        this.f14901p = iconViewTracking;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3844j9)) {
            return false;
        }
        C3844j9 c3844j9 = (C3844j9) obj;
        return Intrinsics.areEqual(this.f14886a, c3844j9.f14886a) && Intrinsics.areEqual(this.f14887b, c3844j9.f14887b) && Intrinsics.areEqual(this.f14888c, c3844j9.f14888c) && Intrinsics.areEqual(this.f14889d, c3844j9.f14889d) && Intrinsics.areEqual(this.f14890e, c3844j9.f14890e) && Intrinsics.areEqual(this.f14891f, c3844j9.f14891f) && Intrinsics.areEqual(this.f14892g, c3844j9.f14892g) && Intrinsics.areEqual(this.f14893h, c3844j9.f14893h) && Intrinsics.areEqual(this.f14894i, c3844j9.f14894i) && Intrinsics.areEqual(this.f14895j, c3844j9.f14895j) && Intrinsics.areEqual(this.f14896k, c3844j9.f14896k) && Intrinsics.areEqual(this.f14897l, c3844j9.f14897l) && Intrinsics.areEqual(this.f14898m, c3844j9.f14898m) && Intrinsics.areEqual(this.f14899n, c3844j9.f14899n) && Intrinsics.areEqual(this.f14900o, c3844j9.f14900o) && Intrinsics.areEqual(this.f14901p, c3844j9.f14901p);
    }

    public int hashCode() {
        String str = this.f14886a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f14887b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14888c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f14889d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14890e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14891f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14892g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14893h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14894i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f14895j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f14896k;
        int iHashCode11 = (((((((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.f14897l.hashCode()) * 31) + this.f14898m.hashCode()) * 31) + this.f14899n.hashCode()) * 31;
        C3890l9 c3890l9 = this.f14900o;
        return ((iHashCode11 + (c3890l9 != null ? c3890l9.hashCode() : 0)) * 31) + this.f14901p.hashCode();
    }

    public String toString() {
        return "Icon(program=" + this.f14886a + ", width=" + this.f14887b + ", height=" + this.f14888c + ", xPosition=" + this.f14889d + ", yPosition=" + this.f14890e + ", duration=" + this.f14891f + ", offset=" + this.f14892g + ", apiFramework=" + this.f14893h + ", pxratio=" + this.f14894i + ", altText=" + this.f14895j + ", hoverText=" + this.f14896k + ", staticResources=" + this.f14897l + ", iFrameResources=" + this.f14898m + ", htmlResources=" + this.f14899n + ", iconClicks=" + this.f14900o + ", iconViewTracking=" + this.f14901p + ")";
    }
}
