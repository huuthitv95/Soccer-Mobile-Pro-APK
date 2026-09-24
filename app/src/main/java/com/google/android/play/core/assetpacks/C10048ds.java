package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ds */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10048ds {

    /* JADX INFO: renamed from: a */
    private byte[] f22296a = new byte[4096];

    /* JADX INFO: renamed from: b */
    private int f22297b;

    /* JADX INFO: renamed from: c */
    private long f22298c;

    /* JADX INFO: renamed from: d */
    private long f22299d;

    /* JADX INFO: renamed from: e */
    private int f22300e;

    /* JADX INFO: renamed from: f */
    private int f22301f;

    /* JADX INFO: renamed from: g */
    private int f22302g;

    /* JADX INFO: renamed from: h */
    private boolean f22303h;

    /* JADX INFO: renamed from: i */
    private String f22304i;

    public C10048ds() {
        m22668d();
    }

    /* JADX INFO: renamed from: e */
    private final int m22664e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f22297b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f22296a, this.f22297b, iMin);
        int i5 = this.f22297b + iMin;
        this.f22297b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: a */
    public final int m22665a() {
        return this.f22301f;
    }

    /* JADX INFO: renamed from: b */
    public final int m22666b(byte[] bArr, int i, int i2) {
        int iM22664e = m22664e(30, bArr, i, i2);
        if (iM22664e == -1) {
            return -1;
        }
        if (this.f22298c == -1) {
            long jM22599c = C9993br.m22599c(this.f22296a, 0);
            this.f22298c = jM22599c;
            if (jM22599c == 67324752) {
                this.f22303h = false;
                this.f22299d = C9993br.m22599c(this.f22296a, 18);
                this.f22302g = C9993br.m22597a(this.f22296a, 8);
                this.f22300e = C9993br.m22597a(this.f22296a, 26);
                int iM22597a = this.f22300e + 30 + C9993br.m22597a(this.f22296a, 28);
                this.f22301f = iM22597a;
                int length = this.f22296a.length;
                if (length < iM22597a) {
                    do {
                        length += length;
                    } while (length < iM22597a);
                    this.f22296a = Arrays.copyOf(this.f22296a, length);
                }
            } else {
                this.f22303h = true;
            }
        }
        int iM22664e2 = m22664e(this.f22301f, bArr, i + iM22664e, i2 - iM22664e);
        if (iM22664e2 == -1) {
            return -1;
        }
        int i3 = iM22664e + iM22664e2;
        if (!this.f22303h && this.f22304i == null) {
            this.f22304i = new String(this.f22296a, 30, this.f22300e);
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC10075es m22667c() {
        int i = this.f22297b;
        int i2 = this.f22301f;
        if (i < i2) {
            return new C9992bq(this.f22304i, this.f22299d, this.f22302g, true, this.f22303h, Arrays.copyOf(this.f22296a, i));
        }
        C9992bq c9992bq = new C9992bq(this.f22304i, this.f22299d, this.f22302g, false, this.f22303h, Arrays.copyOf(this.f22296a, i2));
        m22668d();
        return c9992bq;
    }

    /* JADX INFO: renamed from: d */
    public final void m22668d() {
        this.f22297b = 0;
        this.f22300e = -1;
        this.f22298c = -1L;
        this.f22303h = false;
        this.f22301f = 30;
        this.f22299d = -1L;
        this.f22302g = -1;
        this.f22304i = null;
    }
}
