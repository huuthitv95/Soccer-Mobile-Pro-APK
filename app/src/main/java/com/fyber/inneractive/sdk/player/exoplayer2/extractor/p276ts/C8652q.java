package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8606n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8652q implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8815n f20054a;

    /* JADX INFO: renamed from: b */
    public final C8606n f20055b;

    /* JADX INFO: renamed from: c */
    public final String f20056c;

    /* JADX INFO: renamed from: d */
    public String f20057d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8629r f20058e;

    /* JADX INFO: renamed from: f */
    public int f20059f = 0;

    /* JADX INFO: renamed from: g */
    public int f20060g;

    /* JADX INFO: renamed from: h */
    public boolean f20061h;

    /* JADX INFO: renamed from: i */
    public boolean f20062i;

    /* JADX INFO: renamed from: j */
    public long f20063j;

    /* JADX INFO: renamed from: k */
    public int f20064k;

    /* JADX INFO: renamed from: l */
    public long f20065l;

    public C8652q(String str) {
        C8815n c8815n = new C8815n(4);
        this.f20054a = c8815n;
        c8815n.f20643a[0] = -1;
        this.f20055b = new C8606n();
        this.f20056c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f20059f = 0;
        this.f20060g = 0;
        this.f20062i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f20057d = c8639e0.f19937e;
        c8639e0.m21175b();
        this.f20058e = interfaceC8568j.mo21092a(c8639e0.f19936d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        while (true) {
            int i = c8815n.f20645c;
            int i2 = c8815n.f20644b;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f20059f;
            if (i4 == 0) {
                byte[] bArr = c8815n.f20643a;
                while (true) {
                    if (i2 >= i) {
                        c8815n.m21347e(i);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f20062i && (b & 224) == 224;
                    this.f20062i = z;
                    if (z2) {
                        c8815n.m21347e(i2 + 1);
                        this.f20062i = false;
                        this.f20054a.f20643a[1] = bArr[i2];
                        this.f20060g = 2;
                        this.f20059f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int iMin = Math.min(i3, 4 - this.f20060g);
                c8815n.m21339a(this.f20054a.f20643a, this.f20060g, iMin);
                int i5 = this.f20060g + iMin;
                this.f20060g = i5;
                if (i5 >= 4) {
                    this.f20054a.m21347e(0);
                    if (C8606n.m21146a(this.f20054a.m21340b(), this.f20055b)) {
                        C8606n c8606n = this.f20055b;
                        this.f20064k = c8606n.f19788c;
                        if (!this.f20061h) {
                            long j = ((long) c8606n.f19792g) * 1000000;
                            int i6 = c8606n.f19789d;
                            this.f20063j = j / ((long) i6);
                            this.f20058e.mo21053a(C8708o.m21263a(this.f20057d, c8606n.f19787b, -1, 4096, c8606n.f19790e, i6, null, null, this.f20056c));
                            this.f20061h = true;
                        }
                        this.f20054a.m21347e(0);
                        this.f20058e.mo21049a(4, this.f20054a);
                        this.f20059f = 2;
                    } else {
                        this.f20060g = 0;
                        this.f20059f = 1;
                    }
                }
            } else if (i4 == 2) {
                int iMin2 = Math.min(i3, this.f20064k - this.f20060g);
                this.f20058e.mo21049a(iMin2, c8815n);
                int i7 = this.f20060g + iMin2;
                this.f20060g = i7;
                int i8 = this.f20064k;
                if (i7 >= i8) {
                    this.f20058e.mo21051a(this.f20065l, 1, i8, 0, null);
                    this.f20065l += this.f20063j;
                    this.f20060g = 0;
                    this.f20059f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f20065l = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
