package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.resource.stream.b */
/* JADX INFO: compiled from: FileDownloadRandomAccessDownloadFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12817b implements InterfaceC12816a {

    /* JADX INFO: renamed from: a */
    private final BufferedOutputStream f34243a;

    /* JADX INFO: renamed from: b */
    private final FileDescriptor f34244b;

    /* JADX INFO: renamed from: c */
    private final RandomAccessFile f34245c;

    public C12817b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f34245c = randomAccessFile;
        this.f34244b = randomAccessFile.getFD();
        this.f34243a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a
    public void close() throws IOException {
        this.f34243a.close();
        this.f34245c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a
    public void flushAndSync() throws IOException {
        this.f34243a.flush();
        this.f34244b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a
    public void seek(long j) throws IOException {
        this.f34245c.seek(j);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f34243a.write(bArr, i, i2);
    }
}
