package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.i */
/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12798i {

    /* JADX INFO: renamed from: a */
    private InterfaceC12799j f34156a;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.i$b */
    /* JADX INFO: compiled from: ExecutorManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C12798i f34157a = new C12798i();
    }

    /* JADX INFO: renamed from: b */
    public static C12798i m35415b() {
        return b.f34157a;
    }

    /* JADX INFO: renamed from: a */
    public void m35417a(int i) {
        this.f34156a = new C12790a(i);
    }

    private C12798i() {
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC12799j m35416a() {
        if (this.f34156a == null) {
            this.f34156a = new C12790a(10);
        }
        return this.f34156a;
    }
}
