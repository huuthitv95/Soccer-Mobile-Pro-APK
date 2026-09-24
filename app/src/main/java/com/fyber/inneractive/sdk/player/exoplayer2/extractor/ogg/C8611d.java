package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8807f;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8611d extends AbstractC8619l {

    /* JADX INFO: renamed from: n */
    public C8807f f19812n;

    /* JADX INFO: renamed from: o */
    public C8610c f19813o;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final long mo21151a(C8815n c8815n) {
        int i;
        int i2;
        int i3;
        byte[] bArr = c8815n.f20643a;
        int i4 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i5 = (bArr[2] & 255) >> 4;
        switch (i5) {
            case 1:
                i4 = 192;
                return i4;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i5 - 2;
                i2 = 576;
                i4 = i2 << i;
                return i4;
            case 6:
            case 7:
                c8815n.m21347e(c8815n.f20644b + 4);
                long j = c8815n.f20643a[c8815n.f20644b];
                int i6 = 7;
                while (true) {
                    if (i6 >= 0) {
                        int i7 = 1 << i6;
                        if ((((long) i7) & j) != 0) {
                            i6--;
                        } else if (i6 < 6) {
                            j &= (long) (i7 - 1);
                            i3 = 7 - i6;
                        } else if (i6 == 7) {
                            i3 = 1;
                        }
                    }
                    i3 = 0;
                }
                if (i3 == 0) {
                    throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                }
                for (int i8 = 1; i8 < i3; i8++) {
                    byte b = c8815n.f20643a[c8815n.f20644b + i8];
                    if ((b & 192) != 128) {
                        throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                    }
                    j = (j << 6) | ((long) (b & 63));
                }
                c8815n.f20644b += i3;
                int iM21352j = i5 == 6 ? c8815n.m21352j() : c8815n.m21357o();
                c8815n.m21347e(0);
                i4 = iM21352j + 1;
                return i4;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i5 - 8;
                i2 = 256;
                i4 = i2 << i;
                return i4;
            default:
                return i4;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final void mo21152a(boolean z) {
        super.mo21152a(z);
        if (z) {
            this.f19812n = null;
            this.f19813o = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final boolean mo21153a(C8815n c8815n, long j, C8617j c8617j) {
        byte[] bArr = c8815n.f20643a;
        if (this.f19812n == null) {
            this.f19812n = new C8807f(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c8815n.f20645c);
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            C8807f c8807f = this.f19812n;
            int i = c8807f.f20619c;
            int i2 = c8807f.f20617a;
            c8617j.f19831a = C8708o.m21263a(null, "audio/flac", -1, i * i2, c8807f.f20618b, i2, listSingletonList, null, null);
        } else {
            byte b = bArr[0];
            if ((b & 127) == 3) {
                C8610c c8610c = new C8610c(this);
                this.f19813o = c8610c;
                c8815n.m21347e(c8815n.f20644b + 1);
                int iM21354l = c8815n.m21354l() / 18;
                c8610c.f19807a = new long[iM21354l];
                c8610c.f19808b = new long[iM21354l];
                for (int i3 = 0; i3 < iM21354l; i3++) {
                    c8610c.f19807a[i3] = c8815n.m21349g();
                    c8610c.f19808b[i3] = c8815n.m21349g();
                    c8815n.m21347e(c8815n.f20644b + 2);
                }
            } else if (b == -1) {
                C8610c c8610c2 = this.f19813o;
                if (c8610c2 != null) {
                    c8610c2.f19809c = j;
                    c8617j.f19832b = c8610c2;
                }
                return false;
            }
        }
        return true;
    }
}
