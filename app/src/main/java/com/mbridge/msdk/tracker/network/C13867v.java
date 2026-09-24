package com.mbridge.msdk.tracker.network;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.v */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13867v<T> {

    /* JADX INFO: renamed from: a */
    public final T f39590a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13830b.a f39591b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13831b0 f39592c;

    /* JADX INFO: renamed from: d */
    public boolean f39593d;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.v$a */
    /* JADX INFO: compiled from: Response.java */
    /* JADX INFO: loaded from: classes9.dex */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo41117a(AbstractC13831b0 abstractC13831b0);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.v$b */
    /* JADX INFO: compiled from: Response.java */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo41337a(T t);
    }

    private C13867v(AbstractC13831b0 abstractC13831b0) {
        this.f39593d = false;
        this.f39590a = null;
        this.f39591b = null;
        this.f39592c = abstractC13831b0;
    }

    private C13867v(T t, InterfaceC13830b.a aVar) {
        this.f39593d = false;
        this.f39590a = t;
        this.f39591b = aVar;
        this.f39592c = null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C13867v<T> m41334a(AbstractC13831b0 abstractC13831b0) {
        return new C13867v<>(abstractC13831b0);
    }

    /* JADX INFO: renamed from: a */
    public static <T> C13867v<T> m41335a(T t, InterfaceC13830b.a aVar) {
        return new C13867v<>(t, aVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m41336a() {
        return this.f39592c == null;
    }
}
