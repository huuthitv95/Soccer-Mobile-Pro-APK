package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC8510t;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8640f implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8815n f19938a;

    /* JADX INFO: renamed from: b */
    public final String f19939b;

    /* JADX INFO: renamed from: c */
    public String f19940c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8629r f19941d;

    /* JADX INFO: renamed from: e */
    public int f19942e;

    /* JADX INFO: renamed from: f */
    public int f19943f;

    /* JADX INFO: renamed from: g */
    public int f19944g;

    /* JADX INFO: renamed from: h */
    public long f19945h;

    /* JADX INFO: renamed from: i */
    public C8708o f19946i;

    /* JADX INFO: renamed from: j */
    public int f19947j;

    /* JADX INFO: renamed from: k */
    public long f19948k;

    public C8640f(String str) {
        byte[] bArr = new byte[15];
        this.f19938a = new C8815n(bArr);
        bArr[0] = 127;
        bArr[1] = -2;
        bArr[2] = -128;
        bArr[3] = 1;
        this.f19942e = 0;
        this.f19939b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f19942e = 0;
        this.f19943f = 0;
        this.f19944g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f19940c = c8639e0.f19937e;
        c8639e0.m21175b();
        this.f19941d = interfaceC8568j.mo21092a(c8639e0.f19936d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        while (true) {
            int i = c8815n.f20645c - c8815n.f20644b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f19942e;
            if (i2 == 0) {
                while (c8815n.f20645c - c8815n.f20644b > 0) {
                    int i3 = this.f19944g << 8;
                    this.f19944g = i3;
                    int iM21352j = i3 | c8815n.m21352j();
                    this.f19944g = iM21352j;
                    if (iM21352j == 2147385345) {
                        this.f19944g = 0;
                        this.f19943f = 4;
                        this.f19942e = 1;
                        break;
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr = this.f19938a.f20643a;
                int iMin = Math.min(i, 15 - this.f19943f);
                c8815n.m21339a(bArr, this.f19943f, iMin);
                int i4 = this.f19943f + iMin;
                this.f19943f = i4;
                if (i4 == 15) {
                    byte[] bArr2 = this.f19938a.f20643a;
                    if (this.f19946i == null) {
                        String str = this.f19940c;
                        String str2 = this.f19939b;
                        C8814m c8814m = new C8814m(bArr2);
                        c8814m.m21336c(60);
                        int i5 = AbstractC8510t.f19041a[c8814m.m21332a(6)];
                        int i6 = AbstractC8510t.f19042b[c8814m.m21332a(4)];
                        int iM21332a = c8814m.m21332a(5);
                        int i7 = iM21332a >= 29 ? -1 : (AbstractC8510t.f19043c[iM21332a] * 1000) / 2;
                        c8814m.m21336c(10);
                        C8708o c8708oM21263a = C8708o.m21263a(str, "audio/vnd.dts", i7, -1, i5 + (c8814m.m21332a(2) > 0 ? 1 : 0), i6, null, null, str2);
                        this.f19946i = c8708oM21263a;
                        this.f19941d.mo21053a(c8708oM21263a);
                    }
                    byte b = bArr2[5];
                    this.f19947j = (((b & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f19945h = (int) ((((long) (((((bArr2[4] & 1) << 6) | ((b & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f19946i.f20308s));
                    this.f19938a.m21347e(0);
                    this.f19941d.mo21049a(15, this.f19938a);
                    this.f19942e = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(i, this.f19947j - this.f19943f);
                this.f19941d.mo21049a(iMin2, c8815n);
                int i8 = this.f19943f + iMin2;
                this.f19943f = i8;
                int i9 = this.f19947j;
                if (i8 == i9) {
                    this.f19941d.mo21051a(this.f19948k, 1, i9, 0, null);
                    this.f19948k += this.f19945h;
                    this.f19942e = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f19948k = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
