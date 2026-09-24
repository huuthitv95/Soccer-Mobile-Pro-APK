package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.pgl.ssdk.d */
/* JADX INFO: loaded from: classes7.dex */
public class C14274d {

    /* JADX INFO: renamed from: com.pgl.ssdk.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final long f41320a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC14287q f41321b;

        public a(long j, InterfaceC14287q interfaceC14287q) {
            this.f41320a = j;
            this.f41321b = interfaceC14287q;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC14287q m43060a() {
            return this.f41321b;
        }

        /* JADX INFO: renamed from: b */
        public long m43061b() {
            return this.f41320a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m43058a(InterfaceC14287q interfaceC14287q, C14290t c14290t) throws C14269b, IOException {
        long jM43110a = c14290t.m43110a();
        long jM43112c = c14290t.m43112c() + jM43110a;
        long jM43114e = c14290t.m43114e();
        if (jM43112c != jM43114e) {
            throw new C14269b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jM43112c + ", EoCD start: " + jM43114e);
        }
        if (jM43110a < 32) {
            throw new C14269b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jM43110a)));
        }
        ByteBuffer byteBufferMo43091a = interfaceC14287q.mo43091a(jM43110a - 24, 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferMo43091a.order(byteOrder);
        if (byteBufferMo43091a.getLong(8) != 2334950737559900225L || byteBufferMo43091a.getLong(16) != 3617552046287187010L) {
            throw new C14269b("No APK Signing Block before ZIP Central Directory");
        }
        long j = byteBufferMo43091a.getLong(0);
        if (j < byteBufferMo43091a.capacity() || j > 2147483639) {
            throw new C14269b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
        }
        long j2 = (int) (8 + j);
        long j3 = jM43110a - j2;
        if (j3 < 0) {
            throw new C14269b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
        }
        ByteBuffer byteBufferMo43091a2 = interfaceC14287q.mo43091a(j3, 8);
        byteBufferMo43091a2.order(byteOrder);
        long j4 = byteBufferMo43091a2.getLong(0);
        if (j4 == j) {
            return new a(j3, interfaceC14287q.mo43090a(j3, j2));
        }
        throw new C14269b("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j);
    }

    /* JADX INFO: renamed from: a */
    public static C14290t m43059a(InterfaceC14287q interfaceC14287q) throws IOException, C14289s {
        C14285o<ByteBuffer, Long> c14285oM43100a = AbstractC14286p.m43100a(interfaceC14287q);
        if (c14285oM43100a == null) {
            throw new C14289s("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferM43097a = c14285oM43100a.m43097a();
        long jLongValue = c14285oM43100a.m43098b().longValue();
        byteBufferM43097a.order(ByteOrder.LITTLE_ENDIAN);
        long jM43105c = AbstractC14286p.m43105c(byteBufferM43097a);
        if (jM43105c > jLongValue) {
            throw new C14289s("ZIP Central Directory start offset out of range: " + jM43105c + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        long jM43106d = AbstractC14286p.m43106d(byteBufferM43097a);
        long j = jM43105c + jM43106d;
        if (j <= jLongValue) {
            return new C14290t(jM43105c, jM43106d, AbstractC14286p.m43107e(byteBufferM43097a), jLongValue, byteBufferM43097a);
        }
        throw new C14289s("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j + ", EoCD start: " + jLongValue);
    }
}
