package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.h */
/* JADX INFO: loaded from: classes9.dex */
public final class C8539h implements InterfaceC8629r {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final int mo21046a(C8527b c8527b, int i, boolean z) throws InterruptedException, EOFException {
        C8527b c8527b2;
        int iMin = Math.min(c8527b.f19127f, i);
        c8527b.m21026b(iMin);
        if (iMin == 0) {
            c8527b2 = c8527b;
            iMin = c8527b2.m21022a(C8527b.f19121g, 0, Math.min(i, 4096), 0, true);
        } else {
            c8527b2 = c8527b;
        }
        if (iMin != -1) {
            c8527b2.f19124c += (long) iMin;
        }
        if (iMin != -1) {
            return iMin;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21049a(int i, C8815n c8815n) {
        c8815n.m21347e(c8815n.f20644b + i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21051a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21053a(C8708o c8708o) {
    }
}
