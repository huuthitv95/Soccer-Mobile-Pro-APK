package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.w1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9033w1 implements InterfaceC8913b2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8913b2[] f21154a;

    public C9033w1(InterfaceC8913b2... interfaceC8913b2Arr) {
        this.f21154a = interfaceC8913b2Arr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8913b2
    /* JADX INFO: renamed from: a */
    public final boolean mo21519a(Class cls) {
        for (InterfaceC8913b2 interfaceC8913b2 : this.f21154a) {
            if (interfaceC8913b2.mo21519a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8913b2
    /* JADX INFO: renamed from: b */
    public final C9009r2 mo21520b(Class cls) {
        for (InterfaceC8913b2 interfaceC8913b2 : this.f21154a) {
            if (interfaceC8913b2.mo21519a(cls)) {
                return interfaceC8913b2.mo21520b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
