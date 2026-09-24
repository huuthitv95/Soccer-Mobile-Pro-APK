package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3834j {

    /* JADX INFO: renamed from: a */
    public final EnumC4036s f14770a;

    /* JADX INFO: renamed from: b */
    public final Map f14771b;

    public C3834j(EnumC4036s adFormat, Map extras) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f14770a = adFormat;
        this.f14771b = extras;
    }

    public /* synthetic */ C3834j(EnumC4036s enumC4036s, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC4036s, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX INFO: renamed from: a */
    public final EnumC4036s m18083a() {
        return this.f14770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3834j)) {
            return false;
        }
        C3834j c3834j = (C3834j) obj;
        return this.f14770a == c3834j.f14770a && Intrinsics.areEqual(this.f14771b, c3834j.f14771b);
    }

    public int hashCode() {
        return (this.f14770a.hashCode() * 31) + this.f14771b.hashCode();
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.f14770a + ", extras=" + this.f14771b + ")";
    }
}
