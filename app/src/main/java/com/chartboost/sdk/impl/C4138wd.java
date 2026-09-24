package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wd */
/* JADX INFO: loaded from: classes3.dex */
public final class C4138wd {

    /* JADX INFO: renamed from: a */
    public boolean f16726a;

    /* JADX INFO: renamed from: b */
    public boolean f16727b;

    /* JADX INFO: renamed from: c */
    public int f16728c;

    /* JADX INFO: renamed from: d */
    public int f16729d;

    /* JADX INFO: renamed from: e */
    public long f16730e;

    /* JADX INFO: renamed from: f */
    public int f16731f;

    /* JADX INFO: renamed from: g */
    public List f16732g;

    public C4138wd(boolean z, boolean z2, int i, int i2, long j, int i3, List list) {
        this.f16726a = z;
        this.f16727b = z2;
        this.f16728c = i;
        this.f16729d = i2;
        this.f16730e = j;
        this.f16731f = i3;
        this.f16732g = list;
    }

    public /* synthetic */ C4138wd(boolean z, boolean z2, int i, int i2, long j, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 1 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 100L : j, (i4 & 32) != 0 ? 25 : i3, (i4 & 64) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: a */
    public final int m19784a() {
        return this.f16728c;
    }

    /* JADX INFO: renamed from: b */
    public final int m19785b() {
        return this.f16729d;
    }

    /* JADX INFO: renamed from: c */
    public final int m19786c() {
        return this.f16731f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19787d() {
        return this.f16727b;
    }

    /* JADX INFO: renamed from: e */
    public final List m19788e() {
        return this.f16732g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4138wd)) {
            return false;
        }
        C4138wd c4138wd = (C4138wd) obj;
        return this.f16726a == c4138wd.f16726a && this.f16727b == c4138wd.f16727b && this.f16728c == c4138wd.f16728c && this.f16729d == c4138wd.f16729d && this.f16730e == c4138wd.f16730e && this.f16731f == c4138wd.f16731f && Intrinsics.areEqual(this.f16732g, c4138wd.f16732g);
    }

    /* JADX INFO: renamed from: f */
    public final long m19789f() {
        return this.f16730e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19790g() {
        return this.f16726a;
    }

    public int hashCode() {
        int iM43487m = ((((((((((UByte$$ExternalSyntheticBackport0.m43487m(this.f16726a) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f16727b)) * 31) + this.f16728c) * 31) + this.f16729d) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16730e)) * 31) + this.f16731f) * 31;
        List list = this.f16732g;
        return iM43487m + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "OmSdkModel(isEnabled=" + this.f16726a + ", verificationEnabled=" + this.f16727b + ", minVisibleDips=" + this.f16728c + ", minVisibleDurationMs=" + this.f16729d + ", visibilityCheckIntervalMs=" + this.f16730e + ", traversalLimit=" + this.f16731f + ", verificationList=" + this.f16732g + ")";
    }
}
