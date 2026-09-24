package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7171lC extends AbstractC5324H2 {
    public C7171lC(C460253 c460253, long j, long j2) {
        super(new C7269mz(), new C7172lD(c460253), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }
}
