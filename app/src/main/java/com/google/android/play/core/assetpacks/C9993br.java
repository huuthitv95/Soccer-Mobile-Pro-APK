package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.br */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9993br {
    /* JADX INFO: renamed from: a */
    static int m22597a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: b */
    static int m22598b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    static long m22599c(byte[] bArr, int i) {
        int i2 = i + 2;
        return ((long) ((m22597a(bArr, i2) << 16) | m22597a(bArr, i))) & 4294967295L;
    }
}
