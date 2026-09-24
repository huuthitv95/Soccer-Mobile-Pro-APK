package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12239i1 {

    /* JADX INFO: renamed from: a */
    private final EnumC12101af f30512a;

    /* JADX INFO: renamed from: b */
    private final EnumC11630Q7 f30513b;

    /* JADX INFO: renamed from: c */
    private final String f30514c;

    /* JADX INFO: renamed from: d */
    private final long f30515d;

    public C12239i1(EnumC12101af recordType, EnumC11630Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f30512a = recordType;
        this.f30513b = adProvider;
        this.f30514c = adInstanceId;
        this.f30515d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    /* JADX INFO: renamed from: a */
    public final String m31656a() {
        return this.f30514c;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11630Q7 m31657b() {
        return this.f30513b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m31658c() {
        return MapsKt.mapOf(TuplesKt.m43482to(C12460ra.f31826c, Integer.valueOf(this.f30513b.m27293b())), TuplesKt.m43482to("ts", String.valueOf(this.f30515d)));
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m31659d() {
        return MapsKt.mapOf(TuplesKt.m43482to(C12460ra.f31825b, this.f30514c), TuplesKt.m43482to(C12460ra.f31826c, Integer.valueOf(this.f30513b.m27293b())), TuplesKt.m43482to("ts", String.valueOf(this.f30515d)), TuplesKt.m43482to("rt", Integer.valueOf(this.f30512a.ordinal())));
    }

    /* JADX INFO: renamed from: e */
    public final EnumC12101af m31660e() {
        return this.f30512a;
    }

    /* JADX INFO: renamed from: f */
    public final long m31661f() {
        return this.f30515d;
    }
}
