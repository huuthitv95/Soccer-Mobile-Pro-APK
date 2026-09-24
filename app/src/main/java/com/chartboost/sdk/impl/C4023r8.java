package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r8 */
/* JADX INFO: loaded from: classes3.dex */
public class C4023r8 {

    /* JADX INFO: renamed from: a */
    public final File f16132a;

    /* JADX INFO: renamed from: b */
    public final File f16133b;

    /* JADX INFO: renamed from: c */
    public final File f16134c;

    /* JADX INFO: renamed from: d */
    public final File f16135d;

    /* JADX INFO: renamed from: e */
    public final File f16136e;

    /* JADX INFO: renamed from: f */
    public final File f16137f;

    /* JADX INFO: renamed from: g */
    public final File f16138g;

    /* JADX INFO: renamed from: h */
    public final File f16139h;

    /* JADX INFO: renamed from: i */
    public final File f16140i;

    public C4023r8(File file) {
        File file2 = new File(file, ".chartboost");
        this.f16132a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f16133b = m19312a(file2, "css");
        this.f16134c = m19312a(file2, "html");
        this.f16135d = m19312a(file2, "images");
        this.f16136e = m19312a(file2, "js");
        this.f16137f = m19312a(file2, "templates");
        this.f16138g = m19312a(file2, "videos");
        this.f16139h = m19312a(file2, "precache");
        this.f16140i = m19312a(file2, "precache_queue");
    }

    /* JADX INFO: renamed from: a */
    public static File m19312a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    /* JADX INFO: renamed from: a */
    public File m19313a() {
        return this.f16132a;
    }
}
