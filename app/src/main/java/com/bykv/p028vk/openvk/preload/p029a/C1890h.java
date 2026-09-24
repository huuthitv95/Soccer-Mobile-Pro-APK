package com.bykv.p028vk.openvk.preload.p029a;

import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.h */
/* JADX INFO: compiled from: Pipe.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1890h {

    /* JADX INFO: renamed from: a */
    Class<? extends AbstractC1886d> f4268a;

    /* JADX INFO: renamed from: b */
    private AbstractC1883a f4269b;

    /* JADX INFO: renamed from: c */
    private Object[] f4270c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.h$a */
    /* JADX INFO: compiled from: Pipe.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Class<? extends AbstractC1886d> f4271a;

        /* JADX INFO: renamed from: b */
        private AbstractC1883a f4272b;

        /* JADX INFO: renamed from: c */
        private Object[] f4273c;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m5860a() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public final a m5864a(AbstractC1883a abstractC1883a) {
            this.f4272b = abstractC1883a;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5865a(Class<? extends AbstractC1886d> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("interceptor class == null");
            }
            this.f4271a = cls;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m5866a(Object... objArr) {
            this.f4273c = objArr;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final C1890h m5867b() {
            return new C1890h(this, (byte) 0);
        }
    }

    private C1890h(a aVar) {
        this.f4268a = aVar.f4271a;
        this.f4269b = aVar.f4272b;
        this.f4270c = aVar.f4273c;
        if (this.f4268a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    /* synthetic */ C1890h(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a */
    final AbstractC1883a m5858a() {
        return this.f4269b;
    }

    /* JADX INFO: renamed from: b */
    final Object[] m5859b() {
        return this.f4270c;
    }
}
