package com.bykv.p028vk.openvk.preload.geckox.buffer.p036a;

import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.buffer.a.c */
/* JADX INFO: compiled from: RAFBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1916c implements InterfaceC1913a {

    /* JADX INFO: renamed from: a */
    private long f4368a;

    /* JADX INFO: renamed from: b */
    private long f4369b;

    /* JADX INFO: renamed from: c */
    private RandomAccessFile f4370c;

    /* JADX INFO: renamed from: d */
    private AtomicBoolean f4371d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private File f4372e;

    C1916c(long j, File file) throws IOException {
        this.f4368a = j;
        this.f4372e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f4370c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            CloseableUtils.close(this.f4370c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final int mo5968a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4371d.get()) {
            throw new IOException("released!");
        }
        if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            long j = this.f4369b;
            long j2 = this.f4368a;
            if (j == j2) {
                return 0;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            this.f4370c.write(bArr, i, i2);
            this.f4369b += (long) i2;
            return i2;
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final synchronized long mo5969a(long j) throws IOException {
        int iSkipBytes;
        if (this.f4371d.get()) {
            throw new IOException("released!");
        }
        int i = (int) j;
        if (i != j) {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        iSkipBytes = this.f4370c.skipBytes(i);
        this.f4369b = this.f4370c.getFilePointer();
        return iSkipBytes;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: a */
    public final void mo5970a() throws IOException {
        if (this.f4371d.get()) {
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
        if (this.f4371d.get()) {
            throw new IOException("released!");
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            long j = this.f4369b;
            long j2 = this.f4368a;
            if (j == j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int i3 = this.f4370c.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.f4369b += (long) i3;
            return i3;
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final long mo5975b() {
        return this.f4368a;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r0
  0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: b */
    public final void mo5976b(long j) throws IOException {
        if (this.f4371d.get()) {
            throw new IOException("released!");
        }
        long j2 = 0;
        if (j < 0) {
            j = j2;
        } else {
            j2 = this.f4368a;
            if (j > j2) {
                j = j2;
            }
        }
        this.f4369b = j;
        this.f4370c.seek(j);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: c */
    public final long mo5977c() throws IOException {
        if (this.f4371d.get()) {
            throw new IOException("released!");
        }
        return this.f4369b;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: d */
    public final int mo5978d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo5973b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: e */
    public final void mo5979e() {
        if (this.f4371d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f4370c);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a
    /* JADX INFO: renamed from: f */
    public final File mo5980f() {
        return this.f4372e;
    }
}
