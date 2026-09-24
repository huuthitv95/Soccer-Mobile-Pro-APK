package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8814m {

    /* JADX INFO: renamed from: a */
    public final byte[] f20639a;

    /* JADX INFO: renamed from: b */
    public int f20640b;

    /* JADX INFO: renamed from: c */
    public int f20641c;

    /* JADX INFO: renamed from: d */
    public final int f20642d;

    public C8814m(byte[] bArr) {
        int length = bArr.length;
        this.f20639a = bArr;
        this.f20642d = length;
    }

    /* JADX INFO: renamed from: a */
    public final int m21332a(int i) {
        int i2;
        this.f20641c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f20641c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f20641c = i4;
            byte[] bArr = this.f20639a;
            int i5 = this.f20640b;
            this.f20640b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f20639a;
        int i6 = this.f20640b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f20641c = 0;
            this.f20640b = i6 + 1;
        }
        m21333a();
        return i7;
    }

    /* JADX INFO: renamed from: a */
    public final void m21333a() {
        int i = this.f20640b;
        if (i >= 0) {
            int i2 = this.f20642d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.f20641c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: b */
    public final void m21334b(int i) {
        int i2 = i / 8;
        this.f20640b = i2;
        this.f20641c = i - (i2 * 8);
        m21333a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21335b() {
        byte[] bArr = this.f20639a;
        int i = this.f20640b;
        byte b = bArr[i];
        int i2 = this.f20641c;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.f20641c = i3;
        if (i3 == 8) {
            this.f20641c = 0;
            this.f20640b = i + 1;
        }
        m21333a();
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m21336c(int i) {
        int i2 = i / 8;
        int i3 = this.f20640b + i2;
        this.f20640b = i3;
        int i4 = (i - (i2 * 8)) + this.f20641c;
        this.f20641c = i4;
        if (i4 > 7) {
            this.f20640b = i3 + 1;
            this.f20641c = i4 - 8;
        }
        m21333a();
    }
}
