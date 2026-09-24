package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: renamed from: com.pgl.ssdk.p */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14286p {
    /* JADX INFO: renamed from: a */
    public static int m43099a(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public static C14285o<ByteBuffer, Long> m43100a(InterfaceC14287q interfaceC14287q) throws IOException {
        if (interfaceC14287q.mo43089a() < 22) {
            return null;
        }
        C14285o<ByteBuffer, Long> c14285oM43101a = m43101a(interfaceC14287q, 0);
        return c14285oM43101a != null ? c14285oM43101a : m43101a(interfaceC14287q, 65535);
    }

    /* JADX INFO: renamed from: a */
    private static C14285o<ByteBuffer, Long> m43101a(InterfaceC14287q interfaceC14287q, int i) throws IOException {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i)));
        }
        long jMo43089a = interfaceC14287q.mo43089a();
        if (jMo43089a < 22) {
            return null;
        }
        int iMin = ((int) Math.min(i, jMo43089a - 22)) + 22;
        long j = jMo43089a - ((long) iMin);
        ByteBuffer byteBufferMo43091a = interfaceC14287q.mo43091a(j, iMin);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferMo43091a.order(byteOrder);
        int iM43103b = m43103b(byteBufferMo43091a);
        if (iM43103b == -1) {
            return null;
        }
        byteBufferMo43091a.position(iM43103b);
        ByteBuffer byteBufferSlice = byteBufferMo43091a.slice();
        byteBufferSlice.order(byteOrder);
        return C14285o.m43096a(byteBufferSlice, Long.valueOf(j + ((long) iM43103b)));
    }

    /* JADX INFO: renamed from: a */
    static void m43102a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m43103b(ByteBuffer byteBuffer) {
        m43102a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = Math.min(i, 65535);
        for (int i2 = 0; i2 <= iMin; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && m43099a(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    static long m43104b(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* JADX INFO: renamed from: c */
    public static long m43105c(ByteBuffer byteBuffer) {
        m43102a(byteBuffer);
        return m43104b(byteBuffer, byteBuffer.position() + 16);
    }

    /* JADX INFO: renamed from: d */
    public static long m43106d(ByteBuffer byteBuffer) {
        m43102a(byteBuffer);
        return m43104b(byteBuffer, byteBuffer.position() + 12);
    }

    /* JADX INFO: renamed from: e */
    public static int m43107e(ByteBuffer byteBuffer) {
        m43102a(byteBuffer);
        return m43099a(byteBuffer, byteBuffer.position() + 10);
    }
}
