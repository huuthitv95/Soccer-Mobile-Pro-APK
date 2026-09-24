package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8582d implements InterfaceC8580b {

    /* JADX INFO: renamed from: a */
    public final long[] f19515a;

    /* JADX INFO: renamed from: b */
    public final long[] f19516b;

    /* JADX INFO: renamed from: c */
    public final long f19517c;

    public C8582d(long[] jArr, long[] jArr2, long j) {
        this.f19515a = jArr;
        this.f19516b = jArr2;
        this.f19517c = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        return this.f19516b[AbstractC8827z.m21380a(this.f19515a, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC8580b
    /* JADX INFO: renamed from: b */
    public final long mo21118b(long j) {
        return this.f19515a[AbstractC8827z.m21380a(this.f19516b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19517c;
    }
}
