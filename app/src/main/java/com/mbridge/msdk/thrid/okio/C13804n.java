package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.n */
/* JADX INFO: compiled from: RealBufferedSource.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13804n implements InterfaceC13795e, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final C13793c f39334a = new C13793c();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13809s f39335b;

    /* JADX INFO: renamed from: c */
    boolean f39336c;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.n$a */
    /* JADX INFO: compiled from: RealBufferedSource.java */
    class a extends InputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C13804n c13804n = C13804n.this;
            if (c13804n.f39336c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c13804n.f39334a.f39306b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C13804n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C13804n c13804n = C13804n.this;
            if (c13804n.f39336c) {
                throw new IOException("closed");
            }
            C13793c c13793c = c13804n.f39334a;
            if (c13793c.f39306b == 0 && c13804n.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return C13804n.this.f39334a.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (C13804n.this.f39336c) {
                throw new IOException("closed");
            }
            C13811u.m40969a(bArr.length, i, i2);
            C13804n c13804n = C13804n.this;
            C13793c c13793c = c13804n.f39334a;
            if (c13793c.f39306b == 0 && c13804n.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return C13804n.this.f39334a.read(bArr, i, i2);
        }

        public String toString() {
            return C13804n.this + ".inputStream()";
        }
    }

    C13804n(InterfaceC13809s interfaceC13809s) {
        if (interfaceC13809s == null) {
            throw new NullPointerException("source == null");
        }
        this.f39335b = interfaceC13809s;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public long mo40862a(byte b) throws IOException {
        return m40953a(b, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m40953a(byte b, long j, long j2) throws IOException {
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long jMax = j;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jM40863a = this.f39334a.m40863a(b2, jMax, j3);
            if (jM40863a != -1) {
                return jM40863a;
            }
            C13793c c13793c = this.f39334a;
            long j4 = c13793c.f39306b;
            if (j4 >= j3 || this.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e, com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a */
    public C13793c mo40865a() {
        return this.f39334a;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public String mo40876a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f39334a.m40864a(this.f39335b);
        return this.f39334a.mo40876a(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: a */
    public boolean mo40877a(long j, C13796f c13796f) throws IOException {
        return m40954a(j, c13796f, 0, c13796f.mo40923j());
    }

    /* JADX INFO: renamed from: a */
    public boolean m40954a(long j, C13796f c13796f, int i, int i2) throws IOException {
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || c13796f.mo40923j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!m40955f(1 + j2) || this.f39334a.m40890f(j2) != c13796f.mo40912a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public long mo40427b(C13793c c13793c, long j) throws IOException {
        if (c13793c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        C13793c c13793c2 = this.f39334a;
        if (c13793c2.f39306b == 0 && this.f39335b.mo40427b(c13793c2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f39334a.mo40427b(c13793c, Math.min(j, this.f39334a.f39306b));
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: b */
    public C13796f mo40880b(long j) throws IOException {
        mo40889e(j);
        return this.f39334a.mo40880b(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public C13810t mo40428b() {
        return this.f39335b.mo40428b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: c */
    public String mo40883c() throws IOException {
        return mo40886d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: c */
    public byte[] mo40884c(long j) throws IOException {
        mo40889e(j);
        return this.f39334a.mo40884c(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f39336c) {
            return;
        }
        this.f39336c = true;
        this.f39335b.close();
        this.f39334a.m40899k();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: d */
    public String mo40886d(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM40953a = m40953a((byte) 10, 0L, j2);
        if (jM40953a != -1) {
            return this.f39334a.m40895h(jM40953a);
        }
        if (j2 < Long.MAX_VALUE && m40955f(j2) && this.f39334a.m40890f(j2 - 1) == 13 && m40955f(j2 + 1) && this.f39334a.m40890f(j2) == 10) {
            return this.f39334a.m40895h(j2);
        }
        C13793c c13793c = new C13793c();
        C13793c c13793c2 = this.f39334a;
        c13793c2.m40866a(c13793c, 0L, Math.min(32L, c13793c2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f39334a.size(), j) + " content=" + c13793c.m40903o().mo40920g() + Typography.ellipsis);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: e */
    public int mo40887e() throws IOException {
        mo40889e(4L);
        return this.f39334a.mo40887e();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: e */
    public void mo40889e(long j) throws IOException {
        if (!m40955f(j)) {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: f */
    public boolean mo40892f() throws IOException {
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        return this.f39334a.mo40892f() && this.f39335b.mo40427b(this.f39334a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    /* JADX INFO: renamed from: f */
    public boolean m40955f(long j) throws IOException {
        C13793c c13793c;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        do {
            c13793c = this.f39334a;
            if (c13793c.f39306b >= j) {
                return true;
            }
        } while (this.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: g */
    public short mo40894g() throws IOException {
        mo40889e(2L);
        return this.f39334a.mo40894g();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: i */
    public long mo40896i() throws IOException {
        mo40889e(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m40955f(i2)) {
                break;
            }
            byte bM40890f = this.f39334a.m40890f(i);
            if ((bM40890f < 48 || bM40890f > 57) && ((bM40890f < 97 || bM40890f > 102) && (bM40890f < 65 || bM40890f > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM40890f)));
            }
            i = i2;
        }
        return this.f39334a.mo40896i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f39336c;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    /* JADX INFO: renamed from: j */
    public InputStream mo40898j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C13793c c13793c = this.f39334a;
        if (c13793c.f39306b == 0 && this.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f39334a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public byte readByte() throws IOException {
        mo40889e(1L);
        return this.f39334a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo40889e(bArr.length);
            this.f39334a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C13793c c13793c = this.f39334a;
                long j = c13793c.f39306b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c13793c.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public int readInt() throws IOException {
        mo40889e(4L);
        return this.f39334a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public short readShort() throws IOException {
        mo40889e(2L);
        return this.f39334a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13795e
    public void skip(long j) throws IOException {
        if (this.f39336c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C13793c c13793c = this.f39334a;
            if (c13793c.f39306b == 0 && this.f39335b.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f39334a.size());
            this.f39334a.skip(jMin);
            j -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f39335b + ")";
    }
}
