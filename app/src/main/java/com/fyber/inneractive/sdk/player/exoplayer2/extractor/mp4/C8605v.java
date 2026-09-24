package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8605v {

    /* JADX INFO: renamed from: a */
    public final int f19773a;

    /* JADX INFO: renamed from: b */
    public final long[] f19774b;

    /* JADX INFO: renamed from: c */
    public final int[] f19775c;

    /* JADX INFO: renamed from: d */
    public final int f19776d;

    /* JADX INFO: renamed from: e */
    public final long[] f19777e;

    /* JADX INFO: renamed from: f */
    public final int[] f19778f;

    public C8605v(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.f19774b = jArr;
        this.f19775c = iArr;
        this.f19776d = i;
        this.f19777e = jArr2;
        this.f19778f = iArr2;
        this.f19773a = jArr.length;
    }
}
