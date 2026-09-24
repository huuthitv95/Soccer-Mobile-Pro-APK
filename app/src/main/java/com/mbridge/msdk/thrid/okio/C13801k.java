package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.k */
/* JADX INFO: compiled from: InflaterSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13801k implements InterfaceC13809s, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13795e f39321a;

    /* JADX INFO: renamed from: b */
    private final Inflater f39322b;

    /* JADX INFO: renamed from: c */
    private int f39323c;

    /* JADX INFO: renamed from: d */
    private boolean f39324d;

    C13801k(InterfaceC13795e interfaceC13795e, Inflater inflater) {
        if (interfaceC13795e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f39321a = interfaceC13795e;
        this.f39322b = inflater;
    }

    /* JADX INFO: renamed from: h */
    private void m40941h() throws IOException {
        int i = this.f39323c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f39322b.getRemaining();
        this.f39323c -= remaining;
        this.f39321a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public long mo40427b(C13793c c13793c, long j) throws IOException {
        boolean zM40942d;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f39324d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            zM40942d = m40942d();
            try {
                C13805o c13805oM40881b = c13793c.m40881b(1);
                int iInflate = this.f39322b.inflate(c13805oM40881b.f39338a, c13805oM40881b.f39340c, (int) Math.min(j, 8192 - c13805oM40881b.f39340c));
                if (iInflate > 0) {
                    c13805oM40881b.f39340c += iInflate;
                    long j2 = iInflate;
                    c13793c.f39306b += j2;
                    return j2;
                }
                if (!this.f39322b.finished() && !this.f39322b.needsDictionary()) {
                }
                m40941h();
                if (c13805oM40881b.f39339b != c13805oM40881b.f39340c) {
                    return -1L;
                }
                c13793c.f39305a = c13805oM40881b.m40960b();
                C13806p.m40963a(c13805oM40881b);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!zM40942d);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public C13810t mo40428b() {
        return this.f39321a.mo40428b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f39324d) {
            return;
        }
        this.f39322b.end();
        this.f39324d = true;
        this.f39321a.close();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m40942d() throws IOException {
        if (!this.f39322b.needsInput()) {
            return false;
        }
        m40941h();
        if (this.f39322b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f39321a.mo40892f()) {
            return true;
        }
        C13805o c13805o = this.f39321a.mo40865a().f39305a;
        int i = c13805o.f39340c;
        int i2 = c13805o.f39339b;
        int i3 = i - i2;
        this.f39323c = i3;
        this.f39322b.setInput(c13805o.f39338a, i2, i3);
        return false;
    }
}
