package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8612e implements InterfaceC8567i {

    /* JADX INFO: renamed from: a */
    public AbstractC8619l f19814a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, EOFException {
        AbstractC8619l abstractC8619l = this.f19814a;
        int i = abstractC8619l.f19840h;
        if (i == 0) {
            boolean zMo21153a = true;
            while (zMo21153a) {
                if (!abstractC8619l.f19833a.m21155a(c8527b)) {
                    abstractC8619l.f19840h = 3;
                    return -1;
                }
                long j = c8527b.f19124c;
                long j2 = abstractC8619l.f19838f;
                abstractC8619l.f19843k = j - j2;
                zMo21153a = abstractC8619l.mo21153a(abstractC8619l.f19833a.f19816b, j2, abstractC8619l.f19842j);
                if (zMo21153a) {
                    abstractC8619l.f19838f = c8527b.f19124c;
                }
            }
            C8708o c8708o = abstractC8619l.f19842j.f19831a;
            abstractC8619l.f19841i = c8708o.f20308s;
            if (!abstractC8619l.f19845m) {
                abstractC8619l.f19834b.mo21053a(c8708o);
                abstractC8619l.f19845m = true;
            }
            C8610c c8610c = abstractC8619l.f19842j.f19832b;
            if (c8610c != null) {
                abstractC8619l.f19836d = c8610c;
            } else {
                long j3 = c8527b.f19123b;
                if (j3 == -1) {
                    abstractC8619l.f19836d = new C8618k();
                } else {
                    C8614g c8614g = abstractC8619l.f19833a.f19815a;
                    abstractC8619l.f19836d = new C8609b(abstractC8619l.f19838f, j3, abstractC8619l, c8614g.f19824d + c8614g.f19825e, c8614g.f19822b);
                }
            }
            abstractC8619l.f19842j = null;
            abstractC8619l.f19840h = 2;
            abstractC8619l.f19833a.m21154a();
            return 0;
        }
        if (i == 1) {
            c8527b.m21023a((int) abstractC8619l.f19838f);
            abstractC8619l.f19840h = 2;
            return 0;
        }
        if (i != 2) {
            throw new IllegalStateException();
        }
        long jMo21147a = abstractC8619l.f19836d.mo21147a(c8527b);
        if (jMo21147a >= 0) {
            c8607o.f19793a = jMo21147a;
            return 1;
        }
        if (jMo21147a < -1) {
            abstractC8619l.mo21157a(-(jMo21147a + 2));
        }
        if (!abstractC8619l.f19844l) {
            abstractC8619l.f19835c.mo21093a(abstractC8619l.f19836d.mo21149b());
            abstractC8619l.f19844l = true;
        }
        if (abstractC8619l.f19843k <= 0 && !abstractC8619l.f19833a.m21155a(c8527b)) {
            abstractC8619l.f19840h = 3;
            return -1;
        }
        abstractC8619l.f19843k = 0L;
        C8815n c8815n = abstractC8619l.f19833a.f19816b;
        long jMo21151a = abstractC8619l.mo21151a(c8815n);
        if (jMo21151a >= 0) {
            long j4 = abstractC8619l.f19839g;
            if (j4 + jMo21151a >= abstractC8619l.f19837e) {
                long j5 = (j4 * 1000000) / ((long) abstractC8619l.f19841i);
                abstractC8619l.f19834b.mo21049a(c8815n.f20645c, c8815n);
                abstractC8619l.f19834b.mo21051a(j5, 1, c8815n.f20645c, 0, null);
                abstractC8619l.f19837e = -1L;
            }
        }
        abstractC8619l.f19839g += jMo21151a;
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        AbstractC8619l abstractC8619l = this.f19814a;
        C8613f c8613f = abstractC8619l.f19833a;
        C8614g c8614g = c8613f.f19815a;
        c8614g.f19821a = 0;
        c8614g.f19822b = 0L;
        c8614g.f19823c = 0;
        c8614g.f19824d = 0;
        c8614g.f19825e = 0;
        C8815n c8815n = c8613f.f19816b;
        c8815n.f20644b = 0;
        c8815n.f20645c = 0;
        c8613f.f19817c = -1;
        c8613f.f19819e = false;
        if (j == 0) {
            abstractC8619l.mo21152a(!abstractC8619l.f19844l);
        } else if (abstractC8619l.f19840h != 0) {
            abstractC8619l.f19837e = abstractC8619l.f19836d.mo21150c(j2);
            abstractC8619l.f19840h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(0, 1);
        interfaceC8568j.mo21096b();
        AbstractC8619l abstractC8619l = this.f19814a;
        abstractC8619l.f19835c = interfaceC8568j;
        abstractC8619l.f19834b = c8538gMo21092a;
        abstractC8619l.f19833a = new C8613f();
        abstractC8619l.mo21152a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        boolean zM21162a;
        boolean zEquals;
        try {
            C8614g c8614g = new C8614g();
            if (c8614g.m21156a(c8527b, true) && (c8614g.f19821a & 2) == 2) {
                int iMin = Math.min(c8614g.f19825e, 8);
                C8815n c8815n = new C8815n(iMin);
                c8527b.m21025a(c8815n.f20643a, 0, iMin, false);
                c8815n.m21347e(0);
                if (c8815n.f20645c - c8815n.f20644b >= 5 && c8815n.m21352j() == 127 && c8815n.m21353k() == 1179402563) {
                    this.f19814a = new C8611d();
                } else {
                    c8815n.m21347e(0);
                    try {
                        zM21162a = AbstractC8626s.m21162a(1, c8815n, true);
                    } catch (C8711r unused) {
                        zM21162a = false;
                    }
                    if (zM21162a) {
                        this.f19814a = new C8622o();
                    } else {
                        c8815n.m21347e(0);
                        int i = C8616i.f19828o;
                        int i2 = c8815n.f20645c - c8815n.f20644b;
                        byte[] bArr = C8616i.f19829p;
                        if (i2 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            c8815n.m21339a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f19814a = new C8616i();
                        }
                    }
                }
                return true;
            }
        } catch (C8711r unused2) {
        }
        return false;
    }
}
