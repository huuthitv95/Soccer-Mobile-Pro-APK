package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.resource.stream.a */
/* JADX INFO: compiled from: DownloadFileOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC12816a {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
