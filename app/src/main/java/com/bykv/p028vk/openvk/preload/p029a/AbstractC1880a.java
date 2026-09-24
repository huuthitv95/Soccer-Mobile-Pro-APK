package com.bykv.p028vk.openvk.preload.p029a;

import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.a */
/* JADX INFO: compiled from: BranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1880a<IN, OUT> extends AbstractC1894l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final Object mo5832a(InterfaceC1882b<OUT> interfaceC1882b, IN in) throws Exception {
        new C1895m(interfaceC1882b);
        String strMo5833a = mo5833a(in);
        AbstractC1894l.a aVar = m5876a().get(strMo5833a);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strMo5833a)));
        }
        List<C1890h> list = aVar.f4281a;
        Object objMo5836a = C1885c.m5846a(list, ((C1891i) interfaceC1882b).f4274a, this).mo5836a(in);
        return !m5875a(list) ? objMo5836a : interfaceC1882b.mo5836a(objMo5836a);
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo5833a(IN in);
}
