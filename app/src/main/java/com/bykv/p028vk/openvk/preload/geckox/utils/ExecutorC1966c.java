package com.bykv.p028vk.openvk.preload.geckox.utils;

import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.c */
/* JADX INFO: compiled from: IOSerialExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorC1966c implements Executor {

    /* JADX INFO: renamed from: a */
    private static volatile ExecutorC1966c f4488a;

    /* JADX INFO: renamed from: a */
    public static ExecutorC1966c m6079a() {
        if (f4488a == null) {
            synchronized (ExecutorC1966c.class) {
                if (f4488a == null) {
                    f4488a = new ExecutorC1966c();
                }
            }
        }
        return f4488a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C1910b.m5921t().execute(runnable);
    }
}
