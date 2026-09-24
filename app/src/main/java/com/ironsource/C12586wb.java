package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12586wb {

    /* JADX INFO: renamed from: c */
    public static final a f32704c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final String f32705d = "revenue";

    /* JADX INFO: renamed from: e */
    public static final String f32706e = "precision";

    /* JADX INFO: renamed from: a */
    private final double f32707a;

    /* JADX INFO: renamed from: b */
    private final String f32708b;

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final C12586wb m34058a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C12586wb(d, precision);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                C12518sf.m33679a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C12586wb(double d, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.f32707a = d;
        this.f32708b = precision;
    }

    /* JADX INFO: renamed from: a */
    public final double m34053a() {
        return this.f32707a;
    }

    /* JADX INFO: renamed from: b */
    public final String m34055b() {
        return this.f32708b;
    }

    /* JADX INFO: renamed from: c */
    public final String m34056c() {
        return this.f32708b;
    }

    /* JADX INFO: renamed from: d */
    public final double m34057d() {
        return this.f32707a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12586wb)) {
            return false;
        }
        C12586wb c12586wb = (C12586wb) obj;
        return Double.compare(this.f32707a, c12586wb.f32707a) == 0 && Intrinsics.areEqual(this.f32708b, c12586wb.f32708b);
    }

    public int hashCode() {
        return (UByte$$ExternalSyntheticBackport0.m43483m(this.f32707a) * 31) + this.f32708b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f32707a + ", precision=" + this.f32708b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12586wb m34054a(double d, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C12586wb(d, precision);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12586wb m34051a(C12586wb c12586wb, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = c12586wb.f32707a;
        }
        if ((i & 2) != 0) {
            str = c12586wb.f32708b;
        }
        return c12586wb.m34054a(d, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final C12586wb m34052a(JSONObject jSONObject) {
        return f32704c.m34058a(jSONObject);
    }
}
