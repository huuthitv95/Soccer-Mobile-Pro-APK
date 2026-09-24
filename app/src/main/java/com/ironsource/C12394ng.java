package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ng */
/* JADX INFO: loaded from: classes6.dex */
public final class C12394ng {

    /* JADX INFO: renamed from: a */
    private final boolean f31569a;

    /* JADX INFO: renamed from: b */
    private final boolean f31570b;

    /* JADX INFO: renamed from: c */
    private final boolean f31571c;

    public C12394ng(boolean z, boolean z2, boolean z3) {
        this.f31569a = z;
        this.f31570b = z2;
        this.f31571c = z3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32847a() {
        return this.f31569a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32848b() {
        return this.f31570b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m32849c() {
        return this.f31571c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32850d() {
        return this.f31571c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m32851e() {
        return this.f31569a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12394ng)) {
            return false;
        }
        C12394ng c12394ng = (C12394ng) obj;
        return this.f31569a == c12394ng.f31569a && this.f31570b == c12394ng.f31570b && this.f31571c == c12394ng.f31571c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m32852f() {
        return this.f31570b;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m32853g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C12148d8.f30227k, this.f31569a).put(C12148d8.f30228l, this.f31570b).put(C12148d8.f30229m, this.f31571c);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.f31569a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f31570b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f31571c;
        return i2 + (z3 ? 1 : z3);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f31569a + ", isWindowVisible=" + this.f31570b + ", isShown=" + this.f31571c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12394ng m32846a(boolean z, boolean z2, boolean z3) {
        return new C12394ng(z, z2, z3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12394ng m32845a(C12394ng c12394ng, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c12394ng.f31569a;
        }
        if ((i & 2) != 0) {
            z2 = c12394ng.f31570b;
        }
        if ((i & 4) != 0) {
            z3 = c12394ng.f31571c;
        }
        return c12394ng.m32846a(z, z2, z3);
    }
}
