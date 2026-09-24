package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3795h6 {

    /* JADX INFO: renamed from: a */
    public final int f14375a;

    /* JADX INFO: renamed from: b */
    public final int f14376b;

    /* JADX INFO: renamed from: c */
    public final int f14377c;

    /* JADX INFO: renamed from: d */
    public final int f14378d;

    /* JADX INFO: renamed from: e */
    public final float f14379e;

    /* JADX INFO: renamed from: f */
    public final String f14380f;

    /* JADX INFO: renamed from: g */
    public final int f14381g;

    /* JADX INFO: renamed from: h */
    public final String f14382h;

    /* JADX INFO: renamed from: i */
    public final String f14383i;

    /* JADX INFO: renamed from: j */
    public final String f14384j;

    /* JADX INFO: renamed from: k */
    public final boolean f14385k;

    public C3795h6(int i, int i2, int i3, int i4, float f, String str, int i5, String deviceType, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.f14375a = i;
        this.f14376b = i2;
        this.f14377c = i3;
        this.f14378d = i4;
        this.f14379e = f;
        this.f14380f = str;
        this.f14381g = i5;
        this.f14382h = deviceType;
        this.f14383i = str2;
        this.f14384j = str3;
        this.f14385k = z;
    }

    public /* synthetic */ C3795h6(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? AbstractC3887l6.f15194a : i5, (i6 & 128) != 0 ? "phone" : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? null : str4, (i6 & 1024) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: a */
    public final int m17857a() {
        return this.f14376b;
    }

    /* JADX INFO: renamed from: b */
    public final String m17858b() {
        return this.f14382h;
    }

    /* JADX INFO: renamed from: c */
    public final int m17859c() {
        return this.f14375a;
    }

    /* JADX INFO: renamed from: d */
    public final String m17860d() {
        return this.f14380f;
    }

    /* JADX INFO: renamed from: e */
    public final int m17861e() {
        return this.f14378d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3795h6)) {
            return false;
        }
        C3795h6 c3795h6 = (C3795h6) obj;
        return this.f14375a == c3795h6.f14375a && this.f14376b == c3795h6.f14376b && this.f14377c == c3795h6.f14377c && this.f14378d == c3795h6.f14378d && Float.compare(this.f14379e, c3795h6.f14379e) == 0 && Intrinsics.areEqual(this.f14380f, c3795h6.f14380f) && this.f14381g == c3795h6.f14381g && Intrinsics.areEqual(this.f14382h, c3795h6.f14382h) && Intrinsics.areEqual(this.f14383i, c3795h6.f14383i) && Intrinsics.areEqual(this.f14384j, c3795h6.f14384j) && this.f14385k == c3795h6.f14385k;
    }

    /* JADX INFO: renamed from: f */
    public final int m17862f() {
        return this.f14381g;
    }

    /* JADX INFO: renamed from: g */
    public final String m17863g() {
        return this.f14383i;
    }

    /* JADX INFO: renamed from: h */
    public final float m17864h() {
        return this.f14379e;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((this.f14375a * 31) + this.f14376b) * 31) + this.f14377c) * 31) + this.f14378d) * 31) + Float.floatToIntBits(this.f14379e)) * 31;
        String str = this.f14380f;
        int iHashCode = (((((iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31) + this.f14381g) * 31) + this.f14382h.hashCode()) * 31;
        String str2 = this.f14383i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14384j;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14385k);
    }

    /* JADX INFO: renamed from: i */
    public final String m17865i() {
        return this.f14384j;
    }

    /* JADX INFO: renamed from: j */
    public final int m17866j() {
        return this.f14377c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17867k() {
        return this.f14385k;
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.f14375a + ", deviceHeight=" + this.f14376b + ", width=" + this.f14377c + ", height=" + this.f14378d + ", scale=" + this.f14379e + ", dpi=" + this.f14380f + ", ortbDeviceType=" + this.f14381g + ", deviceType=" + this.f14382h + ", packageName=" + this.f14383i + ", versionName=" + this.f14384j + ", isPortrait=" + this.f14385k + ")";
    }
}
