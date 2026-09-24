package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C9041y extends AbstractC8911b0 {

    /* JADX INFO: renamed from: d */
    public final byte[] f21178d;

    /* JADX INFO: renamed from: e */
    public final int f21179e;

    /* JADX INFO: renamed from: f */
    public int f21180f;

    public C9041y(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f21178d = bArr;
        this.f21180f = 0;
        this.f21179e = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m21840a() {
        return this.f21179e - this.f21180f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21473a(byte b) throws C9046z {
        try {
            byte[] bArr = this.f21178d;
            int i = this.f21180f;
            this.f21180f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21474a(int i, int i2) throws C9046z {
        mo21489c(i, 5);
        mo21493e(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21475a(int i, long j) throws C9046z {
        mo21489c(i, 1);
        mo21490c(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21476a(int i, InterfaceC8925d2 interfaceC8925d2) throws C9046z {
        mo21489c(1, 3);
        mo21489c(2, 0);
        mo21498g(i);
        mo21489c(3, 2);
        mo21498g(interfaceC8925d2.getSerializedSize());
        interfaceC8925d2.writeTo(this);
        mo21489c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21477a(int i, InterfaceC8925d2 interfaceC8925d2, InterfaceC9019t2 interfaceC9019t2) throws C9046z {
        mo21489c(i, 2);
        mo21498g(((AbstractC8910b) interfaceC8925d2).getSerializedSize(interfaceC9019t2));
        interfaceC9019t2.mo21635a((Object) interfaceC8925d2, this.f20985a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21478a(int i, AbstractC9011s abstractC9011s) throws C9046z {
        mo21489c(i, 2);
        mo21498g(abstractC9011s.size());
        abstractC9011s.mo21701a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21479a(int i, boolean z) throws C9046z {
        mo21489c(i, 0);
        mo21473a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: a */
    public final void mo21481a(String str, int i) throws C9046z {
        mo21489c(i, 2);
        m21841b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8964k
    /* JADX INFO: renamed from: a */
    public final void mo21482a(byte[] bArr, int i, int i2) throws C9046z {
        m21842b(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21483b(int i, int i2) throws C9046z {
        mo21489c(i, 0);
        mo21496f(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21484b(int i, long j) throws C9046z {
        mo21489c(i, 0);
        mo21492d(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: b */
    public final void mo21485b(int i, AbstractC9011s abstractC9011s) throws C9046z {
        mo21489c(1, 3);
        mo21489c(2, 0);
        mo21498g(i);
        mo21478a(3, abstractC9011s);
        mo21489c(1, 4);
    }

    /* JADX INFO: renamed from: b */
    public final void m21841b(String str) throws C9046z {
        int i = this.f21180f;
        try {
            int iM21516c = AbstractC8911b0.m21516c(str.length() * 3);
            int iM21516c2 = AbstractC8911b0.m21516c(str.length());
            if (iM21516c2 != iM21516c) {
                mo21498g(AbstractC8927d4.m21533a(str));
                byte[] bArr = this.f21178d;
                int i2 = this.f21180f;
                this.f21180f = AbstractC8927d4.f21001a.mo21506a(str, bArr, i2, this.f21179e - i2);
                return;
            }
            int i3 = i + iM21516c2;
            this.f21180f = i3;
            int iMo21506a = AbstractC8927d4.f21001a.mo21506a(str, this.f21178d, i3, this.f21179e - i3);
            this.f21180f = i;
            mo21498g((iMo21506a - i) - iM21516c2);
            this.f21180f = iMo21506a;
        } catch (C8915b4 e) {
            this.f21180f = i;
            m21518a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C9046z(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21842b(byte[] bArr, int i, int i2) throws C9046z {
        try {
            System.arraycopy(bArr, i, this.f21178d, this.f21180f, i2);
            this.f21180f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: c */
    public final void mo21489c(int i, int i2) throws C9046z {
        mo21498g((i << 3) | i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: c */
    public final void mo21490c(long j) throws C9046z {
        try {
            byte[] bArr = this.f21178d;
            int i = this.f21180f;
            int i2 = i + 1;
            this.f21180f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f21180f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f21180f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f21180f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f21180f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f21180f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f21180f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f21180f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: d */
    public final void mo21491d(int i, int i2) throws C9046z {
        mo21489c(i, 0);
        mo21498g(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: d */
    public final void mo21492d(long j) throws C9046z {
        if (AbstractC8911b0.f20984c && this.f21179e - this.f21180f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f21178d;
                int i = this.f21180f;
                this.f21180f = i + 1;
                AbstractC9040x3.f21172c.mo21756a((Object) bArr, AbstractC9040x3.f21175f + ((long) i), (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f21178d;
            int i2 = this.f21180f;
            this.f21180f = i2 + 1;
            AbstractC9040x3.f21172c.mo21756a((Object) bArr2, AbstractC9040x3.f21175f + ((long) i2), (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f21178d;
                int i3 = this.f21180f;
                this.f21180f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), 1), e);
            }
        }
        byte[] bArr4 = this.f21178d;
        int i4 = this.f21180f;
        this.f21180f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: e */
    public final void mo21493e(int i) throws C9046z {
        try {
            byte[] bArr = this.f21178d;
            int i2 = this.f21180f;
            int i3 = i2 + 1;
            this.f21180f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f21180f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f21180f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f21180f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: f */
    public final void mo21496f(int i) throws C9046z {
        if (i >= 0) {
            mo21498g(i);
        } else {
            mo21492d(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8911b0
    /* JADX INFO: renamed from: g */
    public final void mo21498g(int i) throws C9046z {
        if (AbstractC8911b0.f20984c && !AbstractC8922d.m21528a()) {
            int i2 = this.f21179e;
            int i3 = this.f21180f;
            if (i2 - i3 >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f21178d;
                    this.f21180f = i3 + 1;
                    AbstractC9040x3.f21172c.mo21756a((Object) bArr, AbstractC9040x3.f21175f + ((long) i3), (byte) i);
                    return;
                }
                byte[] bArr2 = this.f21178d;
                this.f21180f = i3 + 1;
                AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
                long j = AbstractC9040x3.f21175f;
                abstractC9035w3.mo21756a((Object) bArr2, ((long) i3) + j, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f21178d;
                    int i5 = this.f21180f;
                    this.f21180f = i5 + 1;
                    abstractC9035w3.mo21756a((Object) bArr3, j + ((long) i5), (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f21178d;
                int i6 = this.f21180f;
                this.f21180f = i6 + 1;
                abstractC9035w3.mo21756a((Object) bArr4, ((long) i6) + j, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f21178d;
                    int i8 = this.f21180f;
                    this.f21180f = i8 + 1;
                    abstractC9035w3.mo21756a((Object) bArr5, j + ((long) i8), (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f21178d;
                int i9 = this.f21180f;
                this.f21180f = i9 + 1;
                abstractC9035w3.mo21756a((Object) bArr6, ((long) i9) + j, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f21178d;
                    int i11 = this.f21180f;
                    this.f21180f = i11 + 1;
                    abstractC9035w3.mo21756a((Object) bArr7, j + ((long) i11), (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f21178d;
                int i12 = this.f21180f;
                this.f21180f = i12 + 1;
                abstractC9035w3.mo21756a((Object) bArr8, ((long) i12) + j, (byte) (i10 | 128));
                byte[] bArr9 = this.f21178d;
                int i13 = this.f21180f;
                this.f21180f = i13 + 1;
                abstractC9035w3.mo21756a((Object) bArr9, j + ((long) i13), (byte) (i >>> 28));
                return;
            }
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f21178d;
                int i14 = this.f21180f;
                this.f21180f = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C9046z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21180f), Integer.valueOf(this.f21179e), 1), e);
            }
        }
        byte[] bArr11 = this.f21178d;
        int i15 = this.f21180f;
        this.f21180f = i15 + 1;
        bArr11[i15] = (byte) i;
    }
}
