package com.ironsource;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ad */
/* JADX INFO: loaded from: classes6.dex */
public final class C11805ad {

    /* JADX INFO: renamed from: a */
    private boolean f26791a;

    /* JADX INFO: renamed from: b */
    private String f26792b;

    /* JADX INFO: renamed from: c */
    private boolean f26793c;

    /* JADX INFO: renamed from: d */
    private int f26794d;

    /* JADX INFO: renamed from: e */
    private int[] f26795e;

    /* JADX INFO: renamed from: f */
    private int[] f26796f;

    public C11805ad() {
        this(false, null, false, 0, null, null, 63, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28184a() {
        return this.f26791a;
    }

    /* JADX INFO: renamed from: b */
    public final String m28185b() {
        return this.f26792b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28188c() {
        return this.f26793c;
    }

    /* JADX INFO: renamed from: d */
    public final int m28189d() {
        return this.f26794d;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m28190e() {
        return this.f26795e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11805ad)) {
            return false;
        }
        C11805ad c11805ad = (C11805ad) obj;
        return this.f26791a == c11805ad.f26791a && Intrinsics.areEqual(this.f26792b, c11805ad.f26792b) && this.f26793c == c11805ad.f26793c && this.f26794d == c11805ad.f26794d && Intrinsics.areEqual(this.f26795e, c11805ad.f26795e) && Intrinsics.areEqual(this.f26796f, c11805ad.f26796f);
    }

    /* JADX INFO: renamed from: f */
    public final int[] m28191f() {
        return this.f26796f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28192g() {
        return this.f26793c;
    }

    /* JADX INFO: renamed from: h */
    public final int m28193h() {
        return this.f26794d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z = this.f26791a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.f26792b.hashCode()) * 31;
        boolean z2 = this.f26793c;
        int i = (((iHashCode + (z2 ? 1 : z2)) * 31) + this.f26794d) * 31;
        int[] iArr = this.f26795e;
        int iHashCode2 = (i + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f26796f;
        return iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28194i() {
        return this.f26791a;
    }

    /* JADX INFO: renamed from: j */
    public final String m28195j() {
        return this.f26792b;
    }

    /* JADX INFO: renamed from: k */
    public final int[] m28196k() {
        return this.f26796f;
    }

    /* JADX INFO: renamed from: l */
    public final int[] m28197l() {
        return this.f26795e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f26791a + ", pixelEventsUrl=" + this.f26792b + ", pixelEventsCompression=" + this.f26793c + ", pixelEventsCompressionLevel=" + this.f26794d + ", pixelOptOut=" + Arrays.toString(this.f26795e) + ", pixelOptIn=" + Arrays.toString(this.f26796f) + ")";
    }

    public C11805ad(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f26791a = z;
        this.f26792b = pixelEventsUrl;
        this.f26793c = z2;
        this.f26794d = i;
        this.f26795e = iArr;
        this.f26796f = iArr2;
    }

    /* JADX INFO: renamed from: a */
    public final C11805ad m28179a(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C11805ad(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    /* JADX INFO: renamed from: b */
    public final void m28186b(boolean z) {
        this.f26791a = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11805ad m28178a(C11805ad c11805ad, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c11805ad.f26791a;
        }
        if ((i2 & 2) != 0) {
            str = c11805ad.f26792b;
        }
        if ((i2 & 4) != 0) {
            z2 = c11805ad.f26793c;
        }
        if ((i2 & 8) != 0) {
            i = c11805ad.f26794d;
        }
        if ((i2 & 16) != 0) {
            iArr = c11805ad.f26795e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c11805ad.f26796f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c11805ad.m28179a(z, str, z2, i, iArr3, iArr4);
    }

    /* JADX INFO: renamed from: b */
    public final void m28187b(int[] iArr) {
        this.f26795e = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m28181a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f26792b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m28182a(boolean z) {
        this.f26793c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m28180a(int i) {
        this.f26794d = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m28183a(int[] iArr) {
        this.f26796f = iArr;
    }

    public /* synthetic */ C11805ad(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C12117bd.f30133a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }
}
