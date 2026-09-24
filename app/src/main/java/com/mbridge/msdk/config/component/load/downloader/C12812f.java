package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.f */
/* JADX INFO: compiled from: MBDownloadConfig.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12812f {

    /* JADX INFO: renamed from: a */
    private long f34226a;

    /* JADX INFO: renamed from: b */
    private long f34227b;

    /* JADX INFO: renamed from: c */
    private long f34228c;

    /* JADX INFO: renamed from: d */
    private long f34229d;

    /* JADX INFO: renamed from: e */
    private int f34230e;

    /* JADX INFO: renamed from: f */
    private int f34231f;

    /* JADX INFO: renamed from: g */
    private int f34232g;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.f$b */
    /* JADX INFO: compiled from: MBDownloadConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private long f34233a;

        /* JADX INFO: renamed from: b */
        private long f34234b;

        /* JADX INFO: renamed from: c */
        private long f34235c;

        /* JADX INFO: renamed from: d */
        private long f34236d;

        /* JADX INFO: renamed from: e */
        private int f34237e;

        /* JADX INFO: renamed from: f */
        private int f34238f;

        /* JADX INFO: renamed from: g */
        private int f34239g;

        public b() {
            this(null);
        }

        public b(C12812f c12812f) {
            this.f34233a = 20000L;
            this.f34234b = 10L;
            this.f34235c = 20000L;
            this.f34236d = 20000L;
            this.f34237e = 64;
            this.f34238f = 20;
            this.f34239g = 10;
            if (C12818a.m35507a(c12812f)) {
                this.f34235c = c12812f.m35476c();
                this.f34233a = c12812f.m35474a();
                this.f34237e = c12812f.m35479f();
                this.f34236d = c12812f.m35477d();
                this.f34238f = c12812f.m35480g();
                this.f34234b = c12812f.m35475b();
                this.f34239g = c12812f.m35478e();
            }
        }

        /* JADX INFO: renamed from: a */
        public C12812f m35489a() {
            return new C12812f(this);
        }

        /* JADX INFO: renamed from: a */
        public b m35488a(int i) {
            this.f34239g = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m35474a() {
        return this.f34226a;
    }

    /* JADX INFO: renamed from: b */
    public long m35475b() {
        return this.f34227b;
    }

    /* JADX INFO: renamed from: c */
    public long m35476c() {
        return this.f34228c;
    }

    /* JADX INFO: renamed from: d */
    public long m35477d() {
        return this.f34229d;
    }

    /* JADX INFO: renamed from: e */
    public int m35478e() {
        return this.f34232g;
    }

    /* JADX INFO: renamed from: f */
    public int m35479f() {
        return this.f34230e;
    }

    /* JADX INFO: renamed from: g */
    public int m35480g() {
        return this.f34231f;
    }

    private C12812f(b bVar) {
        this.f34226a = bVar.f34233a;
        this.f34228c = bVar.f34235c;
        this.f34229d = bVar.f34236d;
        this.f34230e = bVar.f34237e;
        this.f34231f = bVar.f34238f;
        this.f34227b = bVar.f34234b;
        this.f34232g = bVar.f34239g;
    }
}
