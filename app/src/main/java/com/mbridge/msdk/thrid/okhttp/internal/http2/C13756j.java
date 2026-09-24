package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.j */
/* JADX INFO: compiled from: Http2Writer.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13756j implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g */
    private static final Logger f39073g = Logger.getLogger(C13751e.class.getName());

    /* JADX INFO: renamed from: a */
    private final InterfaceC13794d f39074a;

    /* JADX INFO: renamed from: b */
    private final boolean f39075b;

    /* JADX INFO: renamed from: c */
    private final C13793c f39076c;

    /* JADX INFO: renamed from: d */
    private int f39077d;

    /* JADX INFO: renamed from: e */
    private boolean f39078e;

    /* JADX INFO: renamed from: f */
    final C13750d.b f39079f;

    C13756j(InterfaceC13794d interfaceC13794d, boolean z) {
        this.f39074a = interfaceC13794d;
        this.f39075b = z;
        C13793c c13793c = new C13793c();
        this.f39076c = c13793c;
        this.f39079f = new C13750d.b(c13793c);
        this.f39077d = 16384;
    }

    /* JADX INFO: renamed from: a */
    private static void m40559a(InterfaceC13794d interfaceC13794d, int i) throws IOException {
        interfaceC13794d.writeByte((i >>> 16) & 255);
        interfaceC13794d.writeByte((i >>> 8) & 255);
        interfaceC13794d.writeByte(i & 255);
    }

    /* JADX INFO: renamed from: b */
    private void m40560b(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.f39077d, j);
            long j2 = iMin;
            j -= j2;
            m40562a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f39074a.mo40370a(this.f39076c, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    void m40561a(int i, byte b, C13793c c13793c, int i2) throws IOException {
        m40562a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f39074a.mo40370a(c13793c, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40562a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f39073g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13751e.m40461a(false, i, i2, b, b2));
        }
        int i3 = this.f39077d;
        if (i2 > i3) {
            throw C13751e.m40459a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw C13751e.m40459a("reserved bit set: %s", Integer.valueOf(i));
        }
        m40559a(this.f39074a, i2);
        this.f39074a.writeByte(b & 255);
        this.f39074a.writeByte(b2 & 255);
        this.f39074a.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40563a(int i, int i2, List<C13749c> list) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        this.f39079f.m40457a(list);
        long size = this.f39076c.size();
        int iMin = (int) Math.min(this.f39077d - 4, size);
        long j = iMin;
        m40562a(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.f39074a.writeInt(i2 & Integer.MAX_VALUE);
        this.f39074a.mo40370a(this.f39076c, j);
        if (size > j) {
            m40560b(i, size - j);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40564a(int i, long j) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw C13751e.m40459a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        m40562a(i, 4, (byte) 8, (byte) 0);
        this.f39074a.writeInt((int) j);
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40565a(int i, EnumC13748b enumC13748b) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        if (enumC13748b.f38922a == -1) {
            throw new IllegalArgumentException();
        }
        m40562a(i, 4, (byte) 3, (byte) 0);
        this.f39074a.writeInt(enumC13748b.f38922a);
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40566a(int i, EnumC13748b enumC13748b, byte[] bArr) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        if (enumC13748b.f38922a == -1) {
            throw C13751e.m40459a("errorCode.httpCode == -1", new Object[0]);
        }
        m40562a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f39074a.writeInt(i);
        this.f39074a.writeInt(enumC13748b.f38922a);
        if (bArr.length > 0) {
            this.f39074a.write(bArr);
        }
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40567a(C13759m c13759m) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        this.f39077d = c13759m.m40592c(this.f39077d);
        if (c13759m.m40589b() != -1) {
            this.f39079f.m40458b(c13759m.m40589b());
        }
        m40562a(0, 0, (byte) 4, (byte) 1);
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40568a(boolean z, int i, int i2) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        m40562a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f39074a.writeInt(i);
        this.f39074a.writeInt(i2);
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40569a(boolean z, int i, int i2, List<C13749c> list) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        m40571a(z, i, list);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m40570a(boolean z, int i, C13793c c13793c, int i2) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        m40561a(i, z ? (byte) 1 : (byte) 0, c13793c, i2);
    }

    /* JADX INFO: renamed from: a */
    void m40571a(boolean z, int i, List<C13749c> list) throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        this.f39079f.m40457a(list);
        long size = this.f39076c.size();
        int iMin = (int) Math.min(this.f39077d, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m40562a(i, iMin, (byte) 1, b);
        this.f39074a.mo40370a(this.f39076c, j);
        if (size > j) {
            m40560b(i, size - j);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m40572b(C13759m c13759m) throws IOException {
        int i;
        if (this.f39078e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m40562a(0, c13759m.m40593d() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (c13759m.m40594d(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.f39074a.writeShort(i);
                this.f39074a.writeInt(c13759m.m40585a(i2));
            }
            i2++;
        }
        this.f39074a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f39078e = true;
        this.f39074a.close();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m40573d() throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        if (this.f39075b) {
            Logger logger = f39073g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C13723c.m40272a(">> CONNECTION %s", C13751e.f38952a.mo40920g()));
            }
            this.f39074a.write(C13751e.f38952a.mo40925l());
            this.f39074a.flush();
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f39078e) {
            throw new IOException("closed");
        }
        this.f39074a.flush();
    }

    /* JADX INFO: renamed from: h */
    public int m40574h() {
        return this.f39077d;
    }
}
