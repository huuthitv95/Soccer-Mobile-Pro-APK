package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.d */
/* JADX INFO: compiled from: DownloadResponse.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12806d {

    /* JADX INFO: renamed from: a */
    private C12787a f34182a;

    /* JADX INFO: renamed from: b */
    private boolean f34183b;

    /* JADX INFO: renamed from: c */
    private boolean f34184c;

    /* JADX INFO: renamed from: a */
    public C12787a m35437a() {
        return this.f34182a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m35442b() {
        return this.f34183b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m35443c() {
        return this.f34184c;
    }

    /* JADX INFO: renamed from: a */
    public void m35438a(C12787a c12787a) {
        this.f34182a = c12787a;
        m35441b(false);
    }

    /* JADX INFO: renamed from: b */
    public void m35441b(boolean z) {
        this.f34184c = z;
    }

    /* JADX INFO: renamed from: a */
    public void m35439a(Exception exc) {
        m35438a(new C12787a(exc));
    }

    /* JADX INFO: renamed from: a */
    public void m35440a(boolean z) {
        this.f34183b = z;
    }
}
