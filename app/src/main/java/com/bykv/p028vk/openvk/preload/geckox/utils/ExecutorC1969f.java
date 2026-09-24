package com.bykv.p028vk.openvk.preload.geckox.utils;

import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.f */
/* JADX INFO: compiled from: PiecemealSerialExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorC1969f implements Executor {

    /* JADX INFO: renamed from: a */
    private static volatile ExecutorC1969f f4490a;

    /* JADX INFO: renamed from: a */
    public static ExecutorC1969f m6083a() {
        if (f4490a == null) {
            synchronized (ExecutorC1969f.class) {
                if (f4490a == null) {
                    f4490a = new ExecutorC1969f();
                }
            }
        }
        return f4490a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C1910b.m5921t().execute(runnable);
    }
}
