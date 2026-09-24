package com.bykv.p028vk.openvk.preload.geckox.p045e.p046a;

import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.e.a.b */
/* JADX INFO: compiled from: MyArchiveFileLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class C1950b extends AbstractC1949a {
    public C1950b(File file) {
        super(file);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.AbstractC1949a
    /* JADX INFO: renamed from: a */
    protected final InputStream mo6013a(File file, String str) throws IOException {
        GeckoLogger.m6040d("gecko-debug-tag", "MyArchiveFileLoader, file:", new File(str).getCanonicalPath());
        return null;
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.p045e.p046a.AbstractC1949a
    /* JADX INFO: renamed from: b */
    protected final boolean mo6015b(File file, String str) throws IOException {
        new File(str).getCanonicalPath();
        return false;
    }
}
