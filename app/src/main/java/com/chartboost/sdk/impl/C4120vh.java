package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vh */
/* JADX INFO: loaded from: classes3.dex */
public final class C4120vh {

    /* JADX INFO: renamed from: a */
    public final String f16626a;

    /* JADX INFO: renamed from: b */
    public final String f16627b;

    /* JADX INFO: renamed from: c */
    public final String f16628c;

    /* JADX INFO: renamed from: d */
    public final String f16629d;

    public C4120vh(String url, String method, String str, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f16626a = url;
        this.f16627b = method;
        this.f16628c = str;
        this.f16629d = str2;
    }

    public /* synthetic */ C4120vh(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a */
    public final String m19708a() {
        return this.f16628c;
    }

    /* JADX INFO: renamed from: b */
    public final String m19709b() {
        return this.f16629d;
    }

    /* JADX INFO: renamed from: c */
    public final String m19710c() {
        return this.f16627b;
    }

    /* JADX INFO: renamed from: d */
    public final String m19711d() {
        return this.f16626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4120vh)) {
            return false;
        }
        C4120vh c4120vh = (C4120vh) obj;
        return Intrinsics.areEqual(this.f16626a, c4120vh.f16626a) && Intrinsics.areEqual(this.f16627b, c4120vh.f16627b) && Intrinsics.areEqual(this.f16628c, c4120vh.f16628c) && Intrinsics.areEqual(this.f16629d, c4120vh.f16629d);
    }

    public int hashCode() {
        int iHashCode = ((this.f16626a.hashCode() * 31) + this.f16627b.hashCode()) * 31;
        String str = this.f16628c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16629d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackerConfig(url=" + this.f16626a + ", method=" + this.f16627b + ", bodyTemplate=" + this.f16628c + ", contentType=" + this.f16629d + ")";
    }
}
