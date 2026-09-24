package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.x0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9037x0 extends AbstractC8929e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8925d2 f21163a;

    /* JADX INFO: renamed from: b */
    public final Object f21164b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8925d2 f21165c;

    /* JADX INFO: renamed from: d */
    public final C9032w0 f21166d;

    public C9037x0(InterfaceC8925d2 interfaceC8925d2, Object obj, InterfaceC8925d2 interfaceC8925d3, C9032w0 c9032w0) {
        if (interfaceC8925d2 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c9032w0.f21151c == EnumC8963j4.MESSAGE && interfaceC8925d3 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f21163a = interfaceC8925d2;
        this.f21164b = obj;
        this.f21165c = interfaceC8925d3;
        this.f21166d = c9032w0;
    }
}
