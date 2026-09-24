package com.bykv.p028vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.buffer.stream.b */
/* JADX INFO: compiled from: RandomOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1918b extends OutputStream {
    public abstract void write(long j, int i) throws IOException;

    public abstract void write(long j, byte[] bArr) throws IOException;

    public abstract void write(long j, byte[] bArr, int i, int i2) throws IOException;
}
