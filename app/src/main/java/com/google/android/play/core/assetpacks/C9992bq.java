package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bq */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9992bq extends AbstractC10075es {

    /* JADX INFO: renamed from: a */
    private final String f22099a;

    /* JADX INFO: renamed from: b */
    private final long f22100b;

    /* JADX INFO: renamed from: c */
    private final int f22101c;

    /* JADX INFO: renamed from: d */
    private final boolean f22102d;

    /* JADX INFO: renamed from: e */
    private final boolean f22103e;

    /* JADX INFO: renamed from: f */
    private final byte[] f22104f;

    C9992bq(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f22099a = str;
        this.f22100b = j;
        this.f22101c = i;
        this.f22102d = z;
        this.f22103e = z2;
        this.f22104f = bArr;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: a */
    final int mo22591a() {
        return this.f22101c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: b */
    final long mo22592b() {
        return this.f22100b;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: c */
    final String mo22593c() {
        return this.f22099a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: d */
    final boolean mo22594d() {
        return this.f22103e;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: e */
    final boolean mo22595e() {
        return this.f22102d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10075es) {
            AbstractC10075es abstractC10075es = (AbstractC10075es) obj;
            String str = this.f22099a;
            if (str != null ? str.equals(abstractC10075es.mo22593c()) : abstractC10075es.mo22593c() == null) {
                if (this.f22100b == abstractC10075es.mo22592b() && this.f22101c == abstractC10075es.mo22591a() && this.f22102d == abstractC10075es.mo22595e() && this.f22103e == abstractC10075es.mo22594d()) {
                    if (Arrays.equals(this.f22104f, abstractC10075es instanceof C9992bq ? ((C9992bq) abstractC10075es).f22104f : abstractC10075es.mo22596f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC10075es
    /* JADX INFO: renamed from: f */
    final byte[] mo22596f() {
        return this.f22104f;
    }

    public final int hashCode() {
        String str = this.f22099a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f22100b;
        int i = this.f22101c;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ (true != this.f22102d ? 1237 : 1231)) * 1000003) ^ (true == this.f22103e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f22104f);
    }

    public final String toString() {
        return "ZipEntry{name=" + this.f22099a + ", size=" + this.f22100b + ", compressionMethod=" + this.f22101c + ", isPartial=" + this.f22102d + ", isEndOfArchive=" + this.f22103e + ", headerBytes=" + Arrays.toString(this.f22104f) + "}";
    }
}
