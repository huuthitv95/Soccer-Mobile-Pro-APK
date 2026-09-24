package com.chartboost.sdk.impl;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fi */
/* JADX INFO: loaded from: classes3.dex */
public final class C3761fi {

    /* JADX INFO: renamed from: a */
    public final String f14251a;

    /* JADX INFO: renamed from: b */
    public final String f14252b;

    /* JADX INFO: renamed from: c */
    public final int f14253c;

    /* JADX INFO: renamed from: d */
    public final String f14254d;

    /* JADX INFO: renamed from: e */
    public final Map f14255e;

    /* JADX INFO: renamed from: f */
    public final UUID f14256f;

    public C3761fi(String str, String str2, int i, String str3, Map extras, UUID uuid) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f14251a = str;
        this.f14252b = str2;
        this.f14253c = i;
        this.f14254d = str3;
        this.f14255e = extras;
        this.f14256f = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3761fi(String str, String str2, int i, String str3, Map map, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = (i2 & 8) != 0 ? null : str3;
        Map mapEmptyMap = (i2 & 16) != 0 ? MapsKt.emptyMap() : map;
        if ((i2 & 32) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        this(str, str2, i, str4, mapEmptyMap, uuid);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3761fi m17738a(C3761fi c3761fi, String str, String str2, int i, String str3, Map map, UUID uuid, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c3761fi.f14251a;
        }
        if ((i2 & 2) != 0) {
            str2 = c3761fi.f14252b;
        }
        if ((i2 & 4) != 0) {
            i = c3761fi.f14253c;
        }
        if ((i2 & 8) != 0) {
            str3 = c3761fi.f14254d;
        }
        if ((i2 & 16) != 0) {
            map = c3761fi.f14255e;
        }
        if ((i2 & 32) != 0) {
            uuid = c3761fi.f14256f;
        }
        Map map2 = map;
        UUID uuid2 = uuid;
        return c3761fi.m17739a(str, str2, i, str3, map2, uuid2);
    }

    /* JADX INFO: renamed from: a */
    public final C3761fi m17739a(String str, String str2, int i, String str3, Map extras, UUID uuid) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new C3761fi(str, str2, i, str3, extras, uuid);
    }

    /* JADX INFO: renamed from: a */
    public final String m17740a() {
        return this.f14251a;
    }

    /* JADX INFO: renamed from: b */
    public final Map m17741b() {
        return this.f14255e;
    }

    /* JADX INFO: renamed from: c */
    public final int m17742c() {
        return this.f14253c;
    }

    /* JADX INFO: renamed from: d */
    public final String m17743d() {
        return this.f14254d;
    }

    /* JADX INFO: renamed from: e */
    public final String m17744e() {
        return this.f14252b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3761fi)) {
            return false;
        }
        C3761fi c3761fi = (C3761fi) obj;
        return Intrinsics.areEqual(this.f14251a, c3761fi.f14251a) && Intrinsics.areEqual(this.f14252b, c3761fi.f14252b) && this.f14253c == c3761fi.f14253c && Intrinsics.areEqual(this.f14254d, c3761fi.f14254d) && Intrinsics.areEqual(this.f14255e, c3761fi.f14255e) && Intrinsics.areEqual(this.f14256f, c3761fi.f14256f);
    }

    public int hashCode() {
        String str = this.f14251a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14252b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f14253c) * 31;
        String str3 = this.f14254d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f14255e.hashCode()) * 31) + this.f14256f.hashCode();
    }

    public String toString() {
        return "TrackingEvent(event=" + this.f14251a + ", url=" + this.f14252b + ", level=" + this.f14253c + ", offset=" + this.f14254d + ", extras=" + this.f14255e + ", uuid=" + this.f14256f + ")";
    }
}
