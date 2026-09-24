package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7357oQ implements InterfaceC45213k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC45213k.A00;
    public ByteBuffer A03 = InterfaceC45213k.A00;
    public C45193i A00 = C45193i.A05;
    public C45193i A01 = C45193i.A05;
    public C45193i A05 = C45193i.A05;
    public C45193i A06 = C45193i.A05;

    public abstract C45193i A09(C45193i c45193i) throws C45203j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final C45193i A57(C45193i c45193i) throws C45203j {
        this.A00 = c45193i;
        this.A01 = A09(c45193i);
        return AAL() ? this.A01 : C45193i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC45213k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public boolean AAL() {
        return this.A01 != C45193i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC45213k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void flush() {
        this.A03 = InterfaceC45213k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
