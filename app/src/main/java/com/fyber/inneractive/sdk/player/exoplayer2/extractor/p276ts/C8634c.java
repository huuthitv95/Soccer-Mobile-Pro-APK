package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8634c implements InterfaceC8567i {

    /* JADX INFO: renamed from: e */
    public static final int f19903e = AbstractC8827z.m21379a("ID3");

    /* JADX INFO: renamed from: a */
    public final long f19904a;

    /* JADX INFO: renamed from: b */
    public final C8815n f19905b = new C8815n(200);

    /* JADX INFO: renamed from: c */
    public C8636d f19906c;

    /* JADX INFO: renamed from: d */
    public boolean f19907d;

    public C8634c(long j) {
        this.f19904a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, EOFException {
        int iMin;
        C8527b c8527b2;
        byte[] bArr = this.f19905b.f20643a;
        int i = c8527b.f19127f;
        if (i == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i, 200);
            System.arraycopy(c8527b.f19125d, 0, bArr, 0, iMin);
            c8527b.m21026b(iMin);
        }
        if (iMin == 0) {
            c8527b2 = c8527b;
            iMin = c8527b2.m21022a(bArr, 0, 200, 0, true);
        } else {
            c8527b2 = c8527b;
        }
        if (iMin != -1) {
            c8527b2.f19124c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f19905b.m21347e(0);
        this.f19905b.m21345d(iMin);
        if (!this.f19907d) {
            this.f19906c.f19925o = this.f19904a;
            this.f19907d = true;
        }
        this.f19906c.mo21167a(this.f19905b);
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f19907d = false;
        C8636d c8636d = this.f19906c;
        c8636d.f19918h = 0;
        c8636d.f19919i = 0;
        c8636d.f19920j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        C8636d c8636d = new C8636d(true, null);
        this.f19906c = c8636d;
        c8636d.mo21166a(interfaceC8568j, new C8639e0(Integer.MIN_VALUE, 0, 1));
        interfaceC8568j.mo21096b();
        interfaceC8568j.mo21093a(new C8627p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        C8815n c8815n = new C8815n(10);
        C8814m c8814m = new C8814m(c8815n.f20643a);
        int i = 0;
        while (true) {
            c8527b.m21025a(c8815n.f20643a, 0, 10, false);
            c8815n.m21347e(0);
            if (c8815n.m21354l() != f19903e) {
                break;
            }
            c8815n.m21347e(c8815n.f20644b + 3);
            int iM21351i = c8815n.m21351i();
            i += iM21351i + 10;
            c8527b.m21024a(iM21351i, false);
        }
        c8527b.f19126e = 0;
        c8527b.m21024a(i, false);
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (true) {
            c8527b.m21025a(c8815n.f20643a, 0, 2, false);
            c8815n.m21347e(0);
            if ((c8815n.m21357o() & 65526) != 65520) {
                c8527b.f19126e = 0;
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                c8527b.m21024a(i4, false);
                i2 = 0;
                i3 = 0;
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c8527b.m21025a(c8815n.f20643a, 0, 4, false);
                c8814m.m21334b(14);
                int iM21332a = c8814m.m21332a(13);
                if (iM21332a <= 6) {
                    return false;
                }
                c8527b.m21024a(iM21332a - 6, false);
                i3 += iM21332a;
            }
        }
    }
}
