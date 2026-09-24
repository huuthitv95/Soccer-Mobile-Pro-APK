package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8577f {

    /* JADX INFO: renamed from: a */
    public final C8815n f19491a = new C8815n(8);

    /* JADX INFO: renamed from: b */
    public int f19492b;

    /* JADX INFO: renamed from: a */
    public final long m21115a(C8527b c8527b) {
        int i = 0;
        c8527b.m21025a(this.f19491a.f20643a, 0, 1, false);
        int i2 = this.f19491a.f20643a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c8527b.m21025a(this.f19491a.f20643a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f19491a.f20643a[i] & 255) + (i5 << 8);
        }
        this.f19492b = i4 + 1 + this.f19492b;
        return i5;
    }
}
