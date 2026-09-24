package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8654s implements InterfaceC8641f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8643h f20071a;

    /* JADX INFO: renamed from: b */
    public final C8814m f20072b = new C8814m(new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f20073c = 0;

    /* JADX INFO: renamed from: d */
    public int f20074d;

    /* JADX INFO: renamed from: e */
    public C8823v f20075e;

    /* JADX INFO: renamed from: f */
    public boolean f20076f;

    /* JADX INFO: renamed from: g */
    public boolean f20077g;

    /* JADX INFO: renamed from: h */
    public boolean f20078h;

    /* JADX INFO: renamed from: i */
    public int f20079i;

    /* JADX INFO: renamed from: j */
    public int f20080j;

    /* JADX INFO: renamed from: k */
    public boolean f20081k;

    /* JADX INFO: renamed from: l */
    public long f20082l;

    public C8654s(InterfaceC8643h interfaceC8643h) {
        this.f20071a = interfaceC8643h;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21176a() {
        this.f20073c = 0;
        this.f20074d = 0;
        this.f20078h = false;
        this.f20071a.mo21165a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21177a(C8815n c8815n, boolean z) {
        int i;
        if (z) {
            int i2 = this.f20073c;
            if (i2 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i2 == 3) {
                if (this.f20080j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f20080j + " more bytes");
                }
                this.f20071a.mo21169b();
            }
            this.f20073c = 1;
            this.f20074d = 0;
        }
        while (true) {
            int i3 = c8815n.f20645c;
            int i4 = c8815n.f20644b;
            int i5 = i3 - i4;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.f20073c;
            if (i6 == 0) {
                c8815n.m21347e(i5 + i4);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    if (m21184a(c8815n, this.f20072b.f20639a, Math.min(10, this.f20079i)) && m21184a(c8815n, (byte[]) null, this.f20079i)) {
                        this.f20072b.m21334b(0);
                        this.f20082l = -9223372036854775807L;
                        if (this.f20076f) {
                            this.f20072b.m21336c(4);
                            long jM21332a = ((long) this.f20072b.m21332a(3)) << 30;
                            this.f20072b.m21336c(1);
                            long jM21332a2 = jM21332a | ((long) (this.f20072b.m21332a(15) << 15));
                            this.f20072b.m21336c(1);
                            long jM21332a3 = jM21332a2 | ((long) this.f20072b.m21332a(15));
                            this.f20072b.m21336c(1);
                            if (!this.f20078h && this.f20077g) {
                                this.f20072b.m21336c(4);
                                long jM21332a4 = ((long) this.f20072b.m21332a(3)) << 30;
                                this.f20072b.m21336c(1);
                                long jM21332a5 = jM21332a4 | ((long) (this.f20072b.m21332a(15) << 15));
                                this.f20072b.m21336c(1);
                                long jM21332a6 = jM21332a5 | ((long) this.f20072b.m21332a(15));
                                this.f20072b.m21336c(1);
                                this.f20075e.m21371b(jM21332a6);
                                this.f20078h = true;
                            }
                            this.f20082l = this.f20075e.m21371b(jM21332a3);
                        }
                        this.f20071a.mo21168a(this.f20081k, this.f20082l);
                        this.f20073c = 3;
                        this.f20074d = 0;
                    }
                } else if (i6 == 3) {
                    int i7 = this.f20080j;
                    int i8 = i7 == -1 ? 0 : i5 - i7;
                    if (i8 > 0) {
                        i5 -= i8;
                        c8815n.m21345d(i4 + i5);
                    }
                    this.f20071a.mo21167a(c8815n);
                    int i9 = this.f20080j;
                    if (i9 != -1) {
                        int i10 = i9 - i5;
                        this.f20080j = i10;
                        if (i10 == 0) {
                            this.f20071a.mo21169b();
                            this.f20073c = 1;
                            this.f20074d = 0;
                        }
                    }
                }
            } else if (m21184a(c8815n, this.f20072b.f20639a, 9)) {
                this.f20072b.m21334b(0);
                int iM21332a = this.f20072b.m21332a(24);
                if (iM21332a != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iM21332a);
                    this.f20080j = -1;
                    i = 0;
                } else {
                    this.f20072b.m21336c(8);
                    int iM21332a2 = this.f20072b.m21332a(16);
                    this.f20072b.m21336c(5);
                    this.f20081k = this.f20072b.m21335b();
                    this.f20072b.m21336c(2);
                    this.f20076f = this.f20072b.m21335b();
                    this.f20077g = this.f20072b.m21335b();
                    this.f20072b.m21336c(6);
                    int iM21332a3 = this.f20072b.m21332a(8);
                    this.f20079i = iM21332a3;
                    if (iM21332a2 == 0) {
                        this.f20080j = -1;
                    } else {
                        this.f20080j = (iM21332a2 - 3) - iM21332a3;
                    }
                    i = 2;
                }
                this.f20073c = i;
                this.f20074d = 0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8641f0
    /* JADX INFO: renamed from: a */
    public final void mo21178a(C8823v c8823v, InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        this.f20075e = c8823v;
        this.f20071a.mo21166a(interfaceC8568j, c8639e0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21184a(C8815n c8815n, byte[] bArr, int i) {
        int iMin = Math.min(c8815n.f20645c - c8815n.f20644b, i - this.f20074d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c8815n.m21347e(c8815n.f20644b + iMin);
        } else {
            c8815n.m21339a(bArr, this.f20074d, iMin);
        }
        int i2 = this.f20074d + iMin;
        this.f20074d = i2;
        return i2 == i;
    }
}
