package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12427pd {

    /* JADX INFO: renamed from: a */
    private final String f31711a;

    /* JADX INFO: renamed from: b */
    private final String f31712b;

    /* JADX INFO: renamed from: c */
    private final String f31713c;

    /* JADX INFO: renamed from: d */
    private final String f31714d;

    /* JADX INFO: renamed from: e */
    private final String f31715e;

    /* JADX INFO: renamed from: f */
    private final Boolean f31716f;

    /* JADX INFO: renamed from: g */
    private final JSONObject f31717g;

    /* JADX INFO: renamed from: h */
    private final a f31718h;

    /* JADX INFO: renamed from: com.ironsource.pd$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final JSONObject f31719a;

        /* JADX INFO: renamed from: b */
        private final JSONObject f31720b;

        /* JADX INFO: renamed from: c */
        private final JSONObject f31721c;

        /* JADX INFO: renamed from: d */
        private final JSONObject f31722d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a */
        public final JSONObject m33092a() {
            return this.f31719a;
        }

        /* JADX INFO: renamed from: b */
        public final JSONObject m33093b() {
            return this.f31720b;
        }

        /* JADX INFO: renamed from: c */
        public final JSONObject m33094c() {
            return this.f31721c;
        }

        /* JADX INFO: renamed from: d */
        public final JSONObject m33095d() {
            return this.f31722d;
        }

        /* JADX INFO: renamed from: e */
        public final JSONObject m33096e() {
            return this.f31721c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f31719a, aVar.f31719a) && Intrinsics.areEqual(this.f31720b, aVar.f31720b) && Intrinsics.areEqual(this.f31721c, aVar.f31721c) && Intrinsics.areEqual(this.f31722d, aVar.f31722d);
        }

        /* JADX INFO: renamed from: f */
        public final JSONObject m33097f() {
            return this.f31720b;
        }

        /* JADX INFO: renamed from: g */
        public final JSONObject m33098g() {
            return this.f31722d;
        }

        /* JADX INFO: renamed from: h */
        public final JSONObject m33099h() {
            return this.f31719a;
        }

        public int hashCode() {
            JSONObject jSONObject = this.f31719a;
            int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.f31720b;
            int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSONObject jSONObject3 = this.f31721c;
            int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            JSONObject jSONObject4 = this.f31722d;
            return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f31719a + ", interstitial=" + this.f31720b + ", banner=" + this.f31721c + ", nativeAd=" + this.f31722d + ")";
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            this.f31719a = jSONObject;
            this.f31720b = jSONObject2;
            this.f31721c = jSONObject3;
            this.f31722d = jSONObject4;
        }

        /* JADX INFO: renamed from: a */
        public final a m33091a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m33090a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.f31719a;
            }
            if ((i & 2) != 0) {
                jSONObject2 = aVar.f31720b;
            }
            if ((i & 4) != 0) {
                jSONObject3 = aVar.f31721c;
            }
            if ((i & 8) != 0) {
                jSONObject4 = aVar.f31722d;
            }
            return aVar.m33091a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }
    }

    public C12427pd() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m33074a() {
        return this.f31711a;
    }

    /* JADX INFO: renamed from: b */
    public final String m33075b() {
        return this.f31712b;
    }

    /* JADX INFO: renamed from: c */
    public final String m33076c() {
        return this.f31713c;
    }

    /* JADX INFO: renamed from: d */
    public final String m33077d() {
        return this.f31714d;
    }

    /* JADX INFO: renamed from: e */
    public final String m33078e() {
        return this.f31715e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12427pd)) {
            return false;
        }
        C12427pd c12427pd = (C12427pd) obj;
        return Intrinsics.areEqual(this.f31711a, c12427pd.f31711a) && Intrinsics.areEqual(this.f31712b, c12427pd.f31712b) && Intrinsics.areEqual(this.f31713c, c12427pd.f31713c) && Intrinsics.areEqual(this.f31714d, c12427pd.f31714d) && Intrinsics.areEqual(this.f31715e, c12427pd.f31715e) && Intrinsics.areEqual(this.f31716f, c12427pd.f31716f) && Intrinsics.areEqual(this.f31717g, c12427pd.f31717g) && Intrinsics.areEqual(this.f31718h, c12427pd.f31718h);
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m33079f() {
        return this.f31716f;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m33080g() {
        return this.f31717g;
    }

    /* JADX INFO: renamed from: h */
    public final a m33081h() {
        return this.f31718h;
    }

    public int hashCode() {
        String str = this.f31711a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31712b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31713c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31714d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31715e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f31716f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.f31717g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.f31718h;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final a m33082i() {
        return this.f31718h;
    }

    /* JADX INFO: renamed from: j */
    public final String m33083j() {
        return this.f31711a;
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m33084k() {
        return this.f31717g;
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m33085l() {
        return this.f31716f;
    }

    /* JADX INFO: renamed from: m */
    public final String m33086m() {
        return this.f31714d;
    }

    /* JADX INFO: renamed from: n */
    public final String m33087n() {
        return this.f31713c;
    }

    /* JADX INFO: renamed from: o */
    public final String m33088o() {
        return this.f31712b;
    }

    /* JADX INFO: renamed from: p */
    public final String m33089p() {
        return this.f31715e;
    }

    public String toString() {
        return "ProviderConfig2(adSourceName=" + this.f31711a + ", providerNetworkKey=" + this.f31712b + ", providerLoadName=" + this.f31713c + ", providerDefaultInstance=" + this.f31714d + ", spId=" + this.f31715e + ", mpis=" + this.f31716f + ", application=" + this.f31717g + ", adFormats=" + this.f31718h + ")";
    }

    public C12427pd(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        this.f31711a = str;
        this.f31712b = str2;
        this.f31713c = str3;
        this.f31714d = str4;
        this.f31715e = str5;
        this.f31716f = bool;
        this.f31717g = jSONObject;
        this.f31718h = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final C12427pd m33073a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        return new C12427pd(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12427pd m33072a(C12427pd c12427pd, String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12427pd.f31711a;
        }
        if ((i & 2) != 0) {
            str2 = c12427pd.f31712b;
        }
        if ((i & 4) != 0) {
            str3 = c12427pd.f31713c;
        }
        if ((i & 8) != 0) {
            str4 = c12427pd.f31714d;
        }
        if ((i & 16) != 0) {
            str5 = c12427pd.f31715e;
        }
        if ((i & 32) != 0) {
            bool = c12427pd.f31716f;
        }
        if ((i & 64) != 0) {
            jSONObject = c12427pd.f31717g;
        }
        if ((i & 128) != 0) {
            aVar = c12427pd.f31718h;
        }
        JSONObject jSONObject2 = jSONObject;
        a aVar2 = aVar;
        String str6 = str5;
        Boolean bool2 = bool;
        return c12427pd.m33073a(str, str2, str3, str4, str6, bool2, jSONObject2, aVar2);
    }

    public /* synthetic */ C12427pd(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) != 0 ? null : aVar);
    }
}
