package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.cn */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10016cn extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final C10048ds f22200a = new C10048ds();

    /* JADX INFO: renamed from: b */
    private final File f22201b;

    /* JADX INFO: renamed from: c */
    private final C10069em f22202c;

    /* JADX INFO: renamed from: d */
    private long f22203d;

    /* JADX INFO: renamed from: e */
    private long f22204e;

    /* JADX INFO: renamed from: f */
    private FileOutputStream f22205f;

    /* JADX INFO: renamed from: g */
    private AbstractC10075es f22206g;

    C10016cn(File file, C10069em c10069em) {
        this.f22201b = file;
        this.f22202c = c10069em;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int i3;
        while (i2 > 0) {
            if (this.f22203d == 0 && this.f22204e == 0) {
                int iM22666b = this.f22200a.m22666b(bArr, i, i2);
                if (iM22666b == -1) {
                    return;
                }
                i += iM22666b;
                i2 -= iM22666b;
                AbstractC10075es abstractC10075esM22667c = this.f22200a.m22667c();
                this.f22206g = abstractC10075esM22667c;
                if (abstractC10075esM22667c.mo22594d()) {
                    this.f22203d = 0L;
                    this.f22202c.m22692l(this.f22206g.mo22596f(), 0, this.f22206g.mo22596f().length);
                    this.f22204e = this.f22206g.mo22596f().length;
                } else if (!this.f22206g.m22699h() || this.f22206g.m22698g()) {
                    byte[] bArrMo22596f = this.f22206g.mo22596f();
                    this.f22202c.m22692l(bArrMo22596f, 0, bArrMo22596f.length);
                    this.f22203d = this.f22206g.mo22592b();
                } else {
                    this.f22202c.m22690j(this.f22206g.mo22596f());
                    File file = new File(this.f22201b, this.f22206g.mo22593c());
                    file.getParentFile().mkdirs();
                    this.f22203d = this.f22206g.mo22592b();
                    this.f22205f = new FileOutputStream(file);
                }
            }
            int i4 = i;
            int iMin = i2;
            if (this.f22206g.m22698g()) {
                i2 = iMin;
                bArr = bArr;
                i = i4;
            } else {
                long j = iMin;
                if (this.f22206g.mo22594d()) {
                    bArr2 = bArr;
                    this.f22202c.m22685e(this.f22204e, bArr2, i4, iMin);
                    i3 = iMin;
                    this.f22204e += j;
                } else {
                    bArr2 = bArr;
                    i3 = iMin;
                    if (this.f22206g.m22699h()) {
                        iMin = (int) Math.min(j, this.f22203d);
                        this.f22205f.write(bArr2, i4, iMin);
                        long j2 = this.f22203d - ((long) iMin);
                        this.f22203d = j2;
                        if (j2 == 0) {
                            this.f22205f.close();
                        }
                    } else {
                        iMin = (int) Math.min(j, this.f22203d);
                        this.f22202c.m22685e((((long) this.f22206g.mo22596f().length) + this.f22206g.mo22592b()) - this.f22203d, bArr2, i4, iMin);
                        this.f22203d -= (long) iMin;
                    }
                }
                i = i4 + iMin;
                i2 = i3 - iMin;
                bArr = bArr2;
            }
        }
    }
}
