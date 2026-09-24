package com.bykv.p028vk.openvk.preload.geckox.buffer.p036a;

import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.buffer.a.a */
/* JADX INFO: compiled from: BufferPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1914a {

    /* JADX INFO: renamed from: a */
    public String f4358a;

    /* JADX INFO: renamed from: b */
    public String f4359b;

    /* JADX INFO: renamed from: c */
    public String f4360c;

    /* JADX INFO: renamed from: d */
    public String f4361d;

    /* JADX INFO: renamed from: e */
    public String f4362e;

    /* JADX INFO: renamed from: f */
    public String f4363f;

    /* JADX INFO: renamed from: g */
    public int f4364g;

    /* JADX INFO: renamed from: a */
    public static InterfaceC1913a m5981a(File file, long j) throws IOException {
        InterfaceC1913a interfaceC1913aM5982b = m5982b(file, j);
        GeckoLogger.m6040d("gecko-debug-tag", "buffer type:" + interfaceC1913aM5982b.getClass());
        return interfaceC1913aM5982b;
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1913a m5982b(File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new C1915b(file);
            } catch (Exception e) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e.getMessage(), e);
            }
        }
        try {
            return new C1916c(j, file);
        } catch (Exception e2) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
        }
    }
}
