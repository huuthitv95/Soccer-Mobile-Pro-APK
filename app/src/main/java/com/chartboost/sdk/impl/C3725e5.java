package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3725e5 {

    /* JADX INFO: renamed from: a */
    public final String f14012a;

    /* JADX INFO: renamed from: b */
    public final boolean f14013b;

    /* JADX INFO: renamed from: c */
    public final String f14014c;

    /* JADX INFO: renamed from: d */
    public final boolean f14015d;

    /* JADX INFO: renamed from: e */
    public final C4197z6 f14016e;

    public C3725e5(String str, boolean z, String webViewVersion, boolean z2, C4197z6 nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(webViewVersion, "webViewVersion");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        this.f14012a = str;
        this.f14013b = z;
        this.f14014c = webViewVersion;
        this.f14015d = z2;
        this.f14016e = nrpWaterfallEndpoints;
    }

    /* JADX INFO: renamed from: a */
    public final String m17480a() {
        return this.f14012a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17481b() {
        return this.f14015d;
    }

    /* JADX INFO: renamed from: c */
    public final C4197z6 m17482c() {
        return this.f14016e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17483d() {
        return this.f14013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3725e5)) {
            return false;
        }
        C3725e5 c3725e5 = (C3725e5) obj;
        return Intrinsics.areEqual(this.f14012a, c3725e5.f14012a) && this.f14013b == c3725e5.f14013b && Intrinsics.areEqual(this.f14014c, c3725e5.f14014c) && this.f14015d == c3725e5.f14015d && Intrinsics.areEqual(this.f14016e, c3725e5.f14016e);
    }

    public int hashCode() {
        String str = this.f14012a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14013b)) * 31) + this.f14014c.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14015d)) * 31) + this.f14016e.hashCode();
    }

    public String toString() {
        return "ConfigurationBodyFields(configVariant=" + this.f14012a + ", webViewEnabled=" + this.f14013b + ", webViewVersion=" + this.f14014c + ", nrpWaterfallEnabled=" + this.f14015d + ", nrpWaterfallEndpoints=" + this.f14016e + ")";
    }
}
