package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.td */
/* JADX INFO: loaded from: classes6.dex */
public final class C12534td {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<String>> f32476a;

    /* JADX INFO: renamed from: b */
    private final Map<String, List<String>> f32477b;

    /* JADX INFO: renamed from: c */
    private final Map<String, List<String>> f32478c;

    /* JADX INFO: renamed from: d */
    private final Map<String, List<String>> f32479d;

    public C12534td() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> m33812a() {
        return this.f32476a;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> m33813b() {
        return this.f32477b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> m33814c() {
        return this.f32478c;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, List<String>> m33815d() {
        return this.f32479d;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, List<String>> m33816e() {
        return this.f32478c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12534td)) {
            return false;
        }
        C12534td c12534td = (C12534td) obj;
        return Intrinsics.areEqual(this.f32476a, c12534td.f32476a) && Intrinsics.areEqual(this.f32477b, c12534td.f32477b) && Intrinsics.areEqual(this.f32478c, c12534td.f32478c) && Intrinsics.areEqual(this.f32479d, c12534td.f32479d);
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, List<String>> m33817f() {
        return this.f32477b;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, List<String>> m33818g() {
        return this.f32479d;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> m33819h() {
        return this.f32476a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f32476a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.f32477b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.f32478c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.f32479d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f32476a + ", interstitial=" + this.f32477b + ", banner=" + this.f32478c + ", nativeAd=" + this.f32479d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12534td(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.f32476a = map;
        this.f32477b = map2;
        this.f32478c = map3;
        this.f32479d = map4;
    }

    /* JADX INFO: renamed from: a */
    public final C12534td m33811a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new C12534td(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12534td m33810a(C12534td c12534td, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c12534td.f32476a;
        }
        if ((i & 2) != 0) {
            map2 = c12534td.f32477b;
        }
        if ((i & 4) != 0) {
            map3 = c12534td.f32478c;
        }
        if ((i & 8) != 0) {
            map4 = c12534td.f32479d;
        }
        return c12534td.m33811a(map, map2, map3, map4);
    }

    public /* synthetic */ C12534td(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}
