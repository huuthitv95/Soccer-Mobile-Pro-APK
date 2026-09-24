package com.bykv.p028vk.openvk.preload.p029a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.k */
/* JADX INFO: compiled from: RetryInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1893k<IN, OUT> extends AbstractC1886d<IN, OUT> {

    /* JADX INFO: renamed from: d */
    private IN f4279d;

    /* JADX INFO: renamed from: a */
    private Object m5871a(InterfaceC1882b<OUT> interfaceC1882b, Throwable th) throws Throwable {
        while (mo5873a(th)) {
            try {
                return interfaceC1882b.mo5836a(mo5872a());
            } catch (C1891i.a e) {
                th = e.getCause();
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: a */
    protected OUT mo5872a() {
        return this.f4279d;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final Object mo5832a(InterfaceC1882b<OUT> interfaceC1882b, IN in) throws Throwable {
        this.f4279d = in;
        try {
            return interfaceC1882b.mo5836a(mo5872a());
        } catch (C1891i.a e) {
            return m5871a((InterfaceC1882b) interfaceC1882b, e.getCause());
        } catch (Throwable th) {
            return m5871a((InterfaceC1882b) interfaceC1882b, th);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo5873a(Throwable th);

    /* JADX INFO: renamed from: g */
    protected final IN m5874g() {
        return this.f4279d;
    }
}
