package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bw */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9998bw extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final C10048ds f22109a;

    /* JADX INFO: renamed from: b */
    private byte[] f22110b;

    /* JADX INFO: renamed from: c */
    private long f22111c;

    /* JADX INFO: renamed from: d */
    private boolean f22112d;

    /* JADX INFO: renamed from: e */
    private boolean f22113e;

    C9998bw(InputStream inputStream) {
        super(inputStream);
        this.f22109a = new C10048ds();
        this.f22110b = new byte[4096];
        this.f22112d = false;
        this.f22113e = false;
    }

    /* JADX INFO: renamed from: e */
    private final int m22603e(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* JADX INFO: renamed from: f */
    private final boolean m22604f(int i) throws IOException {
        int iM22603e = m22603e(this.f22110b, 0, i);
        if (iM22603e != i) {
            int i2 = i - iM22603e;
            if (m22603e(this.f22110b, iM22603e, i2) != i2) {
                this.f22109a.m22666b(this.f22110b, 0, iM22603e);
                return false;
            }
        }
        this.f22109a.m22666b(this.f22110b, 0, i);
        return true;
    }

    /* JADX INFO: renamed from: a */
    final long m22605a() {
        return this.f22111c;
    }

    /* JADX INFO: renamed from: b */
    final AbstractC10075es m22606b() throws IOException {
        byte[] bArr;
        if (this.f22111c > 0) {
            do {
                bArr = this.f22110b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f22112d || this.f22113e) {
            return new C9992bq(null, -1L, -1, false, false, null);
        }
        if (!m22604f(30)) {
            this.f22112d = true;
            return this.f22109a.m22667c();
        }
        AbstractC10075es abstractC10075esM22667c = this.f22109a.m22667c();
        if (abstractC10075esM22667c.mo22594d()) {
            this.f22113e = true;
            return abstractC10075esM22667c;
        }
        if (abstractC10075esM22667c.mo22592b() == 4294967295L) {
            throw new C10013ck("Files bigger than 4GiB are not supported.");
        }
        int iM22665a = this.f22109a.m22665a() - 30;
        int length = this.f22110b.length;
        long j = iM22665a;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.f22110b = Arrays.copyOf(this.f22110b, length);
        }
        if (!m22604f(iM22665a)) {
            this.f22112d = true;
            return this.f22109a.m22667c();
        }
        AbstractC10075es abstractC10075esM22667c2 = this.f22109a.m22667c();
        this.f22111c = abstractC10075esM22667c2.mo22592b();
        return abstractC10075esM22667c2;
    }

    /* JADX INFO: renamed from: c */
    final boolean m22607c() {
        return this.f22113e;
    }

    /* JADX INFO: renamed from: d */
    final boolean m22608d() {
        return this.f22112d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f22111c;
        if (j <= 0 || this.f22112d) {
            return -1;
        }
        int iM22603e = m22603e(bArr, i, (int) Math.min(j, i2));
        this.f22111c -= (long) iM22603e;
        if (iM22603e != 0) {
            return iM22603e;
        }
        this.f22112d = true;
        return 0;
    }
}
