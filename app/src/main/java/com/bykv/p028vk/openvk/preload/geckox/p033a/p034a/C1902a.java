package com.bykv.p028vk.openvk.preload.geckox.p033a.p034a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a */
/* JADX INFO: compiled from: CacheConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1902a {

    /* JADX INFO: renamed from: a */
    final int f4309a;

    /* JADX INFO: renamed from: b */
    final InterfaceC1904c f4310b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1903b f4311c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a */
    /* JADX INFO: compiled from: CacheConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private int f4312a;

        /* JADX INFO: renamed from: b */
        private AbstractC1903b f4313b = AbstractC1903b.f4315a;

        /* JADX INFO: renamed from: c */
        private InterfaceC1904c f4314c;

        /* JADX INFO: renamed from: a */
        public final a m5904a() {
            this.f4312a = 20;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5905a(AbstractC1903b abstractC1903b) {
            if (abstractC1903b == null) {
                abstractC1903b = AbstractC1903b.f4315a;
            }
            this.f4313b = abstractC1903b;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C1902a m5906b() {
            return new C1902a(this, (byte) 0);
        }
    }

    private C1902a(a aVar) {
        this.f4309a = aVar.f4312a;
        this.f4311c = aVar.f4313b;
        this.f4310b = aVar.f4314c;
    }

    /* synthetic */ C1902a(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1903b m5900a() {
        return this.f4311c;
    }
}
