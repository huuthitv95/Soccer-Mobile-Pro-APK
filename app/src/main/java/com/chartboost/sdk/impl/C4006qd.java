package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qd */
/* JADX INFO: loaded from: classes3.dex */
public final class C4006qd {

    /* JADX INFO: renamed from: a */
    public final boolean f15925a;

    /* JADX INFO: renamed from: b */
    public final int f15926b;

    /* JADX INFO: renamed from: c */
    public final byte[] f15927c;

    /* JADX INFO: renamed from: d */
    public final Throwable f15928d;

    /* JADX INFO: renamed from: e */
    public final String f15929e;

    /* JADX INFO: renamed from: f */
    public final Lazy f15930f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qd$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            byte[] bArrM19164b = C4006qd.this.m19164b();
            if (bArrM19164b == null) {
                return null;
            }
            String strM19165c = C4006qd.this.m19165c();
            if (strM19165c == null) {
                strM19165c = Charsets.UTF_8.name();
            }
            try {
                Intrinsics.checkNotNull(strM19165c);
                Charset charsetForName = Charset.forName(strM19165c);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                return new String(bArrM19164b, charsetForName);
            } catch (Exception unused) {
                return new String(bArrM19164b, Charsets.UTF_8);
            }
        }
    }

    public C4006qd(boolean z, int i, byte[] bArr, Throwable th, String str) {
        this.f15925a = z;
        this.f15926b = i;
        this.f15927c = bArr;
        this.f15928d = th;
        this.f15929e = str;
        this.f15930f = LazyKt.lazy(new a());
    }

    public /* synthetic */ C4006qd(boolean z, int i, byte[] bArr, Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a */
    public final String m19163a() {
        return (String) this.f15930f.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m19164b() {
        return this.f15927c;
    }

    /* JADX INFO: renamed from: c */
    public final String m19165c() {
        return this.f15929e;
    }

    /* JADX INFO: renamed from: d */
    public final Throwable m19166d() {
        return this.f15928d;
    }

    /* JADX INFO: renamed from: e */
    public final int m19167e() {
        return this.f15926b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4006qd)) {
            return false;
        }
        C4006qd c4006qd = (C4006qd) obj;
        return this.f15925a == c4006qd.f15925a && this.f15926b == c4006qd.f15926b && Intrinsics.areEqual(this.f15927c, c4006qd.f15927c) && Intrinsics.areEqual(this.f15928d, c4006qd.f15928d) && Intrinsics.areEqual(this.f15929e, c4006qd.f15929e);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19168f() {
        return this.f15925a;
    }

    public int hashCode() {
        int iM43487m = ((UByte$$ExternalSyntheticBackport0.m43487m(this.f15925a) * 31) + this.f15926b) * 31;
        byte[] bArr = this.f15927c;
        int iHashCode = (iM43487m + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th = this.f15928d;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.f15929e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(isSuccessful=" + this.f15925a + ", statusCode=" + this.f15926b + ", bytes=" + Arrays.toString(this.f15927c) + ", error=" + this.f15928d + ", charset=" + this.f15929e + ")";
    }
}
