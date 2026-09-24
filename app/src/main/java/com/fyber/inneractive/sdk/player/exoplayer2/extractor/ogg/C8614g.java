package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8614g {

    /* JADX INFO: renamed from: h */
    public static final int f19820h = AbstractC8827z.m21379a("OggS");

    /* JADX INFO: renamed from: a */
    public int f19821a;

    /* JADX INFO: renamed from: b */
    public long f19822b;

    /* JADX INFO: renamed from: c */
    public int f19823c;

    /* JADX INFO: renamed from: d */
    public int f19824d;

    /* JADX INFO: renamed from: e */
    public int f19825e;

    /* JADX INFO: renamed from: f */
    public final int[] f19826f = new int[255];

    /* JADX INFO: renamed from: g */
    public final C8815n f19827g = new C8815n(255);

    /* JADX INFO: renamed from: a */
    public final boolean m21156a(C8527b c8527b, boolean z) throws C8711r, EOFException {
        C8815n c8815n = this.f19827g;
        c8815n.f20644b = 0;
        c8815n.f20645c = 0;
        this.f19821a = 0;
        this.f19822b = 0L;
        this.f19823c = 0;
        this.f19824d = 0;
        this.f19825e = 0;
        long j = c8527b.f19123b;
        if ((j != -1 && j - (c8527b.f19124c + ((long) c8527b.f19126e)) < 27) || !c8527b.m21025a(c8815n.f20643a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f19827g.m21353k() != f19820h) {
            if (z) {
                return false;
            }
            throw new C8711r("expected OggS capture pattern at begin of page");
        }
        if (this.f19827g.m21352j() != 0) {
            if (z) {
                return false;
            }
            throw new C8711r("unsupported bit stream revision");
        }
        this.f19821a = this.f19827g.m21352j();
        C8815n c8815n2 = this.f19827g;
        byte[] bArr = c8815n2.f20643a;
        int i = c8815n2.f20644b;
        int i2 = i + 1;
        c8815n2.f20644b = i2;
        long j2 = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        c8815n2.f20644b = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        c8815n2.f20644b = i4;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        c8815n2.f20644b = i5;
        long j5 = j4 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        c8815n2.f20644b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        c8815n2.f20644b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        c8815n2.f20644b = i8;
        long j8 = j7 | ((((long) bArr[i7]) & 255) << 48);
        c8815n2.f20644b = i + 8;
        this.f19822b = j8 | ((255 & ((long) bArr[i8])) << 56);
        c8815n2.m21346e();
        this.f19827g.m21346e();
        this.f19827g.m21346e();
        int iM21352j = this.f19827g.m21352j();
        this.f19823c = iM21352j;
        this.f19824d = iM21352j + 27;
        C8815n c8815n3 = this.f19827g;
        c8815n3.f20644b = 0;
        c8815n3.f20645c = 0;
        c8527b.m21025a(c8815n3.f20643a, 0, iM21352j, false);
        for (int i9 = 0; i9 < this.f19823c; i9++) {
            this.f19826f[i9] = this.f19827g.m21352j();
            this.f19825e += this.f19826f[i9];
        }
        return true;
    }
}
