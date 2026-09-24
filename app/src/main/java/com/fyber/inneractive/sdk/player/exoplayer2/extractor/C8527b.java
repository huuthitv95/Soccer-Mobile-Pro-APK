package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8527b {

    /* JADX INFO: renamed from: g */
    public static final byte[] f19121g = new byte[4096];

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f19122a;

    /* JADX INFO: renamed from: b */
    public final long f19123b;

    /* JADX INFO: renamed from: c */
    public long f19124c;

    /* JADX INFO: renamed from: d */
    public byte[] f19125d = new byte[65536];

    /* JADX INFO: renamed from: e */
    public int f19126e;

    /* JADX INFO: renamed from: f */
    public int f19127f;

    public C8527b(InterfaceC8783h interfaceC8783h, long j, long j2) {
        this.f19122a = interfaceC8783h;
        this.f19124c = j;
        this.f19123b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final int m21022a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i4 = this.f19122a.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: a */
    public final void m21023a(int i) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f19127f, i);
        m21026b(iMin);
        int iM21022a = iMin;
        while (iM21022a < i && iM21022a != -1) {
            iM21022a = m21022a(f19121g, -iM21022a, Math.min(i, iM21022a + 4096), iM21022a, false);
        }
        if (iM21022a != -1) {
            this.f19124c += (long) iM21022a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21024a(int i, boolean z) throws InterruptedException, EOFException {
        int i2 = this.f19126e + i;
        byte[] bArr = this.f19125d;
        if (i2 > bArr.length) {
            int i3 = AbstractC8827z.f20671a;
            this.f19125d = Arrays.copyOf(this.f19125d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int iMin = Math.min(this.f19127f - this.f19126e, i);
        while (iMin < i) {
            int i4 = i;
            boolean z2 = z;
            iMin = m21022a(this.f19125d, this.f19126e, i4, iMin, z2);
            if (iMin == -1) {
                return false;
            }
            i = i4;
            z = z2;
        }
        int i5 = this.f19126e + i;
        this.f19126e = i5;
        this.f19127f = Math.max(this.f19127f, i5);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21025a(byte[] bArr, int i, int i2, boolean z) {
        if (!m21024a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f19125d, this.f19126e - i2, bArr, i, i2);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m21026b(int i) {
        int i2 = this.f19127f - i;
        this.f19127f = i2;
        this.f19126e = 0;
        byte[] bArr = this.f19125d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f19125d = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21027b(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, EOFException {
        int iM21022a;
        int i3 = this.f19127f;
        if (i3 == 0) {
            iM21022a = 0;
        } else {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f19125d, 0, bArr, i, iMin);
            m21026b(iMin);
            iM21022a = iMin;
        }
        while (iM21022a < i2 && iM21022a != -1) {
            iM21022a = m21022a(bArr, i, i2, iM21022a, z);
        }
        if (iM21022a != -1) {
            this.f19124c += (long) iM21022a;
        }
        return iM21022a != -1;
    }
}
