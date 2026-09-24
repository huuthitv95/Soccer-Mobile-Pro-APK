package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.m */
/* JADX INFO: compiled from: RealBufferedSink.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13803m implements InterfaceC13794d, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final C13793c f39331a = new C13793c();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13808r f39332b;

    /* JADX INFO: renamed from: c */
    boolean f39333c;

    C13803m(InterfaceC13808r interfaceC13808r) {
        if (interfaceC13808r == null) {
            throw new NullPointerException("sink == null");
        }
        this.f39332b = interfaceC13808r;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a */
    public C13793c mo40865a() {
        return this.f39331a;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a */
    public InterfaceC13794d mo40872a(long j) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.mo40872a(j);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    /* JADX INFO: renamed from: a */
    public InterfaceC13794d mo40873a(String str) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.mo40873a(str);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
    /* JADX INFO: renamed from: a */
    public void mo40370a(C13793c c13793c, long j) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.mo40370a(c13793c, j);
        m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
    /* JADX INFO: renamed from: b */
    public C13810t mo40429b() {
        return this.f39332b.mo40429b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f39333c) {
            return;
        }
        C13793c c13793c = this.f39331a;
        long j = c13793c.f39306b;
        if (j > 0) {
            this.f39332b.mo40370a(c13793c, j);
        }
        th = null;
        try {
            this.f39332b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f39333c = true;
        if (th != null) {
            C13811u.m40970a(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC13794d m40952d() throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        long jM40901m = this.f39331a.m40901m();
        if (jM40901m > 0) {
            this.f39332b.mo40370a(this.f39331a, jM40901m);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d, com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        C13793c c13793c = this.f39331a;
        long j = c13793c.f39306b;
        if (j > 0) {
            this.f39332b.mo40370a(c13793c, j);
        }
        this.f39332b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f39333c;
    }

    public String toString() {
        return "buffer(" + this.f39332b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f39331a.write(byteBuffer);
        m40952d();
        return iWrite;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    public InterfaceC13794d write(byte[] bArr) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.write(bArr);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    public InterfaceC13794d write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.write(bArr, i, i2);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    public InterfaceC13794d writeByte(int i) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.writeByte(i);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    public InterfaceC13794d writeInt(int i) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.writeInt(i);
        return m40952d();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13794d
    public InterfaceC13794d writeShort(int i) throws IOException {
        if (this.f39333c) {
            throw new IllegalStateException("closed");
        }
        this.f39331a.writeShort(i);
        return m40952d();
    }
}
