package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC8491a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8632b implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8814m f19877a;

    /* JADX INFO: renamed from: b */
    public final C8815n f19878b;

    /* JADX INFO: renamed from: c */
    public final String f19879c;

    /* JADX INFO: renamed from: d */
    public String f19880d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8629r f19881e;

    /* JADX INFO: renamed from: f */
    public int f19882f = 0;

    /* JADX INFO: renamed from: g */
    public int f19883g;

    /* JADX INFO: renamed from: h */
    public boolean f19884h;

    /* JADX INFO: renamed from: i */
    public long f19885i;

    /* JADX INFO: renamed from: j */
    public C8708o f19886j;

    /* JADX INFO: renamed from: k */
    public int f19887k;

    /* JADX INFO: renamed from: l */
    public long f19888l;

    public C8632b(String str) {
        byte[] bArr = new byte[8];
        this.f19877a = new C8814m(bArr);
        this.f19878b = new C8815n(bArr);
        this.f19879c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f19882f = 0;
        this.f19883g = 0;
        this.f19884h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f19880d = c8639e0.f19937e;
        c8639e0.m21175b();
        this.f19881e = interfaceC8568j.mo21092a(c8639e0.f19936d, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        int iM21332a;
        int i;
        String str;
        int iM21332a2;
        int i2;
        while (true) {
            int i3 = c8815n.f20645c - c8815n.f20644b;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f19882f;
            if (i4 == 0) {
                while (c8815n.f20645c - c8815n.f20644b > 0) {
                    if (this.f19884h) {
                        int iM21352j = c8815n.m21352j();
                        if (iM21352j == 119) {
                            this.f19884h = false;
                            this.f19882f = 1;
                            byte[] bArr = this.f19878b.f20643a;
                            bArr[0] = Ascii.f22503VT;
                            bArr[1] = 119;
                            this.f19883g = 2;
                            break;
                        }
                        this.f19884h = iM21352j == 11;
                    } else {
                        this.f19884h = c8815n.m21352j() == 11;
                    }
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.f19878b.f20643a;
                int iMin = Math.min(i3, 8 - this.f19883g);
                c8815n.m21339a(bArr2, this.f19883g, iMin);
                int i5 = this.f19883g + iMin;
                this.f19883g = i5;
                if (i5 == 8) {
                    this.f19877a.m21334b(0);
                    C8814m c8814m = this.f19877a;
                    int i6 = (c8814m.f20640b * 8) + c8814m.f20641c;
                    c8814m.m21336c(40);
                    Object[] objArr = c8814m.m21332a(5) == 16;
                    c8814m.m21334b(i6);
                    int i7 = 6;
                    if (objArr == true) {
                        c8814m.m21336c(21);
                        iM21332a2 = (c8814m.m21332a(11) + 1) * 2;
                        int iM21332a3 = c8814m.m21332a(2);
                        if (iM21332a3 == 3) {
                            i = AbstractC8491a.f18939c[c8814m.m21332a(2)];
                        } else {
                            i7 = AbstractC8491a.f18937a[c8814m.m21332a(2)];
                            i = AbstractC8491a.f18938b[iM21332a3];
                        }
                        i2 = i7 * 256;
                        iM21332a = c8814m.m21332a(3);
                        str = "audio/eac3";
                    } else {
                        c8814m.m21336c(32);
                        int iM21332a4 = c8814m.m21332a(2);
                        int iM20975a = AbstractC8491a.m20975a(iM21332a4, c8814m.m21332a(6));
                        c8814m.m21336c(8);
                        iM21332a = c8814m.m21332a(3);
                        if ((iM21332a & 1) != 0 && iM21332a != 1) {
                            c8814m.m21336c(2);
                        }
                        if ((iM21332a & 4) != 0) {
                            c8814m.m21336c(2);
                        }
                        if (iM21332a == 2) {
                            c8814m.m21336c(2);
                        }
                        i = AbstractC8491a.f18938b[iM21332a4];
                        str = "audio/ac3";
                        iM21332a2 = iM20975a;
                        i2 = 1536;
                    }
                    int i8 = i;
                    String str2 = str;
                    int i9 = AbstractC8491a.f18940d[iM21332a] + (c8814m.m21335b() ? 1 : 0);
                    C8708o c8708o = this.f19886j;
                    if (c8708o == null || i9 != c8708o.f20307r || i8 != c8708o.f20308s || str2 != c8708o.f20295f) {
                        C8708o c8708oM21263a = C8708o.m21263a(this.f19880d, str2, -1, -1, i9, i8, null, null, this.f19879c);
                        this.f19886j = c8708oM21263a;
                        this.f19881e.mo21053a(c8708oM21263a);
                    }
                    this.f19887k = iM21332a2;
                    this.f19885i = (((long) i2) * 1000000) / ((long) this.f19886j.f20308s);
                    this.f19878b.m21347e(0);
                    this.f19881e.mo21049a(8, this.f19878b);
                    this.f19882f = 2;
                }
            } else if (i4 == 2) {
                int iMin2 = Math.min(i3, this.f19887k - this.f19883g);
                this.f19881e.mo21049a(iMin2, c8815n);
                int i10 = this.f19883g + iMin2;
                this.f19883g = i10;
                int i11 = this.f19887k;
                if (i10 == i11) {
                    this.f19881e.mo21051a(this.f19888l, 1, i11, 0, null);
                    this.f19888l += this.f19885i;
                    this.f19882f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f19888l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
