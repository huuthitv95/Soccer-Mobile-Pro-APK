package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w1 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12576w1 {

    /* JADX INFO: renamed from: a */
    public static final b f32637a = b.f32653a;

    /* JADX INFO: renamed from: com.ironsource.w1$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            b bVar = InterfaceC12576w1.f32637a;
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static InterfaceC12576w1 m34000a(String str) {
            return InterfaceC12576w1.f32637a.m34029a(str);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w1$a */
    public interface a extends InterfaceC12576w1 {

        /* JADX INFO: renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        public static final class C15547a implements a {

            /* JADX INFO: renamed from: b */
            private final String f32638b;

            /* JADX INFO: renamed from: c */
            private final String f32639c;

            /* JADX INFO: renamed from: d */
            private final C12386n8.e f32640d;

            /* JADX INFO: renamed from: e */
            private final String f32641e;

            /* JADX INFO: renamed from: f */
            private final String f32642f;

            /* JADX INFO: renamed from: g */
            private final C15548a f32643g;

            /* JADX INFO: renamed from: h */
            private final int f32644h;

            /* JADX INFO: renamed from: i */
            private final int f32645i;

            /* JADX INFO: renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            public static final class C15548a {

                /* JADX INFO: renamed from: a */
                private final int f32646a;

                /* JADX INFO: renamed from: b */
                private final int f32647b;

                public C15548a(int i, int i2) {
                    this.f32646a = i;
                    this.f32647b = i2;
                }

                /* JADX INFO: renamed from: a */
                public final int m34016a() {
                    return this.f32646a;
                }

                /* JADX INFO: renamed from: b */
                public final int m34018b() {
                    return this.f32647b;
                }

                /* JADX INFO: renamed from: c */
                public final int m34019c() {
                    return this.f32646a;
                }

                /* JADX INFO: renamed from: d */
                public final int m34020d() {
                    return this.f32647b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C15548a)) {
                        return false;
                    }
                    C15548a c15548a = (C15548a) obj;
                    return this.f32646a == c15548a.f32646a && this.f32647b == c15548a.f32647b;
                }

                public int hashCode() {
                    return (this.f32646a * 31) + this.f32647b;
                }

                public String toString() {
                    return "Coordinates(x=" + this.f32646a + ", y=" + this.f32647b + ")";
                }

                /* JADX INFO: renamed from: a */
                public final C15548a m34017a(int i, int i2) {
                    return new C15548a(i, i2);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ C15548a m34015a(C15548a c15548a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c15548a.f32646a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c15548a.f32647b;
                    }
                    return c15548a.m34017a(i, i2);
                }
            }

            public C15547a(String successCallback, String failCallback, C12386n8.e productType, String demandSourceName, String url, C15548a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.f32638b = successCallback;
                this.f32639c = failCallback;
                this.f32640d = productType;
                this.f32641e = demandSourceName;
                this.f32642f = url;
                this.f32643g = coordinates;
                this.f32644h = i;
                this.f32645i = i2;
            }

            /* JADX INFO: renamed from: a */
            public final C15547a m34003a(String successCallback, String failCallback, C12386n8.e productType, String demandSourceName, String url, C15548a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C15547a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC12576w1.a
            /* JADX INFO: renamed from: b */
            public String mo34001b() {
                return this.f32642f;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: c */
            public String mo33997c() {
                return this.f32639c;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: d */
            public C12386n8.e mo33998d() {
                return this.f32640d;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: e */
            public String mo33999e() {
                return this.f32641e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C15547a)) {
                    return false;
                }
                C15547a c15547a = (C15547a) obj;
                return Intrinsics.areEqual(this.f32638b, c15547a.f32638b) && Intrinsics.areEqual(this.f32639c, c15547a.f32639c) && this.f32640d == c15547a.f32640d && Intrinsics.areEqual(this.f32641e, c15547a.f32641e) && Intrinsics.areEqual(this.f32642f, c15547a.f32642f) && Intrinsics.areEqual(this.f32643g, c15547a.f32643g) && this.f32644h == c15547a.f32644h && this.f32645i == c15547a.f32645i;
            }

            /* JADX INFO: renamed from: f */
            public final String m34004f() {
                return this.f32638b;
            }

            /* JADX INFO: renamed from: g */
            public final String m34005g() {
                return this.f32639c;
            }

            /* JADX INFO: renamed from: h */
            public final C12386n8.e m34006h() {
                return this.f32640d;
            }

            public int hashCode() {
                return (((((((((((((this.f32638b.hashCode() * 31) + this.f32639c.hashCode()) * 31) + this.f32640d.hashCode()) * 31) + this.f32641e.hashCode()) * 31) + this.f32642f.hashCode()) * 31) + this.f32643g.hashCode()) * 31) + this.f32644h) * 31) + this.f32645i;
            }

            /* JADX INFO: renamed from: i */
            public final String m34007i() {
                return this.f32641e;
            }

            /* JADX INFO: renamed from: j */
            public final String m34008j() {
                return this.f32642f;
            }

            /* JADX INFO: renamed from: k */
            public final C15548a m34009k() {
                return this.f32643g;
            }

            /* JADX INFO: renamed from: l */
            public final int m34010l() {
                return this.f32644h;
            }

            /* JADX INFO: renamed from: m */
            public final int m34011m() {
                return this.f32645i;
            }

            /* JADX INFO: renamed from: n */
            public final int m34012n() {
                return this.f32644h;
            }

            /* JADX INFO: renamed from: o */
            public final C15548a m34013o() {
                return this.f32643g;
            }

            /* JADX INFO: renamed from: p */
            public final int m34014p() {
                return this.f32645i;
            }

            public String toString() {
                return "Click(successCallback=" + this.f32638b + ", failCallback=" + this.f32639c + ", productType=" + this.f32640d + ", demandSourceName=" + this.f32641e + ", url=" + this.f32642f + ", coordinates=" + this.f32643g + ", action=" + this.f32644h + ", metaState=" + this.f32645i + ")";
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ C15547a m34002a(C15547a c15547a, String str, String str2, C12386n8.e eVar, String str3, String str4, C15548a c15548a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c15547a.f32638b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c15547a.f32639c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c15547a.f32640d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c15547a.f32641e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c15547a.f32642f;
                }
                if ((i3 & 32) != 0) {
                    c15548a = c15547a.f32643g;
                }
                if ((i3 & 64) != 0) {
                    i = c15547a.f32644h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c15547a.f32645i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C15548a c15548a2 = c15548a;
                return c15547a.m34003a(str, str2, eVar, str3, str5, c15548a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: a */
            public String mo33996a() {
                return this.f32638b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.w1$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: b */
            private final String f32648b;

            /* JADX INFO: renamed from: c */
            private final String f32649c;

            /* JADX INFO: renamed from: d */
            private final C12386n8.e f32650d;

            /* JADX INFO: renamed from: e */
            private final String f32651e;

            /* JADX INFO: renamed from: f */
            private final String f32652f;

            public b(String successCallback, String failCallback, C12386n8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.f32648b = successCallback;
                this.f32649c = failCallback;
                this.f32650d = productType;
                this.f32651e = demandSourceName;
                this.f32652f = url;
            }

            /* JADX INFO: renamed from: a */
            public final b m34022a(String successCallback, String failCallback, C12386n8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC12576w1.a
            /* JADX INFO: renamed from: b */
            public String mo34001b() {
                return this.f32652f;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: c */
            public String mo33997c() {
                return this.f32649c;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: d */
            public C12386n8.e mo33998d() {
                return this.f32650d;
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: e */
            public String mo33999e() {
                return this.f32651e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f32648b, bVar.f32648b) && Intrinsics.areEqual(this.f32649c, bVar.f32649c) && this.f32650d == bVar.f32650d && Intrinsics.areEqual(this.f32651e, bVar.f32651e) && Intrinsics.areEqual(this.f32652f, bVar.f32652f);
            }

            /* JADX INFO: renamed from: f */
            public final String m34023f() {
                return this.f32648b;
            }

            /* JADX INFO: renamed from: g */
            public final String m34024g() {
                return this.f32649c;
            }

            /* JADX INFO: renamed from: h */
            public final C12386n8.e m34025h() {
                return this.f32650d;
            }

            public int hashCode() {
                return (((((((this.f32648b.hashCode() * 31) + this.f32649c.hashCode()) * 31) + this.f32650d.hashCode()) * 31) + this.f32651e.hashCode()) * 31) + this.f32652f.hashCode();
            }

            /* JADX INFO: renamed from: i */
            public final String m34026i() {
                return this.f32651e;
            }

            /* JADX INFO: renamed from: j */
            public final String m34027j() {
                return this.f32652f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.f32648b + ", failCallback=" + this.f32649c + ", productType=" + this.f32650d + ", demandSourceName=" + this.f32651e + ", url=" + this.f32652f + ")";
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ b m34021a(b bVar, String str, String str2, C12386n8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f32648b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f32649c;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.f32650d;
                }
                if ((i & 8) != 0) {
                    str3 = bVar.f32651e;
                }
                if ((i & 16) != 0) {
                    str4 = bVar.f32652f;
                }
                String str5 = str4;
                C12386n8.e eVar2 = eVar;
                return bVar.m34022a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC12576w1
            /* JADX INFO: renamed from: a */
            public String mo33996a() {
                return this.f32648b;
            }
        }

        /* JADX INFO: renamed from: b */
        String mo34001b();
    }

    /* JADX INFO: renamed from: a */
    String mo33996a();

    /* JADX INFO: renamed from: c */
    String mo33997c();

    /* JADX INFO: renamed from: d */
    C12386n8.e mo33998d();

    /* JADX INFO: renamed from: e */
    String mo33999e();

    /* JADX INFO: renamed from: com.ironsource.w1$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ b f32653a = new b();

        private b() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final InterfaceC12576w1 m34029a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (Intrinsics.areEqual(strOptString, C11761Y3.f26572c)) {
                return m34028a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        /* JADX INFO: renamed from: a */
        private final a m34028a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C11744X3.g.f26257e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C11744X3.i.f26378m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C12386n8.e eVarValueOf = C12386n8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C11761Y3.f26575f);
                int i = jSONObject3.getInt(C11761Y3.f26576g);
                int i2 = jSONObject3.getInt(C11761Y3.f26577h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C11761Y3.f26579j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C15547a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C15547a.C15548a(i, i2), iOptInt, iOptInt2);
            }
            if (Intrinsics.areEqual(strOptString, "impression")) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
