package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8539h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8805d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8636d implements InterfaceC8643h {

    /* JADX INFO: renamed from: r */
    public static final byte[] f19910r = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f19911a;

    /* JADX INFO: renamed from: d */
    public final String f19914d;

    /* JADX INFO: renamed from: e */
    public String f19915e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8629r f19916f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8629r f19917g;

    /* JADX INFO: renamed from: k */
    public boolean f19921k;

    /* JADX INFO: renamed from: l */
    public boolean f19922l;

    /* JADX INFO: renamed from: m */
    public long f19923m;

    /* JADX INFO: renamed from: n */
    public int f19924n;

    /* JADX INFO: renamed from: o */
    public long f19925o;

    /* JADX INFO: renamed from: p */
    public InterfaceC8629r f19926p;

    /* JADX INFO: renamed from: q */
    public long f19927q;

    /* JADX INFO: renamed from: b */
    public final C8814m f19912b = new C8814m(new byte[7]);

    /* JADX INFO: renamed from: c */
    public final C8815n f19913c = new C8815n(Arrays.copyOf(f19910r, 10));

    /* JADX INFO: renamed from: h */
    public int f19918h = 0;

    /* JADX INFO: renamed from: i */
    public int f19919i = 0;

    /* JADX INFO: renamed from: j */
    public int f19920j = 256;

    public C8636d(boolean z, String str) {
        this.f19911a = z;
        this.f19914d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        this.f19918h = 0;
        this.f19919i = 0;
        this.f19920j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f19915e = c8639e0.f19937e;
        c8639e0.m21175b();
        this.f19916f = interfaceC8568j.mo21092a(c8639e0.f19936d, 1);
        if (!this.f19911a) {
            this.f19917g = new C8539h();
            return;
        }
        c8639e0.m21174a();
        c8639e0.m21175b();
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 4);
        this.f19917g = c8538gMo21092a;
        c8639e0.m21175b();
        c8538gMo21092a.mo21053a(C8708o.m21266a(c8639e0.f19937e, "application/id3", (C8524d) null));
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
            int i4 = this.f19918h;
            if (i4 == 0) {
                byte[] bArr = c8815n.f20643a;
                while (true) {
                    if (i2 >= i) {
                        c8815n.m21347e(i2);
                        break;
                    }
                    int i5 = i2 + 1;
                    byte b = bArr[i2];
                    int i6 = b & 255;
                    int i7 = this.f19920j;
                    if (i7 == 512 && i6 >= 240 && i6 != 255) {
                        this.f19921k = (b & 1) == 0;
                        this.f19918h = 2;
                        this.f19919i = 0;
                        c8815n.m21347e(i5);
                        break;
                    }
                    int i8 = i7 | i6;
                    if (i8 == 329) {
                        this.f19920j = ViewUtils.EDGE_TO_EDGE_FLAGS;
                    } else if (i8 == 511) {
                        this.f19920j = 512;
                    } else if (i8 == 836) {
                        this.f19920j = 1024;
                    } else {
                        if (i8 == 1075) {
                            this.f19918h = 1;
                            this.f19919i = 3;
                            this.f19924n = 0;
                            this.f19913c.m21347e(0);
                            c8815n.m21347e(i5);
                            break;
                        }
                        if (i7 != 256) {
                            this.f19920j = 256;
                        }
                    }
                    i2 = i5;
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.f19913c.f20643a;
                int iMin = Math.min(i3, 10 - this.f19919i);
                c8815n.m21339a(bArr2, this.f19919i, iMin);
                int i9 = this.f19919i + iMin;
                this.f19919i = i9;
                if (i9 == 10) {
                    this.f19917g.mo21049a(10, this.f19913c);
                    this.f19913c.m21347e(6);
                    InterfaceC8629r interfaceC8629r = this.f19917g;
                    int iM21351i = this.f19913c.m21351i() + 10;
                    this.f19918h = 3;
                    this.f19919i = 10;
                    this.f19926p = interfaceC8629r;
                    this.f19927q = 0L;
                    this.f19924n = iM21351i;
                }
            } else if (i4 == 2) {
                int i10 = this.f19921k ? 7 : 5;
                byte[] bArr3 = this.f19912b.f20639a;
                int iMin2 = Math.min(i3, i10 - this.f19919i);
                c8815n.m21339a(bArr3, this.f19919i, iMin2);
                int i11 = this.f19919i + iMin2;
                this.f19919i = i11;
                if (i11 == i10) {
                    this.f19912b.m21334b(0);
                    if (this.f19922l) {
                        this.f19912b.m21336c(10);
                    } else {
                        int iM21332a = this.f19912b.m21332a(2) + 1;
                        if (iM21332a != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iM21332a + ", but assuming AAC LC.");
                            iM21332a = 2;
                        }
                        int iM21332a2 = this.f19912b.m21332a(4);
                        this.f19912b.m21336c(1);
                        byte[] bArr4 = {(byte) (((iM21332a << 3) & 248) | ((iM21332a2 >> 1) & 7)), (byte) (((iM21332a2 << 7) & 128) | ((this.f19912b.m21332a(3) << 3) & 120))};
                        Pair pairM21322a = AbstractC8805d.m21322a(bArr4);
                        C8708o c8708oM21263a = C8708o.m21263a(this.f19915e, "audio/mp4a-latm", -1, -1, ((Integer) pairM21322a.second).intValue(), ((Integer) pairM21322a.first).intValue(), Collections.singletonList(bArr4), null, this.f19914d);
                        this.f19923m = 1024000000 / ((long) c8708oM21263a.f20308s);
                        this.f19916f.mo21053a(c8708oM21263a);
                        this.f19922l = true;
                    }
                    this.f19912b.m21336c(4);
                    int iM21332a3 = this.f19912b.m21332a(13);
                    int i12 = iM21332a3 - 7;
                    if (this.f19921k) {
                        i12 = iM21332a3 - 9;
                    }
                    InterfaceC8629r interfaceC8629r2 = this.f19916f;
                    long j = this.f19923m;
                    this.f19918h = 3;
                    this.f19919i = 0;
                    this.f19926p = interfaceC8629r2;
                    this.f19927q = j;
                    this.f19924n = i12;
                }
            } else if (i4 == 3) {
                int iMin3 = Math.min(i3, this.f19924n - this.f19919i);
                this.f19926p.mo21049a(iMin3, c8815n);
                int i13 = this.f19919i + iMin3;
                this.f19919i = i13;
                int i14 = this.f19924n;
                if (i13 == i14) {
                    this.f19926p.mo21051a(this.f19925o, 1, i14, 0, null);
                    this.f19925o += this.f19927q;
                    this.f19918h = 0;
                    this.f19919i = 0;
                    this.f19920j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f19925o = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
