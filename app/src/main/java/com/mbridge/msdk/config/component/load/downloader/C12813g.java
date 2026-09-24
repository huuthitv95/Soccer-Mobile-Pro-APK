package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.C12794e;
import com.mbridge.msdk.config.component.load.downloader.core.C12795f;
import com.mbridge.msdk.config.component.load.downloader.core.C12798i;
import com.mbridge.msdk.config.component.load.downloader.core.C12801l;
import com.mbridge.msdk.config.component.load.downloader.resource.C12815a;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.g */
/* JADX INFO: compiled from: MBDownloadManager.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12813g {

    /* JADX INFO: renamed from: a */
    private boolean f34240a;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.g$b */
    /* JADX INFO: compiled from: MBDownloadManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C12813g f34241a = new C12813g();
    }

    /* JADX INFO: renamed from: a */
    public static C12813g m35490a() {
        return b.f34241a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m35494b(String str) {
        return C12815a.m35497a().m35498a(str);
    }

    private C12813g() {
        this.f34240a = false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m35493a(String str) {
        C12795f.m35401a().m35405a(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m35495b() {
        return this.f34240a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C12794e m35491a(C12788b<?> c12788b) {
        return new C12794e(c12788b);
    }

    /* JADX INFO: renamed from: a */
    public void m35492a(C12812f c12812f) {
        if (this.f34240a) {
            return;
        }
        C12801l.m35424c().m35427a(c12812f);
        C12798i.m35415b().m35417a(c12812f.m35478e());
        C12795f.m35401a().m35407c();
        this.f34240a = true;
    }
}
