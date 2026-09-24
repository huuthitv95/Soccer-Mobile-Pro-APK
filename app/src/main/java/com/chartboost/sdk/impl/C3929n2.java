package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3929n2 {

    /* JADX INFO: renamed from: d */
    public static final a f15419d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C3933n6 f15420e;

    /* JADX INFO: renamed from: f */
    public static final C3933n6 f15421f;

    /* JADX INFO: renamed from: g */
    public static final C3933n6 f15422g;

    /* JADX INFO: renamed from: h */
    public static final C3929n2 f15423h;

    /* JADX INFO: renamed from: a */
    public final C3933n6 f15424a;

    /* JADX INFO: renamed from: b */
    public final C3933n6 f15425b;

    /* JADX INFO: renamed from: c */
    public final C3933n6 f15426c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3929n2 m18710a() {
            return C3929n2.f15423h;
        }

        /* JADX INFO: renamed from: a */
        public final C3929n2 m18711a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C3933n6.a aVar = C3933n6.f15477c;
            C3933n6 c3933n6M18768a = aVar.m18768a(jSONObject.optJSONObject("margin"));
            if (c3933n6M18768a == null) {
                c3933n6M18768a = C3929n2.f15420e;
            }
            C3933n6 c3933n6M18768a2 = aVar.m18768a(jSONObject.optJSONObject("padding"));
            if (c3933n6M18768a2 == null) {
                c3933n6M18768a2 = C3929n2.f15421f;
            }
            C3933n6 c3933n6M18768a3 = aVar.m18768a(jSONObject.optJSONObject("size"));
            if (c3933n6M18768a3 == null) {
                c3933n6M18768a3 = C3929n2.f15422g;
            }
            return new C3929n2(c3933n6M18768a, c3933n6M18768a2, c3933n6M18768a3);
        }
    }

    static {
        C3933n6 c3933n6 = new C3933n6(0, 0);
        f15420e = c3933n6;
        C3933n6 c3933n7 = new C3933n6(8, 8);
        f15421f = c3933n7;
        C3933n6 c3933n8 = new C3933n6(28, 28);
        f15422g = c3933n8;
        f15423h = new C3929n2(c3933n6, c3933n7, c3933n8);
    }

    public C3929n2(C3933n6 margin, C3933n6 padding, C3933n6 size) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f15424a = margin;
        this.f15425b = padding;
        this.f15426c = size;
    }

    /* JADX INFO: renamed from: e */
    public final C3933n6 m18707e() {
        return this.f15424a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3929n2)) {
            return false;
        }
        C3929n2 c3929n2 = (C3929n2) obj;
        return Intrinsics.areEqual(this.f15424a, c3929n2.f15424a) && Intrinsics.areEqual(this.f15425b, c3929n2.f15425b) && Intrinsics.areEqual(this.f15426c, c3929n2.f15426c);
    }

    /* JADX INFO: renamed from: f */
    public final C3933n6 m18708f() {
        return this.f15425b;
    }

    /* JADX INFO: renamed from: g */
    public final C3933n6 m18709g() {
        return this.f15426c;
    }

    public int hashCode() {
        return (((this.f15424a.hashCode() * 31) + this.f15425b.hashCode()) * 31) + this.f15426c.hashCode();
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.f15424a + ", padding=" + this.f15425b + ", size=" + this.f15426c + ")";
    }
}
