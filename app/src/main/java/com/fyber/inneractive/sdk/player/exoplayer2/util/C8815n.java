package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8815n {

    /* JADX INFO: renamed from: a */
    public byte[] f20643a;

    /* JADX INFO: renamed from: b */
    public int f20644b;

    /* JADX INFO: renamed from: c */
    public int f20645c;

    public C8815n() {
    }

    public C8815n(int i) {
        this.f20643a = new byte[i];
        this.f20645c = i;
    }

    public C8815n(int i, byte[] bArr) {
        this.f20643a = bArr;
        this.f20645c = i;
    }

    public C8815n(byte[] bArr) {
        this.f20643a = bArr;
        this.f20645c = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m21337a() {
        byte[] bArr = this.f20643a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final String m21338a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f20644b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f20643a, i2, (i3 >= this.f20645c || this.f20643a[i3] != 0) ? i : i - 1);
        this.f20644b += i;
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m21339a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f20643a, this.f20644b, bArr, i, i2);
        this.f20644b += i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m21340b() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f20644b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f20644b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f20644b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: b */
    public final String m21341b(int i) {
        String str = new String(this.f20643a, this.f20644b, i, Charset.defaultCharset());
        this.f20644b += i;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX INFO: renamed from: c */
    public final String m21342c() {
        int i;
        int i2 = this.f20645c;
        int i3 = this.f20644b;
        if (i2 - i3 == 0) {
            return null;
        }
        while (i3 < this.f20645c) {
            byte b = this.f20643a[i3];
            int i4 = AbstractC8827z.f20671a;
            if (b == 10 || b == 13) {
                break;
            }
            i3++;
        }
        int i5 = this.f20644b;
        if (i3 - i5 >= 3) {
            byte[] bArr = this.f20643a;
            if (bArr[i5] == -17 && bArr[i5 + 1] == -69 && bArr[i5 + 2] == -65) {
                this.f20644b = i5 + 3;
            }
        }
        byte[] bArr2 = this.f20643a;
        int i6 = this.f20644b;
        String str = new String(bArr2, i6, i3 - i6);
        this.f20644b = i3;
        int i7 = this.f20645c;
        if (i3 != i7) {
            byte[] bArr3 = this.f20643a;
            if (bArr3[i3] == 13) {
                int i8 = i3 + 1;
                this.f20644b = i8;
                if (i8 != i7) {
                    i = this.f20644b;
                    if (bArr3[i] == 10) {
                        this.f20644b = i + 1;
                    }
                }
            } else {
                i = this.f20644b;
                if (bArr3[i] == 10) {
                    this.f20644b = i + 1;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m21343c(int i) {
        this.f20643a = m21337a() < i ? new byte[i] : this.f20643a;
        this.f20645c = i;
        this.f20644b = 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m21344d() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f20644b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f20644b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f20644b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: d */
    public final void m21345d(int i) {
        if (i < 0 || i > this.f20643a.length) {
            throw new IllegalArgumentException();
        }
        this.f20645c = i;
    }

    /* JADX INFO: renamed from: e */
    public final long m21346e() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f20644b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f20644b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f20644b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: e */
    public final void m21347e(int i) {
        if (i < 0 || i > this.f20645c) {
            throw new IllegalArgumentException();
        }
        this.f20644b = i;
    }

    /* JADX INFO: renamed from: f */
    public final int m21348f() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        int i3 = bArr[i] & 255;
        this.f20644b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: g */
    public final long m21349g() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f20644b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f20644b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f20644b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f20644b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f20644b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f20644b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f20644b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: h */
    public final void m21350h() {
        int i = this.f20645c;
        int i2 = this.f20644b;
        if (i - i2 == 0) {
            return;
        }
        while (i2 < this.f20645c && this.f20643a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f20643a;
        int i3 = this.f20644b;
        new String(bArr, i3, i2 - i3);
        this.f20644b = i2;
        if (i2 < this.f20645c) {
            this.f20644b = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m21351i() {
        return (m21352j() << 21) | (m21352j() << 14) | (m21352j() << 7) | m21352j();
    }

    /* JADX INFO: renamed from: j */
    public final int m21352j() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        this.f20644b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: k */
    public final long m21353k() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f20644b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f20644b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f20644b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: l */
    public final int m21354l() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f20644b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f20644b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: m */
    public final int m21355m() {
        int iM21340b = m21340b();
        if (iM21340b >= 0) {
            return iM21340b;
        }
        throw new IllegalStateException(AbstractC8673m.m21221a("Top bit not zero: ", iM21340b));
    }

    /* JADX INFO: renamed from: n */
    public final long m21356n() {
        long jM21349g = m21349g();
        if (jM21349g >= 0) {
            return jM21349g;
        }
        throw new IllegalStateException("Top bit not zero: " + jM21349g);
    }

    /* JADX INFO: renamed from: o */
    public final int m21357o() {
        byte[] bArr = this.f20643a;
        int i = this.f20644b;
        int i2 = i + 1;
        this.f20644b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f20644b = i + 2;
        return (bArr[i2] & 255) | i3;
    }
}
