package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8578g {

    /* JADX INFO: renamed from: d */
    public static final long[] f19493d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f19494a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f19495b;

    /* JADX INFO: renamed from: c */
    public int f19496c;

    /* JADX INFO: renamed from: a */
    public static long m21116a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f19493d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final long m21117a(C8527b c8527b, boolean z, boolean z2, int i) throws InterruptedException, EOFException {
        int i2;
        if (this.f19495b == 0) {
            if (!c8527b.m21027b(this.f19494a, 0, 1, z)) {
                return -1L;
            }
            int i3 = this.f19494a[0] & 255;
            int i4 = 0;
            while (true) {
                long[] jArr = f19493d;
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((((long) i3) & jArr[i4]) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f19496c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f19495b = 1;
        }
        int i5 = this.f19496c;
        if (i5 > i) {
            this.f19495b = 0;
            return -2L;
        }
        if (i5 != 1) {
            c8527b.m21027b(this.f19494a, 1, i5 - 1, false);
        }
        this.f19495b = 0;
        return m21116a(this.f19494a, this.f19496c, z2);
    }
}
