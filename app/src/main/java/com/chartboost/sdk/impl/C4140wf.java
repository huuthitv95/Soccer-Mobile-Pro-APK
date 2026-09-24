package com.chartboost.sdk.impl;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wf */
/* JADX INFO: loaded from: classes3.dex */
public final class C4140wf {

    /* JADX INFO: renamed from: a */
    public final int f16742a;

    /* JADX INFO: renamed from: b */
    public final int f16743b;

    /* JADX INFO: renamed from: c */
    public final float f16744c;

    /* JADX INFO: renamed from: d */
    public final WindowInsetsCompat f16745d;

    /* JADX INFO: renamed from: e */
    public final Insets f16746e;

    public C4140wf(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets) {
        this.f16742a = i;
        this.f16743b = i2;
        this.f16744c = f;
        this.f16745d = windowInsetsCompat;
        this.f16746e = insets;
    }

    public /* synthetic */ C4140wf(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, (i3 & 8) != 0 ? null : windowInsetsCompat, (i3 & 16) != 0 ? null : insets);
    }

    /* JADX INFO: renamed from: a */
    public final float m19800a() {
        return this.f16744c;
    }

    /* JADX INFO: renamed from: b */
    public final int m19801b() {
        return this.f16743b;
    }

    /* JADX INFO: renamed from: c */
    public final Insets m19802c() {
        return this.f16746e;
    }

    /* JADX INFO: renamed from: d */
    public final int m19803d() {
        return this.f16742a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4140wf)) {
            return false;
        }
        C4140wf c4140wf = (C4140wf) obj;
        return this.f16742a == c4140wf.f16742a && this.f16743b == c4140wf.f16743b && Float.compare(this.f16744c, c4140wf.f16744c) == 0 && Intrinsics.areEqual(this.f16745d, c4140wf.f16745d) && Intrinsics.areEqual(this.f16746e, c4140wf.f16746e);
    }

    public int hashCode() {
        int iFloatToIntBits = ((((this.f16742a * 31) + this.f16743b) * 31) + Float.floatToIntBits(this.f16744c)) * 31;
        WindowInsetsCompat windowInsetsCompat = this.f16745d;
        int iHashCode = (iFloatToIntBits + (windowInsetsCompat == null ? 0 : windowInsetsCompat.hashCode())) * 31;
        Insets insets = this.f16746e;
        return iHashCode + (insets != null ? insets.hashCode() : 0);
    }

    public String toString() {
        return "RenderingContainer(width=" + this.f16742a + ", height=" + this.f16743b + ", density=" + this.f16744c + ", windowInsets=" + this.f16745d + ", systemInsets=" + this.f16746e + ")";
    }
}
