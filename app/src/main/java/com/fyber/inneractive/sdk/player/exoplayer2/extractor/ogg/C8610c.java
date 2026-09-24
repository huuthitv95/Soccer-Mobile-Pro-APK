package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8807f;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8610c implements InterfaceC8615h, InterfaceC8628q {

    /* JADX INFO: renamed from: a */
    public long[] f19807a;

    /* JADX INFO: renamed from: b */
    public long[] f19808b;

    /* JADX INFO: renamed from: c */
    public long f19809c = -1;

    /* JADX INFO: renamed from: d */
    public long f19810d = -1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8611d f19811e;

    public C8610c(C8611d c8611d) {
        this.f19811e = c8611d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        return this.f19809c + this.f19808b[AbstractC8827z.m21380a(this.f19807a, (((long) this.f19811e.f19841i) * j) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: a */
    public final long mo21147a(C8527b c8527b) {
        long j = this.f19810d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f19810d = -1L;
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: b */
    public final InterfaceC8628q mo21149b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        C8807f c8807f = this.f19811e.f19812n;
        return (c8807f.f20620d * 1000000) / ((long) c8807f.f20617a);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: c */
    public final long mo21150c(long j) {
        long j2 = (((long) this.f19811e.f19841i) * j) / 1000000;
        this.f19810d = this.f19807a[AbstractC8827z.m21380a(this.f19807a, j2, true)];
        return j2;
    }
}
