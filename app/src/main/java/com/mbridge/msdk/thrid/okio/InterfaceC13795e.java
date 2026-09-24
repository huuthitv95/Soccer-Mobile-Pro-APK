package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.e */
/* JADX INFO: compiled from: BufferedSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13795e extends InterfaceC13809s, ReadableByteChannel {
    /* JADX INFO: renamed from: a */
    long mo40862a(byte b) throws IOException;

    /* JADX INFO: renamed from: a */
    C13793c mo40865a();

    /* JADX INFO: renamed from: a */
    String mo40876a(Charset charset) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo40877a(long j, C13796f c13796f) throws IOException;

    /* JADX INFO: renamed from: b */
    C13796f mo40880b(long j) throws IOException;

    /* JADX INFO: renamed from: c */
    String mo40883c() throws IOException;

    /* JADX INFO: renamed from: c */
    byte[] mo40884c(long j) throws IOException;

    /* JADX INFO: renamed from: d */
    String mo40886d(long j) throws IOException;

    /* JADX INFO: renamed from: e */
    int mo40887e() throws IOException;

    /* JADX INFO: renamed from: e */
    void mo40889e(long j) throws IOException;

    /* JADX INFO: renamed from: f */
    boolean mo40892f() throws IOException;

    /* JADX INFO: renamed from: g */
    short mo40894g() throws IOException;

    /* JADX INFO: renamed from: i */
    long mo40896i() throws IOException;

    /* JADX INFO: renamed from: j */
    InputStream mo40898j();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;
}
