package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8709p;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8519b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8520c;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8758a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8787l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.g */
/* JADX INFO: loaded from: classes9.dex */
public final class C8538g implements InterfaceC8629r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8760b f19176a;

    /* JADX INFO: renamed from: b */
    public final int f19177b;

    /* JADX INFO: renamed from: c */
    public final C8530e f19178c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingDeque f19179d;

    /* JADX INFO: renamed from: e */
    public final C8529d f19180e;

    /* JADX INFO: renamed from: f */
    public final C8815n f19181f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f19182g;

    /* JADX INFO: renamed from: h */
    public long f19183h;

    /* JADX INFO: renamed from: i */
    public C8708o f19184i;

    /* JADX INFO: renamed from: j */
    public long f19185j;

    /* JADX INFO: renamed from: k */
    public C8758a f19186k;

    /* JADX INFO: renamed from: l */
    public int f19187l;

    /* JADX INFO: renamed from: m */
    public boolean f19188m;

    /* JADX INFO: renamed from: n */
    public InterfaceC8531f f19189n;

    public C8538g(InterfaceC8760b interfaceC8760b) {
        this.f19176a = interfaceC8760b;
        ((C8787l) interfaceC8760b).getClass();
        this.f19177b = 65536;
        this.f19178c = new C8530e();
        this.f19179d = new LinkedBlockingDeque();
        this.f19180e = new C8529d();
        this.f19181f = new C8815n(32);
        this.f19182g = new AtomicInteger();
        this.f19187l = 65536;
    }

    /* JADX INFO: renamed from: a */
    public final int m21045a(int i) {
        C8758a c8758a;
        if (this.f19187l == this.f19177b) {
            this.f19187l = 0;
            C8787l c8787l = (C8787l) this.f19176a;
            synchronized (c8787l) {
                c8787l.f20553c++;
                int i2 = c8787l.f20554d;
                if (i2 > 0) {
                    C8758a[] c8758aArr = c8787l.f20555e;
                    int i3 = i2 - 1;
                    c8787l.f20554d = i3;
                    c8758a = c8758aArr[i3];
                    c8758aArr[i3] = null;
                } else {
                    c8758a = new C8758a(0, new byte[65536]);
                }
            }
            this.f19186k = c8758a;
            this.f19179d.add(c8758a);
        }
        return Math.min(i, this.f19177b - this.f19187l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final int mo21046a(C8527b c8527b, int i, boolean z) throws InterruptedException, EOFException {
        C8527b c8527b2;
        int iM21022a = 0;
        if (!this.f19182g.compareAndSet(0, 1)) {
            int iMin = Math.min(c8527b.f19127f, i);
            c8527b.m21026b(iMin);
            if (iMin == 0) {
                iMin = c8527b.m21022a(C8527b.f19121g, 0, Math.min(i, 4096), 0, true);
            }
            if (iMin != -1) {
                c8527b.f19124c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iM21045a = m21045a(i);
            C8758a c8758a = this.f19186k;
            byte[] bArr = c8758a.f20450a;
            int i2 = c8758a.f20451b + this.f19187l;
            int i3 = c8527b.f19127f;
            if (i3 != 0) {
                int iMin2 = Math.min(i3, iM21045a);
                System.arraycopy(c8527b.f19125d, 0, bArr, i2, iMin2);
                c8527b.m21026b(iMin2);
                iM21022a = iMin2;
            }
            if (iM21022a == 0) {
                c8527b2 = c8527b;
                iM21022a = c8527b.m21022a(bArr, i2, iM21045a, 0, true);
            } else {
                c8527b2 = c8527b;
            }
            if (iM21022a != -1) {
                c8527b2.f19124c += (long) iM21022a;
            }
            if (iM21022a == -1) {
                if (!z) {
                    throw new EOFException();
                }
                m21057c();
                return -1;
            }
            this.f19187l += iM21022a;
            this.f19185j += (long) iM21022a;
            m21057c();
            return iM21022a;
        } catch (Throwable th) {
            m21057c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m21047a(C8709p c8709p, C8520c c8520c, boolean z, boolean z2, long j) {
        int i;
        byte b;
        int iM21357o;
        C8530e c8530e = this.f19178c;
        C8708o c8708o = this.f19184i;
        C8529d c8529d = this.f19180e;
        synchronized (c8530e) {
            if (c8530e.f19141i == 0) {
                if (z2) {
                    c8520c.f19102a = 4;
                    b = -4;
                } else {
                    C8708o c8708o2 = c8530e.f19149q;
                    if (c8708o2 != null && (z || c8708o2 != c8708o)) {
                        c8709p.f20316a = c8708o2;
                        b = -5;
                    }
                }
                i = 1;
            } else if (z) {
                i = 1;
                c8709p.f20316a = c8530e.f19140h[c8530e.f19143k];
                b = -5;
            } else {
                C8708o[] c8708oArr = c8530e.f19140h;
                int i2 = c8530e.f19143k;
                if (c8708oArr[i2] != c8708o) {
                    i = 1;
                    c8709p.f20316a = c8530e.f19140h[c8530e.f19143k];
                    b = -5;
                } else if (c8520c.f19104c != null || c8520c.f19106e != 0) {
                    long j2 = c8530e.f19138f[i2];
                    c8520c.f19105d = j2;
                    c8520c.f19102a = c8530e.f19137e[i2];
                    c8529d.f19129a = c8530e.f19136d[i2];
                    i = 1;
                    c8529d.f19130b = c8530e.f19135c[i2];
                    c8529d.f19132d = c8530e.f19139g[i2];
                    c8530e.f19145m = Math.max(c8530e.f19145m, j2);
                    int i3 = c8530e.f19141i - 1;
                    c8530e.f19141i = i3;
                    int i4 = c8530e.f19143k + 1;
                    c8530e.f19143k = i4;
                    c8530e.f19142j++;
                    if (i4 == c8530e.f19133a) {
                        c8530e.f19143k = 0;
                    }
                    c8529d.f19131c = i3 > 0 ? c8530e.f19135c[c8530e.f19143k] : c8529d.f19130b + ((long) c8529d.f19129a);
                    b = -4;
                }
            }
            b = -3;
            i = 1;
        }
        if (b == -5) {
            this.f19184i = c8709p.f20316a;
            return -5;
        }
        if (b != -4) {
            if (b == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!c8520c.m21018b(4)) {
            if (c8520c.f19105d < j) {
                c8520c.f19102a = Integer.MIN_VALUE | c8520c.f19102a;
            }
            if (c8520c.m21018b(1073741824)) {
                C8529d c8529d2 = this.f19180e;
                long j3 = c8529d2.f19130b;
                int i5 = i;
                this.f19181f.m21343c(i5);
                m21052a(j3, this.f19181f.f20643a, i5);
                long j4 = j3 + 1;
                byte b2 = this.f19181f.f20643a[0];
                int i6 = (b2 & 128) != 0 ? i5 : 0;
                int i7 = b2 & 127;
                C8519b c8519b = c8520c.f19103b;
                if (c8519b.f19097a == null) {
                    c8519b.f19097a = new byte[16];
                }
                m21052a(j4, c8519b.f19097a, i7);
                long j5 = j4 + ((long) i7);
                if (i6 != 0) {
                    this.f19181f.m21343c(2);
                    m21052a(j5, this.f19181f.f20643a, 2);
                    j5 += 2;
                    iM21357o = this.f19181f.m21357o();
                } else {
                    iM21357o = i5;
                }
                C8519b c8519b2 = c8520c.f19103b;
                int[] iArr = c8519b2.f19098b;
                if (iArr == null || iArr.length < iM21357o) {
                    iArr = new int[iM21357o];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = c8519b2.f19099c;
                if (iArr3 == null || iArr3.length < iM21357o) {
                    iArr3 = new int[iM21357o];
                }
                int[] iArr4 = iArr3;
                if (i6 != 0) {
                    int i8 = iM21357o * 6;
                    this.f19181f.m21343c(i8);
                    m21052a(j5, this.f19181f.f20643a, i8);
                    j5 += (long) i8;
                    this.f19181f.m21347e(0);
                    for (int i9 = 0; i9 < iM21357o; i9++) {
                        iArr2[i9] = this.f19181f.m21357o();
                        iArr4[i9] = this.f19181f.m21355m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = c8529d2.f19129a - ((int) (j5 - c8529d2.f19130b));
                }
                C8519b c8519b3 = c8520c.f19103b;
                c8519b3.m21015a(iM21357o, iArr2, iArr4, c8529d2.f19132d, c8519b3.f19097a);
                long j6 = c8529d2.f19130b;
                int i10 = (int) (j5 - j6);
                c8529d2.f19130b = j6 + ((long) i10);
                c8529d2.f19129a -= i10;
            }
            int i11 = this.f19180e.f19129a;
            ByteBuffer byteBuffer = c8520c.f19104c;
            if (byteBuffer == null) {
                c8520c.f19104c = c8520c.m21016a(i11);
            } else {
                int iCapacity = byteBuffer.capacity();
                int iPosition = c8520c.f19104c.position();
                int i12 = i11 + iPosition;
                if (iCapacity < i12) {
                    ByteBuffer byteBufferM21016a = c8520c.m21016a(i12);
                    if (iPosition > 0) {
                        c8520c.f19104c.position(0);
                        c8520c.f19104c.limit(iPosition);
                        byteBufferM21016a.put(c8520c.f19104c);
                    }
                    c8520c.f19104c = byteBufferM21016a;
                }
            }
            C8529d c8529d3 = this.f19180e;
            long j7 = c8529d3.f19130b;
            ByteBuffer byteBuffer2 = c8520c.f19104c;
            int i13 = c8529d3.f19129a;
            while (i13 > 0) {
                m21050a(j7);
                int i14 = (int) (j7 - this.f19183h);
                int iMin = Math.min(i13, this.f19177b - i14);
                C8758a c8758a = (C8758a) this.f19179d.peek();
                byteBuffer2.put(c8758a.f20450a, c8758a.f20451b + i14, iMin);
                j7 += (long) iMin;
                i13 -= iMin;
            }
            m21050a(this.f19180e.f19131c);
        }
        return -4;
    }

    /* JADX INFO: renamed from: a */
    public final void m21048a() {
        C8530e c8530e = this.f19178c;
        c8530e.f19142j = 0;
        c8530e.f19143k = 0;
        c8530e.f19144l = 0;
        c8530e.f19141i = 0;
        c8530e.f19147o = true;
        InterfaceC8760b interfaceC8760b = this.f19176a;
        LinkedBlockingDeque linkedBlockingDeque = this.f19179d;
        ((C8787l) interfaceC8760b).m21309a((C8758a[]) linkedBlockingDeque.toArray(new C8758a[linkedBlockingDeque.size()]));
        this.f19179d.clear();
        ((C8787l) this.f19176a).m21307a();
        this.f19183h = 0L;
        this.f19185j = 0L;
        this.f19186k = null;
        this.f19187l = this.f19177b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21049a(int i, C8815n c8815n) {
        if (!this.f19182g.compareAndSet(0, 1)) {
            c8815n.m21347e(c8815n.f20644b + i);
            return;
        }
        while (i > 0) {
            int iM21045a = m21045a(i);
            C8758a c8758a = this.f19186k;
            c8815n.m21339a(c8758a.f20450a, c8758a.f20451b + this.f19187l, iM21045a);
            this.f19187l += iM21045a;
            this.f19185j += (long) iM21045a;
            i -= iM21045a;
        }
        m21057c();
    }

    /* JADX INFO: renamed from: a */
    public final void m21050a(long j) {
        int i = ((int) (j - this.f19183h)) / this.f19177b;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC8760b interfaceC8760b = this.f19176a;
            C8758a c8758a = (C8758a) this.f19179d.remove();
            C8787l c8787l = (C8787l) interfaceC8760b;
            synchronized (c8787l) {
                C8758a[] c8758aArr = c8787l.f20551a;
                c8758aArr[0] = c8758a;
                c8787l.m21309a(c8758aArr);
            }
            this.f19183h += (long) this.f19177b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21051a(long j, int i, int i2, int i3, byte[] bArr) {
        if (!this.f19182g.compareAndSet(0, 1)) {
            C8530e c8530e = this.f19178c;
            synchronized (c8530e) {
                c8530e.f19146n = Math.max(c8530e.f19146n, j);
            }
            return;
        }
        try {
            if (this.f19188m) {
                if ((i & 1) != 0 && this.f19178c.m21030a(j)) {
                    this.f19188m = false;
                }
                return;
            }
            this.f19178c.m21029a(j, i, (this.f19185j - ((long) i2)) - ((long) i3), i2, bArr);
        } finally {
            m21057c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21052a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m21050a(j);
            int i3 = (int) (j - this.f19183h);
            int iMin = Math.min(i - i2, this.f19177b - i3);
            C8758a c8758a = (C8758a) this.f19179d.peek();
            System.arraycopy(c8758a.f20450a, c8758a.f20451b + i3, bArr, i2, iMin);
            j += (long) iMin;
            i2 += iMin;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r
    /* JADX INFO: renamed from: a */
    public final void mo21053a(C8708o c8708o) {
        boolean z;
        if (c8708o == null) {
            c8708o = null;
        }
        C8530e c8530e = this.f19178c;
        synchronized (c8530e) {
            z = true;
            try {
                if (c8708o == null) {
                    c8530e.f19148p = true;
                } else {
                    c8530e.f19148p = false;
                    C8708o c8708o2 = c8530e.f19149q;
                    int i = AbstractC8827z.f20671a;
                    if (!c8708o.equals(c8708o2)) {
                        c8530e.f19149q = c8708o;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC8531f interfaceC8531f = this.f19189n;
        if (interfaceC8531f == null || !z) {
            return;
        }
        interfaceC8531f.mo21032e();
    }

    /* JADX INFO: renamed from: a */
    public final void m21054a(boolean z) {
        int andSet = this.f19182g.getAndSet(z ? 0 : 2);
        m21048a();
        C8530e c8530e = this.f19178c;
        c8530e.f19145m = Long.MIN_VALUE;
        c8530e.f19146n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f19184i = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21055a(boolean z, long j) {
        long j2;
        C8530e c8530e = this.f19178c;
        synchronized (c8530e) {
            if (c8530e.f19141i != 0) {
                long[] jArr = c8530e.f19138f;
                int i = c8530e.f19143k;
                if (j < jArr[i]) {
                    j2 = -1;
                } else {
                    if (j <= c8530e.f19146n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (i != c8530e.f19144l && c8530e.f19138f[i] <= j) {
                            if ((c8530e.f19137e[i] & 1) != 0) {
                                i2 = i3;
                            }
                            i = (i + 1) % c8530e.f19133a;
                            i3++;
                        }
                        if (i2 != -1) {
                            int i4 = (c8530e.f19143k + i2) % c8530e.f19133a;
                            c8530e.f19143k = i4;
                            c8530e.f19142j += i2;
                            c8530e.f19141i -= i2;
                            j2 = c8530e.f19135c[i4];
                        }
                    }
                    j2 = -1;
                }
            } else {
                j2 = -1;
            }
        }
        if (j2 == -1) {
            return false;
        }
        m21050a(j2);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m21056b() {
        if (this.f19182g.getAndSet(2) == 0) {
            m21048a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21057c() {
        if (this.f19182g.compareAndSet(1, 0)) {
            return;
        }
        m21048a();
    }

    /* JADX INFO: renamed from: d */
    public final long m21058d() {
        long jMax;
        C8530e c8530e = this.f19178c;
        synchronized (c8530e) {
            jMax = Math.max(c8530e.f19145m, c8530e.f19146n);
        }
        return jMax;
    }

    /* JADX INFO: renamed from: e */
    public final C8708o m21059e() {
        C8708o c8708o;
        C8530e c8530e = this.f19178c;
        synchronized (c8530e) {
            c8708o = c8530e.f19148p ? null : c8530e.f19149q;
        }
        return c8708o;
    }

    /* JADX INFO: renamed from: f */
    public final void m21060f() {
        long j;
        C8530e c8530e = this.f19178c;
        synchronized (c8530e) {
            int i = c8530e.f19141i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = c8530e.f19143k + i;
                int i3 = c8530e.f19133a;
                int i4 = (i2 - 1) % i3;
                c8530e.f19143k = i2 % i3;
                c8530e.f19142j += i;
                c8530e.f19141i = 0;
                j = c8530e.f19135c[i4] + ((long) c8530e.f19136d[i4]);
            }
        }
        if (j != -1) {
            m21050a(j);
        }
    }
}
