package com.apm.insight.p022l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.apm.insight.l.e */
/* JADX INFO: compiled from: DigestPrintWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1429e extends PrintWriter {

    /* JADX INFO: renamed from: a */
    private MessageDigest f719a;

    /* JADX INFO: renamed from: b */
    private Charset f720b;

    /* JADX INFO: renamed from: c */
    private a f721c;

    /* JADX INFO: renamed from: com.apm.insight.l.e$a */
    /* JADX INFO: compiled from: DigestPrintWriter.java */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean mo1167a(String str) {
            return true;
        }
    }

    public C1429e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f720b = null;
        this.f719a = messageDigest;
        this.f721c = aVar;
        if (messageDigest != null) {
            this.f720b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f719a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f719a != null) {
            a aVar = this.f721c;
            if (aVar == null || aVar.mo1167a(str)) {
                this.f719a.update(this.f720b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f719a;
        if (messageDigest != null) {
            messageDigest.update(this.f720b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
