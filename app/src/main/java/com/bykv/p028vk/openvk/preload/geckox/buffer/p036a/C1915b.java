package com.bykv.p028vk.openvk.preload.geckox.buffer.p036a;

import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.buffer.a.b */
/* JADX INFO: compiled from: FileBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1915b implements InterfaceC1913a {

    /* JADX INFO: renamed from: a */
    private RandomAccessFile f4365a;

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f4366b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private File f4367c;

    C1915b(File file) throws IOException {
        this.f4367c = file;
        file.getParentFile().mkdirs();
        try {
            this.f4365a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            CloseableUtils.close(this.f4365a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final int mo5968a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
        if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            this.f4365a.write(bArr, i, i2);
        }
        return i2;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final synchronized long mo5969a(long j) throws IOException {
        int i;
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
        i = (int) j;
        if (i != j) {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.f4365a.skipBytes(i);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final void mo5970a() throws IOException {
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final void mo5971a(int i) throws IOException {
        mo5972a(new byte[]{(byte) i});
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final void mo5972a(byte[] bArr) throws IOException {
        mo5968a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final int mo5973b(byte[] bArr) throws IOException {
        return mo5974b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final int mo5974b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            i3 = this.f4365a.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final long mo5975b() throws IOException {
        return this.f4365a.length();
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final void mo5976b(long j) throws IOException {
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
        if (j < 0) {
            j = 0;
        }
        this.f4365a.seek(j);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: c */
    public final long mo5977c() throws IOException {
        if (this.f4366b.get()) {
            throw new IOException("released!");
        }
        return this.f4365a.getFilePointer();
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: d */
    public final int mo5978d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo5973b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: e */
    public final void mo5979e() {
        if (this.f4366b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f4365a);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: f */
    public final File mo5980f() {
        return this.f4367c;
    }
}
