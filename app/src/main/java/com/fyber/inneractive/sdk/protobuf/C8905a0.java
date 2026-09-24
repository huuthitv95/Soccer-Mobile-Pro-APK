package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8905a0 extends AbstractC8911b0 {

    /* JADX INFO: renamed from: d */
    public final byte[] f20972d;

    /* JADX INFO: renamed from: e */
    public final int f20973e;

    /* JADX INFO: renamed from: f */
    public int f20974f;

    /* JADX INFO: renamed from: g */
    public final OutputStream f20975g;

    public C8905a0(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f20972d = new byte[iMax];
        this.f20973e = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f20975g = outputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m21472a() {
        this.f20975g.write(this.f20972d, 0, this.f20974f);
        this.f20974f = 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21473a(byte b) {
        if (this.f20974f == this.f20973e) {
            m21472a();
        }
        byte[] bArr = this.f20972d;
        int i = this.f20974f;
        this.f20974f = i + 1;
        bArr[i] = b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21474a(int i, int i2) {
        m21501j(14);
        m21494e(i, 5);
        m21499h(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21475a(int i, long j) {
        m21501j(18);
        m21494e(i, 1);
        m21495e(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21476a(int i, InterfaceC8925d2 interfaceC8925d2) {
        mo21489c(1, 3);
        mo21491d(2, i);
        mo21489c(3, 2);
        m21480a(interfaceC8925d2);
        mo21489c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21477a(int i, InterfaceC8925d2 interfaceC8925d2, InterfaceC9019t2 interfaceC9019t2) {
        mo21489c(i, 2);
        int serializedSize = ((AbstractC8910b) interfaceC8925d2).getSerializedSize(interfaceC9019t2);
        m21501j(5);
        m21500i(serializedSize);
        interfaceC9019t2.mo21635a((Object) interfaceC8925d2, this.f20985a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21478a(int i, AbstractC9011s abstractC9011s) {
        mo21489c(i, 2);
        m21486b(abstractC9011s);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21479a(int i, boolean z) {
        m21501j(11);
        m21494e(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f20972d;
        int i2 = this.f20974f;
        this.f20974f = i2 + 1;
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: a */
    public final void m21480a(InterfaceC8925d2 interfaceC8925d2) {
        int serializedSize = interfaceC8925d2.getSerializedSize();
        m21501j(5);
        m21500i(serializedSize);
        interfaceC8925d2.writeTo(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21481a(String str, int i) throws IOException {
        mo21489c(i, 2);
        m21487b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8964k
    /* JADX INFO: renamed from: a */
    public final void mo21482a(byte[] bArr, int i, int i2) throws IOException {
        m21488b(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21483b(int i, int i2) {
        m21501j(20);
        m21494e(i, 0);
        if (i2 >= 0) {
            m21500i(i2);
        } else {
            m21497f(i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21484b(int i, long j) {
        m21501j(20);
        m21494e(i, 0);
        m21497f(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21485b(int i, AbstractC9011s abstractC9011s) {
        mo21489c(1, 3);
        mo21491d(2, i);
        mo21489c(3, 2);
        m21486b(abstractC9011s);
        mo21489c(1, 4);
    }

    /* JADX INFO: renamed from: b */
    public final void m21486b(AbstractC9011s abstractC9011s) {
        int size = abstractC9011s.size();
        m21501j(5);
        m21500i(size);
        abstractC9011s.mo21701a(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m21487b(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM21516c = AbstractC8911b0.m21516c(length);
            int i = iM21516c + length;
            int i2 = this.f20973e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo21506a = AbstractC8927d4.f21001a.mo21506a(str, bArr, 0, length);
                m21501j(5);
                m21500i(iMo21506a);
                m21488b(bArr, 0, iMo21506a);
                return;
            }
            if (i > i2 - this.f20974f) {
                m21472a();
            }
            int iM21516c2 = AbstractC8911b0.m21516c(str.length());
            int i3 = this.f20974f;
            try {
                if (iM21516c2 != iM21516c) {
                    int iM21533a = AbstractC8927d4.m21533a(str);
                    m21500i(iM21533a);
                    this.f20974f = AbstractC8927d4.f21001a.mo21506a(str, this.f20972d, this.f20974f, iM21533a);
                    return;
                }
                int i4 = i3 + iM21516c2;
                this.f20974f = i4;
                int iMo21506a2 = AbstractC8927d4.f21001a.mo21506a(str, this.f20972d, i4, this.f20973e - i4);
                this.f20974f = i3;
                m21500i((iMo21506a2 - i3) - iM21516c2);
                this.f20974f = iMo21506a2;
            } catch (C8915b4 e) {
                this.f20974f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C9046z(e2);
            }
        } catch (C8915b4 e3) {
            m21518a(str, e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21488b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f20973e;
        int i4 = this.f20974f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f20972d, i4, i2);
            this.f20974f += i2;
            return;
        }
        System.arraycopy(bArr, i, this.f20972d, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f20974f = this.f20973e;
        m21472a();
        if (i7 > this.f20973e) {
            this.f20975g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, this.f20972d, 0, i7);
            this.f20974f = i7;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: c */
    public final void mo21489c(int i, int i2) {
        m21501j(5);
        m21500i((i << 3) | i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: c */
    public final void mo21490c(long j) {
        m21501j(8);
        m21495e(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: d */
    public final void mo21491d(int i, int i2) {
        m21501j(20);
        m21494e(i, 0);
        m21500i(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: d */
    public final void mo21492d(long j) {
        m21501j(10);
        m21497f(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: e */
    public final void mo21493e(int i) {
        m21501j(4);
        m21499h(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m21494e(int i, int i2) {
        m21500i((i << 3) | i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m21495e(long j) {
        byte[] bArr = this.f20972d;
        int i = this.f20974f;
        int i2 = i + 1;
        this.f20974f = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f20974f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f20974f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f20974f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f20974f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f20974f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f20974f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f20974f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: f */
    public final void mo21496f(int i) {
        if (i >= 0) {
            m21501j(5);
            m21500i(i);
        } else {
            m21501j(10);
            m21497f(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m21497f(long j) {
        if (!AbstractC8911b0.f20984c) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f20972d;
                int i = this.f20974f;
                this.f20974f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            byte[] bArr2 = this.f20972d;
            int i2 = this.f20974f;
            this.f20974f = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.f20972d;
            int i3 = this.f20974f;
            this.f20974f = i3 + 1;
            AbstractC9040x3.f21172c.mo21756a((Object) bArr3, AbstractC9040x3.f21175f + ((long) i3), (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f20972d;
        int i4 = this.f20974f;
        this.f20974f = i4 + 1;
        AbstractC9040x3.f21172c.mo21756a((Object) bArr4, AbstractC9040x3.f21175f + ((long) i4), (byte) j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: g */
    public final void mo21498g(int i) {
        m21501j(5);
        m21500i(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m21499h(int i) {
        byte[] bArr = this.f20972d;
        int i2 = this.f20974f;
        int i3 = i2 + 1;
        this.f20974f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f20974f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f20974f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f20974f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: i */
    public final void m21500i(int i) {
        if (!AbstractC8911b0.f20984c) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f20972d;
                int i2 = this.f20974f;
                this.f20974f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            byte[] bArr2 = this.f20972d;
            int i3 = this.f20974f;
            this.f20974f = i3 + 1;
            bArr2[i3] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.f20972d;
            int i4 = this.f20974f;
            this.f20974f = i4 + 1;
            AbstractC9040x3.f21172c.mo21756a((Object) bArr3, AbstractC9040x3.f21175f + ((long) i4), (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.f20972d;
        int i5 = this.f20974f;
        this.f20974f = i5 + 1;
        AbstractC9040x3.f21172c.mo21756a((Object) bArr4, AbstractC9040x3.f21175f + ((long) i5), (byte) i);
    }

    /* JADX INFO: renamed from: j */
    public final void m21501j(int i) {
        if (this.f20973e - this.f20974f < i) {
            m21472a();
        }
    }
}
