package com.bykv.p028vk.openvk.preload.p029a;

import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.i */
/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1891i implements InterfaceC1882b {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1887e f4274a;

    /* JADX INFO: renamed from: b */
    private int f4275b;

    /* JADX INFO: renamed from: c */
    private List<C1890h> f4276c;

    /* JADX INFO: renamed from: d */
    private AbstractC1886d f4277d;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.i$a */
    /* JADX INFO: compiled from: RealInterceptorChain.java */
    static final class a extends Exception {
        a(Throwable th) {
            super(th);
        }
    }

    C1891i(List<C1890h> list, int i, InterfaceC1887e interfaceC1887e, AbstractC1886d abstractC1886d) {
        this.f4276c = list;
        this.f4275b = i;
        this.f4274a = interfaceC1887e;
        this.f4277d = abstractC1886d;
    }

    /* JADX INFO: renamed from: c */
    private AbstractC1886d m5868c(Class cls) {
        AbstractC1886d abstractC1886d = this.f4277d;
        while (abstractC1886d != null && abstractC1886d.getClass() != cls) {
            abstractC1886d = abstractC1886d.f4256a;
        }
        return abstractC1886d;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: a */
    public final Object mo5835a(Class cls) {
        AbstractC1886d abstractC1886dM5868c = m5868c(cls);
        if (abstractC1886dM5868c != null) {
            return abstractC1886dM5868c.f4257b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: a */
    public final Object mo5836a(Object obj) throws Exception {
        AbstractC1886d abstractC1886d = this.f4277d;
        if (abstractC1886d != null) {
            abstractC1886d.f4258c = obj;
            this.f4277d.m5855e();
        }
        if (this.f4275b >= this.f4276c.size()) {
            return obj;
        }
        C1890h c1890h = this.f4276c.get(this.f4275b);
        Class<? extends AbstractC1886d> cls = c1890h.f4268a;
        AbstractC1886d abstractC1886d2 = (AbstractC1886d) this.f4274a.mo5857a(cls);
        if (abstractC1886d2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        AbstractC1883a abstractC1883aM5858a = c1890h.m5858a();
        C1891i c1891i = new C1891i(this.f4276c, this.f4275b + 1, this.f4274a, abstractC1886d2);
        abstractC1886d2.m5847a(c1891i, this.f4277d, obj, abstractC1883aM5858a, c1890h.m5859b());
        abstractC1886d2.m5851c();
        try {
            Object objMo5832a = abstractC1886d2.mo5832a(c1891i, obj);
            abstractC1886d2.m5853d();
            return objMo5832a;
        } catch (a e) {
            abstractC1886d2.m5852c(e.getCause());
            throw e;
        } catch (Throwable th) {
            abstractC1886d2.m5850b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: b */
    public final Object mo5837b(Class cls) {
        AbstractC1886d abstractC1886dM5868c = m5868c(cls);
        if (abstractC1886dM5868c != null) {
            return abstractC1886dM5868c.f4258c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
