package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7350oJ implements InterfaceC45213k {
    public long A03;
    public long A04;
    public C48679Y A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public C45193i A07 = C45193i.A05;
    public C45193i A08 = C45193i.A05;
    public C45193i A05 = C45193i.A05;
    public C45193i A06 = C45193i.A05;
    public ByteBuffer A0A = InterfaceC45213k.A00;
    public ShortBuffer A0C = this.A0A.asShortBuffer();
    public ByteBuffer A0B = InterfaceC45213k.A00;
    public int A02 = -1;

    public final long A00(long j) {
        if (this.A04 >= 1024) {
            long jA0I = this.A03 - ((long) ((C48679Y) AbstractC45353y.A01(this.A09)).A0I());
            if (this.A06.A03 == this.A05.A03) {
                long processedInputBytes = AbstractC46115C.A0U(j, jA0I, this.A04);
                return processedInputBytes;
            }
            long processedInputBytes2 = this.A06.A03;
            long j2 = jA0I * processedInputBytes2;
            long j3 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return AbstractC46115C.A0U(j, j2, j3 * processedInputBytes3);
        }
        return (long) (((double) this.A01) * j);
    }

    public final void A01(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            this.A0E = true;
        }
    }

    public final void A02(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            this.A0E = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final C45193i A57(C45193i c45193i) throws C45203j {
        int i;
        if (c45193i.A02 == 2) {
            if (this.A02 == -1) {
                i = c45193i.A03;
            } else {
                i = this.A02;
            }
            this.A07 = c45193i;
            this.A08 = new C45193i(i, c45193i.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new C45203j(c45193i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final ByteBuffer A8d() {
        int iA0H;
        C48679Y c48679y = this.A09;
        if (c48679y != null && (iA0H = c48679y.A0H()) > 0) {
            if (this.A0A.capacity() < iA0H) {
                this.A0A = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            c48679y.A0L(this.A0C);
            this.A04 += (long) iA0H;
            this.A0A.limit(iA0H);
            this.A0B = this.A0A;
        }
        ByteBuffer outputBuffer = this.A0B;
        this.A0B = InterfaceC45213k.A00;
        return outputBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final boolean AAL() {
        return this.A08.A03 != -1 && (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final boolean AAP() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void AHG() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void AHH(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C48679Y c48679y = (C48679Y) AbstractC45353y.A01(this.A09);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.A03 += (long) iRemaining;
        c48679y.A0M(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void flush() {
        if (AAL()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            if (this.A0E) {
                this.A09 = new C48679Y(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = InterfaceC45213k.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
