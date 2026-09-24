package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.pgl.ssdk.m */
/* JADX INFO: loaded from: classes7.dex */
public class C14283m implements InterfaceC14287q {

    /* JADX INFO: renamed from: a */
    private final FileChannel f41332a;

    /* JADX INFO: renamed from: b */
    private final long f41333b;

    /* JADX INFO: renamed from: c */
    private final long f41334c;

    public C14283m(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        this.f41332a = fileChannel;
        this.f41333b = j;
        this.f41334c = j2;
    }

    /* JADX INFO: renamed from: a */
    private static void m43088a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        }
        if (j4 <= j3) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
    }

    @Override // com.pgl.ssdk.InterfaceC14287q
    /* JADX INFO: renamed from: a */
    public long mo43089a() {
        long j = this.f41334c;
        if (j != -1) {
            return j;
        }
        try {
            return this.f41332a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.pgl.ssdk.InterfaceC14287q
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo43091a(long j, int i) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        m43092a(j, i, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: a */
    public void m43092a(long j, int i, ByteBuffer byteBuffer) throws IOException {
        int i2;
        m43088a(j, i, mo43089a());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.f41333b + j;
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.f41332a) {
                    this.f41332a.position(j2);
                    i2 = this.f41332a.read(byteBuffer);
                }
                j2 += (long) i2;
                i -= i2;
            }
            byteBuffer.limit(iLimit);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    @Override // com.pgl.ssdk.InterfaceC14287q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14283m mo43090a(long j, long j2) {
        long jMo43089a = mo43089a();
        m43088a(j, j2, jMo43089a);
        return (j == 0 && j2 == jMo43089a) ? this : new C14283m(this.f41332a, this.f41333b + j, j2);
    }
}
