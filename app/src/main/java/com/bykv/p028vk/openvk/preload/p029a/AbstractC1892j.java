package com.bykv.p028vk.openvk.preload.p029a;

import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.j */
/* JADX INFO: compiled from: RetryBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1892j<IN, OUT> extends AbstractC1894l<IN, OUT> {

    /* JADX INFO: renamed from: d */
    private String f4278d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final Object mo5832a(InterfaceC1882b<OUT> interfaceC1882b, IN in) throws Throwable {
        new C1895m(interfaceC1882b);
        this.f4278d = mo5869a(in);
        AbstractC1894l.a aVar = m5876a().get(this.f4278d);
        while (aVar != null) {
            List<C1890h> list = aVar.f4281a;
            try {
                Object objMo5836a = C1885c.m5846a(list, interfaceC1882b.f4274a, this).mo5836a(in);
                return !m5875a(list) ? objMo5836a : interfaceC1882b.mo5836a(objMo5836a);
            } catch (C1891i.a e) {
                Throwable cause = e.getCause();
                new C1895m(interfaceC1882b);
                this.f4278d = mo5870a(in, cause, this.f4278d);
                aVar = m5876a().get(this.f4278d);
            } catch (Throwable th) {
                new C1895m(interfaceC1882b);
                this.f4278d = mo5870a(in, th, this.f4278d);
                aVar = m5876a().get(this.f4278d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f4278d);
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo5869a(IN in);

    /* JADX INFO: renamed from: a */
    protected abstract String mo5870a(IN in, Throwable th, String str);
}
