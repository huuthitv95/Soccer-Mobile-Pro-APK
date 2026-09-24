package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.j */
/* JADX INFO: compiled from: GzipSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13800j implements InterfaceC13809s, AutoCloseable {

    /* JADX INFO: renamed from: b */
    private final InterfaceC13795e f39317b;

    /* JADX INFO: renamed from: c */
    private final Inflater f39318c;

    /* JADX INFO: renamed from: d */
    private final C13801k f39319d;

    /* JADX INFO: renamed from: a */
    private int f39316a = 0;

    /* JADX INFO: renamed from: e */
    private final CRC32 f39320e = new CRC32();

    public C13800j(InterfaceC13809s interfaceC13809s) {
        if (interfaceC13809s == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f39318c = inflater;
        InterfaceC13795e interfaceC13795eM40944a = C13802l.m40944a(interfaceC13809s);
        this.f39317b = interfaceC13795eM40944a;
        this.f39319d = new C13801k(interfaceC13795eM40944a, inflater);
    }

    /* JADX INFO: renamed from: a */
    private void m40937a(C13793c c13793c, long j, long j2) {
        C13805o c13805o = c13793c.f39305a;
        while (true) {
            long j3 = c13805o.f39340c - c13805o.f39339b;
            if (j < j3) {
                break;
            }
            j -= j3;
            c13805o = c13805o.f39343f;
        }
        while (j2 > 0) {
            int i = (int) (((long) c13805o.f39339b) + j);
            int iMin = (int) Math.min(c13805o.f39340c - i, j2);
            this.f39320e.update(c13805o.f39338a, i, iMin);
            j2 -= (long) iMin;
            c13805o = c13805o.f39343f;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40938a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m40939d() throws IOException {
        this.f39317b.mo40889e(10L);
        byte bM40890f = this.f39317b.mo40865a().m40890f(3L);
        boolean z = ((bM40890f >> 1) & 1) == 1;
        if (z) {
            m40937a(this.f39317b.mo40865a(), 0L, 10L);
        }
        m40938a("ID1ID2", 8075, this.f39317b.readShort());
        this.f39317b.skip(8L);
        if (((bM40890f >> 2) & 1) == 1) {
            this.f39317b.mo40889e(2L);
            if (z) {
                m40937a(this.f39317b.mo40865a(), 0L, 2L);
            }
            long jMo40894g = this.f39317b.mo40865a().mo40894g();
            this.f39317b.mo40889e(jMo40894g);
            if (z) {
                m40937a(this.f39317b.mo40865a(), 0L, jMo40894g);
            }
            this.f39317b.skip(jMo40894g);
        }
        if (((bM40890f >> 3) & 1) == 1) {
            long jMo40862a = this.f39317b.mo40862a((byte) 0);
            if (jMo40862a == -1) {
                throw new EOFException();
            }
            if (z) {
                m40937a(this.f39317b.mo40865a(), 0L, jMo40862a + 1);
            }
            this.f39317b.skip(jMo40862a + 1);
        }
        if (((bM40890f >> 4) & 1) == 1) {
            long jMo40862a2 = this.f39317b.mo40862a((byte) 0);
            if (jMo40862a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                m40937a(this.f39317b.mo40865a(), 0L, jMo40862a2 + 1);
            }
            this.f39317b.skip(jMo40862a2 + 1);
        }
        if (z) {
            m40938a("FHCRC", this.f39317b.mo40894g(), (short) this.f39320e.getValue());
            this.f39320e.reset();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m40940h() throws IOException {
        m40938a("CRC", this.f39317b.mo40887e(), (int) this.f39320e.getValue());
        m40938a("ISIZE", this.f39317b.mo40887e(), (int) this.f39318c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public long mo40427b(C13793c c13793c, long j) throws IOException {
        C13800j c13800j;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f39316a == 0) {
            m40939d();
            this.f39316a = 1;
        }
        if (this.f39316a == 1) {
            long j2 = c13793c.f39306b;
            long jMo40427b = this.f39319d.mo40427b(c13793c, j);
            if (jMo40427b != -1) {
                m40937a(c13793c, j2, jMo40427b);
                return jMo40427b;
            }
            c13800j = this;
            c13800j.f39316a = 2;
        } else {
            c13800j = this;
        }
        if (c13800j.f39316a == 2) {
            m40940h();
            c13800j.f39316a = 3;
            if (!c13800j.f39317b.mo40892f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public C13810t mo40428b() {
        return this.f39317b.mo40428b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39319d.close();
    }
}
