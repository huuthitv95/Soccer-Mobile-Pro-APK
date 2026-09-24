package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8982n extends C9000q {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e */
    public final int f21070e;

    /* JADX INFO: renamed from: f */
    public final int f21071f;

    public C8982n(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC9011s.m21712a(i, i + i2, bArr.length);
        this.f21070e = i;
        this.f21071f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C9000q, com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: a */
    public final void mo21668a(int i, byte[] bArr) {
        System.arraycopy(this.f21091d, this.f21070e, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C9000q, com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: c */
    public final byte mo21669c(int i) {
        int i2 = this.f21071f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f21091d[this.f21070e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC8673m.m21221a("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C9000q, com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: d */
    public final byte mo21670d(int i) {
        return this.f21091d[this.f21070e + i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C9000q
    /* JADX INFO: renamed from: g */
    public final int mo21671g() {
        return this.f21070e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C9000q, com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    public final int size() {
        return this.f21071f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = AbstractC8972l1.f21065b;
        } else {
            byte[] bArr2 = new byte[size];
            mo21668a(size, bArr2);
            bArr = bArr2;
        }
        return new C9000q(bArr);
    }
}
