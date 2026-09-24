package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8832d {

    /* JADX INFO: renamed from: a */
    public final List f20722a;

    /* JADX INFO: renamed from: b */
    public final int f20723b;

    public C8832d(int i, List list) {
        this.f20722a = list;
        this.f20723b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C8832d m21393a(C8815n c8815n) throws C8711r {
        try {
            c8815n.m21347e(c8815n.f20644b + 21);
            int iM21352j = c8815n.m21352j() & 3;
            int iM21352j2 = c8815n.m21352j();
            int i = c8815n.f20644b;
            int i2 = 0;
            for (int i3 = 0; i3 < iM21352j2; i3++) {
                c8815n.m21347e(c8815n.f20644b + 1);
                int iM21357o = c8815n.m21357o();
                for (int i4 = 0; i4 < iM21357o; i4++) {
                    int iM21357o2 = c8815n.m21357o();
                    i2 += iM21357o2 + 4;
                    c8815n.m21347e(c8815n.f20644b + iM21357o2);
                }
            }
            c8815n.m21347e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iM21352j2; i6++) {
                c8815n.m21347e(c8815n.f20644b + 1);
                int iM21357o3 = c8815n.m21357o();
                for (int i7 = 0; i7 < iM21357o3; i7++) {
                    int iM21357o4 = c8815n.m21357o();
                    System.arraycopy(AbstractC8813l.f20635a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(c8815n.f20643a, c8815n.f20644b, bArr, i8, iM21357o4);
                    i5 = i8 + iM21357o4;
                    c8815n.m21347e(c8815n.f20644b + iM21357o4);
                }
            }
            return new C8832d(iM21352j + 1, i2 == 0 ? null : Collections.singletonList(bArr));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8711r("Error parsing HEVC config", e);
        }
    }
}
