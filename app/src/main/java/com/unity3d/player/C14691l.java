package com.unity3d.player;

import android.os.Build;

/* JADX INFO: renamed from: com.unity3d.player.l */
/* JADX INFO: loaded from: classes7.dex */
final class C14691l implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private volatile Thread.UncaughtExceptionHandler f41760a;

    C14691l() {
    }

    /* JADX INFO: renamed from: a */
    final synchronized boolean m43413a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            return false;
        }
        this.f41760a = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            Error error = new Error(String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + String.format("Unity version     : %s\n", "2020.3.49f1") + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + String.format("Device fingerprint: %s\n", Build.FINGERPRINT) + String.format("Build Type        : %s\n", "Release") + String.format("Scripting Backend : %s\n", "Mono") + String.format("ABI               : %s\n", Build.CPU_ABI) + String.format("Strip Engine Code : %s\n", false));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f41760a.uncaughtException(thread, error);
        } catch (Throwable unused) {
            this.f41760a.uncaughtException(thread, th);
        }
    }
}
