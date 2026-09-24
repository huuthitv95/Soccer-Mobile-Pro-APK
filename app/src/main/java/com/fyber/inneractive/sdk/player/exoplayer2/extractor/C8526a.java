package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8526a implements InterfaceC8628q {

    /* JADX INFO: renamed from: a */
    public final long[] f19118a;

    /* JADX INFO: renamed from: b */
    public final long[] f19119b;

    /* JADX INFO: renamed from: c */
    public final long f19120c;

    public C8526a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f19118a = jArr;
        this.f19119b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f19120c = 0L;
        } else {
            int i = length - 1;
            this.f19120c = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        return this.f19118a[AbstractC8827z.m21380a(this.f19119b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19120c;
    }
}
