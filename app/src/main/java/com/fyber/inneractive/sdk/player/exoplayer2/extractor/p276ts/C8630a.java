package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC8491a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8630a implements InterfaceC8567i {

    /* JADX INFO: renamed from: e */
    public static final int f19867e = AbstractC8827z.m21379a("ID3");

    /* JADX INFO: renamed from: a */
    public final long f19868a;

    /* JADX INFO: renamed from: b */
    public final C8815n f19869b = new C8815n(2786);

    /* JADX INFO: renamed from: c */
    public C8632b f19870c;

    /* JADX INFO: renamed from: d */
    public boolean f19871d;

    public C8630a(long j) {
        this.f19868a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, EOFException {
        int iMin;
        C8527b c8527b2;
        byte[] bArr = this.f19869b.f20643a;
        int i = c8527b.f19127f;
        if (i == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i, 2786);
            System.arraycopy(c8527b.f19125d, 0, bArr, 0, iMin);
            c8527b.m21026b(iMin);
        }
        if (iMin == 0) {
            c8527b2 = c8527b;
            iMin = c8527b2.m21022a(bArr, 0, 2786, 0, true);
        } else {
            c8527b2 = c8527b;
        }
        if (iMin != -1) {
            c8527b2.f19124c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f19869b.m21347e(0);
        this.f19869b.m21345d(iMin);
        if (!this.f19871d) {
            this.f19870c.f19888l = this.f19868a;
            this.f19871d = true;
        }
        this.f19870c.mo21167a(this.f19869b);
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f19871d = false;
        this.f19870c.mo21165a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        C8632b c8632b = new C8632b(null);
        this.f19870c = c8632b;
        c8632b.f19880d = "0";
        c8632b.f19881e = interfaceC8568j.mo21092a(0, 1);
        interfaceC8568j.mo21096b();
        interfaceC8568j.mo21093a(new C8627p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        int iM20975a;
        C8815n c8815n = new C8815n(10);
        int i = 0;
        while (true) {
            c8527b.m21025a(c8815n.f20643a, 0, 10, false);
            c8815n.m21347e(0);
            if (c8815n.m21354l() != f19867e) {
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
        int i3 = i;
        while (true) {
            c8527b.m21025a(c8815n.f20643a, 0, 5, false);
            c8815n.m21347e(0);
            if (c8815n.m21357o() != 2935) {
                c8527b.f19126e = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                c8527b.m21024a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c8815n.f20643a;
                if (bArr.length < 5) {
                    iM20975a = -1;
                } else {
                    byte b = bArr[4];
                    iM20975a = AbstractC8491a.m20975a((b & 192) >> 6, b & 63);
                }
                if (iM20975a == -1) {
                    return false;
                }
                c8527b.m21024a(iM20975a - 5, false);
            }
        }
    }
}
