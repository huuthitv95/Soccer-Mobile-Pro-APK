package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8829a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8537f extends AbstractC8536e {

    /* JADX INFO: renamed from: b */
    public final C8815n f19171b;

    /* JADX INFO: renamed from: c */
    public final C8815n f19172c;

    /* JADX INFO: renamed from: d */
    public int f19173d;

    /* JADX INFO: renamed from: e */
    public boolean f19174e;

    /* JADX INFO: renamed from: f */
    public int f19175f;

    public C8537f(InterfaceC8629r interfaceC8629r) {
        super(interfaceC8629r);
        this.f19171b = new C8815n(AbstractC8813l.f20635a);
        this.f19172c = new C8815n(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m21043a(C8815n c8815n, long j) throws C8711r {
        int iM21352j = c8815n.m21352j();
        long jM21354l = (((long) c8815n.m21354l()) * 1000) + j;
        if (iM21352j == 0 && !this.f19174e) {
            byte[] bArr = new byte[c8815n.f20645c - c8815n.f20644b];
            C8815n c8815n2 = new C8815n(bArr);
            c8815n.m21339a(bArr, 0, c8815n.f20645c - c8815n.f20644b);
            C8829a c8829aM21392a = C8829a.m21392a(c8815n2);
            this.f19173d = c8829aM21392a.f20713b;
            this.f19170a.mo21053a(C8708o.m21264a(null, "video/avc", -1, c8829aM21392a.f20714c, c8829aM21392a.f20715d, c8829aM21392a.f20712a, -1, c8829aM21392a.f20716e, null, -1, null, null));
            this.f19174e = true;
            return;
        }
        if (iM21352j == 1 && this.f19174e) {
            byte[] bArr2 = this.f19172c.f20643a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i = 4 - this.f19173d;
            int i2 = 0;
            while (c8815n.f20645c - c8815n.f20644b > 0) {
                c8815n.m21339a(this.f19172c.f20643a, i, this.f19173d);
                this.f19172c.m21347e(0);
                int iM21355m = this.f19172c.m21355m();
                this.f19171b.m21347e(0);
                this.f19170a.mo21049a(4, this.f19171b);
                this.f19170a.mo21049a(iM21355m, c8815n);
                i2 = i2 + 4 + iM21355m;
            }
            this.f19170a.mo21051a(jM21354l, this.f19175f == 1 ? 1 : 0, i2, 0, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21044a(C8815n c8815n) throws C8535d {
        int iM21352j = c8815n.m21352j();
        int i = (iM21352j >> 4) & 15;
        int i2 = iM21352j & 15;
        if (i2 != 7) {
            throw new C8535d(AbstractC8673m.m21221a("Video format not supported: ", i2));
        }
        this.f19175f = i;
        return i != 5;
    }
}
