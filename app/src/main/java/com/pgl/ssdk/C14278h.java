package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.pgl.ssdk.h */
/* JADX INFO: loaded from: classes9.dex */
public class C14278h {

    /* JADX INFO: renamed from: a */
    private static final char[] f41326a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public static C14279i m43076a(InterfaceC14287q interfaceC14287q, C14290t c14290t, int i) throws C14280j, IOException {
        try {
            C14274d.a aVarM43058a = C14274d.m43058a(interfaceC14287q, c14290t);
            long jM43061b = aVarM43058a.m43061b();
            InterfaceC14287q interfaceC14287qM43060a = aVarM43058a.m43060a();
            ByteBuffer byteBufferMo43091a = interfaceC14287qM43060a.mo43091a(0L, (int) interfaceC14287qM43060a.mo43089a());
            byteBufferMo43091a.order(ByteOrder.LITTLE_ENDIAN);
            return new C14279i(m43077a(byteBufferMo43091a, i), jM43061b, c14290t.m43110a(), c14290t.m43114e(), c14290t.m43113d());
        } catch (C14269b e) {
            throw new C14280j(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m43077a(ByteBuffer byteBuffer, int i) throws C14280j {
        m43079a(byteBuffer);
        ByteBuffer byteBufferM43078a = m43078a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (byteBufferM43078a.hasRemaining()) {
            i2++;
            if (byteBufferM43078a.remaining() < 8) {
                throw new C14280j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
            }
            long j = byteBufferM43078a.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new C14280j("APK Signing Block entry #" + i2 + " size out of range: " + j);
            }
            int i3 = (int) j;
            int iPosition = byteBufferM43078a.position() + i3;
            if (i3 > byteBufferM43078a.remaining()) {
                throw new C14280j("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferM43078a.remaining());
            }
            if (byteBufferM43078a.getInt() == i) {
                return m43081b(byteBufferM43078a, i3 - 4);
            }
            byteBufferM43078a.position(iPosition);
        }
        throw new C14280j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
    }

    /* JADX INFO: renamed from: a */
    private static ByteBuffer m43078a(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m43079a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m43080b(ByteBuffer byteBuffer) throws C14236a {
        if (byteBuffer.remaining() < 4) {
            throw new C14236a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return m43081b(byteBuffer, i);
        }
        throw new C14236a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: b */
    private static ByteBuffer m43081b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m43082c(ByteBuffer byteBuffer) throws C14236a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C14236a("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new C14236a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }
}
