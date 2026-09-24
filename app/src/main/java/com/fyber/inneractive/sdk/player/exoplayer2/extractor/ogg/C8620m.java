package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8620m {

    /* JADX INFO: renamed from: a */
    public final byte[] f19846a;

    /* JADX INFO: renamed from: b */
    public final int f19847b;

    /* JADX INFO: renamed from: c */
    public int f19848c;

    /* JADX INFO: renamed from: d */
    public int f19849d;

    public C8620m(byte[] bArr) {
        this.f19846a = bArr;
        this.f19847b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m21158a(int i) {
        int i2 = this.f19848c;
        int iMin = Math.min(i, 8 - this.f19849d);
        int i3 = i2 + 1;
        int i4 = ((this.f19846a[i2] & 255) >> this.f19849d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f19846a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m21160b(i);
        return i5;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21159a() {
        boolean z = (((this.f19846a[this.f19848c] & 255) >> this.f19849d) & 1) == 1;
        m21160b(1);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m21160b(int i) {
        int i2 = i / 8;
        int i3 = this.f19848c + i2;
        this.f19848c = i3;
        int i4 = (i - (i2 * 8)) + this.f19849d;
        this.f19849d = i4;
        if (i4 > 7) {
            this.f19848c = i3 + 1;
            this.f19849d = i4 - 8;
        }
        int i5 = this.f19848c;
        if (i5 >= 0) {
            int i6 = this.f19847b;
            if (i5 < i6) {
                return;
            }
            if (i5 == i6 && this.f19849d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
