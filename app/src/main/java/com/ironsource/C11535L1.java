package com.ironsource;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.L1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11535L1 {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f24878a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11535L1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m26335a() {
        return this.f24878a;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m26336b() {
        return this.f24878a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11535L1) && Intrinsics.areEqual(this.f24878a, ((C11535L1) obj).f24878a);
    }

    public int hashCode() {
        return this.f24878a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f24878a + ")";
    }

    public C11535L1(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f24878a = mediationTypes;
    }

    /* JADX INFO: renamed from: a */
    public final C11535L1 m26334a(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new C11535L1(mediationTypes);
    }

    public /* synthetic */ C11535L1(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11535L1 m26333a(C11535L1 c11535l1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c11535l1.f24878a;
        }
        return c11535l1.m26334a(map);
    }
}
