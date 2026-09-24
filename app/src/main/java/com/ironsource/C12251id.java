package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.id */
/* JADX INFO: loaded from: classes6.dex */
public final class C12251id {

    /* JADX INFO: renamed from: a */
    private final Integer f30585a;

    /* JADX INFO: renamed from: b */
    private final String f30586b;

    /* JADX INFO: renamed from: c */
    private final Boolean f30587c;

    /* JADX INFO: renamed from: d */
    private final String f30588d;

    /* JADX INFO: renamed from: e */
    private final Integer f30589e;

    /* JADX INFO: renamed from: f */
    private final Boolean f30590f;

    /* JADX INFO: renamed from: g */
    private final C12614y3 f30591g;

    /* JADX INFO: renamed from: h */
    private final C11685Tc f30592h;

    public C12251id() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m31744a() {
        return this.f30585a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31745b() {
        return this.f30586b;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m31746c() {
        return this.f30587c;
    }

    /* JADX INFO: renamed from: d */
    public final String m31747d() {
        return this.f30588d;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m31748e() {
        return this.f30589e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12251id)) {
            return false;
        }
        C12251id c12251id = (C12251id) obj;
        return Intrinsics.areEqual(this.f30585a, c12251id.f30585a) && Intrinsics.areEqual(this.f30586b, c12251id.f30586b) && Intrinsics.areEqual(this.f30587c, c12251id.f30587c) && Intrinsics.areEqual(this.f30588d, c12251id.f30588d) && Intrinsics.areEqual(this.f30589e, c12251id.f30589e) && Intrinsics.areEqual(this.f30590f, c12251id.f30590f) && Intrinsics.areEqual(this.f30591g, c12251id.f30591g) && Intrinsics.areEqual(this.f30592h, c12251id.f30592h);
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m31749f() {
        return this.f30590f;
    }

    /* JADX INFO: renamed from: g */
    public final C12614y3 m31750g() {
        return this.f30591g;
    }

    /* JADX INFO: renamed from: h */
    public final C11685Tc m31751h() {
        return this.f30592h;
    }

    public int hashCode() {
        Integer num = this.f30585a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f30586b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f30587c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f30588d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f30589e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f30590f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C12614y3 c12614y3 = this.f30591g;
        int iHashCode7 = (iHashCode6 + (c12614y3 == null ? 0 : c12614y3.hashCode())) * 31;
        C11685Tc c11685Tc = this.f30592h;
        return iHashCode7 + (c11685Tc != null ? c11685Tc.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final C12614y3 m31752i() {
        return this.f30591g;
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m31753j() {
        return this.f30590f;
    }

    /* JADX INFO: renamed from: k */
    public final C11685Tc m31754k() {
        return this.f30592h;
    }

    /* JADX INFO: renamed from: l */
    public final Integer m31755l() {
        return this.f30585a;
    }

    /* JADX INFO: renamed from: m */
    public final String m31756m() {
        return this.f30586b;
    }

    /* JADX INFO: renamed from: n */
    public final Integer m31757n() {
        return this.f30589e;
    }

    /* JADX INFO: renamed from: o */
    public final String m31758o() {
        return this.f30588d;
    }

    /* JADX INFO: renamed from: p */
    public final Boolean m31759p() {
        return this.f30587c;
    }

    public String toString() {
        return "PlacementConfig2(placementId=" + this.f30585a + ", placementName=" + this.f30586b + ", isDefault=" + this.f30587c + ", virtualItemName=" + this.f30588d + ", virtualItemCount=" + this.f30589e + ", delivery=" + this.f30590f + ", capping=" + this.f30591g + ", pacing=" + this.f30592h + ")";
    }

    public C12251id(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C12614y3 c12614y3, C11685Tc c11685Tc) {
        this.f30585a = num;
        this.f30586b = str;
        this.f30587c = bool;
        this.f30588d = str2;
        this.f30589e = num2;
        this.f30590f = bool2;
        this.f30591g = c12614y3;
        this.f30592h = c11685Tc;
    }

    /* JADX INFO: renamed from: a */
    public final C12251id m31743a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C12614y3 c12614y3, C11685Tc c11685Tc) {
        return new C12251id(num, str, bool, str2, num2, bool2, c12614y3, c11685Tc);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12251id m31742a(C12251id c12251id, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C12614y3 c12614y3, C11685Tc c11685Tc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c12251id.f30585a;
        }
        if ((i & 2) != 0) {
            str = c12251id.f30586b;
        }
        if ((i & 4) != 0) {
            bool = c12251id.f30587c;
        }
        if ((i & 8) != 0) {
            str2 = c12251id.f30588d;
        }
        if ((i & 16) != 0) {
            num2 = c12251id.f30589e;
        }
        if ((i & 32) != 0) {
            bool2 = c12251id.f30590f;
        }
        if ((i & 64) != 0) {
            c12614y3 = c12251id.f30591g;
        }
        if ((i & 128) != 0) {
            c11685Tc = c12251id.f30592h;
        }
        C12614y3 c12614y4 = c12614y3;
        C11685Tc c11685Tc2 = c11685Tc;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c12251id.m31743a(num, str, bool, str2, num3, bool3, c12614y4, c11685Tc2);
    }

    public /* synthetic */ C12251id(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C12614y3 c12614y3, C11685Tc c11685Tc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c12614y3, (i & 128) != 0 ? null : c11685Tc);
    }
}
