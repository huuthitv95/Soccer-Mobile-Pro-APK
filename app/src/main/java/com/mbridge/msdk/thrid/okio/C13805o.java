package com.mbridge.msdk.thrid.okio;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.o */
/* JADX INFO: compiled from: Segment.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13805o {

    /* JADX INFO: renamed from: a */
    final byte[] f39338a;

    /* JADX INFO: renamed from: b */
    int f39339b;

    /* JADX INFO: renamed from: c */
    int f39340c;

    /* JADX INFO: renamed from: d */
    boolean f39341d;

    /* JADX INFO: renamed from: e */
    boolean f39342e;

    /* JADX INFO: renamed from: f */
    C13805o f39343f;

    /* JADX INFO: renamed from: g */
    C13805o f39344g;

    C13805o() {
        this.f39338a = new byte[8192];
        this.f39342e = true;
        this.f39341d = false;
    }

    C13805o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f39338a = bArr;
        this.f39339b = i;
        this.f39340c = i2;
        this.f39341d = z;
        this.f39342e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final C13805o m40956a(int i) {
        C13805o c13805oM40962a;
        if (i <= 0 || i > this.f39340c - this.f39339b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            c13805oM40962a = m40961c();
        } else {
            c13805oM40962a = C13806p.m40962a();
            System.arraycopy(this.f39338a, this.f39339b, c13805oM40962a.f39338a, 0, i);
        }
        c13805oM40962a.f39340c = c13805oM40962a.f39339b + i;
        this.f39339b += i;
        this.f39344g.m40957a(c13805oM40962a);
        return c13805oM40962a;
    }

    /* JADX INFO: renamed from: a */
    public final C13805o m40957a(C13805o c13805o) {
        c13805o.f39344g = this;
        c13805o.f39343f = this.f39343f;
        this.f39343f.f39344g = c13805o;
        this.f39343f = c13805o;
        return c13805o;
    }

    /* JADX INFO: renamed from: a */
    public final void m40958a() {
        C13805o c13805o = this.f39344g;
        if (c13805o == this) {
            throw new IllegalStateException();
        }
        if (c13805o.f39342e) {
            int i = this.f39340c - this.f39339b;
            if (i > (8192 - c13805o.f39340c) + (c13805o.f39341d ? 0 : c13805o.f39339b)) {
                return;
            }
            m40959a(c13805o, i);
            m40960b();
            C13806p.m40963a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m40959a(C13805o c13805o, int i) {
        if (!c13805o.f39342e) {
            throw new IllegalArgumentException();
        }
        int i2 = c13805o.f39340c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c13805o.f39341d) {
                throw new IllegalArgumentException();
            }
            int i4 = c13805o.f39339b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c13805o.f39338a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c13805o.f39340c -= c13805o.f39339b;
            c13805o.f39339b = 0;
        }
        System.arraycopy(this.f39338a, this.f39339b, c13805o.f39338a, c13805o.f39340c, i);
        c13805o.f39340c += i;
        this.f39339b += i;
    }

    /* JADX INFO: renamed from: b */
    public final C13805o m40960b() {
        C13805o c13805o = this.f39343f;
        C13805o c13805o2 = c13805o != this ? c13805o : null;
        C13805o c13805o3 = this.f39344g;
        c13805o3.f39343f = c13805o;
        this.f39343f.f39344g = c13805o3;
        this.f39343f = null;
        this.f39344g = null;
        return c13805o2;
    }

    /* JADX INFO: renamed from: c */
    final C13805o m40961c() {
        this.f39341d = true;
        return new C13805o(this.f39338a, this.f39339b, this.f39340c, true, false);
    }
}
