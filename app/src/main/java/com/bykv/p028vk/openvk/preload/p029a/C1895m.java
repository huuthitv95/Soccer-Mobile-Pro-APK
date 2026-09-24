package com.bykv.p028vk.openvk.preload.p029a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.m */
/* JADX INFO: compiled from: UnProceedChain.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1895m<IN> implements InterfaceC1882b<IN> {

    /* JADX INFO: renamed from: a */
    private InterfaceC1882b<IN> f4284a;

    public C1895m(InterfaceC1882b<IN> interfaceC1882b) {
        this.f4284a = interfaceC1882b;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: a */
    public final <I> I mo5835a(Class<? extends AbstractC1886d<I, ?>> cls) {
        return (I) this.f4284a.mo5835a((Class) cls);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: a */
    public final Object mo5836a(IN in) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b
    /* JADX INFO: renamed from: b */
    public final <O> O mo5837b(Class<? extends AbstractC1886d<?, O>> cls) {
        return (O) this.f4284a.mo5837b(cls);
    }
}
