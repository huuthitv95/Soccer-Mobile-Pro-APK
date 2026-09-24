package com.bykv.p028vk.openvk.preload.geckox.p045e.p046a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.e.a.a */
/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1949a {

    /* JADX INFO: renamed from: a */
    private File f4412a;

    public AbstractC1949a(File file) {
        this.f4412a = file;
    }

    /* JADX INFO: renamed from: a */
    protected abstract InputStream mo6013a(File file, String str) throws IOException;

    /* JADX INFO: renamed from: a */
    public final InputStream m6014a(String str) throws IOException {
        return mo6013a(this.f4412a, str);
    }

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo6015b(File file, String str) throws IOException;

    /* JADX INFO: renamed from: b */
    public final boolean m6016b(String str) throws IOException {
        return mo6015b(this.f4412a, str);
    }
}
