package com.bytedance.sdk.component.p160lr.p161ri.p162lr;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public final class C2658ri implements InterfaceC2654ik, InterfaceC2656lr, Cloneable, ByteChannel, AutoCloseable {

    /* JADX INFO: renamed from: ik */
    private static final byte[] f7562ik = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: lr */
    long f7563lr;

    /* JADX INFO: renamed from: ri */
    C2653fi f7564ri;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2658ri)) {
            return false;
        }
        C2658ri c2658ri = (C2658ri) obj;
        long j = this.f7563lr;
        if (j != c2658ri.f7563lr) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2653fi c2653fi = this.f7564ri;
        C2653fi c2653fi2 = c2658ri.f7564ri;
        int i = c2653fi.f7553lr;
        int i2 = c2653fi2.f7553lr;
        while (j2 < this.f7563lr) {
            long jMin = Math.min(c2653fi.f7551ik - i, c2653fi2.f7551ik - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c2653fi.f7554ri[i] != c2653fi2.f7554ri[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c2653fi.f7551ik) {
                c2653fi = c2653fi.f7549di;
                i = c2653fi.f7553lr;
            }
            if (i2 == c2653fi2.f7551ik) {
                c2653fi2 = c2653fi2.f7549di;
                i2 = c2653fi2.f7553lr;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: fi */
    public final C2655ka m9954fi() {
        long j = this.f7563lr;
        if (j <= 2147483647L) {
            return m9957ka((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f7563lr);
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        C2653fi c2653fi = this.f7564ri;
        if (c2653fi == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2653fi.f7551ik;
            for (int i3 = c2653fi.f7553lr; i3 < i2; i3++) {
                i = (i * 31) + c2653fi.f7554ri[i3];
            }
            c2653fi = c2653fi.f7549di;
        } while (c2653fi != this.f7564ri);
        return i;
    }

    /* JADX INFO: renamed from: ik */
    C2653fi m9955ik(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2653fi c2653fi = this.f7564ri;
        if (c2653fi != null) {
            C2653fi c2653fi2 = c2653fi.xha;
            return (c2653fi2.f7551ik + i > 8192 || !c2653fi2.f7550fi) ? c2653fi2.m9930ri(C2652di.m9926ri()) : c2653fi2;
        }
        C2653fi c2653fiM9926ri = C2652di.m9926ri();
        this.f7564ri = c2653fiM9926ri;
        c2653fiM9926ri.xha = c2653fiM9926ri;
        c2653fiM9926ri.f7549di = c2653fiM9926ri;
        return c2653fiM9926ri;
    }

    /* JADX INFO: renamed from: ik */
    public String m9956ik() {
        try {
            return m9968ri(this.f7563lr, jbs.f7555ri);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: ka */
    public final C2655ka m9957ka(int i) {
        return i == 0 ? C2655ka.f7556ik : new xha(this, i);
    }

    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2658ri clone() {
        C2658ri c2658ri = new C2658ri();
        if (this.f7563lr == 0) {
            return c2658ri;
        }
        C2653fi c2653fiM9929ri = this.f7564ri.m9929ri();
        c2658ri.f7564ri = c2653fiM9929ri;
        c2653fiM9929ri.xha = c2653fiM9929ri;
        c2653fiM9929ri.f7549di = c2653fiM9929ri;
        C2653fi c2653fi = this.f7564ri;
        while (true) {
            c2653fi = c2653fi.f7549di;
            if (c2653fi == this.f7564ri) {
                c2658ri.f7563lr = this.f7563lr;
                return c2658ri;
            }
            c2658ri.f7564ri.xha.m9930ri(c2653fi.m9929ri());
        }
    }

    /* JADX INFO: renamed from: lr */
    public byte m9959lr() {
        if (this.f7563lr == 0) {
            throw new IllegalStateException("size == 0");
        }
        C2653fi c2653fi = this.f7564ri;
        int i = c2653fi.f7553lr;
        int i2 = c2653fi.f7551ik;
        int i3 = i + 1;
        byte b = c2653fi.f7554ri[i];
        this.f7563lr--;
        if (i3 != i2) {
            c2653fi.f7553lr = i3;
            return b;
        }
        this.f7564ri = c2653fi.m9928lr();
        C2652di.m9927ri(c2653fi);
        return b;
    }

    /* JADX INFO: renamed from: lr */
    public C2658ri m9960lr(int i) {
        C2653fi c2653fiM9955ik = m9955ik(1);
        byte[] bArr = c2653fiM9955ik.f7554ri;
        int i2 = c2653fiM9955ik.f7551ik;
        c2653fiM9955ik.f7551ik = i2 + 1;
        bArr[i2] = (byte) i;
        this.f7563lr++;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C2658ri m9961lr(long j) {
        if (j == 0) {
            return m9960lr(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2653fi c2653fiM9955ik = m9955ik(iNumberOfTrailingZeros);
        byte[] bArr = c2653fiM9955ik.f7554ri;
        int i = c2653fiM9955ik.f7551ik;
        for (int i2 = (c2653fiM9955ik.f7551ik + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f7562ik[(int) (15 & j)];
            j >>>= 4;
        }
        c2653fiM9955ik.f7551ik += iNumberOfTrailingZeros;
        this.f7563lr += (long) iNumberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C2658ri m9962lr(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        jbs.m9940ri(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2653fi c2653fiM9955ik = m9955ik(1);
            int iMin = Math.min(i3 - i, 8192 - c2653fiM9955ik.f7551ik);
            System.arraycopy(bArr, i, c2653fiM9955ik.f7554ri, c2653fiM9955ik.f7551ik, iMin);
            i += iMin;
            c2653fiM9955ik.f7551ik += iMin;
        }
        this.f7563lr += j;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C2653fi c2653fi = this.f7564ri;
        if (c2653fi == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c2653fi.f7551ik - c2653fi.f7553lr);
        byteBuffer.put(c2653fi.f7554ri, c2653fi.f7553lr, iMin);
        c2653fi.f7553lr += iMin;
        this.f7563lr -= (long) iMin;
        if (c2653fi.f7553lr == c2653fi.f7551ik) {
            this.f7564ri = c2653fi.m9928lr();
            C2652di.m9927ri(c2653fi);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ri */
    public int m9963ri(byte[] bArr, int i, int i2) {
        jbs.m9940ri(bArr.length, i, i2);
        C2653fi c2653fi = this.f7564ri;
        if (c2653fi == null) {
            return -1;
        }
        int iMin = Math.min(i2, c2653fi.f7551ik - c2653fi.f7553lr);
        System.arraycopy(c2653fi.f7554ri, c2653fi.f7553lr, bArr, i, iMin);
        c2653fi.f7553lr += iMin;
        this.f7563lr -= (long) iMin;
        if (c2653fi.f7553lr == c2653fi.f7551ik) {
            this.f7564ri = c2653fi.m9928lr();
            C2652di.m9927ri(c2653fi);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ri */
    public C2658ri m9964ri(int i) {
        if (i < 128) {
            m9960lr(i);
            return this;
        }
        if (i < 2048) {
            m9960lr((i >> 6) | 192);
            m9960lr((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                m9960lr(63);
                return this;
            }
            m9960lr((i >> 12) | 224);
            m9960lr(((i >> 6) & 63) | 128);
            m9960lr((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        m9960lr((i >> 18) | 240);
        m9960lr(((i >> 12) & 63) | 128);
        m9960lr(((i >> 6) & 63) | 128);
        m9960lr((i & 63) | 128);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2658ri m9965ri(String str) {
        return m9966ri(str, 0, str.length());
    }

    /* JADX INFO: renamed from: ri */
    public C2658ri m9966ri(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C2653fi c2653fiM9955ik = m9955ik(1);
                byte[] bArr = c2653fiM9955ik.f7554ri;
                int i3 = c2653fiM9955ik.f7551ik - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = (i3 + i) - c2653fiM9955ik.f7551ik;
                c2653fiM9955ik.f7551ik += i5;
                this.f7563lr += (long) i5;
            } else {
                if (cCharAt2 < 2048) {
                    m9960lr((cCharAt2 >> 6) | 192);
                    m9960lr((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m9960lr((cCharAt2 >> '\f') | 224);
                    m9960lr(((cCharAt2 >> 6) & 63) | 128);
                    m9960lr((cCharAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char cCharAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m9960lr(63);
                        i = i6;
                    } else {
                        int i7 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m9960lr((i7 >> 18) | 240);
                        m9960lr(((i7 >> 12) & 63) | 128);
                        m9960lr(((i7 >> 6) & 63) | 128);
                        m9960lr((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2658ri m9967ri(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(jbs.f7555ri)) {
            return m9966ri(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return m9962lr(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ri */
    public String m9968ri(long j, Charset charset) throws EOFException {
        jbs.m9940ri(this.f7563lr, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        C2653fi c2653fi = this.f7564ri;
        if (((long) c2653fi.f7553lr) + j > c2653fi.f7551ik) {
            return new String(m9971ri(j), charset);
        }
        String str = new String(c2653fi.f7554ri, c2653fi.f7553lr, (int) j, charset);
        c2653fi.f7553lr = (int) (((long) c2653fi.f7553lr) + j);
        this.f7563lr -= j;
        if (c2653fi.f7553lr == c2653fi.f7551ik) {
            this.f7564ri = c2653fi.m9928lr();
            C2652di.m9927ri(c2653fi);
        }
        return str;
    }

    /* JADX INFO: renamed from: ri */
    public void m9969ri(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iM9963ri = m9963ri(bArr, i, bArr.length - i);
            if (iM9963ri == -1) {
                throw new EOFException();
            }
            i += iM9963ri;
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9970ri() {
        return this.f7563lr == 0;
    }

    /* JADX INFO: renamed from: ri */
    public byte[] m9971ri(long j) throws EOFException {
        jbs.m9940ri(this.f7563lr, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        m9969ri(bArr);
        return bArr;
    }

    public String toString() {
        return m9954fi().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C2653fi c2653fiM9955ik = m9955ik(1);
            int iMin = Math.min(i, 8192 - c2653fiM9955ik.f7551ik);
            byteBuffer.get(c2653fiM9955ik.f7554ri, c2653fiM9955ik.f7551ik, iMin);
            i -= iMin;
            c2653fiM9955ik.f7551ik += iMin;
        }
        this.f7563lr += (long) iRemaining;
        return iRemaining;
    }
}
