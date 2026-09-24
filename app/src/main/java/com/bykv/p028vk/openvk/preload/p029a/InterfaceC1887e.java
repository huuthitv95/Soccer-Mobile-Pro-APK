package com.bykv.p028vk.openvk.preload.p029a;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.e */
/* JADX INFO: compiled from: InterceptorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1887e {

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.e$a */
    /* JADX INFO: compiled from: InterceptorFactory.java */
    public static class a implements InterfaceC1887e {
        @Override // com.bykv.p028vk.openvk.preload.p029a.InterfaceC1887e
        /* JADX INFO: renamed from: a */
        public final <T> T mo5857a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    <T> T mo5857a(Class<T> cls);
}
