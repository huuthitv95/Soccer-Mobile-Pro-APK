package com.bykv.p028vk.openvk.preload.geckox.p045e.p046a;

import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.e.a.c */
/* JADX INFO: compiled from: NormalFileLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1951c extends AbstractC1949a {
    public C1951c(File file) {
        super(file);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.AbstractC1949a
    /* JADX INFO: renamed from: a */
    protected final InputStream mo6013a(File file, String str) throws IOException {
        File file2 = new File(file, "res" + File.separator + str);
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            throw new IOException("file not found");
        }
        GeckoLogger.m6040d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
        return new FileInputStream(file2.getCanonicalFile());
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.AbstractC1949a
    /* JADX INFO: renamed from: b */
    protected final boolean mo6015b(File file, String str) throws IOException {
        return new File(file, "res" + File.separator + str).exists();
    }
}
