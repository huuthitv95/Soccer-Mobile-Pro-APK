package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.d */
/* JADX INFO: compiled from: BufferedSink.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13794d extends InterfaceC13808r, WritableByteChannel {
    /* JADX INFO: renamed from: a */
    C13793c mo40865a();

    /* JADX INFO: renamed from: a */
    InterfaceC13794d mo40872a(long j) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC13794d mo40873a(String str) throws IOException;

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
    void flush() throws IOException;

    InterfaceC13794d write(byte[] bArr) throws IOException;

    InterfaceC13794d write(byte[] bArr, int i, int i2) throws IOException;

    InterfaceC13794d writeByte(int i) throws IOException;

    InterfaceC13794d writeInt(int i) throws IOException;

    InterfaceC13794d writeShort(int i) throws IOException;
}
