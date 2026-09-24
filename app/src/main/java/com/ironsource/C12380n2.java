package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12380n2 {

    /* JADX INFO: renamed from: a */
    private final String f31523a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f31524b;

    /* JADX INFO: renamed from: c */
    private final C12434q2 f31525c;

    /* JADX INFO: renamed from: d */
    private final int f31526d;

    /* JADX INFO: renamed from: e */
    private final String f31527e;

    public C12380n2(String auctionId, JSONObject jSONObject, C12434q2 c12434q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f31523a = auctionId;
        this.f31524b = jSONObject;
        this.f31525c = c12434q2;
        this.f31526d = i;
        this.f31527e = auctionFallback;
    }

    /* JADX INFO: renamed from: a */
    public final String m32801a() {
        return this.f31523a;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m32802b() {
        return this.f31524b;
    }

    /* JADX INFO: renamed from: c */
    public final C12434q2 m32803c() {
        return this.f31525c;
    }

    /* JADX INFO: renamed from: d */
    public final int m32804d() {
        return this.f31526d;
    }

    /* JADX INFO: renamed from: e */
    public final String m32805e() {
        return this.f31527e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12380n2)) {
            return false;
        }
        C12380n2 c12380n2 = (C12380n2) obj;
        return Intrinsics.areEqual(this.f31523a, c12380n2.f31523a) && Intrinsics.areEqual(this.f31524b, c12380n2.f31524b) && Intrinsics.areEqual(this.f31525c, c12380n2.f31525c) && this.f31526d == c12380n2.f31526d && Intrinsics.areEqual(this.f31527e, c12380n2.f31527e);
    }

    /* JADX INFO: renamed from: f */
    public final String m32806f() {
        return this.f31527e;
    }

    /* JADX INFO: renamed from: g */
    public final String m32807g() {
        return this.f31523a;
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m32808h() {
        return this.f31524b;
    }

    public int hashCode() {
        int iHashCode = this.f31523a.hashCode() * 31;
        JSONObject jSONObject = this.f31524b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C12434q2 c12434q2 = this.f31525c;
        return ((((iHashCode2 + (c12434q2 != null ? c12434q2.hashCode() : 0)) * 31) + this.f31526d) * 31) + this.f31527e.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m32809i() {
        return this.f31526d;
    }

    /* JADX INFO: renamed from: j */
    public final C12434q2 m32810j() {
        return this.f31525c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f31523a + ", auctionResponseGenericParam=" + this.f31524b + ", genericNotifications=" + this.f31525c + ", auctionTrial=" + this.f31526d + ", auctionFallback=" + this.f31527e + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12380n2 m32800a(String auctionId, JSONObject jSONObject, C12434q2 c12434q2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C12380n2(auctionId, jSONObject, c12434q2, i, auctionFallback);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12380n2 m32799a(C12380n2 c12380n2, String str, JSONObject jSONObject, C12434q2 c12434q2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c12380n2.f31523a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c12380n2.f31524b;
        }
        if ((i2 & 4) != 0) {
            c12434q2 = c12380n2.f31525c;
        }
        if ((i2 & 8) != 0) {
            i = c12380n2.f31526d;
        }
        if ((i2 & 16) != 0) {
            str2 = c12380n2.f31527e;
        }
        String str3 = str2;
        C12434q2 c12434q3 = c12434q2;
        return c12380n2.m32800a(str, jSONObject, c12434q3, i, str3);
    }
}
