package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.si */
/* JADX INFO: loaded from: classes3.dex */
public final class C4055si {

    /* JADX INFO: renamed from: a */
    public final String f16285a;

    /* JADX INFO: renamed from: b */
    public final EnumC3816i4 f16286b;

    /* JADX INFO: renamed from: c */
    public final boolean f16287c;

    public C4055si(String url, EnumC3816i4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        this.f16285a = url;
        this.f16286b = clickPreference;
        this.f16287c = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4055si m19436a(C4055si c4055si, String str, EnumC3816i4 enumC3816i4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4055si.f16285a;
        }
        if ((i & 2) != 0) {
            enumC3816i4 = c4055si.f16286b;
        }
        if ((i & 4) != 0) {
            z = c4055si.f16287c;
        }
        return c4055si.m19438a(str, enumC3816i4, z);
    }

    /* JADX INFO: renamed from: a */
    public final EnumC3816i4 m19437a() {
        return this.f16286b;
    }

    /* JADX INFO: renamed from: a */
    public final C4055si m19438a(String url, EnumC3816i4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        return new C4055si(url, clickPreference, z);
    }

    /* JADX INFO: renamed from: b */
    public final String m19439b() {
        return this.f16285a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19440c() {
        return this.f16287c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4055si)) {
            return false;
        }
        C4055si c4055si = (C4055si) obj;
        return Intrinsics.areEqual(this.f16285a, c4055si.f16285a) && this.f16286b == c4055si.f16286b && this.f16287c == c4055si.f16287c;
    }

    public int hashCode() {
        return (((this.f16285a.hashCode() * 31) + this.f16286b.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f16287c);
    }

    public String toString() {
        return "UrlArgs(url=" + this.f16285a + ", clickPreference=" + this.f16286b + ", userGesture=" + this.f16287c + ")";
    }
}
