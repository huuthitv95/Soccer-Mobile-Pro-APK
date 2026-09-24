package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12229h9 {

    /* JADX INFO: renamed from: a */
    private final String f30479a;

    /* JADX INFO: renamed from: b */
    private final String f30480b;

    /* JADX INFO: renamed from: c */
    private final EnumC12265j9 f30481c;

    /* JADX INFO: renamed from: d */
    private final JSONObject f30482d;

    public C12229h9(String url, String storePackage, EnumC12265j9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f30479a = url;
        this.f30480b = storePackage;
        this.f30481c = strategy;
        this.f30482d = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final String m31615a() {
        return this.f30479a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31616b() {
        return this.f30480b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC12265j9 m31617c() {
        return this.f30481c;
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m31618d() {
        return this.f30482d;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m31619e() {
        return this.f30482d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12229h9)) {
            return false;
        }
        C12229h9 c12229h9 = (C12229h9) obj;
        return Intrinsics.areEqual(this.f30479a, c12229h9.f30479a) && Intrinsics.areEqual(this.f30480b, c12229h9.f30480b) && this.f30481c == c12229h9.f30481c && Intrinsics.areEqual(this.f30482d, c12229h9.f30482d);
    }

    /* JADX INFO: renamed from: f */
    public final String m31620f() {
        return this.f30480b;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC12265j9 m31621g() {
        return this.f30481c;
    }

    /* JADX INFO: renamed from: h */
    public final String m31622h() {
        return this.f30479a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f30479a.hashCode() * 31) + this.f30480b.hashCode()) * 31) + this.f30481c.hashCode()) * 31;
        JSONObject jSONObject = this.f30482d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.f30479a + ", storePackage=" + this.f30480b + ", strategy=" + this.f30481c + ", extras=" + this.f30482d + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12229h9 m31614a(String url, String storePackage, EnumC12265j9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C12229h9(url, storePackage, strategy, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12229h9 m31613a(C12229h9 c12229h9, String str, String str2, EnumC12265j9 enumC12265j9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12229h9.f30479a;
        }
        if ((i & 2) != 0) {
            str2 = c12229h9.f30480b;
        }
        if ((i & 4) != 0) {
            enumC12265j9 = c12229h9.f30481c;
        }
        if ((i & 8) != 0) {
            jSONObject = c12229h9.f30482d;
        }
        return c12229h9.m31614a(str, str2, enumC12265j9, jSONObject);
    }

    public /* synthetic */ C12229h9(String str, String str2, EnumC12265j9 enumC12265j9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC12265j9.APP_ACTIVITY : enumC12265j9, (i & 8) != 0 ? null : jSONObject);
    }
}
