package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8805d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8812k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8829a {

    /* JADX INFO: renamed from: a */
    public final List f20712a;

    /* JADX INFO: renamed from: b */
    public final int f20713b;

    /* JADX INFO: renamed from: c */
    public final int f20714c;

    /* JADX INFO: renamed from: d */
    public final int f20715d;

    /* JADX INFO: renamed from: e */
    public final float f20716e;

    public C8829a(ArrayList arrayList, int i, int i2, int i3, float f) {
        this.f20712a = arrayList;
        this.f20713b = i;
        this.f20714c = i2;
        this.f20715d = i3;
        this.f20716e = f;
    }

    /* JADX INFO: renamed from: a */
    public static C8829a m21392a(C8815n c8815n) throws C8711r {
        float f;
        int i;
        int i2;
        try {
            c8815n.m21347e(c8815n.f20644b + 4);
            int iM21352j = (c8815n.m21352j() & 3) + 1;
            if (iM21352j == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM21352j2 = c8815n.m21352j() & 31;
            for (int i3 = 0; i3 < iM21352j2; i3++) {
                int iM21357o = c8815n.m21357o();
                int i4 = c8815n.f20644b;
                c8815n.m21347e(i4 + iM21357o);
                byte[] bArr = c8815n.f20643a;
                byte[] bArr2 = new byte[iM21357o + 4];
                System.arraycopy(AbstractC8805d.f20613a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i4, bArr2, 4, iM21357o);
                arrayList.add(bArr2);
            }
            int iM21352j3 = c8815n.m21352j();
            for (int i5 = 0; i5 < iM21352j3; i5++) {
                int iM21357o2 = c8815n.m21357o();
                int i6 = c8815n.f20644b;
                c8815n.m21347e(i6 + iM21357o2);
                byte[] bArr3 = c8815n.f20643a;
                byte[] bArr4 = new byte[iM21357o2 + 4];
                System.arraycopy(AbstractC8805d.f20613a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i6, bArr4, 4, iM21357o2);
                arrayList.add(bArr4);
            }
            if (iM21352j2 > 0) {
                C8812k c8812kM21330a = AbstractC8813l.m21330a((byte[]) arrayList.get(0), iM21352j, ((byte[]) arrayList.get(0)).length);
                int i7 = c8812kM21330a.f20626b;
                int i8 = c8812kM21330a.f20627c;
                f = c8812kM21330a.f20628d;
                i = i7;
                i2 = i8;
            } else {
                f = 1.0f;
                i = -1;
                i2 = -1;
            }
            return new C8829a(arrayList, iM21352j, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8711r("Error parsing AVC config", e);
        }
    }
}
