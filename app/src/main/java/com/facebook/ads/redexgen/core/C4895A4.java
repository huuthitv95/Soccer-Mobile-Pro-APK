package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4895A4 implements InterfaceC45223l {
    public final C48899y A00;
    public final C7350oJ A01;
    public final InterfaceC45213k[] A02;

    public C4895A4(InterfaceC45213k... interfaceC45213kArr) {
        this(interfaceC45213kArr, new C48899y(), new C7350oJ());
    }

    public C4895A4(InterfaceC45213k[] interfaceC45213kArr, C48899y c48899y, C7350oJ c7350oJ) {
        this.A02 = new InterfaceC45213k[interfaceC45213kArr.length + 2];
        System.arraycopy(interfaceC45213kArr, 0, this.A02, 0, interfaceC45213kArr.length);
        this.A00 = c48899y;
        this.A01 = c7350oJ;
        this.A02[interfaceC45213kArr.length] = c48899y;
        this.A02[interfaceC45213kArr.length + 1] = c7350oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45223l
    public final C7451px A4F(C7451px c7451px) {
        this.A01.A02(c7451px.A01);
        this.A01.A01(c7451px.A00);
        return c7451px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45223l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45223l
    public final InterfaceC45213k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45223l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45223l
    public final long A98() {
        return this.A00.A0C();
    }
}
