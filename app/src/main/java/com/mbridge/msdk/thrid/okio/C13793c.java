package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.c */
/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13793c implements InterfaceC13795e, InterfaceC13794d, Cloneable, ByteChannel, AutoCloseable {

    /* JADX INFO: renamed from: c */
    private static final byte[] f39304c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a */
    C13805o f39305a;

    /* JADX INFO: renamed from: b */
    long f39306b;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.c$a */
    /* JADX INFO: compiled from: Buffer.java */
    class a extends InputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C13793c.this.f39306b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C13793c c13793c = C13793c.this;
            if (c13793c.f39306b > 0) {
                return c13793c.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C13793c.this.read(bArr, i, i2);
        }

        public String toString() {
            return C13793c.this + ".inputStream()";
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public long mo40862a(byte b) {
        return m40863a(b, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m40863a(byte b, long j, long j2) {
        C13805o c13805o;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f39306b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f39306b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (c13805o = this.f39305a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c13805o = c13805o.f39344g;
                j4 -= (long) (c13805o.f39340c - c13805o.f39339b);
            }
        } else {
            while (true) {
                long j6 = ((long) (c13805o.f39340c - c13805o.f39339b)) + j3;
                if (j6 >= j) {
                    break;
                }
                c13805o = c13805o.f39343f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = c13805o.f39338a;
            int iMin = (int) Math.min(c13805o.f39340c, (((long) c13805o.f39339b) + j5) - j4);
            for (int i = (int) ((((long) c13805o.f39339b) + j7) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c13805o.f39339b)) + j4;
                }
            }
            j4 += (long) (c13805o.f39340c - c13805o.f39339b);
            c13805o = c13805o.f39343f;
            j7 = j4;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public long m40864a(InterfaceC13809s interfaceC13809s) throws IOException {
        if (interfaceC13809s == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jMo40427b = interfaceC13809s.mo40427b(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo40427b == -1) {
                return j;
            }
            j += jMo40427b;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e, com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a */
    public C13793c mo40865a() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C13793c m40866a(C13793c c13793c, long j, long j2) {
        if (c13793c == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j;
        C13811u.m40969a(this.f39306b, j3, j2);
        if (j2 != 0) {
            c13793c.f39306b += j2;
            C13805o c13805o = this.f39305a;
            while (true) {
                long j4 = c13805o.f39340c - c13805o.f39339b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c13805o = c13805o.f39343f;
            }
            C13805o c13805o2 = c13805o;
            long j5 = j2;
            while (j5 > 0) {
                C13805o c13805oM40961c = c13805o2.m40961c();
                int i = (int) (((long) c13805oM40961c.f39339b) + j3);
                c13805oM40961c.f39339b = i;
                c13805oM40961c.f39340c = Math.min(i + ((int) j5), c13805oM40961c.f39340c);
                C13805o c13805o3 = c13793c.f39305a;
                if (c13805o3 == null) {
                    c13805oM40961c.f39344g = c13805oM40961c;
                    c13805oM40961c.f39343f = c13805oM40961c;
                    c13793c.f39305a = c13805oM40961c;
                } else {
                    c13805o3.f39344g.m40957a(c13805oM40961c);
                }
                j5 -= (long) (c13805oM40961c.f39340c - c13805oM40961c.f39339b);
                c13805o2 = c13805o2.f39343f;
                j3 = 0;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13793c m40867a(C13796f c13796f) {
        if (c13796f == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c13796f.mo40915a(this);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13793c m40868a(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
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
                C13805o c13805oM40881b = m40881b(1);
                byte[] bArr = c13805oM40881b.f39338a;
                int i3 = c13805oM40881b.f39340c - i;
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
                int i5 = c13805oM40881b.f39340c;
                int i6 = (i3 + i) - i5;
                c13805oM40881b.f39340c = i5 + i6;
                this.f39306b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    writeByte((cCharAt2 >> 6) | 192);
                    writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    writeByte((cCharAt2 >> '\f') | 224);
                    writeByte(((cCharAt2 >> 6) & 63) | 128);
                    writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        writeByte((i8 >> 18) | 240);
                        writeByte(((i8 >> 12) & 63) | 128);
                        writeByte(((i8 >> 6) & 63) | 128);
                        writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13793c m40869a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
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
        if (charset.equals(C13811u.f39353a)) {
            return m40868a(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return write(bytes, 0, bytes.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C13793c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C13793c write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C13811u.m40969a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C13805o c13805oM40881b = m40881b(1);
            int iMin = Math.min(i3 - i, 8192 - c13805oM40881b.f39340c);
            System.arraycopy(bArr, i, c13805oM40881b.f39338a, c13805oM40881b.f39340c, iMin);
            i += iMin;
            c13805oM40881b.f39340c += iMin;
        }
        this.f39306b += j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C13796f m40874a(int i) {
        return i == 0 ? C13796f.f39309e : new C13807q(this, i);
    }

    /* JADX INFO: renamed from: a */
    public String m40875a(long j, Charset charset) throws EOFException {
        C13811u.m40969a(this.f39306b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        C13805o c13805o = this.f39305a;
        int i = c13805o.f39339b;
        if (((long) i) + j > c13805o.f39340c) {
            return new String(mo40884c(j), charset);
        }
        String str = new String(c13805o.f39338a, i, (int) j, charset);
        int i2 = (int) (((long) c13805o.f39339b) + j);
        c13805o.f39339b = i2;
        this.f39306b -= j;
        if (i2 == c13805o.f39340c) {
            this.f39305a = c13805o.m40960b();
            C13806p.m40963a(c13805o);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public String mo40876a(Charset charset) {
        try {
            return m40875a(this.f39306b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
    /* JADX INFO: renamed from: a */
    public void mo40370a(C13793c c13793c, long j) {
        if (c13793c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c13793c == this) {
            throw new IllegalArgumentException("source == this");
        }
        C13811u.m40969a(c13793c.f39306b, 0L, j);
        while (j > 0) {
            C13805o c13805o = c13793c.f39305a;
            if (j < c13805o.f39340c - c13805o.f39339b) {
                C13805o c13805o2 = this.f39305a;
                C13805o c13805o3 = c13805o2 != null ? c13805o2.f39344g : null;
                if (c13805o3 != null && c13805o3.f39342e) {
                    if ((((long) c13805o3.f39340c) + j) - ((long) (c13805o3.f39341d ? 0 : c13805o3.f39339b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        c13805o.m40959a(c13805o3, (int) j);
                        c13793c.f39306b -= j;
                        this.f39306b += j;
                        return;
                    }
                }
                c13793c.f39305a = c13805o.m40956a((int) j);
            }
            C13805o c13805o4 = c13793c.f39305a;
            long j2 = c13805o4.f39340c - c13805o4.f39339b;
            c13793c.f39305a = c13805o4.m40960b();
            C13805o c13805o5 = this.f39305a;
            if (c13805o5 == null) {
                this.f39305a = c13805o4;
                c13805o4.f39344g = c13805o4;
                c13805o4.f39343f = c13805o4;
            } else {
                c13805o5.f39344g.m40957a(c13805o4).m40958a();
            }
            c13793c.f39306b -= j2;
            this.f39306b += j2;
            j -= j2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public boolean mo40877a(long j, C13796f c13796f) {
        return m40878a(j, c13796f, 0, c13796f.mo40923j());
    }

    /* JADX INFO: renamed from: a */
    public boolean m40878a(long j, C13796f c13796f, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f39306b - j < i2 || c13796f.mo40923j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m40890f(((long) i3) + j) != c13796f.mo40912a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public long mo40427b(C13793c c13793c, long j) {
        if (c13793c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.f39306b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c13793c.mo40370a(this, j);
        return j;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13793c mo40873a(String str) {
        return m40868a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: b */
    public C13796f mo40880b(long j) throws EOFException {
        return new C13796f(mo40884c(j));
    }

    /* JADX INFO: renamed from: b */
    C13805o m40881b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C13805o c13805o = this.f39305a;
        if (c13805o != null) {
            C13805o c13805o2 = c13805o.f39344g;
            return (c13805o2.f39340c + i > 8192 || !c13805o2.f39342e) ? c13805o2.m40957a(C13806p.m40962a()) : c13805o2;
        }
        C13805o c13805oM40962a = C13806p.m40962a();
        this.f39305a = c13805oM40962a;
        c13805oM40962a.f39344g = c13805oM40962a;
        c13805oM40962a.f39343f = c13805oM40962a;
        return c13805oM40962a;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public C13810t mo40428b() {
        return C13810t.f39349d;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C13793c writeByte(int i) {
        C13805o c13805oM40881b = m40881b(1);
        byte[] bArr = c13805oM40881b.f39338a;
        int i2 = c13805oM40881b.f39340c;
        c13805oM40881b.f39340c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f39306b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: c */
    public String mo40883c() throws EOFException {
        return mo40886d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: c */
    public byte[] mo40884c(long j) throws EOFException {
        C13811u.m40969a(this.f39306b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C13793c writeInt(int i) {
        C13805o c13805oM40881b = m40881b(4);
        byte[] bArr = c13805oM40881b.f39338a;
        int i2 = c13805oM40881b.f39340c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c13805oM40881b.f39340c = i2 + 4;
        this.f39306b += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: d */
    public String mo40886d(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM40863a = m40863a((byte) 10, 0L, j2);
        if (jM40863a != -1) {
            return m40895h(jM40863a);
        }
        if (j2 < size() && m40890f(j2 - 1) == 13 && m40890f(j2) == 10) {
            return m40895h(j2);
        }
        C13793c c13793c = new C13793c();
        m40866a(c13793c, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c13793c.m40903o().mo40920g() + Typography.ellipsis);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: e */
    public int mo40887e() {
        return C13811u.m40967a(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C13793c writeShort(int i) {
        C13805o c13805oM40881b = m40881b(2);
        byte[] bArr = c13805oM40881b.f39338a;
        int i2 = c13805oM40881b.f39340c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c13805oM40881b.f39340c = i2 + 2;
        this.f39306b += 2;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: e */
    public void mo40889e(long j) throws EOFException {
        if (this.f39306b < j) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13793c)) {
            return false;
        }
        C13793c c13793c = (C13793c) obj;
        long j = this.f39306b;
        if (j != c13793c.f39306b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C13805o c13805o = this.f39305a;
        C13805o c13805o2 = c13793c.f39305a;
        int i = c13805o.f39339b;
        int i2 = c13805o2.f39339b;
        while (j2 < this.f39306b) {
            long jMin = Math.min(c13805o.f39340c - i, c13805o2.f39340c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c13805o.f39338a[i] != c13805o2.f39338a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c13805o.f39340c) {
                c13805o = c13805o.f39343f;
                i = c13805o.f39339b;
            }
            if (i2 == c13805o2.f39340c) {
                c13805o2 = c13805o2.f39343f;
                i2 = c13805o2.f39339b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final byte m40890f(long j) {
        C13811u.m40969a(this.f39306b, j, 1L);
        long j2 = this.f39306b;
        if (j2 - j > j) {
            C13805o c13805o = this.f39305a;
            long j3 = j;
            while (true) {
                int i = c13805o.f39340c;
                int i2 = c13805o.f39339b;
                long j4 = i - i2;
                if (j3 < j4) {
                    return c13805o.f39338a[i2 + ((int) j3)];
                }
                j3 -= j4;
                c13805o = c13805o.f39343f;
            }
        } else {
            long j5 = j - j2;
            C13805o c13805o2 = this.f39305a.f39344g;
            while (true) {
                int i3 = c13805o2.f39340c;
                int i4 = c13805o2.f39339b;
                j5 += (long) (i3 - i4);
                if (j5 >= 0) {
                    return c13805o2.f39338a[i4 + ((int) j5)];
                }
                c13805o2 = c13805o2.f39344g;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public C13793c m40891f(int i) {
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                writeByte(63);
                return this;
            }
            writeByte((i >> 12) | 224);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        writeByte((i >> 18) | 240);
        writeByte(((i >> 12) & 63) | 128);
        writeByte(((i >> 6) & 63) | 128);
        writeByte((i & 63) | 128);
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: f */
    public boolean mo40892f() {
        return this.f39306b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d, com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
    public void flush() {
    }

    /* JADX INFO: renamed from: g */
    public String m40893g(long j) throws EOFException {
        return m40875a(j, C13811u.f39353a);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: g */
    public short mo40894g() {
        return C13811u.m40968a(readShort());
    }

    /* JADX INFO: renamed from: h */
    String m40895h(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m40890f(j2) == 13) {
                String strM40893g = m40893g(j2);
                skip(2L);
                return strM40893g;
            }
        }
        String strM40893g2 = m40893g(j);
        skip(1L);
        return strM40893g2;
    }

    public int hashCode() {
        C13805o c13805o = this.f39305a;
        if (c13805o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c13805o.f39340c;
            for (int i3 = c13805o.f39339b; i3 < i2; i3++) {
                i = (i * 31) + c13805o.f39338a[i3];
            }
            c13805o = c13805o.f39343f;
        } while (c13805o != this.f39305a);
        return i;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: i */
    public long mo40896i() {
        int i;
        if (this.f39306b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C13805o c13805o = this.f39305a;
            byte[] bArr = c13805o.f39338a;
            int i3 = c13805o.f39339b;
            int i4 = c13805o.f39340c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new C13793c().mo40872a(j).writeByte((int) b).m40904p());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f39305a = c13805o.m40960b();
                C13806p.m40963a(c13805o);
            } else {
                c13805o.f39339b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f39305a != null);
        this.f39306b -= (long) i2;
        return j;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C13793c mo40872a(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C13805o c13805oM40881b = m40881b(iNumberOfTrailingZeros);
        byte[] bArr = c13805oM40881b.f39338a;
        int i = c13805oM40881b.f39340c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f39304c[(int) (15 & j)];
            j >>>= 4;
        }
        c13805oM40881b.f39340c += iNumberOfTrailingZeros;
        this.f39306b += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: j */
    public InputStream mo40898j() {
        return new a();
    }

    /* JADX INFO: renamed from: k */
    public final void m40899k() {
        try {
            skip(this.f39306b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C13793c clone() {
        C13793c c13793c = new C13793c();
        if (this.f39306b == 0) {
            return c13793c;
        }
        C13805o c13805oM40961c = this.f39305a.m40961c();
        c13793c.f39305a = c13805oM40961c;
        c13805oM40961c.f39344g = c13805oM40961c;
        c13805oM40961c.f39343f = c13805oM40961c;
        for (C13805o c13805o = this.f39305a.f39343f; c13805o != this.f39305a; c13805o = c13805o.f39343f) {
            c13793c.f39305a.f39344g.m40957a(c13805o.m40961c());
        }
        c13793c.f39306b = this.f39306b;
        return c13793c;
    }

    /* JADX INFO: renamed from: m */
    public final long m40901m() {
        long j = this.f39306b;
        if (j == 0) {
            return 0L;
        }
        C13805o c13805o = this.f39305a.f39344g;
        int i = c13805o.f39340c;
        return (i >= 8192 || !c13805o.f39342e) ? j : j - ((long) (i - c13805o.f39339b));
    }

    /* JADX INFO: renamed from: n */
    public byte[] m40902n() {
        try {
            return mo40884c(this.f39306b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public C13796f m40903o() {
        return new C13796f(m40902n());
    }

    /* JADX INFO: renamed from: p */
    public String m40904p() {
        try {
            return m40875a(this.f39306b, C13811u.f39353a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final C13796f m40905q() {
        long j = this.f39306b;
        if (j <= 2147483647L) {
            return m40874a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f39306b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C13805o c13805o = this.f39305a;
        if (c13805o == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c13805o.f39340c - c13805o.f39339b);
        byteBuffer.put(c13805o.f39338a, c13805o.f39339b, iMin);
        int i = c13805o.f39339b + iMin;
        c13805o.f39339b = i;
        this.f39306b -= (long) iMin;
        if (i == c13805o.f39340c) {
            this.f39305a = c13805o.m40960b();
            C13806p.m40963a(c13805o);
        }
        return iMin;
    }

    public int read(byte[] bArr, int i, int i2) {
        C13811u.m40969a(bArr.length, i, i2);
        C13805o c13805o = this.f39305a;
        if (c13805o == null) {
            return -1;
        }
        int iMin = Math.min(i2, c13805o.f39340c - c13805o.f39339b);
        System.arraycopy(c13805o.f39338a, c13805o.f39339b, bArr, i, iMin);
        int i3 = c13805o.f39339b + iMin;
        c13805o.f39339b = i3;
        this.f39306b -= (long) iMin;
        if (i3 == c13805o.f39340c) {
            this.f39305a = c13805o.m40960b();
            C13806p.m40963a(c13805o);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public byte readByte() {
        long j = this.f39306b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C13805o c13805o = this.f39305a;
        int i = c13805o.f39339b;
        int i2 = c13805o.f39340c;
        int i3 = i + 1;
        byte b = c13805o.f39338a[i];
        this.f39306b = j - 1;
        if (i3 != i2) {
            c13805o.f39339b = i3;
            return b;
        }
        this.f39305a = c13805o.m40960b();
        C13806p.m40963a(c13805o);
        return b;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public int readInt() {
        long j = this.f39306b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f39306b);
        }
        C13805o c13805o = this.f39305a;
        int i = c13805o.f39339b;
        int i2 = c13805o.f39340c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c13805o.f39338a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f39306b = j - 4;
        if (i5 != i2) {
            c13805o.f39339b = i5;
            return i6;
        }
        this.f39305a = c13805o.m40960b();
        C13806p.m40963a(c13805o);
        return i6;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public short readShort() {
        long j = this.f39306b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f39306b);
        }
        C13805o c13805o = this.f39305a;
        int i = c13805o.f39339b;
        int i2 = c13805o.f39340c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c13805o.f39338a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f39306b = j - 2;
        if (i5 == i2) {
            this.f39305a = c13805o.m40960b();
            C13806p.m40963a(c13805o);
        } else {
            c13805o.f39339b = i5;
        }
        return (short) i6;
    }

    public final long size() {
        return this.f39306b;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public void skip(long j) throws EOFException {
        while (j > 0) {
            C13805o c13805o = this.f39305a;
            if (c13805o == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c13805o.f39340c - c13805o.f39339b);
            long j2 = iMin;
            this.f39306b -= j2;
            j -= j2;
            C13805o c13805o2 = this.f39305a;
            int i = c13805o2.f39339b + iMin;
            c13805o2.f39339b = i;
            if (i == c13805o2.f39340c) {
                this.f39305a = c13805o2.m40960b();
                C13806p.m40963a(c13805o2);
            }
        }
    }

    public String toString() {
        return m40905q().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C13805o c13805oM40881b = m40881b(1);
            int iMin = Math.min(i, 8192 - c13805oM40881b.f39340c);
            byteBuffer.get(c13805oM40881b.f39338a, c13805oM40881b.f39340c, iMin);
            i -= iMin;
            c13805oM40881b.f39340c += iMin;
        }
        this.f39306b += (long) iRemaining;
        return iRemaining;
    }
}
