package com.tiktok.util;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TTSafeRunnable implements Runnable {
    public abstract void doSafeRun();

    @Override // java.lang.Runnable
    public void run() {
        try {
            doSafeRun();
        } catch (Throwable unused) {
        }
    }
}
