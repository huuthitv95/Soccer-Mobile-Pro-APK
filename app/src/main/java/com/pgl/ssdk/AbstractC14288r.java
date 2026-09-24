package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.pgl.ssdk.r */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14288r {
    /* JADX INFO: renamed from: a */
    public static InterfaceC14287q m43108a(RandomAccessFile randomAccessFile, long j, long j2) {
        return m43109a(randomAccessFile.getChannel(), j, j2);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC14287q m43109a(FileChannel fileChannel, long j, long j2) {
        fileChannel.getClass();
        return new C14283m(fileChannel, j, j2);
    }
}
