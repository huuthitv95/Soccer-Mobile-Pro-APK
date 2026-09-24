package com.bykv.p028vk.openvk.preload.geckox.p033a.p034a;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.b */
/* JADX INFO: compiled from: CachePolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1903b {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1903b f4315a = new C1905d();

    /* JADX INFO: renamed from: b */
    public static final AbstractC1903b f4316b;

    /* JADX INFO: renamed from: c */
    protected C1902a f4317c;

    /* JADX INFO: renamed from: d */
    protected File f4318d;

    /* JADX INFO: renamed from: e */
    protected List<String> f4319e;

    static {
        new C1907f();
        f4316b = new C1906e();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5907a();

    /* JADX INFO: renamed from: a */
    public void mo5908a(C1902a c1902a, File file, List<String> list) {
        this.f4317c = c1902a;
        this.f4318d = file;
        this.f4319e = list;
    }
}
