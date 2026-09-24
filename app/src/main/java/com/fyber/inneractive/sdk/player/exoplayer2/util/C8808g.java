package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8808g {

    /* JADX INFO: renamed from: a */
    public int f20621a;

    /* JADX INFO: renamed from: b */
    public long[] f20622b = new long[32];

    /* JADX INFO: renamed from: a */
    public final void m21324a(long j) {
        int i = this.f20621a;
        long[] jArr = this.f20622b;
        if (i == jArr.length) {
            this.f20622b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f20622b;
        int i2 = this.f20621a;
        this.f20621a = i2 + 1;
        jArr2[i2] = j;
    }
}
