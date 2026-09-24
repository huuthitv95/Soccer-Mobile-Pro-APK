package com.chartboost.sdk.impl;

import android.os.SystemClock;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3750f7 {

    /* JADX INFO: renamed from: A */
    public final long f14158A;

    /* JADX INFO: renamed from: B */
    public final int f14159B;

    /* JADX INFO: renamed from: C */
    public final int f14160C;

    /* JADX INFO: renamed from: D */
    public final int f14161D;

    /* JADX INFO: renamed from: E */
    public final long f14162E;

    /* JADX INFO: renamed from: F */
    public final long f14163F;

    /* JADX INFO: renamed from: a */
    public final String f14164a;

    /* JADX INFO: renamed from: b */
    public final int f14165b;

    /* JADX INFO: renamed from: c */
    public final String f14166c;

    /* JADX INFO: renamed from: d */
    public final String f14167d;

    /* JADX INFO: renamed from: e */
    public final String f14168e;

    /* JADX INFO: renamed from: f */
    public final boolean f14169f;

    /* JADX INFO: renamed from: g */
    public final String f14170g;

    /* JADX INFO: renamed from: h */
    public final String f14171h;

    /* JADX INFO: renamed from: i */
    public final String f14172i;

    /* JADX INFO: renamed from: j */
    public final String f14173j;

    /* JADX INFO: renamed from: k */
    public final String f14174k;

    /* JADX INFO: renamed from: l */
    public final String f14175l;

    /* JADX INFO: renamed from: m */
    public final String f14176m;

    /* JADX INFO: renamed from: n */
    public final String f14177n;

    /* JADX INFO: renamed from: o */
    public final String f14178o;

    /* JADX INFO: renamed from: p */
    public final String f14179p;

    /* JADX INFO: renamed from: q */
    public final String f14180q;

    /* JADX INFO: renamed from: r */
    public final String f14181r;

    /* JADX INFO: renamed from: s */
    public final String f14182s;

    /* JADX INFO: renamed from: t */
    public final String f14183t;

    /* JADX INFO: renamed from: u */
    public final int f14184u;

    /* JADX INFO: renamed from: v */
    public final boolean f14185v;

    /* JADX INFO: renamed from: w */
    public final int f14186w;

    /* JADX INFO: renamed from: x */
    public final boolean f14187x;

    /* JADX INFO: renamed from: y */
    public final int f14188y;

    /* JADX INFO: renamed from: z */
    public final long f14189z;

    public C3750f7(String sessionId, int i, String appId, String appVersion, String chartboostSdkVersion, boolean z, String chartboostSdkGdpr, String chartboostSdkCcpa, String chartboostSdkCoppa, String chartboostSdkLgpd, String deviceId, String deviceMake, String deviceModel, String deviceOsVersion, String devicePlatform, String deviceCountry, String deviceLanguage, String deviceTimezone, String deviceConnectionType, String deviceOrientation, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkVersion, "chartboostSdkVersion");
        Intrinsics.checkNotNullParameter(chartboostSdkGdpr, "chartboostSdkGdpr");
        Intrinsics.checkNotNullParameter(chartboostSdkCcpa, "chartboostSdkCcpa");
        Intrinsics.checkNotNullParameter(chartboostSdkCoppa, "chartboostSdkCoppa");
        Intrinsics.checkNotNullParameter(chartboostSdkLgpd, "chartboostSdkLgpd");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOsVersion, "deviceOsVersion");
        Intrinsics.checkNotNullParameter(devicePlatform, "devicePlatform");
        Intrinsics.checkNotNullParameter(deviceCountry, "deviceCountry");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(deviceTimezone, "deviceTimezone");
        Intrinsics.checkNotNullParameter(deviceConnectionType, "deviceConnectionType");
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        this.f14164a = sessionId;
        this.f14165b = i;
        this.f14166c = appId;
        this.f14167d = appVersion;
        this.f14168e = chartboostSdkVersion;
        this.f14169f = z;
        this.f14170g = chartboostSdkGdpr;
        this.f14171h = chartboostSdkCcpa;
        this.f14172i = chartboostSdkCoppa;
        this.f14173j = chartboostSdkLgpd;
        this.f14174k = deviceId;
        this.f14175l = deviceMake;
        this.f14176m = deviceModel;
        this.f14177n = deviceOsVersion;
        this.f14178o = devicePlatform;
        this.f14179p = deviceCountry;
        this.f14180q = deviceLanguage;
        this.f14181r = deviceTimezone;
        this.f14182s = deviceConnectionType;
        this.f14183t = deviceOrientation;
        this.f14184u = i2;
        this.f14185v = z2;
        this.f14186w = i3;
        this.f14187x = z3;
        this.f14188y = i4;
        this.f14189z = j;
        this.f14158A = j2;
        this.f14159B = i5;
        this.f14160C = i6;
        this.f14161D = i7;
        this.f14162E = j3;
        this.f14163F = j4;
    }

    public /* synthetic */ C3750f7(String str, int i, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i2, boolean z2, int i3, boolean z3, int i4, long j, long j2, int i5, int i6, int i7, long j3, long j4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "not available" : str, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? "not available" : str2, (i8 & 8) != 0 ? "not available" : str3, (i8 & 16) != 0 ? "not available" : str4, (i8 & 32) != 0 ? false : z, (i8 & 64) != 0 ? "not available" : str5, (i8 & 128) != 0 ? "not available" : str6, (i8 & 256) != 0 ? "not available" : str7, (i8 & 512) != 0 ? "not available" : str8, (i8 & 1024) != 0 ? "not available" : str9, (i8 & 2048) != 0 ? "not available" : str10, (i8 & 4096) != 0 ? "not available" : str11, (i8 & 8192) != 0 ? "not available" : str12, (i8 & 16384) != 0 ? "not available" : str13, (i8 & 32768) != 0 ? "not available" : str14, (i8 & 65536) != 0 ? "not available" : str15, (i8 & 131072) != 0 ? "not available" : str16, (i8 & 262144) != 0 ? "not available" : str17, (i8 & 524288) == 0 ? str18 : "not available", (i8 & 1048576) != 0 ? 0 : i2, (i8 & 2097152) != 0 ? false : z2, (i8 & 4194304) != 0 ? 0 : i3, (i8 & 8388608) != 0 ? false : z3, (i8 & 16777216) != 0 ? 0 : i4, (i8 & 33554432) != 0 ? 0L : j, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? 0L : j2, (i8 & 134217728) != 0 ? 0 : i5, (i8 & 268435456) != 0 ? 0 : i6, (i8 & 536870912) != 0 ? 0 : i7, (i8 & 1073741824) == 0 ? j3 : 0L, (i8 & Integer.MIN_VALUE) != 0 ? SystemClock.uptimeMillis() : j4);
    }

    /* JADX INFO: renamed from: A */
    public final long m17634A() {
        return this.f14162E;
    }

    /* JADX INFO: renamed from: B */
    public final String m17635B() {
        return this.f14164a;
    }

    /* JADX INFO: renamed from: C */
    public final int m17636C() {
        return this.f14161D;
    }

    /* JADX INFO: renamed from: D */
    public final int m17637D() {
        return this.f14159B;
    }

    /* JADX INFO: renamed from: E */
    public final int m17638E() {
        return this.f14160C;
    }

    /* JADX INFO: renamed from: a */
    public final String m17639a() {
        return this.f14166c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17640b() {
        return this.f14169f;
    }

    /* JADX INFO: renamed from: c */
    public final String m17641c() {
        return this.f14171h;
    }

    /* JADX INFO: renamed from: d */
    public final String m17642d() {
        return this.f14172i;
    }

    /* JADX INFO: renamed from: e */
    public final String m17643e() {
        return this.f14170g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3750f7)) {
            return false;
        }
        C3750f7 c3750f7 = (C3750f7) obj;
        return Intrinsics.areEqual(this.f14164a, c3750f7.f14164a) && this.f14165b == c3750f7.f14165b && Intrinsics.areEqual(this.f14166c, c3750f7.f14166c) && Intrinsics.areEqual(this.f14167d, c3750f7.f14167d) && Intrinsics.areEqual(this.f14168e, c3750f7.f14168e) && this.f14169f == c3750f7.f14169f && Intrinsics.areEqual(this.f14170g, c3750f7.f14170g) && Intrinsics.areEqual(this.f14171h, c3750f7.f14171h) && Intrinsics.areEqual(this.f14172i, c3750f7.f14172i) && Intrinsics.areEqual(this.f14173j, c3750f7.f14173j) && Intrinsics.areEqual(this.f14174k, c3750f7.f14174k) && Intrinsics.areEqual(this.f14175l, c3750f7.f14175l) && Intrinsics.areEqual(this.f14176m, c3750f7.f14176m) && Intrinsics.areEqual(this.f14177n, c3750f7.f14177n) && Intrinsics.areEqual(this.f14178o, c3750f7.f14178o) && Intrinsics.areEqual(this.f14179p, c3750f7.f14179p) && Intrinsics.areEqual(this.f14180q, c3750f7.f14180q) && Intrinsics.areEqual(this.f14181r, c3750f7.f14181r) && Intrinsics.areEqual(this.f14182s, c3750f7.f14182s) && Intrinsics.areEqual(this.f14183t, c3750f7.f14183t) && this.f14184u == c3750f7.f14184u && this.f14185v == c3750f7.f14185v && this.f14186w == c3750f7.f14186w && this.f14187x == c3750f7.f14187x && this.f14188y == c3750f7.f14188y && this.f14189z == c3750f7.f14189z && this.f14158A == c3750f7.f14158A && this.f14159B == c3750f7.f14159B && this.f14160C == c3750f7.f14160C && this.f14161D == c3750f7.f14161D && this.f14162E == c3750f7.f14162E && this.f14163F == c3750f7.f14163F;
    }

    /* JADX INFO: renamed from: f */
    public final String m17644f() {
        return this.f14173j;
    }

    /* JADX INFO: renamed from: g */
    public final String m17645g() {
        return this.f14168e;
    }

    /* JADX INFO: renamed from: h */
    public final int m17646h() {
        return this.f14188y;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f14164a.hashCode() * 31) + this.f14165b) * 31) + this.f14166c.hashCode()) * 31) + this.f14167d.hashCode()) * 31) + this.f14168e.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14169f)) * 31) + this.f14170g.hashCode()) * 31) + this.f14171h.hashCode()) * 31) + this.f14172i.hashCode()) * 31) + this.f14173j.hashCode()) * 31) + this.f14174k.hashCode()) * 31) + this.f14175l.hashCode()) * 31) + this.f14176m.hashCode()) * 31) + this.f14177n.hashCode()) * 31) + this.f14178o.hashCode()) * 31) + this.f14179p.hashCode()) * 31) + this.f14180q.hashCode()) * 31) + this.f14181r.hashCode()) * 31) + this.f14182s.hashCode()) * 31) + this.f14183t.hashCode()) * 31) + this.f14184u) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14185v)) * 31) + this.f14186w) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14187x)) * 31) + this.f14188y) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f14189z)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f14158A)) * 31) + this.f14159B) * 31) + this.f14160C) * 31) + this.f14161D) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f14162E)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f14163F);
    }

    /* JADX INFO: renamed from: i */
    public final int m17647i() {
        return this.f14184u;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m17648j() {
        return this.f14185v;
    }

    /* JADX INFO: renamed from: k */
    public final String m17649k() {
        return this.f14182s;
    }

    /* JADX INFO: renamed from: l */
    public final String m17650l() {
        return this.f14179p;
    }

    /* JADX INFO: renamed from: m */
    public final String m17651m() {
        return this.f14174k;
    }

    /* JADX INFO: renamed from: n */
    public final String m17652n() {
        return this.f14180q;
    }

    /* JADX INFO: renamed from: o */
    public final long m17653o() {
        return this.f14158A;
    }

    /* JADX INFO: renamed from: p */
    public final String m17654p() {
        return this.f14175l;
    }

    /* JADX INFO: renamed from: q */
    public final String m17655q() {
        return this.f14176m;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17656r() {
        return this.f14187x;
    }

    /* JADX INFO: renamed from: s */
    public final String m17657s() {
        return this.f14183t;
    }

    /* JADX INFO: renamed from: t */
    public final String m17658t() {
        return this.f14177n;
    }

    public String toString() {
        return "EnvironmentData(sessionId=" + this.f14164a + ", sessionCount=" + this.f14165b + ", appId=" + this.f14166c + ", appVersion=" + this.f14167d + ", chartboostSdkVersion=" + this.f14168e + ", chartboostSdkAutocacheEnabled=" + this.f14169f + ", chartboostSdkGdpr=" + this.f14170g + ", chartboostSdkCcpa=" + this.f14171h + ", chartboostSdkCoppa=" + this.f14172i + ", chartboostSdkLgpd=" + this.f14173j + ", deviceId=" + this.f14174k + ", deviceMake=" + this.f14175l + ", deviceModel=" + this.f14176m + ", deviceOsVersion=" + this.f14177n + ", devicePlatform=" + this.f14178o + ", deviceCountry=" + this.f14179p + ", deviceLanguage=" + this.f14180q + ", deviceTimezone=" + this.f14181r + ", deviceConnectionType=" + this.f14182s + ", deviceOrientation=" + this.f14183t + ", deviceBatteryLevel=" + this.f14184u + ", deviceChargingStatus=" + this.f14185v + ", deviceVolume=" + this.f14186w + ", deviceMute=" + this.f14187x + ", deviceAudioOutput=" + this.f14188y + ", deviceStorage=" + this.f14189z + ", deviceLowMemoryWarning=" + this.f14158A + ", sessionImpressionInterstitialCount=" + this.f14159B + ", sessionImpressionRewardedCount=" + this.f14160C + ", sessionImpressionBannerCount=" + this.f14161D + ", sessionDuration=" + this.f14162E + ", deviceUpTime=" + this.f14163F + ")";
    }

    /* JADX INFO: renamed from: u */
    public final String m17659u() {
        return this.f14178o;
    }

    /* JADX INFO: renamed from: v */
    public final long m17660v() {
        return this.f14189z;
    }

    /* JADX INFO: renamed from: w */
    public final String m17661w() {
        return this.f14181r;
    }

    /* JADX INFO: renamed from: x */
    public final long m17662x() {
        return this.f14163F;
    }

    /* JADX INFO: renamed from: y */
    public final int m17663y() {
        return this.f14186w;
    }

    /* JADX INFO: renamed from: z */
    public final int m17664z() {
        return this.f14165b;
    }
}
