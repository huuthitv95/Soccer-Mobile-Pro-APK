package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4898A7 extends AbstractC7357oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC7357oQ
    public final C45193i A09(C45193i c45193i) throws C45203j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C45193i.A05;
        }
        if (c45193i.A02 == 2) {
            int i = c45193i.A01 != iArr.length ? 1 : 0;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < c45193i.A01) {
                    i |= i3 != i2 ? 1 : 0;
                    i2++;
                } else {
                    throw new C45203j(c45193i);
                }
            }
            if (i != 0) {
                return new C45193i(c45193i.A03, iArr.length, 2);
            }
            return C45193i.A05;
        }
        throw new C45203j(c45193i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7357oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45213k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC45353y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
