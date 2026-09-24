package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8530e {

    /* JADX INFO: renamed from: i */
    public int f19141i;

    /* JADX INFO: renamed from: j */
    public int f19142j;

    /* JADX INFO: renamed from: k */
    public int f19143k;

    /* JADX INFO: renamed from: l */
    public int f19144l;

    /* JADX INFO: renamed from: q */
    public C8708o f19149q;

    /* JADX INFO: renamed from: r */
    public int f19150r;

    /* JADX INFO: renamed from: a */
    public int f19133a = 1000;

    /* JADX INFO: renamed from: b */
    public int[] f19134b = new int[1000];

    /* JADX INFO: renamed from: c */
    public long[] f19135c = new long[1000];

    /* JADX INFO: renamed from: f */
    public long[] f19138f = new long[1000];

    /* JADX INFO: renamed from: e */
    public int[] f19137e = new int[1000];

    /* JADX INFO: renamed from: d */
    public int[] f19136d = new int[1000];

    /* JADX INFO: renamed from: g */
    public byte[][] f19139g = new byte[1000][];

    /* JADX INFO: renamed from: h */
    public C8708o[] f19140h = new C8708o[1000];

    /* JADX INFO: renamed from: m */
    public long f19145m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public long f19146n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public boolean f19148p = true;

    /* JADX INFO: renamed from: o */
    public boolean f19147o = true;

    /* JADX INFO: renamed from: a */
    public final synchronized void m21029a(long j, int i, long j2, int i2, byte[] bArr) {
        if (this.f19147o) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f19147o = false;
            }
        }
        if (this.f19148p) {
            throw new IllegalStateException();
        }
        m21031b(j);
        long[] jArr = this.f19138f;
        int i3 = this.f19144l;
        jArr[i3] = j;
        long[] jArr2 = this.f19135c;
        jArr2[i3] = j2;
        this.f19136d[i3] = i2;
        this.f19137e[i3] = i;
        this.f19139g[i3] = bArr;
        this.f19140h[i3] = this.f19149q;
        this.f19134b[i3] = this.f19150r;
        int i4 = this.f19141i + 1;
        this.f19141i = i4;
        int i5 = this.f19133a;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr3 = new long[i6];
            long[] jArr4 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            byte[][] bArr2 = new byte[i6][];
            C8708o[] c8708oArr = new C8708o[i6];
            int i7 = this.f19143k;
            int i8 = i5 - i7;
            System.arraycopy(jArr2, i7, jArr3, 0, i8);
            System.arraycopy(this.f19138f, this.f19143k, jArr4, 0, i8);
            System.arraycopy(this.f19137e, this.f19143k, iArr2, 0, i8);
            System.arraycopy(this.f19136d, this.f19143k, iArr3, 0, i8);
            System.arraycopy(this.f19139g, this.f19143k, bArr2, 0, i8);
            System.arraycopy(this.f19140h, this.f19143k, c8708oArr, 0, i8);
            System.arraycopy(this.f19134b, this.f19143k, iArr, 0, i8);
            int i9 = this.f19143k;
            System.arraycopy(this.f19135c, 0, jArr3, i8, i9);
            System.arraycopy(this.f19138f, 0, jArr4, i8, i9);
            System.arraycopy(this.f19137e, 0, iArr2, i8, i9);
            System.arraycopy(this.f19136d, 0, iArr3, i8, i9);
            System.arraycopy(this.f19139g, 0, bArr2, i8, i9);
            System.arraycopy(this.f19140h, 0, c8708oArr, i8, i9);
            System.arraycopy(this.f19134b, 0, iArr, i8, i9);
            this.f19135c = jArr3;
            this.f19138f = jArr4;
            this.f19137e = iArr2;
            this.f19136d = iArr3;
            this.f19139g = bArr2;
            this.f19140h = c8708oArr;
            this.f19134b = iArr;
            this.f19143k = 0;
            int i10 = this.f19133a;
            this.f19144l = i10;
            this.f19141i = i10;
            this.f19133a = i6;
        } else {
            int i11 = i3 + 1;
            this.f19144l = i11;
            if (i11 == i5) {
                this.f19144l = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m21030a(long j) {
        if (this.f19145m >= j) {
            return false;
        }
        int i = this.f19141i;
        while (i > 0 && this.f19138f[((this.f19143k + i) - 1) % this.f19133a] >= j) {
            i--;
        }
        int i2 = this.f19142j;
        int i3 = this.f19141i;
        int i4 = (i2 + i3) - (i + i2);
        if (i4 < 0 || i4 > i3) {
            throw new IllegalArgumentException();
        }
        if (i4 != 0) {
            int i5 = i3 - i4;
            this.f19141i = i5;
            int i6 = this.f19144l;
            int i7 = this.f19133a;
            this.f19144l = ((i6 + i7) - i4) % i7;
            this.f19146n = Long.MIN_VALUE;
            for (int i8 = i5 - 1; i8 >= 0; i8--) {
                int i9 = (this.f19143k + i8) % this.f19133a;
                this.f19146n = Math.max(this.f19146n, this.f19138f[i9]);
                if ((this.f19137e[i9] & 1) != 0) {
                    break;
                }
            }
            long j2 = this.f19135c[this.f19144l];
        } else if (i2 != 0) {
            int i10 = this.f19144l;
            if (i10 == 0) {
                i10 = this.f19133a;
            }
            int i11 = i10 - 1;
            long j3 = this.f19135c[i11];
            int i12 = this.f19136d[i11];
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m21031b(long j) {
        this.f19146n = Math.max(this.f19146n, j);
    }
}
