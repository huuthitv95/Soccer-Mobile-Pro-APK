package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8816o {

    /* JADX INFO: renamed from: a */
    public byte[] f20646a;

    /* JADX INFO: renamed from: b */
    public int f20647b;

    /* JADX INFO: renamed from: c */
    public int f20648c;

    /* JADX INFO: renamed from: d */
    public int f20649d = 0;

    public C8816o(byte[] bArr, int i, int i2) {
        this.f20646a = bArr;
        this.f20648c = i;
        this.f20647b = i2;
        m21358a();
    }

    /* JADX INFO: renamed from: a */
    public final void m21358a() {
        int i = this.f20648c;
        if (i >= 0) {
            int i2 = this.f20647b;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f20649d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21359a(int i) {
        int i2 = this.f20648c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f20649d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > i4 || i4 >= this.f20647b) {
                break;
            }
            if (m21363c(i6)) {
                i4++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
        int i7 = this.f20647b;
        if (i4 >= i7) {
            return i4 == i7 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m21360b(int i) {
        int i2;
        this.f20649d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f20649d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f20649d = i5;
            byte[] bArr = this.f20646a;
            int i6 = this.f20648c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m21363c(i6 + 1)) {
                i4 = 1;
            }
            this.f20648c = i6 + i4;
        }
        byte[] bArr2 = this.f20646a;
        int i7 = this.f20648c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f20649d = 0;
            this.f20648c = i7 + (m21363c(i7 + 1) ? 2 : 1);
        }
        m21358a();
        return i8;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21361b() {
        int i = this.f20648c;
        int i2 = this.f20649d;
        int i3 = 0;
        while (this.f20648c < this.f20647b && !m21362c()) {
            i3++;
        }
        boolean z = this.f20648c == this.f20647b;
        this.f20648c = i;
        this.f20649d = i2;
        return !z && m21359a((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21362c() {
        boolean z = (this.f20646a[this.f20648c] & (128 >> this.f20649d)) != 0;
        m21367f();
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21363c(int i) {
        if (2 > i || i >= this.f20647b) {
            return false;
        }
        byte[] bArr = this.f20646a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m21364d() {
        int i = 0;
        while (!m21362c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m21360b(i) : 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m21365d(int i) {
        int i2 = this.f20648c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f20648c = i4;
        int i5 = (i - (i3 * 8)) + this.f20649d;
        this.f20649d = i5;
        if (i5 > 7) {
            this.f20648c = i4 + 1;
            this.f20649d = i5 - 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > this.f20648c) {
                m21358a();
                return;
            } else if (m21363c(i6)) {
                this.f20648c++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m21366e() {
        int iM21364d = m21364d();
        return ((iM21364d + 1) / 2) * (iM21364d % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m21367f() {
        int i = this.f20649d + 1;
        this.f20649d = i;
        if (i == 8) {
            this.f20649d = 0;
            int i2 = this.f20648c;
            this.f20648c = i2 + (m21363c(i2 + 1) ? 2 : 1);
        }
        m21358a();
    }
}
